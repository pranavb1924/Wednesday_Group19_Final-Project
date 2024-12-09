/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.HospitalManagement;
import java.util.ArrayList;
import model.HospitalManagement.TransplantCoordinator;

/**
 *
 * @author pranavb
 */
public class TransplantCoordinatorDirectory {

    public TransplantCoordinatorDirectory() {
        this.transplantCoordinatorDirectory = new ArrayList<TransplantCoordinator>();
    }
    
    ArrayList<TransplantCoordinator> transplantCoordinatorDirectory;

    public ArrayList<TransplantCoordinator> getTransplantCoordinatorDirectory() {
        return transplantCoordinatorDirectory;
    }

    public void setTransplantCoordinatorDirectory(ArrayList<TransplantCoordinator> transplantCoordinatorDirectory) {
        this.transplantCoordinatorDirectory = transplantCoordinatorDirectory;
    }
    
    public void addNewCoordinator(TransplantCoordinator tc){
        this.transplantCoordinatorDirectory.add(tc);
    }
}
