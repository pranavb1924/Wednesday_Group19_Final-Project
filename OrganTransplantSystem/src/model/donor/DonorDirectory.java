/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.donor;
import java.util.*;
import model.donor.Donor;

/**
 *
 * @author pranavb
 */
public class DonorDirectory {
    
    ArrayList<Donor> donorDirectory;

    public ArrayList<Donor> getDonorDirectory() {
        return donorDirectory;
    }

    public void setDonorDirectory(ArrayList<Donor> donorDirectory) {
        this.donorDirectory = donorDirectory;
    }

    public DonorDirectory() {
        this.donorDirectory = new ArrayList<Donor>();
    }
    
    public void addNewDonor(Donor d){
        this.donorDirectory.add(d);
    }
    
}
