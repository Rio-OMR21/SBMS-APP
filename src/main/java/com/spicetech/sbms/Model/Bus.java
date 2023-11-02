package com.spicetech.sbms.Model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;


@Entity
public class Bus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "busId")
    private Long id;

    private String busPlateNumber;
    private int capacity;
    private String busOwnerName;
    private String busOwnerTelephone;
    private String busOwnerEmail;
    private String driverName;
    private String driverTelephone;

    @OneToMany
    private List<Student> students;

    public Bus() {
        
    }

    public Bus(Long id, String busPlateNumber, int capacity, String busOwnerName,
               String busOwnerTelephone, String busOwnerEmail, String driverName, String driverTelephone) {
        this.id = id;
        this.busPlateNumber = busPlateNumber;
        this.capacity = capacity;
        this.busOwnerName = busOwnerName;
        this.busOwnerTelephone = busOwnerTelephone;
        this.busOwnerEmail = busOwnerEmail;
        this.driverName = driverName;
        this.driverTelephone = driverTelephone;
    }


    public Long getBusId() {
        return id;
    }

    public void setBusId(Long busId) {
        this.id = busId;
    }

    public String getBusPlateNumber() {
        return busPlateNumber;
    }

    public void setBusPlateNumber(String busPlateNumber) {
        this.busPlateNumber = busPlateNumber;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public String getBusOwnerName() {
        return busOwnerName;
    }

    public void setBusOwnerName(String busOwnerName) {
        this.busOwnerName = busOwnerName;
    }

    public String getBusOwnerTelephone() {
        return busOwnerTelephone;
    }

    public void setBusOwnerTelephone(String busOwnerTelephone) {
        this.busOwnerTelephone = busOwnerTelephone;
    }

    public String getBusOwnerEmail() {
        return busOwnerEmail;
    }

    public void setBusOwnerEmail(String busOwnerEmail) {
        this.busOwnerEmail = busOwnerEmail;
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName;
    }

    public String getDriverTelephone() {
        return driverTelephone;
    }

    public void setDriverTelephone(String driverTelephone) {
        this.driverTelephone = driverTelephone;
    }

    @Override
    public String toString() {
        return "Bus [busId=" + id + ", busPlateNumber=" + busPlateNumber
                + ", capacity=" + capacity + ", busOwnerName=" + busOwnerName + ", busOwnerTelephone="
                + busOwnerTelephone + ", busOwnerEmail=" + busOwnerEmail + ", driverName=" + driverName
                + ", driverTelephone=" + driverTelephone + "]";
    }
    
}
