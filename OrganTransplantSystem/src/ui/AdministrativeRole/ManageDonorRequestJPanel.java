/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.AdministrativeRole;

import ui.DonorManagement.*;
import java.awt.Image;
import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import DatabaseConn.DatabaseConnection;
import java.awt.Toolkit;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.UUID;
import java.util.regex.Pattern;
import javax.imageio.ImageIO;
import javax.swing.JPanel;
import model.donor.*;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 *
 * @author pranavb
 */
public class ManageDonorRequestJPanel extends javax.swing.JPanel {

    /**
     * Creates new form DonorRegistrationWorkArea
     */
    

    DatabaseConnection databaseConnection = new DatabaseConnection();
    Connection connection;
    String consent;
    JPanel userProcessContainer;
    Donor donor;
    public ManageDonorRequestJPanel(JPanel userProcessContainer, Donor donor) {
        initComponents();
        this.setComponentsVisible(false);
        this.connection = databaseConnection.getConnection();
        this.userProcessContainer = userProcessContainer;
        this.donor = donor;
        this.LoadData();
        this.loadBloodTypes();
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
        txtFirstName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtMiddleName = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        txtDateOfBirth = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        jLabel20 = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        txtAddressLine1 = new javax.swing.JTextField();
        jLabel22 = new javax.swing.JLabel();
        txtAddressLine2 = new javax.swing.JTextField();
        jLabel23 = new javax.swing.JLabel();
        consentArea = new javax.swing.JScrollPane();
        txtMedicalHistory = new javax.swing.JTextArea();
        btnSign = new javax.swing.JButton();
        imglogo = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        cmbStatus = new javax.swing.JComboBox<>();
        cmbBloodType = new javax.swing.JComboBox<>();
        jLabel27 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();

        setBackground(new java.awt.Color(111, 147, 146));
        setMaximumSize(new java.awt.Dimension(1200, 830));
        setMinimumSize(new java.awt.Dimension(1200, 830));
        setPreferredSize(new java.awt.Dimension(1200, 830));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DONOR REGISTRATION REQUESTS");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("FIRST NAME");

        jLabel17.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("MIDDLE NAME");

        jLabel18.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("LAST NAME");

        jLabel19.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("DATE OF BIRTH");

        jLabel20.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("CITY");

        jLabel21.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("STATE");

        txtAddressLine1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAddressLine1ActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("ADDRESS LINE 1");

        jLabel23.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("ADDRESS LINE 2");

        txtMedicalHistory.setColumns(20);
        txtMedicalHistory.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        txtMedicalHistory.setLineWrap(true);
        txtMedicalHistory.setRows(5);
        txtMedicalHistory.setAutoscrolls(false);
        consentArea.setViewportView(txtMedicalHistory);

        btnSign.setBackground(new java.awt.Color(22, 29, 29));
        btnSign.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnSign.setForeground(new java.awt.Color(255, 255, 255));
        btnSign.setText("SIGN AND REGISTER");
        btnSign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignActionPerformed(evt);
            }
        });

        imglogo.setSize(new java.awt.Dimension(140, 16));

        btnSave.setBackground(new java.awt.Color(22, 29, 29));
        btnSave.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("CONFIRM AND FINISH");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        jLabel24.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));

        jLabel25.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("MEDICAL HISTORY");

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("BLOOD TYPE");

        jLabel26.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("STATUS");

        cmbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbStatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatusActionPerformed(evt);
            }
        });

        cmbBloodType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbBloodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbBloodTypeActionPerformed(evt);
            }
        });

        jLabel27.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("PHONE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel21, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAddressLine2))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel22)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jLabel27, javax.swing.GroupLayout.DEFAULT_SIZE, 89, Short.MAX_VALUE)
                                .addComponent(jLabel26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnSign, javax.swing.GroupLayout.PREFERRED_SIZE, 294, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(475, 475, 475)
                            .addComponent(imglogo, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(consentArea, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGap(397, 397, 397)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 279, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(323, 323, 323)))))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtFirstName, txtMiddleName});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel17, jLabel18, jLabel19, jLabel2, jLabel20, jLabel21, jLabel23});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cmbBloodType, cmbStatus});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMiddleName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAddressLine1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtAddressLine2, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtPhone, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cmbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19)
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(consentArea, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addComponent(btnSign, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(imglogo, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(144, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtFirstName, txtMiddleName});

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jLabel17, jLabel18, jLabel19, jLabel2});

    }// </editor-fold>//GEN-END:initComponents

    private void txtAddressLine1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAddressLine1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAddressLine1ActionPerformed

    
    public void validateFields() {
        // Retrieve inputs from text fields
        String firstName = txtFirstName.getText();
        String middleName = txtMiddleName.getText();
        String lastName = txtLastName.getText();
        String dateOfBirth = txtDateOfBirth.getText();
        String city = txtCity.getText();
        String state = txtState.getText();
        String addressLine1 = txtAddressLine1.getText();
        String addressLine2 = txtAddressLine2.getText();
        //String consentText = consentArea.getText();

        // Validate required fields
        if (firstName.isEmpty() || lastName.isEmpty() || dateOfBirth.isEmpty() || city.isEmpty() ||
            state.isEmpty() || addressLine1.isEmpty()) {
            JOptionPane.showMessageDialog(null, "All required fields must be filled.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException("Validation Error: Missing required fields.");
        }

        // Validate name fields (letters and spaces only)
        if (!isValidName(firstName) || !isValidName(middleName) || !isValidName(lastName)) {
            JOptionPane.showMessageDialog(null, "Names must contain only letters and spaces.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException("Validation Error: Invalid name format.");
        }

        // Validate date of birth (basic YYYY-MM-DD format check)
        if (!isValidDate(dateOfBirth)) {
            JOptionPane.showMessageDialog(null, "Date of birth must be in the format YYYY-MM-DD.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException("Validation Error: Invalid date format.");
        }

        // Validate city and state (letters, spaces, and hyphens only)
        if (!isValidName(city) || !isValidName(state)) {
            JOptionPane.showMessageDialog(null, "City and State must contain only letters, spaces, or hyphens.", "Validation Error", JOptionPane.ERROR_MESSAGE);
            throw new IllegalArgumentException("Validation Error: Invalid city or state format.");
        }
    }

    public void insertDonorRegistrationRequest() {
        validateFields();

        try {
            // Generate a unique RequestID
            String requestId = UUID.randomUUID().toString();

            // Retrieve inputs from text fields
            String firstName = txtFirstName.getText();
            String middleName = txtMiddleName.getText();
            String lastName = txtLastName.getText();
            String dateOfBirth = txtDateOfBirth.getText();
            String city = txtCity.getText();
            String state = txtState.getText();
            String addressLine1 = txtAddressLine1.getText();
            String addressLine2 = txtAddressLine2.getText();
            // Assuming the signature image is uploaded and stored in the 'signature' JLabel
            //java.sql.Blob signatureBlob = null; // Add logic to retrieve and convert the signature if available

            // Prepare the SQL insert statement
            String sql = "INSERT INTO DonorRegistrationRequests " +
                         "(RequestID, FirstName, MiddleName, LastName, DateOfBirth, AddressLine1, AddressLine2, " +
                         "City, State, ConsentStatus, RegistrationApproved) " +
                         "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, requestId);
            stmt.setString(2, firstName);
            stmt.setString(3, middleName);
            stmt.setString(4, lastName);
            stmt.setString(5, dateOfBirth);
            stmt.setString(6, addressLine1);
            stmt.setString(7, addressLine2);
            stmt.setString(8, city);
            stmt.setString(9, state);
            //stmt.setBlob(10, signatureBlob); // Assuming the signature is handled as a BLOB
            stmt.setString(10, this.consent); // ConsentStatus is set to 'Pending' by default
            stmt.setNull(11, java.sql.Types.BOOLEAN); // RegistrationApproved is null by default
            

            // Execute the insert query
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                JOptionPane.showMessageDialog(null, "Donor Registration Request submitted successfully.", "Success", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Failed to submit Donor Registration Request.", "Error", JOptionPane.ERROR_MESSAGE);
            }

            stmt.close();
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Database error: " + e.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Utility method to validate name fields (letters, spaces, and optional hyphens)
    private boolean isValidName(String name) {
        if (name == null || name.isEmpty()) {
            return true; // Allow empty fields like MiddleName
        }
        return Pattern.matches("^[a-zA-Z\\s\\-]+$", name);
    }

    // Utility method to validate date format (YYYY-MM-DD)
    private boolean isValidDate(String date) {
        return Pattern.matches("^\\d{4}-\\d{2}-\\d{2}$", date);
    }
    
    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        try {
            // TODO add your handling code here:
            this.saveDonorDetails();
        } catch (SQLException ex) {
            Logger.getLogger(ManageDonorRequestJPanel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignActionPerformed
        // TODO add your handling code here:
        ImageIcon logoImage = new ImageIcon(getClass().getResource("/images/unosadmin.png"));
        logoImage = new ImageIcon(logoImage.getImage().getScaledInstance(230, 210, Image.SCALE_SMOOTH));

        imglogo.setIcon(logoImage);
        this.setComponentsVisible(true);
    }//GEN-LAST:event_btnSignActionPerformed

    private void cmbStatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbStatusActionPerformed

    private void cmbBloodTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbBloodTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbBloodTypeActionPerformed

    public void loadBloodTypes() {
    String[] bloodTypes = {"A+", "A-", "B+", "B-", "AB+", "AB-", "O+", "O-"};
    cmbBloodType.removeAllItems();
    for (String bloodType : bloodTypes) {
        cmbBloodType.addItem(bloodType);
    }
}

    public void LoadData() {
        String[] statuses = {"Active", "Deceased", "Ineligible", "Approved", "Pending"};
        cmbStatus.removeAllItems();
        for (String status : statuses) {
            cmbStatus.addItem(status);
        }
        
        txtFirstName.setText(this.donor.getFirstName());
        txtLastName.setText(this.donor.getLastName());
        txtCity.setText(this.donor.getCity());

    }
    
public void saveDonorDetails() throws SQLException {
    String donorId = UUID.randomUUID().toString();
    String firstName = txtFirstName.getText();
    String middleName = txtMiddleName.getText();
    String lastName = txtLastName.getText();
    String dob = txtDateOfBirth.getText();
    String city = txtCity.getText();
    String state = txtState.getText();
    String addressLine1 = txtAddressLine1.getText();
    String addressLine2 = txtAddressLine2.getText();
    String medicalHistory = txtMedicalHistory.getText();
    String phone = txtPhone.getText();
    String bloodType = cmbBloodType.getSelectedItem().toString();
    String status = cmbStatus.getSelectedItem().toString();

    if (validateInputs(firstName, lastName, dob, city, state, bloodType, status)) {
        String query = "INSERT INTO RegisteredDonors (DonorID, Name, DOB, BloodType, Status, City, State, MedicalHistory, Phone) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement preparedStatement = this.connection.prepareStatement(query);
        preparedStatement.setString(1, donorId);
        preparedStatement.setString(2, firstName + " " + middleName + " " + lastName);
        preparedStatement.setString(3, dob);
        preparedStatement.setString(4, bloodType);
        preparedStatement.setString(5, status);
        preparedStatement.setString(6, city);
        preparedStatement.setString(7, state);
        preparedStatement.setString(8, medicalHistory);
        preparedStatement.setString(9, phone);
        preparedStatement.executeUpdate();
        JOptionPane.showMessageDialog(null, "Donor details saved successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
    }
}

private boolean validateInputs(String firstName, String lastName, String dob, String city, String state, String bloodType, String status) {
    if (firstName == null || firstName.isEmpty()) {
        JOptionPane.showMessageDialog(null, "First Name cannot be empty!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    if (lastName == null || lastName.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Last Name cannot be empty!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    if (!isValidDateFormat(dob)) {
        JOptionPane.showMessageDialog(null, "Date of Birth must be in yyyy-MM-dd format!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    if (city == null || city.isEmpty()) {
        JOptionPane.showMessageDialog(null, "City cannot be empty!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    if (state == null || state.isEmpty()) {
        JOptionPane.showMessageDialog(null, "State cannot be empty!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    if (bloodType == null || bloodType.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Blood Type must be selected!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    if (status == null || status.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Status must be selected!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    return true;
}

private boolean isValidDateFormat(String date) {
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
    sdf.setLenient(false);
    try {
        Date parsedDate = sdf.parse(date);
        return true;
    } catch (Exception e) {
        return false;
    }
}

private boolean validateInputs(String firstName, String lastName, String city, String state, String bloodType, String status) {
    if (firstName == null || firstName.isEmpty()) {
        JOptionPane.showMessageDialog(null, "First Name cannot be empty!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    if (lastName == null || lastName.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Last Name cannot be empty!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
  
    if (city == null || city.isEmpty()) {
        JOptionPane.showMessageDialog(null, "City cannot be empty!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    if (state == null || state.isEmpty()) {
        JOptionPane.showMessageDialog(null, "State cannot be empty!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    if (bloodType == null || bloodType.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Blood Type must be selected!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    if (status == null || status.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Status must be selected!", "Validation Error", JOptionPane.ERROR_MESSAGE);
        return false;
    }
    return true;
}


    public void setComponentsVisible(boolean visible) {
    imglogo.setVisible(visible);
    btnSave.setVisible(visible);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSign;
    private javax.swing.JComboBox<String> cmbBloodType;
    private javax.swing.JComboBox<String> cmbStatus;
    private javax.swing.JScrollPane consentArea;
    private javax.swing.JLabel imglogo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtAddressLine1;
    private javax.swing.JTextField txtAddressLine2;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JTextArea txtMedicalHistory;
    private javax.swing.JTextField txtMiddleName;
    private javax.swing.JTextField txtPhone;
    private javax.swing.JTextField txtState;
    // End of variables declaration//GEN-END:variables
}
