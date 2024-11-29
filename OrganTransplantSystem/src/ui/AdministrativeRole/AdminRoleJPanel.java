/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdministrativeRole;

import java.awt.CardLayout;
import javax.swing.*;
import ui.DonorManagement.DonorRegistrationWorkArea;
import ui.HospitalManagement.ViewHospitalJPanel;
import model.HospitalManagement.*;
import java.sql.*;
/**
 *
 * @author pranavb
 */
public class AdminRoleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AdminRoleJPanel
     */
    
    JPanel userProcessContainer = new JPanel();
    HospitalDirectory hospitalDirectory = new HospitalDirectory();
    Connection connection;
    public AdminRoleJPanel(JPanel userProcessContainer, HospitalDirectory hospitalDirectory, Connection connection) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.hospitalDirectory = hospitalDirectory;
        this.connection = connection;
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
        btnTransplantList.setText("TransplantList");
        btnTransplantList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTransplantListActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(387, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(384, 384, 384))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnDonorManagement, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnManageHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnTransplantList, javax.swing.GroupLayout.PREFERRED_SIZE, 498, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(373, 373, 373))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnDonorManagement, btnManageHospitals});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(jLabel1)
                .addGap(78, 78, 78)
                .addComponent(btnManageHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnDonorManagement, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(btnTransplantList, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(439, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnDonorManagement, btnManageHospitals});

    }// </editor-fold>//GEN-END:initComponents

    private void btnTransplantListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTransplantListActionPerformed
        // TODO add your handling code here:
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
        DonorDetailJPanel donorDetailJPanel = new DonorDetailJPanel();
        userProcessContainer.add("DonorDetailJPanel", donorDetailJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnDonorManagementActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDonorManagement;
    private javax.swing.JButton btnManageHospitals;
    private javax.swing.JButton btnTransplantList;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
