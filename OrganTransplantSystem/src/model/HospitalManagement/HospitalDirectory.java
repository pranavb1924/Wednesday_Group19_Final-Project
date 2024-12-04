/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.HospitalManagement;
import model.HospitalManagement.*;
import java.util.*;

/**
 *
 * @author pranavb
 */
public class HospitalDirectory {
    
    ArrayList<Hospital> hospitalDirectory;

    public HospitalDirectory(){
        this.hospitalDirectory = new ArrayList<Hospital>();
    }
        
    public ArrayList<Hospital> getHospitalDirectory() {
        return hospitalDirectory;
    }

    public void setHospitalDirectory(ArrayList<Hospital> hospitalDirectory) {
        this.hospitalDirectory = hospitalDirectory;
    }
    
    public void addHospital(Hospital hospital){
        this.hospitalDirectory.add(hospital);
    }
    
    public Hospital findHospital(String id){
        if(this.hospitalDirectory != null){
            for (Hospital h : this.hospitalDirectory){
                if (h.getId().equals(id)){
                    return h;
                }
        }
        }
        return null;
    }
    
    public Hospital findHospitalByAdminId(String id){
        if(this.hospitalDirectory != null){
            for (Hospital h : this.hospitalDirectory){
                if (h.getAdminId().equals(id)){
                    return h;
                }
        }
        if(this.hospitalDirectory != null){
            for (Hospital h : this.hospitalDirectory){
                if (h.getCoordinatorId().equals(id)){
                    return h;
                }
        }
        }
        
    }
        return null;
    }
}
