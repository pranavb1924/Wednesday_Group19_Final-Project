/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalManagement;
import java.awt.CardLayout;
import java.util.*;
import javax.swing.*;
import model.HospitalManagement.*;
import javax.swing.*; 
import javax.swing.table.DefaultTableModel; 
import java.sql.*; 
import DatabaseConn.DatabaseConnection;


/**
 *
 * @author pranavb
 */
public class TransplantCasesJPanel extends javax.swing.JPanel {

    /**
     * Creates new form TransplantCasesJPanel
     */
    JPanel userProcessContainer;
    Hospital hospital;
    public TransplantCasesJPanel(JPanel userProcessContainer, Hospital hospital) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.hospital = hospital;
        this.populateTransplantCasesTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransplantCase = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setBackground(new java.awt.Color(110, 146, 147));
        setMaximumSize(new java.awt.Dimension(1200, 830));
        setMinimumSize(new java.awt.Dimension(1200, 830));
        setPreferredSize(new java.awt.Dimension(1200, 830));

        jTextField1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("TRANSPLANT CASES");

        tblTransplantCase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient Date of Birth", "Transplant Organ", "Doctor Assigned"
            }
        ));
        jScrollPane1.setViewportView(tblTransplantCase);

        jButton1.setText("VIEW CASE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("NEW CASE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        btnBack.setText("BACK");

        jButton2.setText("SEARCH");

        jButton4.setText("SEND TO LAWYER");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(53, 53, 53)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 242, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2)
                                        .addGap(131, 131, 131)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(96, 96, 96))
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1140, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 14, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(396, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        AddTransplantCaseJPanel addTransplantCaseJPanel = new AddTransplantCaseJPanel(this.userProcessContainer, this.hospital);
        userProcessContainer.add("AddTransplantCaseJPanel", addTransplantCaseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton3ActionPerformed

    
    private void populateTransplantCasesTable() {
    TransplantCaseDirectory transplantCaseDirectory = new TransplantCaseDirectory();
    DefaultTableModel model = (DefaultTableModel) tblTransplantCase.getModel();
    model.setRowCount(0);

    try {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection connection = databaseConnection.getConnection();
        String query = "SELECT * FROM transplantPatients WHERE hospitalID = '"+this.hospital.getId()+"'";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            TransplantCase transplantCase = new TransplantCase();
            transplantCase.setPatientID(resultSet.getString("PatientID"));
            transplantCase.setPatientName(resultSet.getString("PatientName"));
            transplantCase.setDateOfBirth(resultSet.getDate("DateOfBirth").toString());
            transplantCase.setScanImage(resultSet.getBytes("ScanImage"));
            transplantCase.setPatientInfo(resultSet.getString("PatientInfo"));
            transplantCase.setRequiredTransplant(resultSet.getString("RequiredTransplant"));
            transplantCase.setAssignedDoctor(resultSet.getString("DoctorID"));
            transplantCaseDirectory.addNewCase(transplantCase);
            
        }

        for (TransplantCase transplantCase : transplantCaseDirectory.getTransplantCases()) {
            Object[] row = new Object[4];
            Doctor doctor = this.hospital.getDoctorDirectory().searchDoctor(transplantCase.getAssignedDoctor());
            row[0] = transplantCase;
            row[1] = transplantCase.getDateOfBirth();
            row[2] = transplantCase.getRequiredTransplant();
            row[3] = doctor != null ? doctor.getName() : "";
            model.insertRow(model.getRowCount(), row);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading transplant cases: " + e.getMessage());
    }
}


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                int selectedRowIndex = tblTransplantCase.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
       TransplantCase transplantCase = (TransplantCase) tblTransplantCase.getValueAt(selectedRowIndex, 0);
        
        ViewTransplantCaseJPanel viewTransplantCaseJPanel = new ViewTransplantCaseJPanel(this.userProcessContainer, transplantCase.getPatientID().toString());
        userProcessContainer.add("ViewTransplantCaseJPanel", viewTransplantCaseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblTransplantCase.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
       String patientName= tblTransplantCase.getValueAt(selectedRowIndex, 0).toString();
        CoordinatorToLawyerRequest coordinatorToLawyerRequest = new CoordinatorToLawyerRequest(this.userProcessContainer, patientName);
        userProcessContainer.add("CoordinatorToLawyerRequest", coordinatorToLawyerRequest);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblTransplantCase;
    // End of variables declaration//GEN-END:variables
}
