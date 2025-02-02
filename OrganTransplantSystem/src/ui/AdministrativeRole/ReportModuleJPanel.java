/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdministrativeRole;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DatabaseConn.DatabaseConnection;
import java.awt.CardLayout;
import javax.swing.*;


/**
 *
 * @author pranavb
 */
public class ReportModuleJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReportModuleJPanel
     */
    DatabaseConnection dbCon = new DatabaseConnection();
    Connection connection = dbCon.getConnection();
    JPanel userProcessContainer;
    public ReportModuleJPanel(JPanel userProcessContainer) {
        initComponents();
        this.fetchAndSetAllStats();
        this.userProcessContainer = userProcessContainer;
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
        txtDonors = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtRecepients = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHospitals = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDoctors = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTransplantApproval = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtSuccessfulTransplant = new javax.swing.JTextField();
        txtActiveDonorsRequests = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtOrganMatch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        txtLawyer = new javax.swing.JTextField();

        setBackground(new java.awt.Color(22, 29, 29));
        setMaximumSize(new java.awt.Dimension(1200, 830));
        setMinimumSize(new java.awt.Dimension(1200, 830));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("TOTAL NUMBER OF DONORS:");

        txtDonors.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtDonors.setForeground(new java.awt.Color(22, 29, 29));

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("TOTAL NUMBER OF RECEPIENTS:");

        txtRecepients.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtRecepients.setForeground(new java.awt.Color(22, 29, 29));

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("TOTAL NUMBER OF HOSPITALS:");

        txtHospitals.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtHospitals.setForeground(new java.awt.Color(22, 29, 29));

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TOTAL NUMBER OF DOCTORS:");

        txtDoctors.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtDoctors.setForeground(new java.awt.Color(22, 29, 29));

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("TOTAL NUMBER OF TRANSPLANTS PENDING FOR APPROVAL:");

        txtTransplantApproval.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtTransplantApproval.setForeground(new java.awt.Color(22, 29, 29));

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("TOTAL NUMBER OF SUCCESSFUL TRANSPLANTS:");

        txtSuccessfulTransplant.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtSuccessfulTransplant.setForeground(new java.awt.Color(22, 29, 29));

        txtActiveDonorsRequests.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtActiveDonorsRequests.setForeground(new java.awt.Color(22, 29, 29));

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("TOTAL NUMBER OF ACTIVE DONOR REQUESTS");

        txtOrganMatch.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtOrganMatch.setForeground(new java.awt.Color(22, 29, 29));

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("TOTAL NUMBER OF ORGAN MATCHES");

        jButton1.setBackground(new java.awt.Color(110, 146, 147));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("HEAD BACK");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(22, 29, 29));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REFRESH");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("TOTAL NUMBER OF LAWYERS");

        txtLawyer.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        txtLawyer.setForeground(new java.awt.Color(22, 29, 29));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(200, 200, 200)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtTransplantApproval, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(667, Short.MAX_VALUE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(txtRecepients, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtDonors, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(txtHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addContainerGap(467, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(txtDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 664, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtLawyer, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtOrganMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtSuccessfulTransplant, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(txtActiveDonorsRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(58, 58, 58)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDonors, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRecepients, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtHospitals, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtDoctors, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtTransplantApproval, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSuccessfulTransplant, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtActiveDonorsRequests, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtOrganMatch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLawyer, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(191, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.fetchAndSetAllStats();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void fetchAndSetAllStats() {
    try {
        // Total Number of Donors
        String totalDonorsQuery = "SELECT COUNT(*) AS totalDonors FROM registeredDonors";
        PreparedStatement donorsStmt = this.connection.prepareStatement(totalDonorsQuery);
        ResultSet donorsResultSet = donorsStmt.executeQuery();
        if (donorsResultSet.next()) {
            int totalDonors = donorsResultSet.getInt("totalDonors");
            txtDonors.setText(String.valueOf(totalDonors));
        }
        donorsResultSet.close();
        donorsStmt.close();

        // Total Number of Active Donor Requests
        String activeDonorRequestsQuery = "SELECT COUNT(*) AS activeRequests FROM donorRegistrationRequests WHERE RegistrationApproved = 'Pending'";
        PreparedStatement activeRequestsStmt = this.connection.prepareStatement(activeDonorRequestsQuery);
        ResultSet activeRequestsResultSet = activeRequestsStmt.executeQuery();
        if (activeRequestsResultSet.next()) {
            int activeRequests = activeRequestsResultSet.getInt("activeRequests");
            txtActiveDonorsRequests.setText(String.valueOf(activeRequests));
        }
        activeRequestsResultSet.close();
        activeRequestsStmt.close();

        // Total Number of Matches (Transplants)
        String totalMatchesQuery = "SELECT COUNT(*) AS totalMatches FROM transplant";
        PreparedStatement matchesStmt = this.connection.prepareStatement(totalMatchesQuery);
        ResultSet matchesResultSet = matchesStmt.executeQuery();
        if (matchesResultSet.next()) {
            int totalMatches = matchesResultSet.getInt("totalMatches");
            txtOrganMatch.setText(String.valueOf(totalMatches));
        }
        matchesResultSet.close();
        matchesStmt.close();

        // Total Number of Successful Transplants
        String successfulTransplantsQuery = "SELECT COUNT(*) AS successfulTransplants FROM transplant WHERE Outcome = 'Successful'";
        PreparedStatement successfulStmt = this.connection.prepareStatement(successfulTransplantsQuery);
        ResultSet successfulResultSet = successfulStmt.executeQuery();
        if (successfulResultSet.next()) {
            int successfulTransplants = successfulResultSet.getInt("successfulTransplants");
            txtSuccessfulTransplant.setText(String.valueOf(successfulTransplants));
        }
        successfulResultSet.close();
        successfulStmt.close();

        // Total Number of Transplants Pending for Approval
        String pendingTransplantsQuery = "SELECT COUNT(*) AS pendingTransplants FROM transplantPatients WHERE ApprovalStatus = 'Pending'";
        PreparedStatement pendingStmt = this.connection.prepareStatement(pendingTransplantsQuery);
        ResultSet pendingResultSet = pendingStmt.executeQuery();
        if (pendingResultSet.next()) {
            int pendingTransplants = pendingResultSet.getInt("pendingTransplants");
            txtTransplantApproval.setText(String.valueOf(pendingTransplants));
        }
        pendingResultSet.close();
        pendingStmt.close();

        // Total Number of Hospitals
        String totalHospitalsQuery = "SELECT COUNT(*) AS totalHospitals FROM hospitals";
        PreparedStatement hospitalsStmt = this.connection.prepareStatement(totalHospitalsQuery);
        ResultSet hospitalsResultSet = hospitalsStmt.executeQuery();
        if (hospitalsResultSet.next()) {
            int totalHospitals = hospitalsResultSet.getInt("totalHospitals");
            txtHospitals.setText(String.valueOf(totalHospitals));
        }
        hospitalsResultSet.close();
        hospitalsStmt.close();

        // Total Number of Doctors
        String totalDoctorsQuery = "SELECT COUNT(*) AS totalDoctors FROM doctors";
        PreparedStatement doctorsStmt = this.connection.prepareStatement(totalDoctorsQuery);
        ResultSet doctorsResultSet = doctorsStmt.executeQuery();
        if (doctorsResultSet.next()) {
            int totalDoctors = doctorsResultSet.getInt("totalDoctors");
            txtDoctors.setText(String.valueOf(totalDoctors));
        }
        doctorsResultSet.close();
        doctorsStmt.close();

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error fetching statistics: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
    
        try {
        // Query to get the total number of recipients
        String totalRecipientsQuery = "SELECT COUNT(*) AS totalRecipients FROM transplantPatients";
        PreparedStatement recipientsStmt = this.connection.prepareStatement(totalRecipientsQuery);
        ResultSet recipientsResultSet = recipientsStmt.executeQuery();
        if (recipientsResultSet.next()) {
            int totalRecipients = recipientsResultSet.getInt("totalRecipients");
            txtRecepients.setText(String.valueOf(totalRecipients));
        }
        recipientsResultSet.close();
        recipientsStmt.close();

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error fetching recipient stats: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
            try {
        // Query to get the total number of lawyers
        String totalLawyersQuery = "SELECT COUNT(*) AS totalLawyers FROM lawyers";
        PreparedStatement lawyersStmt = this.connection.prepareStatement(totalLawyersQuery);
        ResultSet lawyersResultSet = lawyersStmt.executeQuery();
        if (lawyersResultSet.next()) {
            int totalLawyers = lawyersResultSet.getInt("totalLawyers");
            txtLawyer.setText(String.valueOf(totalLawyers));
        }
        lawyersResultSet.close();
        lawyersStmt.close();

    } catch (SQLException e) {
        e.printStackTrace();
        JOptionPane.showMessageDialog(null, "Error fetching lawyers stats: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtActiveDonorsRequests;
    private javax.swing.JTextField txtDoctors;
    private javax.swing.JTextField txtDonors;
    private javax.swing.JTextField txtHospitals;
    private javax.swing.JTextField txtLawyer;
    private javax.swing.JTextField txtOrganMatch;
    private javax.swing.JTextField txtRecepients;
    private javax.swing.JTextField txtSuccessfulTransplant;
    private javax.swing.JTextField txtTransplantApproval;
    // End of variables declaration//GEN-END:variables
}
