package com.spicetech.sbms.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.spicetech.sbms.Model.Attendance;
import com.spicetech.sbms.Model.Student;

import java.util.Date;
import java.util.List;

@Repository
public interface AttendanceRepository extends JpaRepository<Attendance, Long> {

    @Override
    List<Attendance> findAll();

}

