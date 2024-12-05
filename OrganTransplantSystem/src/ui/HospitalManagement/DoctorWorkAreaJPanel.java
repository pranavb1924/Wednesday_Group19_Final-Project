/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalManagement;

import java.awt.CardLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Locale;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import model.HospitalManagement.DoctorDirectory;
import model.HospitalManagement.Hospital;
import model.HospitalManagement.HospitalDirectory;
import model.users.User;
import model.HospitalManagement.Doctor;
import ui.AdministrativeRole.DonorRequestJPanel;
import ui.HospitalManagement.*;
import ui.AdministrativeRole.*;

/**
 *
 * @author pranavb
 */
public class DoctorWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DoctorWorkAreaJPanel
     */
   JPanel userProcessContainer = new JPanel();
    HospitalDirectory hospitalDirectory = new HospitalDirectory();
    DoctorDirectory doctorDirectory;
    Connection connection;
    Hospital hospital;
    User user;
    public DoctorWorkAreaJPanel(JPanel userProcessContainer, HospitalDirectory hospitalDirectory, DoctorDirectory doctorDirectory, Connection connection, Hospital hospital, User user) {
        initComponents();
        this.user = user;
        this.userProcessContainer = userProcessContainer;
        this.doctorDirectory = doctorDirectory;
        this.hospitalDirectory = hospitalDirectory;
        this.connection = connection;
        this.loadDoctorProfile();
    }
    
    public void loadDoctorProfile(){
        Doctor doctor = this.doctorDirectory.searchDoctor(this.user.getId());
        txtTitle.setText("Welcome "+doctor.getName().toUpperCase());
        txtDoctorName.setText(doctor.getName().toUpperCase());
        txtDoctorPhoneNumber.setText(doctor.getPhone());
        txtDoctorSpecialization.setText(doctor.getSpecialization().toUpperCase());
        try {
        // SQL query to fetch the profile_image for the given username
        String query = "SELECT profile_image FROM user WHERE username = ?";
        PreparedStatement stmt = connection.prepareStatement(query);
        stmt.setString(1, this.user.getUsername());

        // Execute the query
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            byte[] imageBytes = rs.getBytes("profile_image"); // Fetch the image as bytes

if (imageBytes != null) {
    try {
        ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
        BufferedImage bufferedImage = ImageIO.read(bais);

        if (bufferedImage != null) {
            // Scale and set the image on lblProfilePic
            ImageIcon icon = new ImageIcon(bufferedImage.getScaledInstance(
                    350,
                    300,
                    Image.SCALE_SMOOTH
            ));
            imgProfile.setIcon(icon); // Set the icon to the label
        } else {
            System.err.println("BufferedImage is null. Image data may be invalid.");
            imgProfile.setText("Invalid image data.");
        }
    } catch (Exception e) {
        System.err.println("Error reading image data: " + e.getMessage());
        imgProfile.setText("Invalid image data.");
    }
} else {
    imgProfile.setText("No profile image available.");
}

        } else {
            imgProfile.setText("User not found.");
        }
        stmt.close();
    } catch (Exception e) {
        e.printStackTrace();
        imgProfile.setText("Error loading profile image.");
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

        txtTitle = new javax.swing.JTextField();
        imgProfile = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnViewCases = new javax.swing.JButton();
        btnDonorRegistrationRequest = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtDoctorName = new javax.swing.JTextField();
        txtDoctorPhoneNumber = new javax.swing.JTextField();
        txtDoctorSpecialization = new javax.swing.JTextField();

        setBackground(new java.awt.Color(110, 146, 147));
        setMaximumSize(new java.awt.Dimension(1200, 830));
        setMinimumSize(new java.awt.Dimension(1200, 830));

        txtTitle.setEditable(false);
        txtTitle.setBackground(new java.awt.Color(22, 29, 29));
        txtTitle.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtTitle.setForeground(new java.awt.Color(255, 255, 255));
        txtTitle.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("NAME:");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PHONE NUMBER:");

        btnViewCases.setBackground(new java.awt.Color(22, 29, 29));
        btnViewCases.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnViewCases.setForeground(new java.awt.Color(255, 255, 255));
        btnViewCases.setText("VIEW CASES");
        btnViewCases.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCasesActionPerformed(evt);
            }
        });

        btnDonorRegistrationRequest.setBackground(new java.awt.Color(22, 29, 29));
        btnDonorRegistrationRequest.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDonorRegistrationRequest.setForeground(new java.awt.Color(255, 255, 255));
        btnDonorRegistrationRequest.setText("REGISTER ORGAN DONOR");
        btnDonorRegistrationRequest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonorRegistrationRequestActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(22, 29, 29));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SPECIALIZATION:");

        txtDoctorName.setEditable(false);
        txtDoctorName.setBackground(new java.awt.Color(22, 29, 29));
        txtDoctorName.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtDoctorName.setForeground(new java.awt.Color(255, 255, 255));

        txtDoctorPhoneNumber.setEditable(false);
        txtDoctorPhoneNumber.setBackground(new java.awt.Color(22, 29, 29));
        txtDoctorPhoneNumber.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtDoctorPhoneNumber.setForeground(new java.awt.Color(255, 255, 255));

        txtDoctorSpecialization.setEditable(false);
        txtDoctorSpecialization.setBackground(new java.awt.Color(22, 29, 29));
        txtDoctorSpecialization.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtDoctorSpecialization.setForeground(new java.awt.Color(255, 255, 255));
        txtDoctorSpecialization.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDoctorSpecializationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtTitle)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(imgProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4))
                                .addGap(1, 1, 1)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDoctorSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDoctorPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(188, 188, 188)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDonorRegistrationRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnViewCases, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 478, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 222, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imgProfile, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDoctorPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtDoctorSpecialization, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addComponent(btnViewCases, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDonorRegistrationRequest, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(391, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDonorRegistrationRequestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonorRegistrationRequestActionPerformed
        // TODO add your handling code here:   
        ManageDonorRequestJPanel manageDonorRequestJPanel = new ManageDonorRequestJPanel(this.userProcessContainer, this.user);
        userProcessContainer.add("ManageDonorRequestJPanel", manageDonorRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnDonorRegistrationRequestActionPerformed

    private void btnViewCasesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCasesActionPerformed
        // TODO add your handling code here:
        DoctorTransplantCaseJPanel doctorTransplantCaseJPanel = new DoctorTransplantCaseJPanel(this.userProcessContainer, this.hospitalDirectory, this.doctorDirectory, this.connection, this.hospital, this.user);
        userProcessContainer.add("DoctorTransplantCaseJPanel", doctorTransplantCaseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnViewCasesActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtDoctorSpecializationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDoctorSpecializationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDoctorSpecializationActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDonorRegistrationRequest;
    private javax.swing.JButton btnViewCases;
    private javax.swing.JLabel imgProfile;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtDoctorName;
    private javax.swing.JTextField txtDoctorPhoneNumber;
    private javax.swing.JTextField txtDoctorSpecialization;
    private javax.swing.JTextField txtTitle;
    // End of variables declaration//GEN-END:variables
}
