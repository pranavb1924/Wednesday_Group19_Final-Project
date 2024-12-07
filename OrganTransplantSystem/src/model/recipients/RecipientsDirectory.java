/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.recipients;

import java.util.ArrayList;

/**
 *
 * @author ivyju
 */
public class RecipientsDirectory {
    
    ArrayList<Recipient> recipientDirectory;

    public ArrayList<Recipient> getReceipientDirectory() {
        return recipientDirectory;
    }

    public void setRecipientDirectory(ArrayList<Recipient> recipientDirectory) {
        this.recipientDirectory = recipientDirectory;
    }

    public RecipientsDirectory() {
        this.recipientDirectory = new ArrayList<Recipient>();
    }
    
    public void addNewReceipient(Recipient d){
        this.recipientDirectory.add(d);
    }
    
}
