package com.spicetech.sbms.Model;

import java.util.Date;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Attendance {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "attendanceId")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "busId")
    private Bus bus;

    private Date date;
    private LocalDate homeDepartureTime;
    private LocalDate schoolArrivalTime;
    private LocalDate schoolDepartureTime;
    private LocalDate homeArrivalTime;


    public Attendance() {
        
    }

    public Attendance(Long id, Student student, Bus bus, Date date, LocalDate homeDepartureTime,
                      LocalDate schoolArrivalTime, LocalDate schoolDepartureTime, LocalDate homeArrivalTime) {
        this.id = id;
        this.student = student;
        this.bus = bus;
        this.date = date;
        this.homeDepartureTime = homeDepartureTime;
        this.schoolArrivalTime = schoolArrivalTime;
        this.schoolDepartureTime = schoolDepartureTime;
        this.homeArrivalTime = homeArrivalTime;
    }

    

    public Long getAttendanceId() {
        return id;
    }

    public void setAttendanceId(Long attendanceId) {
        this.id = attendanceId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Bus getBus() {
        return bus;
    }

    public void setBus(Bus bus) {
        this.bus = bus;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public LocalDate getHomeDepartureTime() {
        return homeDepartureTime;
    }

    public void setHomeDepartureTime(LocalDate homeDepartureTime) {
        this.homeDepartureTime = homeDepartureTime;
    }

    public LocalDate getSchoolArrivalTime() {
        return schoolArrivalTime;
    }

    public void setSchoolArrivalTime(LocalDate schoolArrivalTime) {
        this.schoolArrivalTime = schoolArrivalTime;
    }

    public LocalDate getSchoolDepartureTime() {
        return schoolDepartureTime;
    }

    public void setSchoolDepartureTime(LocalDate schoolDepartureTime) {
        this.schoolDepartureTime = schoolDepartureTime;
    }

    public LocalDate getHomeArrivalTime() {
        return homeArrivalTime;
    }

    public void setHomeArrivalTime(LocalDate homeArrivalTime) {
        this.homeArrivalTime = homeArrivalTime;
    }

    @Override
    public String toString() {
        return "Attendance [attendanceId=" + id + ", student=" + student + ", bus=" + bus + ", date=" + date
                + ", homeDepartureTime=" + homeDepartureTime + ", schoolArrivalTime=" + schoolArrivalTime
                + ", schoolDepartureTime=" + schoolDepartureTime + ", homeArrivalTime=" + homeArrivalTime + "]";
    }
    
}
