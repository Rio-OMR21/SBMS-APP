package com.spicetech.sbms.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spicetech.sbms.Model.Attendance;
import com.spicetech.sbms.Repository.AttendanceRepository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class AttendanceService {

    private final AttendanceRepository attendanceRepository;

    @Autowired
    public AttendanceService(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    public Attendance createAttendance(Attendance attendance) {
        return attendanceRepository.save(attendance);
    }

    public List<Attendance> getAllAttendance() {
        return attendanceRepository.findAll();
    }

    public Attendance getAttendanceById(Long attendanceId) {
        Optional<Attendance> optionalAttendance = attendanceRepository.findById(attendanceId);
        if (optionalAttendance.isPresent()) {
            return optionalAttendance.get();
        } else {
            throw new SbmsException("Attendance with ID " + attendanceId + " not found");
        }
    }


}
