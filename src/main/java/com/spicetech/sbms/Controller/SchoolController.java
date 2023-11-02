package com.spicetech.sbms.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.spicetech.sbms.Model.School;
import com.spicetech.sbms.Service.SbmsException;
import com.spicetech.sbms.Service.SchoolService;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/schools")
public class SchoolController {

    private final SchoolService schoolService;

    @Autowired
    public SchoolController(SchoolService schoolService) {
        this.schoolService = schoolService;
    }

    @PostMapping
    public ResponseEntity<School> createSchool(@RequestBody School school) {
        try {
            School createdSchool = schoolService.createSchool(school);
            return new ResponseEntity<>(createdSchool, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping
    public ResponseEntity<List<School>> getAllSchools() {
        try {
            List<School> schools = schoolService.getAllSchools();
            return new ResponseEntity<>(schools, HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<School> getSchoolById(@PathVariable Long id) {
        try {
            School school = schoolService.getSchoolById(id);
            return new ResponseEntity<>(school, HttpStatus.OK);
        } catch (SbmsException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


    @DeleteMapping("/{schoolId}")
    public ResponseEntity<Void> deleteSchoolById(@PathVariable("schoolId") Long schoolId) {
        try {
            schoolService.deleteSchoolById(schoolId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (SbmsException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}

