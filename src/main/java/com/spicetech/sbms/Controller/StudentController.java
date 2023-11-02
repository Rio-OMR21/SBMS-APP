package com.spicetech.sbms.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.spicetech.sbms.Model.Student;
import com.spicetech.sbms.Service.SbmsException;
import com.spicetech.sbms.Service.StudentService;
import com.spicetech.sbms.Repository.StudentRepository;

import java.util.List;

@CrossOrigin(origins = "*", allowedHeaders = "*")
@RestController
@RequestMapping("/api/students")
public class StudentController {

    @Autowired
    private StudentService studentService;

    @Autowired
    private StudentRepository StudentRepository;


    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        try {
            return studentService.createStudent(student);
        } catch (Exception e) {
            throw new SbmsException("Failed to create student: " + e.getMessage());
        }
    }

    @GetMapping
    public List<Student> getAllStudents() {
        try {
            return studentService.getAllStudents();
        } catch (Exception e) {
            throw new SbmsException("Failed to retrieve students: " + e.getMessage());
        }
    }

    @GetMapping("/{studentId}")
    public Student getStudentById(@PathVariable Long id) {
        try {
            return studentService.getStudentById(id);
        } catch (SbmsException e) {
            throw new SbmsException("Student with ID " + id + " not found");
        } catch (Exception e) {
            throw new SbmsException("Failed to retrieve student: " + e.getMessage());
        }
    }

    @DeleteMapping("/{studentId}")
    public ResponseEntity<Student> deleteById(@PathVariable("studentId") Long studentId) {
        try {
            studentService.deleteStudentById(studentId);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } catch (SbmsException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


   
}
