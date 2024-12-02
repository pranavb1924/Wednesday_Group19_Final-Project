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
public class TransplantCaseDirectory {
    private ArrayList<TransplantCase> transplantCases;

    public TransplantCaseDirectory() {
        transplantCases = new ArrayList<>();
    }

    public ArrayList<TransplantCase> getTransplantCases() {
        return transplantCases;
    }

    public void addNewCase(TransplantCase newCase) {
        transplantCases.add(newCase);
    }

    public TransplantCase searchByPatientID(String patientID) {
        for (TransplantCase transplantCase : transplantCases) {
            if (transplantCase.getPatientID().equalsIgnoreCase(patientID)) {
                return transplantCase;
            }
        }
        return null;
    }
}
