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

    @Override
    public String toString() {
        return patientName;
    }
}
