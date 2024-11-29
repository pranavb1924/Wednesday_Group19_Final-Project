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
public class DoctorDirectory {
    
    ArrayList<Doctor> doctorDirectory;

    public DoctorDirectory(){
        
    }
        
    public ArrayList<Doctor> getDoctorDirectory() {
        return doctorDirectory;
    }

    public void setDoctorDirectory(ArrayList<Doctor> doctorDirectory) {
        this.doctorDirectory = doctorDirectory;
    }
    
    public void addNewDoctor(Doctor doctor){
        if(this.doctorDirectory == null){
            this.doctorDirectory = new ArrayList<Doctor>();
        }
        this.doctorDirectory.add(doctor);
    }
    
    public Doctor searchDoctor(String id){
        for (Doctor d: this.doctorDirectory){
            if (d.getDoctorId().equals(id)){
                return d;
            }
        }
        return null;
    }
    
    public void removeDoctor(Doctor doctor){
        this.doctorDirectory.remove(doctor);
    }
}
