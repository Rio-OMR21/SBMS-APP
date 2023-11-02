package com.spicetech.sbms.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spicetech.sbms.Model.School;
import com.spicetech.sbms.Repository.SchoolRepository;

import java.util.List;
import java.util.Optional;

@Service
public class SchoolService {

    private final SchoolRepository schoolRepository;

    @Autowired
    public SchoolService(SchoolRepository schoolRepository) {
        this.schoolRepository = schoolRepository;
    }

    public School createSchool(School school) {
        return schoolRepository.save(school);
    }

    public List<School> getAllSchools() {
        return schoolRepository.findAll();
    }

    public School getSchoolById(Long schoolId) {
        Optional<School> optionalSchool = schoolRepository.findById(schoolId);
        if (optionalSchool.isPresent()) {
            return optionalSchool.get();
        } else {
            throw new SbmsException("School with ID " + schoolId + " not found");
        }
    }


    public void deleteSchoolById(Long schoolId) {
        if (schoolRepository.existsById(schoolId)) {
            schoolRepository.deleteById(schoolId);
        } else {
            throw new SbmsException("School with ID " + schoolId + " not found");
        }
    }
}
