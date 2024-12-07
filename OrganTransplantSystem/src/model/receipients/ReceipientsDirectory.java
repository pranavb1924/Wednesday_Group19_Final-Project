/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.receipients;

import java.util.ArrayList;
import model.donor.Donor;

/**
 *
 * @author ivyju
 */
public class ReceipientsDirectory {
    
    ArrayList<Receipient> receipientDirectory;

    public ArrayList<Receipient> getReceipientDirectory() {
        return receipientDirectory;
    }

    public void setReceipientDirectory(ArrayList<Receipient> receipientDirectory) {
        this.receipientDirectory = receipientDirectory;
    }

    public ReceipientsDirectory() {
        this.receipientDirectory = new ArrayList<Receipient>();
    }
    
    public void addNewReceipient(Receipient d){
        this.receipientDirectory.add(d);
    }
    
}
