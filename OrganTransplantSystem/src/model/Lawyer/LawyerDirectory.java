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

    public void setLawyerDirectory(ArrayList<Lawyer> lawyerDirectory) {
        this.lawyerDirectory = lawyerDirectory;
    }
    
    public void addNewLawyer(Lawyer lawyer){
        if(this.lawyerDirectory == null){
            this.lawyerDirectory = new ArrayList<Lawyer>();
        }
        this.lawyerDirectory.add(lawyer);
    }
    
    public Lawyer searchLawyer(String id){
        for (Lawyer d: this.lawyerDirectory){
            if (d.getLawyerID().equals(id)){
                return d;
            }
        }
        return null;
    }
    
    public Lawyer searchLawyerName(String name){
        for (Lawyer d: this.lawyerDirectory){
            if (d.getName().equals(name)){
                return d;
            }
        }
        return null;
    }
    
    public void removeLawyer(Lawyer lawyer){
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
