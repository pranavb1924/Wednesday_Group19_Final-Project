/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.HospitalManagement;

/**
 *
 * @author pranavb
 */
import java.util.*;
public class TransplantRequest {
    
    private String transplantID;
    private String donorID;
    private String recipientID;
    private String organID;
    private Date transplantDate;
    private String outcome;
    private String legalApproval;
    private String transportStatus;

    public TransplantRequest() {}

    public TransplantRequest(String transplantID, String donorID, String recipientID, String organID, Date transplantDate,
                      String outcome, String legalApproval, String transportStatus) {
        this.transplantID = transplantID;
        this.donorID = donorID;
        this.recipientID = recipientID;
        this.organID = organID;
        this.transplantDate = transplantDate;
        this.outcome = outcome;
        this.legalApproval = legalApproval;
        this.transportStatus = transportStatus;
    }

    public String getTransplantID() {
        return transplantID;
    }

    public void setTransplantID(String transplantID) {
        this.transplantID = transplantID;
    }

    public String getDonorID() {
        return donorID;
    }

    public void setDonorID(String donorID) {
        this.donorID = donorID;
    }

    public String getRecipientID() {
        return recipientID;
    }

    public void setRecipientID(String recipientID) {
        this.recipientID = recipientID;
    }

    public String getOrganID() {
        return organID;
    }

    public void setOrganID(String organID) {
        this.organID = organID;
    }

    public Date getTransplantDate() {
        return transplantDate;
    }

    public void setTransplantDate(Date transplantDate) {
        this.transplantDate = transplantDate;
    }

    public String getOutcome() {
        return outcome;
    }

    public void setOutcome(String outcome) {
        this.outcome = outcome;
    }

    public String getLegalApproval() {
        return legalApproval;
    }

    public void setLegalApproval(String legalApproval) {
        this.legalApproval = legalApproval;
    }

    public String getTransportStatus() {
        return transportStatus;
    }

    public void setTransportStatus(String transportStatus) {
        this.transportStatus = transportStatus;
    }
}
