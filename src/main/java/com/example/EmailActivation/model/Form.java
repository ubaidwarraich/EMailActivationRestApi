package com.example.EmailActivation.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Form {
    @Id
    private int id;
    private int applicantId;
    private String message;
    private String approvedBy;
    private int isApproved;
    private String comments;

    public Form(int id, int applicantId, String message, String approvedBy, int isApproved, String comments) {
        this.id = id;
        this.applicantId = applicantId;
        this.message = message;
        this.approvedBy = approvedBy;
        this.isApproved = isApproved;
        this.comments = comments;
    }

    public Form() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getApprovedBy() {
        return approvedBy;
    }

    public void setApprovedBy(String approvedBy) {
        this.approvedBy = approvedBy;
    }

    public int getIsApproved() {
        return isApproved;
    }

    public void setIsApproved(int isApproved) {
        this.isApproved = isApproved;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
