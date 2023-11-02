package com.spicetech.sbms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spicetech.sbms.Model.School;
import com.spicetech.sbms.Model.Student;

import java.util.List;

@Repository
public interface SchoolRepository extends JpaRepository<School, Long> {

    void deleteSchoolById(Long schoolId);

    @Override
    List<School> findAll();



}

