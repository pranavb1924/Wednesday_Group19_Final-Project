/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalManagement;
import javax.swing.*; 
import java.awt.*;   
import java.io.*;     
import java.sql.*;    
import java.util.UUID;
import model.HospitalManagement.*;
import DatabaseConn.DatabaseConnection;
import javax.swing.text.DefaultEditorKit;


/**
 *
 * @author pranavb
 */
public class AddTransplantCaseJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddTransplantCaseJPanel
     */
    private String filePath;
    Hospital hospital;
    JPanel userProcessContainer;
    DatabaseConnection dbConnection = new DatabaseConnection();
    Connection conn = dbConnection.getConnection();
    TransplantCase transplantCase = new TransplantCase();
    DoctorDirectory doctorDirectory = new DoctorDirectory();
    TransplantCaseDirectory transplantCaseDirectory = new TransplantCaseDirectory();
    public AddTransplantCaseJPanel(JPanel userProcessContainer, Hospital hospital) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.hospital = hospital;
        this.loadOrgans();
        this.populateBloodTypeComboBox();
        this.populateUrgencyComboBox();
        this.populateStatusComboBox();
        this.loadDoctors();
    }

    private void uploadImage() {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int result = fileChooser.showOpenDialog(this);
        if (result == JFileChooser.APPROVE_OPTION) {
            File file = fileChooser.getSelectedFile();
            filePath = file.getAbsolutePath();
            JOptionPane.showMessageDialog(this, "File uploaded successfully: " + file.getName());
        }
    }
    
    private void loadOrgans() {
    try {

        String sql = "SELECT OrganType FROM Organs";
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();
        cmbOrgans.removeAllItems();
        while (rs.next()) {
            String organType = rs.getString("OrganType");
            cmbOrgans.addItem(organType);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error loading organ types: " + e.getMessage());
    }
}
    
    private void loadDoctors(){
        cmbDoctor.removeAllItems();
        for (Doctor doctor : this.hospital.getDoctorDirectory().getDoctorDirectory()){
            cmbDoctor.addItem(doctor);
        }
    }
    

 

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        txtPatientName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtPatientDateOfBirth = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnUpload = new javax.swing.JButton();
        cmbOrgans = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        btnBack1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMedicalHistory = new javax.swing.JTextArea();
        cmbUrgency = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        txtPatientZipCode = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtPatientState = new javax.swing.JTextField();
        txtPatientPriority = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSizeRequirement = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        cmbBloodType = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        cmbDoctor = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(22, 29, 29));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 830));
        setMinimumSize(new java.awt.Dimension(1200, 830));

        jTextField1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.setText("NEW TRANSPLANT CASE");

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PATIENT NAME");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("D.O.B");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SCANNING IMAGES");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("MEDICAL HISTORY");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TRANSPLANT ORGAN");

        btnUpload.setText("UPLOAD");
        btnUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadActionPerformed(evt);
            }
        });

        cmbOrgans.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("SAVE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnBack1.setText("BACK");
        btnBack1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBack1ActionPerformed(evt);
            }
        });

        txtMedicalHistory.setColumns(20);
        txtMedicalHistory.setRows(5);
        jScrollPane1.setViewportView(txtMedicalHistory);

        cmbUrgency.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("URGENCY");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("STATUS");

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("ZIP CODE");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("STATE");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PRIORITY");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("SIZE");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("BLOOD TYPE");

        cmbBloodType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("ASSIGN DOCTOR");

        cmbDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbDoctorActionPerformed(evt);
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
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel8)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPatientDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(txtPatientZipCode, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(txtPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
                            .addComponent(cmbBloodType, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cmbOrgans, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cmbUrgency, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(12, 12, 12)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtPatientPriority, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPatientState, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(42, 42, 42)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtSizeRequirement, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 255, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cmbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(btnBack1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPatientDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, 0)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtPatientZipCode, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientState, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtPatientPriority, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbOrgans, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbUrgency, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSizeRequirement, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cmbDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(267, 267, 267))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.savePatient(this.transplantCaseDirectory);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadActionPerformed
        // TODO add your handling code here:
        this.uploadImage();
    }//GEN-LAST:event_btnUploadActionPerformed

    private void cmbDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbDoctorActionPerformed
        // TODO add your handling code here:
        

    }//GEN-LAST:event_cmbDoctorActionPerformed

    private void btnBack1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBack1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBack1ActionPerformed

    private boolean validateFields() {
    if (txtPatientName.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Patient Name is required!");
        return false;
    }

    // Validate Date of Birth
    if (txtPatientDateOfBirth.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Patient Date of Birth is required!");
        return false;
    }
    try {
        // Validate that the Date of Birth is in a valid format (e.g., yyyy-MM-dd)
        String dateOfBirth = txtPatientDateOfBirth.getText().trim();
        java.sql.Date.valueOf(dateOfBirth); // Will throw an exception if the format is invalid
    } catch (IllegalArgumentException e) {
        JOptionPane.showMessageDialog(this, "Date of Birth must be in the format yyyy-MM-dd!");
        return false;
    }

    if (cmbOrgans.getSelectedItem() == null || cmbOrgans.getSelectedItem().toString().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select the required organ for transplant!");
        return false;
    }

    if (cmbBloodType.getSelectedItem() == null || cmbBloodType.getSelectedItem().toString().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select the patient's blood type!");
        return false;
    }

    if (txtMedicalHistory.getText().trim().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Medical history is required!");
        return false;
    }

    if (filePath == null || filePath.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please upload a scanning image!");
        return false;
    }

    if (cmbUrgency.getSelectedItem() == null || cmbUrgency.getSelectedItem().toString().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select an urgency level!");
        return false;
    }

    if (cmbStatus.getSelectedItem() == null || cmbStatus.getSelectedItem().toString().isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please select a status!");
        return false;
    }

    try {
        int priorityScore = Integer.parseInt(txtPatientPriority.getText().trim());
        if (priorityScore < 0 || priorityScore > 100) {
            JOptionPane.showMessageDialog(this, "Priority Score must be between 0 and 100!");
            return false;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Priority Score must be a valid number!");
        return false;
    }

    try {
        int sizeRequirement = Integer.parseInt(txtSizeRequirement.getText().trim());
        String organRequired = cmbOrgans.getSelectedItem().toString();

        switch (organRequired.toLowerCase()) {
            case "kidney":
                if (sizeRequirement < 50 || sizeRequirement > 200) {
                    JOptionPane.showMessageDialog(this, "Kidney size must be between 50 and 200 grams!");
                    return false;
                }
                break;
            case "liver":
                if (sizeRequirement < 500 || sizeRequirement > 1800) {
                    JOptionPane.showMessageDialog(this, "Liver size must be between 500 and 1800 grams!");
                    return false;
                }
                break;
            case "heart":
                if (sizeRequirement < 100 || sizeRequirement > 350) {
                    JOptionPane.showMessageDialog(this, "Heart size must be between 100 and 350 grams!");
                    return false;
                }
                break;
            case "lungs":
                if (sizeRequirement < 400 || sizeRequirement > 1000) {
                    JOptionPane.showMessageDialog(this, "Lung size must be between 400 and 1000 grams!");
                    return false;
                }
                break;
            case "pancreas":
                if (sizeRequirement < 50 || sizeRequirement > 120) {
                    JOptionPane.showMessageDialog(this, "Pancreas size must be between 50 and 120 grams!");
                    return false;
                }
                break;
            case "small intestine":
                if (sizeRequirement < 1000 || sizeRequirement > 4000) {
                    JOptionPane.showMessageDialog(this, "Small intestine size must be between 1000 and 4000 grams!");
                    return false;
                }
                break;
            default:
                JOptionPane.showMessageDialog(this, "Invalid organ type!");
                return false;
        }
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Size Requirement must be a valid number!");
        return false;
    }
    return true;
}


    private void populateBloodTypeComboBox() {
        cmbBloodType.removeAllItems();
        cmbBloodType.addItem("A+");
        cmbBloodType.addItem("A-");
        cmbBloodType.addItem("B+");
        cmbBloodType.addItem("B-");
        cmbBloodType.addItem("AB+");
        cmbBloodType.addItem("AB-");
        cmbBloodType.addItem("O+");
        cmbBloodType.addItem("O-");
    }

    private void populateUrgencyComboBox() {
    cmbUrgency.removeAllItems();
    cmbUrgency.addItem("Low");
    cmbUrgency.addItem("Medium");
    cmbUrgency.addItem("High");
    cmbUrgency.addItem("Critical");
    }
    
    private void populateStatusComboBox() {
    cmbStatus.removeAllItems();
    cmbStatus.addItem("Pending");
    cmbStatus.addItem("Approved");
    cmbStatus.addItem("Under Review");
    cmbStatus.addItem("Rejected");
    }




    
  private void savePatient(TransplantCaseDirectory directory) {
    if (!validateFields()) {
        return;
    }

    String patientName = txtPatientName.getText().trim();
    String dateOfBirth = txtPatientDateOfBirth.getText().trim();
    String organRequired = cmbOrgans.getSelectedItem().toString(); // Get organ type from combo box
    String medicalHistory = txtMedicalHistory.getText().trim();
    Doctor assignedDoctor = new Doctor();
    assignedDoctor = (Doctor) cmbDoctor.getSelectedItem();
    String bloodType = cmbBloodType.getSelectedItem().toString(); // Get blood type
    int sizeRequirement = Integer.parseInt(txtSizeRequirement.getText().trim());
    int priorityScore = Integer.parseInt(txtPatientPriority.getText().trim());
    String urgencyLevel = cmbUrgency.getSelectedItem().toString(); // Get urgency level
    String status = cmbStatus.getSelectedItem().toString(); // Get status
    byte[] scanImage = null;

    try {
        // Read the scan image from the file path
        File imageFile = new File(filePath);
        FileInputStream fis = new FileInputStream(imageFile);
        scanImage = fis.readAllBytes();
        fis.close();
    } catch (IOException e) {
        JOptionPane.showMessageDialog(this, "Error reading the image file: " + e.getMessage());
        return;
    }

    String organID = null;

    try {
        // Fetch the OrganID from the Organs table based on the selected organ type
        String fetchOrganIDSQL = "SELECT OrganID FROM Organs WHERE OrganType = ?";
        PreparedStatement fetchStmt = conn.prepareStatement(fetchOrganIDSQL);
        fetchStmt.setString(1, organRequired);
        ResultSet rs = fetchStmt.executeQuery();

        if (rs.next()) {
            organID = rs.getString("OrganID");
        } else {
            JOptionPane.showMessageDialog(this, "Organ type not found in the database!");
            return;
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error fetching OrganID: " + e.getMessage());
        return;
    }

    String patientID = UUID.randomUUID().toString();

    try {
        // SQL query to insert the data into the database
        String insertSQL = "INSERT INTO TransplantPatients (PatientID, PatientName, DateOfBirth, ScanImage, PatientInfo, RequiredTransplant, OrganID, BloodType, SizeRequirement, PriorityScore, UrgencyLevel, ApprovalStatus, doctorID, hospitalID) " +
                           "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
        PreparedStatement insertStmt = conn.prepareStatement(insertSQL);

        // Setting the parameters for the SQL query
        insertStmt.setString(1, patientID); // Generate unique PatientID
        insertStmt.setString(2, patientName); // Patient Name
        insertStmt.setDate(3, java.sql.Date.valueOf(dateOfBirth)); // Date of Birth
        insertStmt.setBytes(4, scanImage); // Scan Image
        insertStmt.setString(5, medicalHistory); // Medical History
        insertStmt.setString(6, organRequired); // Required Organ
        insertStmt.setString(7, organID); // Organ ID fetched from the database
        insertStmt.setString(8, bloodType); // Blood Type
        insertStmt.setInt(9, sizeRequirement); // Size Requirement
        insertStmt.setInt(10, priorityScore); // Priority Score
        insertStmt.setString(11, urgencyLevel); // Urgency Level
        insertStmt.setString(12, status); // Status
        insertStmt.setString(13, assignedDoctor.getDoctorId());
        insertStmt.setString(14, this.hospital.getId());

        // Execute the query
        int rowsInserted = insertStmt.executeUpdate();
        if (rowsInserted > 0) {
            JOptionPane.showMessageDialog(this, "Patient data saved successfully!");

            // Create a TransplantCase object and add it to the directory
            TransplantCase transplantCase = new TransplantCase();
            transplantCase.setPatientID(patientID);
            transplantCase.setPatientName(patientName);
            transplantCase.setDateOfBirth(dateOfBirth);
            transplantCase.setScanImage(scanImage);
            transplantCase.setPatientInfo(medicalHistory);
            transplantCase.setRequiredTransplant(organRequired);
            transplantCase.setOrganID(organID);
            transplantCase.setBloodType(bloodType);
            transplantCase.setPriorityScore(priorityScore);
            transplantCase.setUrgencyLevel(urgencyLevel);
            transplantCase.setApprovalStatus(status);
            transplantCase.setSizeRequirement(sizeRequirement);

            // Add the case to the directory
            directory.addNewCase(transplantCase);
        } else {
            JOptionPane.showMessageDialog(this, "Failed to save patient data.");
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Database error: " + e.getMessage());
    }
}





    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack1;
    private javax.swing.JButton btnUpload;
    private javax.swing.JComboBox<String> cmbBloodType;
    private javax.swing.JComboBox cmbDoctor;
    private javax.swing.JComboBox<String> cmbOrgans;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JComboBox<String> cmbUrgency;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea txtMedicalHistory;
    private javax.swing.JTextField txtPatientDateOfBirth;
    private javax.swing.JTextField txtPatientName;
    private javax.swing.JTextField txtPatientPriority;
    private javax.swing.JTextField txtPatientState;
    private javax.swing.JTextField txtPatientZipCode;
    private javax.swing.JTextField txtSizeRequirement;
    // End of variables declaration//GEN-END:variables
}
