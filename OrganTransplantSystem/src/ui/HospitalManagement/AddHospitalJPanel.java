/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalManagement;

import javax.swing.JPanel;
import model.HospitalManagement.HospitalDirectory;
import javax.swing.JOptionPane;
import model.HospitalManagement.*;
import java.sql.*;
import java.util.UUID;

/**
 *
 * @author pranavb
 */
public class AddHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form AddHospitalJPanel
     */
    
    JPanel userProcessContainer;
    HospitalDirectory hospitalDirectory;
    Hospital hospital;
    Connection connection;
    public AddHospitalJPanel(JPanel userProcessContainer, HospitalDirectory hospitalDirectory, Connection connection) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.hospitalDirectory = hospitalDirectory;
        this.connection = connection;
    }

    public void validateFields() {
        // Check if any field is empty
        if (txtHospitalName.getText().isEmpty() ||
            txtHospitalAddress.getText().isEmpty() ||
            txtHospitalCity.getText().isEmpty() ||
            txtHospitalState.getText().isEmpty() ||
            txtHospitalPhone.getText().isEmpty() ||
            txtAdminName.getText().isEmpty() ||
            txtAdminUsername.getText().isEmpty() ||
            txtAdminPassword.getText().isEmpty() ||
            txtAdminEmail.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "All fields must be filled.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate that hospitalName does not contain special characters
        if (!txtHospitalName.getText().matches("[a-zA-Z0-9 ]+")) {
            JOptionPane.showMessageDialog(null, "Hospital name must not contain special characters.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate that hospitalPhone contains only digits
        if (!txtHospitalPhone.getText().matches("\\d+")) {
            JOptionPane.showMessageDialog(null, "Hospital phone must contain only digits.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        // Validate adminEmail with a basic regex for email format
        if (!txtAdminEmail.getText().matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$")) {
            JOptionPane.showMessageDialog(null, "Enter a valid email address.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            return;
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

        jLabel1 = new javax.swing.JLabel();
        txtHospitalName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtHospitalAddress = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtHospitalCity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtHospitalState = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        txtAdminName = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtAdminUsername = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtAdminPassword = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtAdminEmail = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtHospitalPhone = new javax.swing.JTextField();
        lblHospitalPhone = new javax.swing.JLabel();
        txtTcUsername = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtTcPassword = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtTcEmail = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtTcName = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(22, 29, 29));
        setMaximumSize(new java.awt.Dimension(1200, 830));
        setMinimumSize(new java.awt.Dimension(1200, 830));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADD HOSPITAL");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("HOSPITAL NAME");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ADDRESS");

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("CITY");

        jLabel5.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("STATE");

        btnSave.setBackground(new java.awt.Color(111, 147, 146));
        btnSave.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(111, 147, 146));
        btnUpdate.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("UPDATE");

        jLabel6.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("ADMIN NAME");

        jLabel7.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("ADMIN USERNAME");

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("PASSWORD");

        jLabel9.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("EMAIL");

        lblHospitalPhone.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblHospitalPhone.setForeground(new java.awt.Color(255, 255, 255));
        lblHospitalPhone.setText("PHONE");

        jLabel10.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("COORDINATOR USERNAME");

        jLabel11.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("PASSWORD");

        jLabel12.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("EMAIL");

        jLabel13.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("COORDINATOR NAME");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(530, 530, 530)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1)
                            .addComponent(btnSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(39, 39, 39)
                                .addComponent(txtHospitalAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(39, 39, 39)
                                .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(lblHospitalPhone))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtHospitalPhone, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtHospitalState)
                                    .addComponent(txtHospitalCity, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(39, 39, 39)
                                .addComponent(txtAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addGap(39, 39, 39)
                                .addComponent(txtAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAdminEmail)
                                    .addComponent(txtAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addGap(39, 39, 39)
                                .addComponent(txtTcUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addGap(39, 39, 39)
                                .addComponent(txtTcName, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11))
                                .addGap(39, 39, 39)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtTcEmail)
                                    .addComponent(txtTcPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(76, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addComponent(jLabel1)
                .addGap(70, 70, 70)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHospitalName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHospitalAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHospitalCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtHospitalState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAdminName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAdminUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAdminPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel8))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtAdminEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtHospitalPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblHospitalPhone)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTcName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTcUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTcPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtTcEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))))
                .addGap(65, 65, 65)
                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(283, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        // Validate fields
 // Validate fields
this.validateFields();

// Gather input values
String hospitalName = txtHospitalName.getText();
String hospitalAddress = txtHospitalAddress.getText();
String hospitalCity = txtHospitalCity.getText();
String hospitalState = txtHospitalState.getText();
String hospitalPhone = txtHospitalPhone.getText();
String adminName = txtAdminName.getText();
String adminUsername = txtAdminUsername.getText();
String adminPassword = txtAdminPassword.getText();
String adminEmail = txtAdminEmail.getText();
String coordinatorName = txtTcName.getText();
String coordinatorUsername = txtTcUsername.getText();
String coordinatorPassword = txtTcPassword.getText();
String coordinatorEmail = txtTcEmail.getText();

// Ensure usernames are not the same
if (adminUsername.equals(coordinatorUsername)) {
    JOptionPane.showMessageDialog(null, "Admin and Coordinator usernames must be unique.", "Validation Error", JOptionPane.ERROR_MESSAGE);
    return;
}

try {
    // Check if adminUsername already exists in the user table
    String checkUsernameSql = "SELECT username FROM user WHERE username IN (?, ?)";
    PreparedStatement checkUserStmt = this.connection.prepareStatement(checkUsernameSql);
    checkUserStmt.setString(1, adminUsername);
    checkUserStmt.setString(2, coordinatorUsername);

    ResultSet resultSet = checkUserStmt.executeQuery();
    boolean adminExists = false;
    boolean coordinatorExists = false;

    while (resultSet.next()) {
        String existingUsername = resultSet.getString("username");
        if (existingUsername.equals(adminUsername)) {
            adminExists = true;
        }
        if (existingUsername.equals(coordinatorUsername)) {
            coordinatorExists = true;
        }
    }

    if (adminExists) {
        JOptionPane.showMessageDialog(null, "Admin username already exists. Please choose a different username.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    if (coordinatorExists) {
        JOptionPane.showMessageDialog(null, "Coordinator username already exists. Please choose a different username.", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    checkUserStmt.close();

    // Generate IDs
    String adminId = UUID.randomUUID().toString();
    String coordinatorId = UUID.randomUUID().toString();
    String hospitalId = UUID.randomUUID().toString();

    // Insert into coordinators table
    String coordinatorInsertSql = "INSERT INTO coordinators (CoordinatorID, Name, Email) VALUES (?, ?, ?)";
    PreparedStatement coordinatorStmt = this.connection.prepareStatement(coordinatorInsertSql);
    coordinatorStmt.setString(1, coordinatorId);
    coordinatorStmt.setString(2, coordinatorName);
    coordinatorStmt.setString(3, coordinatorEmail);

    int coordinatorRowsAffected = coordinatorStmt.executeUpdate();

    if (coordinatorRowsAffected > 0) {
        // Insert into user table for coordinator
        String userCoordinatorInsertSql = "INSERT INTO user (username, password, email, Role, ReferenceID) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement userCoordinatorStmt = this.connection.prepareStatement(userCoordinatorInsertSql);
        userCoordinatorStmt.setString(1, coordinatorUsername);
        userCoordinatorStmt.setString(2, coordinatorPassword);
        userCoordinatorStmt.setString(3, coordinatorEmail);
        userCoordinatorStmt.setString(4, "3"); // Role ID for coordinator
        userCoordinatorStmt.setString(5, coordinatorId);

        int userCoordinatorRowsAffected = userCoordinatorStmt.executeUpdate();

        if (userCoordinatorRowsAffected <= 0) {
            JOptionPane.showMessageDialog(null, "Failed to insert user record for Coordinator.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        userCoordinatorStmt.close();
    } else {
        JOptionPane.showMessageDialog(null, "Failed to insert Coordinator record.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    coordinatorStmt.close();

    // Insert into admins table
    String adminInsertSql = "INSERT INTO admins (AdminID, Name, Email) VALUES (?, ?, ?)";
    PreparedStatement adminStmt = this.connection.prepareStatement(adminInsertSql);
    adminStmt.setString(1, adminId);
    adminStmt.setString(2, adminName);
    adminStmt.setString(3, adminEmail);

    int adminRowsAffected = adminStmt.executeUpdate();

    if (adminRowsAffected > 0) {
        // Insert into user table for admin
        String userAdminInsertSql = "INSERT INTO user (username, password, email, Role, ReferenceID) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement userAdminStmt = this.connection.prepareStatement(userAdminInsertSql);
        userAdminStmt.setString(1, adminUsername);
        userAdminStmt.setString(2, adminPassword);
        userAdminStmt.setString(3, adminEmail);
        userAdminStmt.setString(4, "5"); // Role ID for admin
        userAdminStmt.setString(5, adminId);

        int userAdminRowsAffected = userAdminStmt.executeUpdate();

        if (userAdminRowsAffected <= 0) {
            JOptionPane.showMessageDialog(null, "Failed to insert user record for Admin.", "Error", JOptionPane.ERROR_MESSAGE);
        }
        userAdminStmt.close();
    } else {
        JOptionPane.showMessageDialog(null, "Failed to insert Admin record.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    adminStmt.close();

    // Insert into hospitals table
    String hospitalInsertSql = "INSERT INTO hospitals (HospitalID, Name, Address, City, State, Phone, coordinatorId, AdminId) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
    PreparedStatement hospitalStmt = this.connection.prepareStatement(hospitalInsertSql);

    hospitalStmt.setString(1, hospitalId);
    hospitalStmt.setString(2, hospitalName);
    hospitalStmt.setString(3, hospitalAddress);
    hospitalStmt.setString(4, hospitalCity);
    hospitalStmt.setString(5, hospitalState);
    hospitalStmt.setString(6, hospitalPhone);
    hospitalStmt.setString(7, coordinatorId);
    hospitalStmt.setString(8, adminId);

    int hospitalRowsAffected = hospitalStmt.executeUpdate();

    if (hospitalRowsAffected > 0) {
        JOptionPane.showMessageDialog(null, "Hospital record inserted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
    } else {
        JOptionPane.showMessageDialog(null, "Failed to insert hospital record.", "Error", JOptionPane.ERROR_MESSAGE);
    }

    hospitalStmt.close();

} catch (SQLException e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
} catch (Exception e) {
    e.printStackTrace();
    JOptionPane.showMessageDialog(null, "An unexpected error occurred: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
}



    }//GEN-LAST:event_btnSaveActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
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
    private javax.swing.JLabel lblHospitalPhone;
    private javax.swing.JTextField txtAdminEmail;
    private javax.swing.JTextField txtAdminName;
    private javax.swing.JTextField txtAdminPassword;
    private javax.swing.JTextField txtAdminUsername;
    private javax.swing.JTextField txtHospitalAddress;
    private javax.swing.JTextField txtHospitalCity;
    private javax.swing.JTextField txtHospitalName;
    private javax.swing.JTextField txtHospitalPhone;
    private javax.swing.JTextField txtHospitalState;
    private javax.swing.JTextField txtTcEmail;
    private javax.swing.JTextField txtTcName;
    private javax.swing.JTextField txtTcPassword;
    private javax.swing.JTextField txtTcUsername;
    // End of variables declaration//GEN-END:variables
}
