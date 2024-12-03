/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.HospitalManagement;

/**
 *
 * @author pranavb
 */
public class TransplantCase {
    private String patientID;
    private String patientName;
    private String dateOfBirth;
    private byte[] scanImage;
    private String patientInfo;
    private String requiredTransplant;
    private String organID;
    private String bloodType;
    private double priorityScore;
    private String urgencyLevel;
    private String addedDate;
    private String approvalStatus;
    private int sizeRequirement;
    private String reasonForRemoval;

    // Getters and Setters for all fields
    public String getPatientID() {
        return patientID;
    }

    public void setPatientID(String patientID) {
        this.patientID = patientID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public byte[] getScanImage() {
        return scanImage;
    }

    public void setScanImage(byte[] scanImage) {
        this.scanImage = scanImage;
    }

    public String getPatientInfo() {
        return patientInfo;
    }

    public void setPatientInfo(String patientInfo) {
        this.patientInfo = patientInfo;
    }

    public String getRequiredTransplant() {
        return requiredTransplant;
    }

    public void setRequiredTransplant(String requiredTransplant) {
        this.requiredTransplant = requiredTransplant;
    }

    public String getOrganID() {
        return organID;
    }

    public void setOrganID(String organID) {
        this.organID = organID;
    }

    public String getBloodType() {
        return bloodType;
    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public double getPriorityScore() {
        return priorityScore;
    }

    public void setPriorityScore(double priorityScore) {
        this.priorityScore = priorityScore;
    }

    public String getUrgencyLevel() {
        return urgencyLevel;
    }

    public void setUrgencyLevel(String urgencyLevel) {
        this.urgencyLevel = urgencyLevel;
    }

    public String getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(String addedDate) {
        this.addedDate = addedDate;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public int getSizeRequirement() {
        return sizeRequirement;
    }

    public void setSizeRequirement(int sizeRequirement) {
        this.sizeRequirement = sizeRequirement;
    }

    public String getReasonForRemoval() {
        return reasonForRemoval;
    }

    public void setReasonForRemoval(String reasonForRemoval) {
        this.reasonForRemoval = reasonForRemoval;
    }

    // Override toString to represent the object by the patient's name
    @Override
    public String toString() {
        return patientName.toUpperCase();
    }
}

