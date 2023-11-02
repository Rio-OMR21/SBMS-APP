package com.spicetech.sbms.Model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Payment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paymentId")
    private Long id;
    
    @ManyToOne
    @JoinColumn(name = "studentId")
    private Student student;
    
    private double amount;
    private LocalDate date;


    public Payment() {
        
    }

    public Payment(Long paymentId, Student student, double amount, LocalDate date) {
        this.id = id;
        this.student = student;
        this.amount = amount;
        this.date = date;
    }

   

    public Long getPaymentId() {
        return id;
    }

    public void setPaymentId(Long paymentId) {
        this.id = paymentId;
    }

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Payments [paymentId=" + id + ", students=" + student + ", amount=" + amount + ", date=" + date
                + "]";
    }
    
}

