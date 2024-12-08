/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalManagement;

import DatabaseConn.DatabaseConnection;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.HospitalManagement.DoctorDirectory;
import model.HospitalManagement.Hospital;
import model.HospitalManagement.HospitalDirectory;
import model.HospitalManagement.TransplantCase;
import model.HospitalManagement.TransplantCaseDirectory;
import model.donor.DonorDirectory;
import model.users.User;

/**
 *
 * @author pranavb
 */
public class DoctorTransplantCaseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorTransplantCaseJPanel
     */
    JPanel userProcessContainer;
    HospitalDirectory hospitalDirectory;
    DoctorDirectory doctorDirectory;
    Connection connection;
    Hospital hospital;
    User user;
    DonorDirectory donorDirectory;
    public DoctorTransplantCaseJPanel(JPanel userProcessContainer, HospitalDirectory hospitalDirectory, DoctorDirectory doctorDirectory, Connection connection, Hospital hospital, User user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.hospitalDirectory = hospitalDirectory;
        this.doctorDirectory = doctorDirectory;
        this.connection = connection;
        this.hospital = hospital;
        this.user = user;
        this.populateTransplantCasesTable();
    }
    
    private void populateTransplantCasesTable() {

    DefaultTableModel model = (DefaultTableModel) tblTransplantCase.getModel();
    model.setRowCount(0);
    TransplantCaseDirectory transplantCaseDirectory = new TransplantCaseDirectory();

    try {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection connection = databaseConnection.getConnection();
        String query = "SELECT * FROM transplantPatients where DoctorId = '"+this.user.getId()+"'";
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
            transplantCase.setOrganID(resultSet.getString("OrganID"));
            transplantCase.setBloodType(resultSet.getString("BloodType"));
            transplantCase.setPriorityScore(resultSet.getDouble("PriorityScore"));
            transplantCase.setUrgencyLevel(resultSet.getString("UrgencyLevel"));
            transplantCase.setAddedDate(resultSet.getDate("AddedDate").toString());
            transplantCase.setApprovalStatus(resultSet.getString("ApprovalStatus"));
            transplantCase.setSizeRequirement(resultSet.getInt("SizeRequirement"));
            transplantCase.setReasonForRemoval(resultSet.getString("ReasonForRemoval"));
            transplantCase.setAssignedDoctor(resultSet.getString("DoctorID"));
            transplantCaseDirectory.addNewCase(transplantCase);
        }

        for (TransplantCase transplantCase : transplantCaseDirectory.getTransplantCases()) {
            Object[] row = new Object[4];
            row[0] = transplantCase;
            row[1] = transplantCase.getDateOfBirth();
            row[2] = transplantCase.getRequiredTransplant().toUpperCase();
            row[3] = transplantCase.getPriorityScore();
            model.insertRow(model.getRowCount(), row);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading transplant cases: " + e.getMessage());
    }
}
    private void populateTransplantCasesTable() {

    DefaultTableModel model = (DefaultTableModel) tblTransplantCase.getModel();
    model.setRowCount(0);
    TransplantCaseDirectory transplantCaseDirectory = new TransplantCaseDirectory();

    try {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection connection = databaseConnection.getConnection();
        String query = "SELECT * FROM transplantPatients where DoctorId = '"+this.user.getId()+"'";
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
            transplantCase.setOrganID(resultSet.getString("OrganID"));
            transplantCase.setBloodType(resultSet.getString("BloodType"));
            transplantCase.setPriorityScore(resultSet.getDouble("PriorityScore"));
            transplantCase.setUrgencyLevel(resultSet.getString("UrgencyLevel"));
            transplantCase.setAddedDate(resultSet.getDate("AddedDate").toString());
            transplantCase.setApprovalStatus(resultSet.getString("ApprovalStatus"));
            transplantCase.setSizeRequirement(resultSet.getInt("SizeRequirement"));
            transplantCase.setReasonForRemoval(resultSet.getString("ReasonForRemoval"));
            transplantCase.setAssignedDoctor(resultSet.getString("DoctorID"));
            transplantCaseDirectory.addNewCase(transplantCase);
        }

        for (TransplantCase transplantCase : transplantCaseDirectory.getTransplantCases()) {
            Object[] row = new Object[4];
            row[0] = transplantCase;
            row[1] = transplantCase.getDateOfBirth();
            row[2] = transplantCase.getRequiredTransplant().toUpperCase();
            row[3] = transplantCase.getPriorityScore();
            model.insertRow(model.getRowCount(), row);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading transplant cases: " + e.getMessage());
    }
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
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblDonorRequests = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblRecepient = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        tblDonor = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(1200, 830));
        setMinimumSize(new java.awt.Dimension(1200, 830));

        jTextField1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("TRANSPLANT CASES");

        tblTransplantCase.setBackground(new java.awt.Color(22, 29, 29));
        tblTransplantCase.setForeground(new java.awt.Color(255, 255, 255));
        tblTransplantCase.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Patient Name", "Patient Date of Birth", "Transplant Organ", "Priority Score"
            }
        ));
        tblTransplantCase.setSelectionBackground(new java.awt.Color(110, 146, 147));
        jScrollPane1.setViewportView(tblTransplantCase);

        jButton1.setText("VIEW CASE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("FIND A MATCH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tblDonorRequests.setBackground(new java.awt.Color(22, 29, 29));
        tblDonorRequests.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tblDonorRequests.setForeground(new java.awt.Color(255, 255, 255));
        tblDonorRequests.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "DONOR NAME", "DONOR DATE OF BIRTH", "DONOR ZIP CODE", "APPROVAL STATUS", "BLOOD TYPE"
            }
        ));
        tblDonorRequests.setRowHeight(20);
        tblDonorRequests.setSelectionBackground(new java.awt.Color(110, 146, 147));
        jScrollPane2.setViewportView(tblDonorRequests);

        tblRecepient.setBackground(new java.awt.Color(22, 29, 29));
        tblRecepient.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tblRecepient.setForeground(new java.awt.Color(255, 255, 255));
        tblRecepient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ));
        tblRecepient.setRowHeight(20);
        tblRecepient.setSelectionBackground(new java.awt.Color(110, 146, 147));
        jScrollPane3.setViewportView(tblRecepient);

        tblDonor.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "", ""
            }
        ));
        jScrollPane4.setViewportView(tblDonor);

        jButton3.setText("SEARCH");

        jButton4.setText("ADD TO REQUEST");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("Patient Name");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTextField1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 181, Short.MAX_VALUE)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(141, 141, 141)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                            .addComponent(jScrollPane2))
                        .addGap(0, 55, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(115, 115, 115))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblTransplantCase.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
       TransplantCase transplantCase = (TransplantCase) tblTransplantCase.getValueAt(selectedRowIndex, 0);
       this.addPatient(transplantCase);
       
        
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton2ActionPerformed

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

    private void addPatient(TransplantCase tc){
      DefaultTableModel model = (DefaultTableModel) tblRecepient.getModel();
      model.setRowCount(0);
Object[][] rows = {
    {"Transplant Case", tc != null ? tc : "N/A"},
    {"Patient ID", tc.getPatientID() != null ? tc.getPatientID() : "N/A"},
    {"Patient Name", tc.getPatientName() != null ? tc.getPatientName() : "N/A"},
    {"Date of Birth", tc.getDateOfBirth() != null ? tc.getDateOfBirth() : "N/A"},
    {"Scan Image", tc.getScanImage() != null ? "[Binary Data]" : "N/A"},
    {"Patient Info", tc.getPatientInfo() != null ? tc.getPatientInfo() : "N/A"},
    {"Required Transplant", tc.getRequiredTransplant() != null ? tc.getRequiredTransplant().toUpperCase() : "N/A"},
    {"Organ ID", tc.getOrganID() != null ? tc.getOrganID() : "N/A"},
    {"Blood Type", tc.getBloodType() != null ? tc.getBloodType() : "N/A"},
    {"Priority Score", tc.getPriorityScore() != 0.0 ? tc.getPriorityScore() : "N/A"},
    {"Urgency Level", tc.getUrgencyLevel() != null ? tc.getUrgencyLevel() : "N/A"},
    {"Added Date", tc.getAddedDate() != null ? tc.getAddedDate() : "N/A"},
    {"Approval Status", tc.getApprovalStatus() != null ? tc.getApprovalStatus() : "N/A"},
    {"Size Requirement", tc.getSizeRequirement() != 0 ? tc.getSizeRequirement() : "N/A"},
    {"Reason for Removal", tc.getReasonForRemoval() != null ? tc.getReasonForRemoval() : "N/A"},
    {"Assigned Doctor", tc.getAssignedDoctor() != null ? tc.getAssignedDoctor() : "N/A"}
};


    // Add each row to the table
    for (Object[] row : rows) {
        model.insertRow(model.getRowCount(), row);
    }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTable tblDonor;
    private javax.swing.JTable tblDonorRequests;
    private javax.swing.JTable tblRecepient;
    private javax.swing.JTable tblTransplantCase;
    // End of variables declaration//GEN-END:variables
}
