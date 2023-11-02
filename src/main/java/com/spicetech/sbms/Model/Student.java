package com.spicetech.sbms.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "studentId")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "schoolId")
    private School school;
    
    private String firstName;
    private String middleName;
    private String lastName;
    private String gender;
    private String classGrade;
    private String homeStreetAddress;
    private String parentFirstName;
    private String parentMiddleName;
    private String parentLastName;
    private String parentTelephone;
    private String parentEmail;


    public Student() {
    }


    public Student(Long id, School school, String firstName, String middleName, String lastName, String gender,
            String classGrade, String homeStreetAddress, String parentFirstName, String parentMiddleName,
            String parentLastName, String parentTelephone, String parentEmail) {
        this.id = id;
        this.school = school;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.gender = gender;
        this.classGrade = classGrade;
        this.homeStreetAddress = homeStreetAddress;
        this.parentFirstName = parentFirstName;
        this.parentMiddleName = parentMiddleName;
        this.parentLastName = parentLastName;
        this.parentTelephone = parentTelephone;
        this.parentEmail = parentEmail;
    }


    public Long getStudentId() {
        return id;
    }


    public void setStudentId(Long id) {
        this.id = id;
    }


    public School getSchool() {
        return school;
    }


    public void setSchool(School school) {
        this.school = school;
    }


    public String getFirstName() {
        return firstName;
    }


    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }


    public String getMiddleName() {
        return middleName;
    }


    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }


    public String getLastName() {
        return lastName;
    }


    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


    public String getGender() {
        return gender;
    }


    public void setGender(String gender) {
        this.gender = gender;
    }


    public String getClassGrade() {
        return classGrade;
    }


    public void setClassGrade(String classGrade) {
        this.classGrade = classGrade;
    }


    public String getHomeStreetAddress() {
        return homeStreetAddress;
    }


    public void setHomeStreetAddress(String homeStreetAddress) {
        this.homeStreetAddress = homeStreetAddress;
    }


    public String getParentFirstName() {
        return parentFirstName;
    }


    public void setParentFirstName(String parentFirstName) {
        this.parentFirstName = parentFirstName;
    }


    public String getParentMiddleName() {
        return parentMiddleName;
    }


    public void setParentMiddleName(String parentMiddleName) {
        this.parentMiddleName = parentMiddleName;
    }


    public String getParentLastName() {
        return parentLastName;
    }


    public void setParentLastName(String parentLastName) {
        this.parentLastName = parentLastName;
    }


    public String getParentTelephone() {
        return parentTelephone;
    }


    public void setParentTelephone(String parentTelephone) {
        this.parentTelephone = parentTelephone;
    }


    public String getParentEmail() {
        return parentEmail;
    }


    public void setParentEmail(String parentEmail) {
        this.parentEmail = parentEmail;
    }


    @Override
    public String toString() {
        return "Students [studentId=" + id + ", school=" + school + ", firstName=" + firstName + ", middleName="
                + middleName + ", lastName=" + lastName + ", gender=" + gender + ", classGrade=" + classGrade
                + ", homeStreetAddress=" + homeStreetAddress + ", parentFirstName=" + parentFirstName
                + ", parentMiddleName=" + parentMiddleName + ", parentLastName=" + parentLastName + ", parentTelephone="
                + parentTelephone + ", parentEmail=" + parentEmail + "]";
    }

    

    

    

    
}
