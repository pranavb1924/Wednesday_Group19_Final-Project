/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.HospitalManagement;

import java.util.ArrayList;

/**
 *
 * @author pranavb
 */
public class Doctor {

    private String name;
    private String specialization;
    private String hospitalId;
    private String DoctorId;
    private String phone;

    public TransplantCaseDirectory getTransplantCaseDirectory() {
        return transplantCaseDirectory;
    }

    public void setTransplantCaseDirectory(TransplantCaseDirectory transplantCaseDirectory) {
        this.transplantCaseDirectory = transplantCaseDirectory;
    }
    private TransplantCaseDirectory transplantCaseDirectory;
    
    public Doctor(){
        this.transplantCaseDirectory = new TransplantCaseDirectory();
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public String getHospitalId() {
        return hospitalId;
    }

    public void setHospitalId(String hospitalId) {
        this.hospitalId = hospitalId;
    }

    public String getDoctorId() {
        return DoctorId;
    }

    public void setDoctorId(String DoctorId) {
        this.DoctorId = DoctorId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    @Override
    public String toString(){
        return this.name.toUpperCase();
    }
}
