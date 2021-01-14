package com.example.EmailActivation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Applicant {
    @Id
    private int id;
    private String name;
    private  String cnic;
    private int UserId;
    private String rollNo;
    private String semester;

    public Applicant(int id, String name, String cnic, int userId, String rollNo, String semester) {
        this.id = id;
        this.name = name;
        this.cnic = cnic;
        this.UserId = userId;
        this.rollNo = rollNo;
        this.semester = semester;
    }

    public Applicant(){}

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnic() {
        return cnic;
    }

    public void setCnic(String cnic) {
        this.cnic = cnic;
    }

    public int getUserId() {
        return UserId;
    }

    public void setUserId(int userId) {
        UserId = userId;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = semester;
    }
}
