/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.Lawyer;

import java.util.ArrayList;

/**
 *
 * @author rexinshiminsutongxue
 */
public class LawyerDirectory {
    
    ArrayList<Lawyer> lawyerDirectory;

    public LawyerDirectory(){
        
    }
        
    public ArrayList<Lawyer> getLawyerDirectory() {
        return lawyerDirectory;
    }

    public void setDoctorDirectory(ArrayList<Lawyer> doctorDirectory) {
        this.lawyerDirectory = doctorDirectory;
    }
    
    public void addNewDoctor(Lawyer doctor){
        if(this.lawyerDirectory == null){
            this.lawyerDirectory = new ArrayList<Lawyer>();
        }
        this.lawyerDirectory.add(doctor);
    }
    
    public Lawyer searchDoctor(String id){
        for (Lawyer d: this.lawyerDirectory){
            if (d.getLawyerID().equals(id)){
                return d;
            }
        }
        return null;
    }
    
    public void removeDoctor(Lawyer lawyer){
        this.lawyerDirectory.remove(lawyer);
    }
    public Lawyer findLawyerById(String id){
        if(this.lawyerDirectory != null){
            for (Lawyer l : this.lawyerDirectory){
                if (l.getLawyerID().equals(id)){
                    return l;
                }
        }
        }
        return null;
    }
    
}
