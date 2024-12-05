/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Lawyer;

import DatabaseConn.DatabaseConnection;
import java.awt.CardLayout;
import java.sql.Connection;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement; 
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import java.sql.SQLException;
import javax.swing.JPanel;

/**
 *
 * @author Rina
 */
public class LawyerWorkAreaJPanel extends javax.swing.JPanel {

    private Connection connection;
    JPanel userProcessContainer;
    String LawyerID;
    
    /**
     * Creates new form LawyerWorkAreaJPanel
     */
    public LawyerWorkAreaJPanel(JPanel userProcessContainer, String LawyerID) {
        initComponents();
        
        this.connection = DatabaseConnection.getConnection();
        this.userProcessContainer= userProcessContainer;
        populateLawyerTable();
        populateRequestTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBack = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCaseDetail = new javax.swing.JTable();
        btnDetail = new javax.swing.JButton();
        btnApprove = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLawyerDetail = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(110, 146, 147));

        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnBack.setText("<<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        tblCaseDetail.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        tblCaseDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "caseID", "Request Date", "PatientID", "Message", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblCaseDetail.setGridColor(new java.awt.Color(0, 0, 0));
        tblCaseDetail.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(tblCaseDetail);

        btnDetail.setText("See Case Detail");
        btnDetail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDetailActionPerformed(evt);
            }
        });

        btnApprove.setText("Approve & Assign a Lawyer");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        tblLawyerDetail.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        tblLawyerDetail.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Lawyer ID", "Lawyer Name", "Phone", "Specialization"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblLawyerDetail);

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnApprove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnDetail)
                        .addGap(32, 32, 32))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 809, Short.MAX_VALUE)
                    .addComponent(jScrollPane1))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDetail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnApprove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(104, 104, 104))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCaseDetail.getSelectedRow();
        
        if (selectedRow != -1) { 
            String caseID = tblCaseDetail.getValueAt(selectedRow, 0).toString();
            updateStatus(caseID, "approved"); 
        } else { 
            JOptionPane.showMessageDialog(this, "Please select a case!"); 
        }
        populateRequestTable();
    }//GEN-LAST:event_btnApproveActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateLawyerTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnDetailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDetailActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCaseDetail.getSelectedRow();
        String patientID= null;
     
        if (selectedRow != -1) { 
            patientID = tblCaseDetail.getValueAt(selectedRow, 0).toString();
            updateStatus(patientID, "approved"); 
        } else { 
            JOptionPane.showMessageDialog(this, "Please select a case!"); 
        }
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        userProcessContainer.add("CaseDetailJPanel", new CaseDetailJPanel(userProcessContainer, connection, patientID ));
        layout.next(userProcessContainer);
        
    }//GEN-LAST:event_btnDetailActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDetail;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCaseDetail;
    private javax.swing.JTable tblLawyerDetail;
    // End of variables declaration//GEN-END:variables
    public void populateLawyerTable(){
        DefaultTableModel model = (DefaultTableModel) tblLawyerDetail.getModel();
        
        model.setRowCount(0); 
        if (connection != null) {
             String query = "SELECT * FROM Lawyers; "; // Query to fetch all Lawyer
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query); 
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) { 
                String id = resultSet.getString("LawyerID"); 
                String name = resultSet.getString("Name"); 
                String phone = resultSet.getString("Phone");
                String specialization = resultSet.getString("Specialization"); 
                
                Object[] row = new Object[4];
                row[0] = id;
                row[1] = name;
                row[2] = phone;
                row[3] = specialization;
            
            model.addRow(row);
            } 
        } catch (SQLException e) { 
            e.printStackTrace(); 
            JOptionPane.showMessageDialog(this, "Error getting Lawyer data", "Error", JOptionPane.ERROR_MESSAGE); 
        } 
         }
    }
    
    public void populateRequestTable(){
        DefaultTableModel model = (DefaultTableModel) tblCaseDetail.getModel();
        
        model.setRowCount(0); 
        if (connection != null) {
             String query = "SELECT * FROM  work_request WHERE receiver_id= 6;"; 
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query); 
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) { 
                String Message = resultSet.getString("message"); 
                String RequestDate = resultSet.getString("request_date"); 
                String status = resultSet.getString("status");
                String patientID = resultSet.getString("patientID");
                String caseID = resultSet.getString("caseID");
                
                Object[] row = new Object[5];
                row[0] = caseID;
                row[1] = RequestDate;
                row[2] = patientID;
                row[3] = Message;
                row[4] = status;
                
            
            model.addRow(row);
            } 
        } catch (SQLException e) { 
            e.printStackTrace(); 
            JOptionPane.showMessageDialog(this, "Error getting Request data", "Error", JOptionPane.ERROR_MESSAGE); 
        } 
         }
}
    
    private void updateStatus(String caseID, String newStatus) { 
        if (connection != null) { 
            String query = "UPDATE work_request SET status = ? WHERE caseID = ?"; 
            try { 
                PreparedStatement preparedStatement = connection.prepareStatement(query); 
                preparedStatement.setString(1, newStatus); 
                preparedStatement.setString(2, caseID); 
                int affectedRows = preparedStatement.executeUpdate(); 
                if (affectedRows > 0) { 
                    //JOptionPane.showMessageDialog(this, "Case Update Successfully!"); 
                } else { 
                    //JOptionPane.showMessageDialog(this, "Update Failed", "Error", JOptionPane.ERROR_MESSAGE); 
                } 
            } catch (SQLException e) { 
                e.printStackTrace(); 
                JOptionPane.showMessageDialog(this, "Error updating Request data", "Error", JOptionPane.ERROR_MESSAGE); 
            } 
        }
    
    }
    
    
}
