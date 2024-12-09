/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalManagement;
import java.util.*;
import model.HospitalManagement.*;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import DatabaseConn.DatabaseConnection;
import java.awt.CardLayout;
import model.users.*;
/**
 *
 * @author pranavb
 */
public class TransplantRequest extends javax.swing.JPanel {

    /**
     * Creates new form TransplantRequest
     */
    TransplantRequest tr;
    DatabaseConnection dbConn = new DatabaseConnection();
    Connection connection = dbConn.getConnection();
    User user;
    Hospital hospital;
    JPanel userProcessContainer;
    ArrayList<TransplantRequest> TransplantRequestDirectory = new ArrayList<TransplantRequest>();
    public TransplantRequest(JPanel userProcessContainer, User user, Hospital hospital) {
        initComponents();
        this.user = user;
        this.hospital = hospital;
        this.populateTransplantTable();
        this.userProcessContainer = userProcessContainer;
    }
    public void populateTransplantTable() {
    
    String query = "";
    
    if (this.user.getRole().toUpperCase().equals("UNOS ADMIN")){
        query = "SELECT * FROM transplant";
        
         btnSurgerySuccess.setVisible(false);
         btnSurgeryUnsuccessful.setVisible(false);
         btnRequestUnosApproval.setVisible(false);
         lbl.setVisible(false);
         txtDate.setVisible(false);
         btnSetTransplantDate.setVisible(false);
    }
    
    else if (this.user.getRole().toUpperCase().equals("COORDINATOR")){
        query = "SELECT * FROM transplant where hospitalID = '"+this.hospital.getId()+"'";
        btnSurgerySuccess.setVisible(false);
         btnSurgeryUnsuccessful.setVisible(false);
         btnApproveTransplant.setVisible(false);
    }
    
    else if (this.user.getRole().toUpperCase().equals("DOCTOR")){
        query = "SELECT * FROM transplant where doctorID = '"+this.user.getId()+"'";
                 btnRequestUnosApproval.setVisible(false);
         lbl.setVisible(false);
         txtDate.setVisible(false);
         btnSetTransplantDate.setVisible(false);
         btnApproveTransplant.setVisible(false);
    }

    try (PreparedStatement preparedStatement = this.connection.prepareStatement(query);
         ResultSet resultSet = preparedStatement.executeQuery()) {

        DefaultTableModel model = (DefaultTableModel) tblTransplant.getModel();

        model.setRowCount(0);

        while (resultSet.next()) {
            String donorID = resultSet.getString("DonorID");
            String recipientID = resultSet.getString("RecipientID");
            String organID = resultSet.getString("OrganID");
            Date transplantDate = resultSet.getDate("TransplantDate");
            String outcome = resultSet.getString("Outcome");
            String legalApproval = resultSet.getString("legalApproval");
            String unosApproval = resultSet.getString("UNOS_APPROVAL");
            //String transportStatus = resultSet.getString("transportStatus");

            model.addRow(new Object[]{
                recipientID, donorID, organID, transplantDate, legalApproval , unosApproval, outcome
            });
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error fetching data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}
    public void populateTransplantTableForDoctor() {
    String query = "SELECT t.RecipientID, t.DonorID, t.OrganID, t.TransplantDate, t.Outcome, t.legalApproval, t.transportStatus " +
                   "FROM transplant t " +
                   "JOIN transplantPatients tp ON t.RecipientID = tp.PatientID " +
                   "WHERE tp.DoctorID = ?";

    try (PreparedStatement preparedStatement = this.connection.prepareStatement(query)) {
        preparedStatement.setString(1, this.user.getId());
        ResultSet resultSet = preparedStatement.executeQuery();

        DefaultTableModel model = (DefaultTableModel) tblTransplant.getModel();
        model.setRowCount(0);

        while (resultSet.next()) {
            String donorID = resultSet.getString("DonorID");
            String recipientID = resultSet.getString("RecipientID");
            String organID = resultSet.getString("OrganID");
            Date transplantDate = resultSet.getDate("TransplantDate");
            String outcome = resultSet.getString("Outcome");
            String legalApproval = resultSet.getString("legalApproval");
            String unos = resultSet.getString("UNOS_APPROVAL");
            String transportStatus = resultSet.getString("transportStatus");

            model.addRow(new Object[]{
                recipientID, donorID, organID, transplantDate, legalApproval , unos, outcome, transportStatus
            });
        }

    } catch (SQLException e) {
        JOptionPane.showMessageDialog(null, "Error fetching data: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}

    
    public void requestUnosApproval() {
    int selectedRow = tblTransplant.getSelectedRow();
    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Please select a case to request UNOS approval.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String recipientID = tblTransplant.getValueAt(selectedRow, 0).toString();

    String query = "UPDATE transplant SET UNOS_APPROVAL_REQUEST = 1, UNOS_APPROVAL = 'PENDING' WHERE RecipientID = ?";
    try (PreparedStatement preparedStatement = this.connection.prepareStatement(query)) {
        preparedStatement.setString(1, recipientID);

        int rowsUpdated = preparedStatement.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "UNOS approval requested successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            populateTransplantTable();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to request UNOS approval.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error requesting UNOS approval: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}
    public void unosApproval() {
    int selectedRow = tblTransplant.getSelectedRow();
    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Please select a case to request UNOS approval.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String recipientID = tblTransplant.getValueAt(selectedRow, 0).toString();

    String query = "UPDATE transplant SET UNOS_APPROVAL = 'Approved' WHERE RecipientID = ?";
    try (PreparedStatement preparedStatement = this.connection.prepareStatement(query)) {
        preparedStatement.setString(1, recipientID);

        int rowsUpdated = preparedStatement.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "UNOS approval  successfull!", "Success", JOptionPane.INFORMATION_MESSAGE);
            populateTransplantTable();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to UNOS approval.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error requesting UNOS approval: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}
    
    public void surgerySuccess() {
    int selectedRow = tblTransplant.getSelectedRow();
    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Please select a case to request UNOS approval.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String recipientID = tblTransplant.getValueAt(selectedRow, 0).toString();

    String query = "UPDATE transplant SET Outcome = 'Successful' WHERE RecipientID = ?";
    try (PreparedStatement preparedStatement = this.connection.prepareStatement(query)) {
        preparedStatement.setString(1, recipientID);

        int rowsUpdated = preparedStatement.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Outcome Changed Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            populateTransplantTable();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to change outcome", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error" + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}
    public void surgeryUnSuccessful() {
    int selectedRow = tblTransplant.getSelectedRow();
    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Please select a case to request UNOS approval.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String recipientID = tblTransplant.getValueAt(selectedRow, 0).toString();

    String query = "UPDATE transplant SET Outcome = 'Unsuccessful' WHERE RecipientID = ?";
    try (PreparedStatement preparedStatement = this.connection.prepareStatement(query)) {
        preparedStatement.setString(1, recipientID);

        int rowsUpdated = preparedStatement.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Outcome Changed Successfully", "Success", JOptionPane.INFORMATION_MESSAGE);
            populateTransplantTable();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to change outcome", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error" + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        tblTransplant = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnSetTransplantDate = new javax.swing.JButton();
        btnRequestUnosApproval = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();
        lbl = new javax.swing.JLabel();
        btnSurgerySuccess = new javax.swing.JButton();
        btnSurgeryUnsuccessful = new javax.swing.JButton();
        btnApproveTransplant = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(22, 29, 29));
        setMaximumSize(new java.awt.Dimension(1200, 830));
        setMinimumSize(new java.awt.Dimension(1200, 830));

        tblTransplant.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "RecepientID", "DonorID", "OrganID", "Transplant Date", "Legal Approval", "Unos Approval", "Outcome"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTransplant);
        if (tblTransplant.getColumnModel().getColumnCount() > 0) {
            tblTransplant.getColumnModel().getColumn(6).setResizable(false);
        }

        jButton1.setText("VIEW CASE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnSetTransplantDate.setText("SET TRANSPLANT DATE");
        btnSetTransplantDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetTransplantDateActionPerformed(evt);
            }
        });

        btnRequestUnosApproval.setText("REQUEST UNOS APPROVAL");
        btnRequestUnosApproval.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestUnosApprovalActionPerformed(evt);
            }
        });

        lbl.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lbl.setForeground(new java.awt.Color(255, 255, 255));
        lbl.setText("DATE:");

        btnSurgerySuccess.setText("SURGERY SUCCESSFUL");
        btnSurgerySuccess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSurgerySuccessActionPerformed(evt);
            }
        });

        btnSurgeryUnsuccessful.setText("SURGERY UNSUCCESSFUL");
        btnSurgeryUnsuccessful.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSurgeryUnsuccessfulActionPerformed(evt);
            }
        });

        btnApproveTransplant.setText("APPROVE TRANSPLANT");
        btnApproveTransplant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveTransplantActionPerformed(evt);
            }
        });

        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnRequestUnosApproval, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnApproveTransplant, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnSurgerySuccess, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtDate)
                            .addComponent(btnSetTransplantDate, javax.swing.GroupLayout.PREFERRED_SIZE, 172, Short.MAX_VALUE))
                        .addGap(152, 152, 152))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSurgeryUnsuccessful, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1064, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(86, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 278, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnRequestUnosApproval, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnApproveTransplant, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSurgerySuccess, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDate, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbl))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSetTransplantDate, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSurgeryUnsuccessful, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
                        int selectedRowIndex = tblTransplant.getSelectedRow();
        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Pls select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
       Object obj = tblTransplant.getValueAt(selectedRowIndex, 0);
        
        ViewTransplantCaseJPanel viewTransplantCaseJPanel = new ViewTransplantCaseJPanel(this.userProcessContainer, tblTransplant.getValueAt(selectedRowIndex, 0).toString());
        userProcessContainer.add("ViewTransplantCaseJPanel", viewTransplantCaseJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnRequestUnosApprovalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestUnosApprovalActionPerformed
        // TODO add your handling code here:
        this.requestUnosApproval();
        this.populateTransplantTable();
    }//GEN-LAST:event_btnRequestUnosApprovalActionPerformed

    private void btnSetTransplantDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetTransplantDateActionPerformed
        // TODO add your handling code here:
        this.setTransplantDate();
        this.populateTransplantTable();
    }//GEN-LAST:event_btnSetTransplantDateActionPerformed

    private void btnApproveTransplantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveTransplantActionPerformed
        // TODO add your handling code here:
        this.unosApproval();
        this.populateTransplantTable();
    }//GEN-LAST:event_btnApproveTransplantActionPerformed

    private void btnSurgerySuccessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSurgerySuccessActionPerformed
        // TODO add your handling code here:
        this.surgerySuccess();
        this.populateTransplantTable();
    }//GEN-LAST:event_btnSurgerySuccessActionPerformed

    private void btnSurgeryUnsuccessfulActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSurgeryUnsuccessfulActionPerformed
        // TODO add your handling code here:
        this.surgeryUnSuccessful();
    }//GEN-LAST:event_btnSurgeryUnsuccessfulActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    public void setTransplantDate() {
    int selectedRow = tblTransplant.getSelectedRow();
    if (selectedRow < 0) {
        JOptionPane.showMessageDialog(this, "Please select a case to set the transplant date.", "No Selection", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String recipientID = tblTransplant.getValueAt(selectedRow, 0).toString();
    String dateText = txtDate.getText().trim();

    if (dateText.isEmpty()) {
        JOptionPane.showMessageDialog(this, "Please enter a date.", "Invalid Input", JOptionPane.WARNING_MESSAGE);
        return;
    }

    if (!isValidDate(dateText)) {
        JOptionPane.showMessageDialog(this, "Please enter a valid date in the format YYYY-MM-DD.", "Invalid Date Format", JOptionPane.WARNING_MESSAGE);
        return;
    }

    String query = "UPDATE transplant SET TransplantDate = ? WHERE RecipientID = ?";
    try (PreparedStatement preparedStatement = this.connection.prepareStatement(query)) {
        preparedStatement.setDate(1, java.sql.Date.valueOf(dateText));
        preparedStatement.setString(2, recipientID);

        int rowsUpdated = preparedStatement.executeUpdate();
        if (rowsUpdated > 0) {
            JOptionPane.showMessageDialog(this, "Transplant date updated successfully!", "Success", JOptionPane.INFORMATION_MESSAGE);
            populateTransplantTable();
        } else {
            JOptionPane.showMessageDialog(this, "Failed to update transplant date.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error updating transplant date: " + e.getMessage(), "Database Error", JOptionPane.ERROR_MESSAGE);
    }
}

    private boolean isValidDate(String dateStr) {
    try {
        java.sql.Date.valueOf(dateStr); // Will throw an exception if the format is invalid
        return true;
    } catch (IllegalArgumentException e) {
        return false;
    }
}


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveTransplant;
    private javax.swing.JButton btnRequestUnosApproval;
    private javax.swing.JButton btnSetTransplantDate;
    private javax.swing.JButton btnSurgerySuccess;
    private javax.swing.JButton btnSurgeryUnsuccessful;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl;
    private javax.swing.JTable tblTransplant;
    private javax.swing.JTextField txtDate;
    // End of variables declaration//GEN-END:variables
}
