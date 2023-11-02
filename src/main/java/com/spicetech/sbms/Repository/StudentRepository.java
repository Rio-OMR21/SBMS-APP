package com.spicetech.sbms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spicetech.sbms.Model.Student;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
    void deleteById(Long studentId);

    @Override
    List<Student> findAll();

}

