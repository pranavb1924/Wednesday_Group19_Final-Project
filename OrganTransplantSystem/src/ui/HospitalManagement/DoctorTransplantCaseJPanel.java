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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.HospitalManagement.DoctorDirectory;
import model.HospitalManagement.Hospital;
import model.HospitalManagement.HospitalDirectory;
import model.HospitalManagement.TransplantCase;
import model.HospitalManagement.TransplantCaseDirectory;
import model.donor.DonorDirectory;
import model.donor.DonorRegistrationRequest;
import model.users.User;
import java.util.*;
import ui.AdministrativeRole.ManageDonorRequestJPanel;

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
    TransplantCase selectedTc;
    DonorRegistrationRequest selectedRq;
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
    
    private Map<String, String> organMap = new HashMap<>();
    private boolean isOrganLoaded = false;

private void loadOrgans() {
    try {
        String sql = "SELECT OrganID, OrganType FROM Organs";
        PreparedStatement stmt = this.connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        
        organMap.clear();
        while (rs.next()) {
            String organID = rs.getString("OrganID");
            String organType = rs.getString("OrganType");
            organMap.put(organID, organType);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading organ types: " + e.getMessage());
    }
}

private String getOrganNameByID(String organID) {
    
    if (!this.isOrganLoaded){
        this.loadOrgans();
        this.isOrganLoaded = true;
    }
    
    return organMap.getOrDefault(organID, "Unknown Organ");
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
        txtSearchCriteria = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        btnInitiateRequest = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();

        setBackground(new java.awt.Color(22, 29, 29));
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

        jButton1.setBackground(new java.awt.Color(110, 146, 147));
        jButton1.setText("VIEW DONOR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(110, 146, 147));
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

        tblDonor.setBackground(new java.awt.Color(22, 29, 29));
        tblDonor.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        tblDonor.setForeground(new java.awt.Color(255, 255, 255));
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
        tblDonor.setRowHeight(20);
        jScrollPane4.setViewportView(tblDonor);

        jButton3.setBackground(new java.awt.Color(110, 146, 147));
        jButton3.setText("SEARCH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(110, 146, 147));
        jButton4.setText("ADD TO REQUEST");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SEARCH CRITERIA");

        jButton5.setBackground(new java.awt.Color(110, 146, 147));
        jButton5.setText("ADD TO REQUEST");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jButton6.setBackground(new java.awt.Color(110, 146, 147));
        jButton6.setText("VIEW CASE");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        btnInitiateRequest.setBackground(new java.awt.Color(0, 51, 51));
        btnInitiateRequest.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnInitiateRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnInitiateRequest.setText("INITIATE REQUEST");
        btnInitiateRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInitiateRequestActionPerformed(evt);
            }
        });

        jButton7.setBackground(new java.awt.Color(110, 146, 147));
        jButton7.setText("REFRESH");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(28, 28, 28)
                                    .addComponent(btnInitiateRequest)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(61, 61, 61)
                                    .addComponent(jLabel1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtSearchCriteria, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton7))
                                .addComponent(jScrollPane2))
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 23, Short.MAX_VALUE)))
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
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtSearchCriteria, javax.swing.GroupLayout.DEFAULT_SIZE, 49, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 42, Short.MAX_VALUE)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInitiateRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblTransplantCase.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
       this.selectedTc = (TransplantCase) tblTransplantCase.getValueAt(selectedRowIndex, 0);
       this.addPatient(this.selectedTc);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.populateDonorRegistrationRequestsTable();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void populateDonorRegistrationRequestsTable() {
        int selectedRowIndex = tblTransplantCase.getSelectedRow();
    TransplantCase transplantCase = (TransplantCase) tblTransplantCase.getValueAt(selectedRowIndex, 0);
    DefaultTableModel model = (DefaultTableModel) tblDonorRequests.getModel();
    model.setRowCount(0);
    ArrayList<DonorRegistrationRequest> dr = new ArrayList<DonorRegistrationRequest>();

    try {
        DatabaseConnection databaseConnection = new DatabaseConnection();
        Connection connection = databaseConnection.getConnection();
        String query = "SELECT * FROM donorRegistrationRequests";
        PreparedStatement preparedStatement = connection.prepareStatement(query);
        ResultSet resultSet = preparedStatement.executeQuery();

        while (resultSet.next()) {
            DonorRegistrationRequest donorRequest = new DonorRegistrationRequest();
            donorRequest.setId(resultSet.getString("RequestID"));
            donorRequest.setFirstName(resultSet.getString("FirstName"));
            donorRequest.setMiddleName(resultSet.getString("MiddleName"));
            donorRequest.setLastName(resultSet.getString("LastName"));
            donorRequest.setDateOfBirth(resultSet.getDate("DateOfBirth").toString());
            donorRequest.setAddress(resultSet.getString("AddressLine2"));
            donorRequest.setCity(resultSet.getString("City"));
            donorRequest.setState(resultSet.getString("State"));
            donorRequest.setRequestDate(resultSet.getTimestamp("RequestDate").toString());
            donorRequest.setBloodType(resultSet.getString("BloodType"));
            donorRequest.setPhone(resultSet.getString("Phone"));
            donorRequest.setZipCode(resultSet.getString("ZIP"));
            donorRequest.setRegistrationApproved(resultSet.getString("RegistrationApproved"));
            donorRequest.setOrgan(resultSet.getString(("organ")));
            donorRequest.setOrganSize(resultSet.getString(("organSize")));
            donorRequest.setSsn(resultSet.getString("ssn"));
            dr.add(donorRequest);
            //|| req.getOrganSize().equals(transplantCase.getSizeRequirement())
            
 
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading donor registration requests: " + e.getMessage());
        return;
    }
    
            for (DonorRegistrationRequest req : dr) {

                if (req.getOrganSize() != null && this.getOrganNameByID(transplantCase.getOrganID()).equals(req.getOrgan()) && req.getBloodType().equals(transplantCase.getBloodType())){
            Object[] row = new Object[5];
            row[0] = req;
            row[1] = req.getDateOfBirth();
            row[2] = req.getZipCode().toUpperCase();
            row[3] = req.getRegistrationApproved();
            row[4] = req.getBloodType();
            model.insertRow(model.getRowCount(), row);
        }}
}


    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDonorRequests.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        DonorRegistrationRequest rq  = (DonorRegistrationRequest) tblDonorRequests.getValueAt(selectedRowIndex, 0);

        ManageDonorRequestJPanel manageDonorRequestJPanel = new ManageDonorRequestJPanel(userProcessContainer, null , this.user, rq);
        userProcessContainer.add("ManageDonorRequestJPanel", manageDonorRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblDonorRequests.getSelectedRow();
        this.selectedRq = (DonorRegistrationRequest) tblDonorRequests.getValueAt(selectedRowIndex, 0);
        this.addDonor(this.selectedRq);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void btnInitiateRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInitiateRequestActionPerformed
        // TODO add your handling code here:
        this.insertTransplantRecord(this.selectedRq.getId(), this.selectedTc.getPatientID(), this.selectedTc.getOrganID());
    }//GEN-LAST:event_btnInitiateRequestActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
  
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.refreshDonorRegistrationRequestsTable();
        
    }//GEN-LAST:event_jButton7ActionPerformed

    public void insertTransplantRecord(String donorID, String recipientID, String organID) {
    String insertQuery = "INSERT INTO transplant (TransplantID, DonorID, RecipientID, OrganID, legalApproval, transportStatus,DoctorID,hospitalId) "
                       + "VALUES (?, ?, ?, ?, ?, ?,?,?)";

    try (PreparedStatement preparedStatement = this.connection.prepareStatement(insertQuery)) {
        String transplantID = java.util.UUID.randomUUID().toString();
        preparedStatement.setString(1, transplantID);
        preparedStatement.setString(2, donorID);
        preparedStatement.setString(3, recipientID);
        preparedStatement.setString(4, organID);
        preparedStatement.setString(5, "Pending");
        preparedStatement.setString(6, "Yet to Begin");
        preparedStatement.setString(7, this.user.getId());
        preparedStatement.setString(8, this.hospital.getId());

        int rowsInserted = preparedStatement.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(null, "Transplant record inserted successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "Failed to insert transplant record.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error inserting transplant record: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
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
            private void addDonor(DonorRegistrationRequest tc){
              DefaultTableModel model = (DefaultTableModel) tblDonor.getModel();
              model.setRowCount(0);
        Object[][] rows = {
            {"Donor", tc != null ? tc : "N/A"},
            {"Donor ID", tc.getId() != null ? tc.getId() : "N/A"},
            {"Date of Birth", tc.getDateOfBirth() != null ? tc.getDateOfBirth() : "N/A"},
            {"Organ Available", tc.getOrgan() != null ? tc.getOrgan().toUpperCase() : "N/A"},
            {"Blood Type", tc.getBloodType() != null ? tc.getBloodType() : "N/A"},
            {"Approval Status", tc.getRegistrationApproved() != null ? tc.getRegistrationApproved() : "N/A"},
            {"Size Requirement", tc.getOrganSize() != null ? tc.getOrganSize() : "N/A"}
        };

    // Add each row to the table
    for (Object[] row : rows) {
        model.insertRow(model.getRowCount(), row);
    }
    }
          

public void refreshDonorRegistrationRequestsTable() {
    populateDonorRegistrationRequestsTable();
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnInitiateRequest;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable tblDonor;
    private javax.swing.JTable tblDonorRequests;
    private javax.swing.JTable tblRecepient;
    private javax.swing.JTable tblTransplantCase;
    private javax.swing.JTextField txtSearchCriteria;
    // End of variables declaration//GEN-END:variables
}
