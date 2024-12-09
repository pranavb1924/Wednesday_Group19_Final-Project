/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdministrativeRole;

import java.awt.CardLayout;
import javax.swing.*;
import ui.DonorManagement.DonorRegistrationWorkArea;
import ui.HospitalManagement.*;
import model.HospitalManagement.*;
import java.sql.*;
import model.users.*;
/**
 *
 * @author pranavb
 */
public class AdminRoleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminRoleJPanel
     */
    
    JPanel userProcessContainer;
    HospitalDirectory hospitalDirectory = new HospitalDirectory();
    Connection connection;
    User user;
    public AdminRoleJPanel(JPanel userProcessContainer, HospitalDirectory hospitalDirectory, Connection connection, User user) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.hospitalDirectory = hospitalDirectory;
        this.connection = connection;
        this.updateNotification();
        this.updateDonorNotification();
        this.user = user;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnDonorManagement = new javax.swing.JButton();
        btnManageHospitals = new javax.swing.JButton();
        btnTransplantList = new javax.swing.JButton();
        btnTransplantList1 = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        txtNotification = new javax.swing.JTextField();
        txtNewDonorNotification = new javax.swing.JTextField();
        txtNotification2 = new javax.swing.JTextField();

        setBackground(new java.awt.Color(22, 29, 29));
        setForeground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(1200, 830));
        setMinimumSize(new java.awt.Dimension(1200, 830));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("MY WORK AREA -ADMINISTRATIVE ROLE");

        btnDonorManagement.setBackground(new java.awt.Color(111, 147, 146));
        btnDonorManagement.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnDonorManagement.setForeground(new java.awt.Color(255, 255, 255));
        btnDonorManagement.setText("DONOR MANAGEMENT");
        btnDonorManagement.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDonorManagementActionPerformed(evt);
            }
        });

        btnManageHospitals.setBackground(new java.awt.Color(111, 147, 146));
        btnManageHospitals.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnManageHospitals.setForeground(new java.awt.Color(255, 255, 255));
        btnManageHospitals.setText("MANAGE HOSPITAL");
        btnManageHospitals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnManageHospitalsActionPerformed(evt);
            }
        });

        btnTransplantList.setBackground(new java.awt.Color(111, 147, 146));
        btnTransplantList.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnTransplantList.setForeground(new java.awt.Color(255, 255, 255));
        btnTransplantList.setText("TRANSPLANT LIST");
        btnTransplantList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransplantListActionPerformed(evt);
            }
        });

        btnTransplantList1.setBackground(new java.awt.Color(111, 147, 146));
        btnTransplantList1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnTransplantList1.setForeground(new java.awt.Color(255, 255, 255));
        btnTransplantList1.setText("TRANSPLANT QUEUE");
        btnTransplantList1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransplantList1ActionPerformed(evt);
            }
        });

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        txtNotification.setEditable(false);
        txtNotification.setBackground(new java.awt.Color(255, 170, 92));
        txtNotification.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtNotification.setForeground(new java.awt.Color(255, 255, 255));
        txtNotification.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNotification.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        txtNewDonorNotification.setEditable(false);
        txtNewDonorNotification.setBackground(new java.awt.Color(255, 170, 92));
        txtNewDonorNotification.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtNewDonorNotification.setForeground(new java.awt.Color(255, 255, 255));
        txtNewDonorNotification.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNewDonorNotification.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        txtNewDonorNotification.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNewDonorNotificationActionPerformed(evt);
            }
        });

        txtNotification2.setEditable(false);
        txtNotification2.setBackground(new java.awt.Color(255, 170, 92));
        txtNotification2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        txtNotification2.setForeground(new java.awt.Color(255, 255, 255));
        txtNotification2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNotification2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(387, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDonorManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTransplantList, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTransplantList1, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNewDonorNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNotification2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(337, 337, 337))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(384, 384, 384))))
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDonorManagement, btnManageHospitals});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addComponent(btnManageHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDonorManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNewDonorNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTransplantList, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNotification, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTransplantList1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNotification2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(346, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDonorManagement, btnManageHospitals});

    }// </editor-fold>//GEN-END:initComponents

    private void btnTransplantListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransplantListActionPerformed
        // TODO add your handling code here:
        ManageTransplantListJPanel manageTransplantListJPanel = new ManageTransplantListJPanel(this.userProcessContainer);
        userProcessContainer.add("ManageTransplantListJPanel", manageTransplantListJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnTransplantListActionPerformed

    private void btnManageHospitalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnManageHospitalsActionPerformed
        // TODO add your handling code here:
        ViewHospitalJPanel viewHospitalJPanel = new ViewHospitalJPanel(this.userProcessContainer, this.hospitalDirectory, this.connection);
        userProcessContainer.add("ViewHospitalJPanel", viewHospitalJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnManageHospitalsActionPerformed

    private void btnDonorManagementActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDonorManagementActionPerformed
        // TODO add your handling code here:
        DonorRequestJPanel donorRequestJPanel = new DonorRequestJPanel(this.userProcessContainer, this.user);
        userProcessContainer.add("DonorRequestJPanel", donorRequestJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDonorManagementActionPerformed

    private void btnTransplantList1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransplantList1ActionPerformed
        // TODO add your handling code here:
        ui.HospitalManagement.TransplantRequest tc = new ui.HospitalManagement.TransplantRequest(this.user, null);
        userProcessContainer.add("TransplantRequest", tc);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnTransplantList1ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void txtNewDonorNotificationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNewDonorNotificationActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNewDonorNotificationActionPerformed

    private void updateNotification() {
    try {
        // Query to count patients with "Under Review" approval status
        String sql = "SELECT COUNT(*) AS UnderReviewCount FROM TransplantPatients WHERE ApprovalStatus = 'Under Review'";
        PreparedStatement stmt = this.connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            int count = rs.getInt("UnderReviewCount"); // Get the count from the query result

            if (count > 0) {
                txtNotification.setText(String.valueOf(count)); // Set the count in the text field
                txtNotification.setVisible(true); // Make the text field visible
            } else {
                txtNotification.setVisible(false); // Hide the text field if the count is zero
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error fetching notifications: " + e.getMessage());
    }
}
        private void updateDonorNotification() {
    try {
        // Query to count patients with "Under Review" approval status
        String sql = "SELECT COUNT(*) AS UnderReviewCount FROM donorRegistrationRequests WHERE RegistrationApproved = 'Pending'";
        PreparedStatement stmt = this.connection.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery();

        if (rs.next()) {
            int count = rs.getInt("UnderReviewCount"); // Get the count from the query result

            if (count > 0) {
                txtNewDonorNotification.setText(String.valueOf(count)); // Set the count in the text field
                txtNewDonorNotification.setVisible(true); // Make the text field visible
            } else {
                txtNewDonorNotification.setVisible(false); // Hide the text field if the count is zero
            }
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error fetching notifications: " + e.getMessage());
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDonorManagement;
    private javax.swing.JButton btnManageHospitals;
    private javax.swing.JButton btnTransplantList;
    private javax.swing.JButton btnTransplantList1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField txtNewDonorNotification;
    private javax.swing.JTextField txtNotification;
    private javax.swing.JTextField txtNotification2;
    // End of variables declaration//GEN-END:variables
}
