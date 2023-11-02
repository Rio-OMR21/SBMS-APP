package com.spicetech.sbms.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "schoolId")
    private Long id;
    
    private String schoolName;
    private String streetAddress;
    private String telephone;
    private String schoolEmail;

    @OneToMany
    private List<Student> students;


    public School() {
        
    }

    public School(Long id, String schoolName, String streetAddress, String telephone, String schoolEmail) {
        this.id = id;
        this.schoolName = schoolName;
        this.streetAddress = streetAddress;
        this.telephone = telephone;
        this.schoolEmail = schoolEmail;
       
    }


    public Long getSchoolId() {
        return id;
    }

    public void setSchoolId(Long id) {
        this.id = id;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getSchoolEmail() {
        return schoolEmail;
    }

    public void setSchoolEmail(String schoolEmail) {
        this.schoolEmail = schoolEmail;
    }


    @Override
    public String toString() {
        return "School [schoolId=" + id + ", schoolName=" + schoolName + ", streetAddress=" + streetAddress
                + ", telephone=" + telephone + ", schoolEmail=" + schoolEmail + "]";
    }
}
