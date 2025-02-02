/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui.Transportation;

import DatabaseConn.DatabaseConnection;
import ui.AdministrativeRole.*;
import java.awt.CardLayout;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.Timestamp;

/**
 *
 * @author Lin
 */
public class TransportationJPanel extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private Connection connection;
    
    /**
     * Creates new form ManageOrganizationJPanel
     */
    public TransportationJPanel(JPanel userProcessContainer) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.connection = DatabaseConnection.getConnection();
        
        populateTable();
    }

    private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblTransTasks.getModel();
        
        model.setRowCount(0); 
        if (connection != null) {
             String query = "SELECT * FROM deliveryTasks; "; // Query to fetch all Lawyer
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query); 
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) { 
                String ID = resultSet.getString("Id"); 
                String StartAddress = resultSet.getString("StartAddress"); 
                String EndAddress = resultSet.getString("EndAddress"); 
                String Category = resultSet.getString("Category");
                String TimeLimit = resultSet.getString("TimeLimit"); 
                String StartTime = resultSet.getString("StartTime"); 
                String EndTime = resultSet.getString("EndTime"); 
                String Status = resultSet.getString("Status"); 
                
                Object[] row = new Object[8];
                row[0] = ID;
                row[1] = StartAddress;
                row[2] = EndAddress;
                row[3] = Category;
                row[4] = TimeLimit;
                row[5] = Status;
                row[6] = StartTime;
                row[7] = EndTime;

                
            
            model.addRow(row);
            } 
        } catch (SQLException e) { 
            e.printStackTrace(); 
            JOptionPane.showMessageDialog(this, "Error getting deliveryTasks data", "Error", JOptionPane.ERROR_MESSAGE); 
        } 
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
        tblTransTasks = new javax.swing.JTable();
        btnStart = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnCompleted1 = new javax.swing.JButton();

        tblTransTasks.setFont(new java.awt.Font("Helvetica Neue", 1, 14)); // NOI18N
        tblTransTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Start Address", "End Address", "Category", "Time Limit", "Status", "Start Time", "End Time"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblTransTasks);

        btnStart.setText("Start");
        btnStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartActionPerformed(evt);
            }
        });

        btnBack.setText("<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnCompleted1.setText("Completed");
        btnCompleted1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCompleted1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jScrollPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 442, Short.MAX_VALUE)
                        .addComponent(btnStart, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCompleted1)))
                .addGap(21, 21, 21))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(97, 97, 97)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addGap(95, 95, 95)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnStart, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCompleted1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(133, 133, 133))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartActionPerformed
        int selectedRow = tblTransTasks.getSelectedRow();
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        
        if (selectedRow != -1) { 
            String ID = tblTransTasks.getValueAt(selectedRow, 0).toString();
            updateStatus(ID, "Pending"); 
            updateStartTime(ID, currentTime);
        } else { 
            JOptionPane.showMessageDialog(this, "Please select a row!"); 
        }
        populateTable();
        
    }//GEN-LAST:event_btnStartActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed

        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCompleted1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCompleted1ActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblTransTasks.getSelectedRow();
        Timestamp currentTime = new Timestamp(System.currentTimeMillis());
        
        if (selectedRow != -1) { 
            String ID = tblTransTasks.getValueAt(selectedRow, 0).toString();
            updateStatus(ID, "Completed"); 
            updateEndTime(ID, currentTime);
        } else { 
            JOptionPane.showMessageDialog(this, "Please select a row!"); 
        }
        populateTable();
    }//GEN-LAST:event_btnCompleted1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCompleted1;
    private javax.swing.JButton btnStart;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblTransTasks;
    // End of variables declaration//GEN-END:variables
 private void updateStatus(String ID, String newStatus) { 
      if (connection != null) { 
          String query = "UPDATE deliveryTasks SET Status = ? WHERE Id = ?"; 
          try { 
              PreparedStatement preparedStatement = connection.prepareStatement(query); 
              preparedStatement.setString(1, newStatus); 
              preparedStatement.setString(2, ID); 
              int affectedRows = preparedStatement.executeUpdate(); 
              if (affectedRows > 0) { 
                  //JOptionPane.showMessageDialog(this, "DeliveryTasks Update Successfully!"); 
              } else { 
                  //JOptionPane.showMessageDialog(this, "Update Failed", "Error", JOptionPane.ERROR_MESSAGE); 
              } 
          } catch (SQLException e) { 
              e.printStackTrace(); 
              JOptionPane.showMessageDialog(this, "Error updating DeliveryTasks data", "Error", JOptionPane.ERROR_MESSAGE); 
          } 
      }
    
    }

private void updateStartTime(String ID, Timestamp Time) { 
      if (connection != null) { 
          String query = "UPDATE deliveryTasks SET StartTime = ? WHERE Id = ?"; 
          try { 
              PreparedStatement preparedStatement = connection.prepareStatement(query); 
              preparedStatement.setTimestamp(1, Time); 
              preparedStatement.setString(2, ID); 
              int affectedRows = preparedStatement.executeUpdate(); 
              if (affectedRows > 0) { 
                  //JOptionPane.showMessageDialog(this, "Delivery Start Time Update Successfully!"); 
              } else { 
                  //JOptionPane.showMessageDialog(this, "Update Time Failed", "Error", JOptionPane.ERROR_MESSAGE); 
              } 
          } catch (SQLException e) { 
              e.printStackTrace(); 
              JOptionPane.showMessageDialog(this, "Error updating Delivery StartTime data", "Error", JOptionPane.ERROR_MESSAGE); 
          } 
      }
    
    }

private void updateEndTime(String ID, Timestamp Time) { 
      if (connection != null) { 
          String query = "UPDATE deliveryTasks SET EndTime = ? WHERE Id = ?"; 
          try { 
              PreparedStatement preparedStatement = connection.prepareStatement(query); 
              preparedStatement.setTimestamp(1, Time); 
              preparedStatement.setString(2, ID); 
              int affectedRows = preparedStatement.executeUpdate(); 
              if (affectedRows > 0) { 
                  JOptionPane.showMessageDialog(this, "Delivery End Time Update Successfully!"); 
              } else { 
                  JOptionPane.showMessageDialog(this, "Update Time Failed", "Error", JOptionPane.ERROR_MESSAGE); 
              } 
          } catch (SQLException e) { 
              e.printStackTrace(); 
              JOptionPane.showMessageDialog(this, "Error updating Delivery EndTime data", "Error", JOptionPane.ERROR_MESSAGE); 
          } 
      }
    
    }

}
