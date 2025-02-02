/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalManagement;

import java.awt.CardLayout;
import java.sql.Connection;
import DatabaseConn.DatabaseConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.Statement;

/**
 *
 * @author rexinshiminsutongxue
 */
public class CoordinatorToTransport extends javax.swing.JPanel {

    JPanel userProcessContainer;
    private Connection connection;
    
    /**
     * Creates new form CoordinatorToTransport
     */
    public CoordinatorToTransport(JPanel userProcessContainer) {
        initComponents();
        
        this.userProcessContainer = userProcessContainer;
        this.connection = DatabaseConnection.getConnection();
        
        this.loadCategory();
        populateTable();
        this.loadStartHospital();
        this.loadEndHospital();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnSubmit = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblRequest = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cmbCategory = new javax.swing.JComboBox<>();
        txtTimeLimit = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        cmbStartHos = new javax.swing.JComboBox<>();
        cmbEndHos = new javax.swing.JComboBox<>();

        btnSubmit.setText("Sumit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jLabel4.setText("Request for Organ Transportation");

        btnBack.setFont(new java.awt.Font("Helvetica Neue", 1, 13)); // NOI18N
        btnBack.setText("<<< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel5.setText("End Hospital:");

        jLabel6.setText("Category:");

        tblRequest.setFont(new java.awt.Font("Helvetica Neue", 0, 14)); // NOI18N
        tblRequest.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Start Address", "End Address", "Category", "Start Time", "Time Limit", "Status"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblRequest.setGridColor(new java.awt.Color(0, 0, 0));
        tblRequest.setSelectionBackground(new java.awt.Color(204, 204, 204));
        jScrollPane2.setViewportView(tblRequest);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 15)); // NOI18N
        jLabel1.setText("Make a Request");

        jLabel2.setText("Start Hospital:");

        cmbCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCategoryActionPerformed(evt);
            }
        });

        txtTimeLimit.setEnabled(false);

        jLabel3.setText("Time Limit:");

        cmbStartHos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cmbEndHos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnBack)
                                .addGap(45, 45, 45)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 298, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(cmbStartHos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTimeLimit, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cmbEndHos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(cmbCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 9, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(cmbStartHos, javax.swing.GroupLayout.DEFAULT_SIZE, 25, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbEndHos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbCategory)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addGap(288, 288, 288))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtTimeLimit, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                        .addGap(60, 60, 60)
                        .addComponent(btnSubmit, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                        .addGap(202, 202, 202))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        String StartHos = cmbStartHos.getSelectedItem().toString();
        String EndHos = cmbEndHos.getSelectedItem().toString();
        String Category = cmbCategory.getSelectedItem().toString();
        String TimeLimit = getTimeLimit(Category);
        String Status = "Pending";
        
        String StartHosAdd = checkHospitalAddress(StartHos);
        String EndHosAdd = checkHospitalAddress(EndHos);

        insertData(StartHosAdd, EndHosAdd, Category, TimeLimit, Status);
        populateTable();
    }//GEN-LAST:event_btnSubmitActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void cmbCategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbCategoryActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmbCategory;
    private javax.swing.JComboBox<String> cmbEndHos;
    private javax.swing.JComboBox<String> cmbStartHos;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblRequest;
    private javax.swing.JTextField txtTimeLimit;
    // End of variables declaration//GEN-END:variables
public void loadCategory() {
    String[] OrganCategory = {"Heart", "Liver", "Kidney", "Lung"};
    cmbCategory.removeAllItems();
    for (String organCategory : OrganCategory) {
        cmbCategory.addItem(organCategory);
    }
}

public void loadStartHospital() {
    cmbStartHos.removeAllItems();
    try{

    //Statement stmt = connection.createStatement();
    String query = "SELECT Name FROM hospitals;"; 
    PreparedStatement preparedStatement = connection.prepareStatement(query); 
    ResultSet resultSet = preparedStatement.executeQuery(); 
    while (resultSet.next()) { 
        cmbStartHos.addItem(resultSet.getString("Name")); 
    }
    resultSet.close(); 
    preparedStatement.close();
    }catch (SQLException e) { 
        e.printStackTrace(); 
    }
    
}

public void loadEndHospital() {
    cmbEndHos.removeAllItems();
    try{

    //Statement stmt = connection.createStatement();
    String query = "SELECT Name FROM hospitals;"; 
    PreparedStatement preparedStatement = connection.prepareStatement(query); 
    ResultSet resultSet = preparedStatement.executeQuery(); 
    while (resultSet.next()) { 
        cmbEndHos.addItem(resultSet.getString("Name")); 
    }
    
    resultSet.close(); 
    preparedStatement.close();
    }catch (SQLException e) { 
        e.printStackTrace(); 
    }
    
}

private String getTimeLimit(String category) { 
    switch (category) { 
        case "Heart": 
            return "6:00:00"; 
        case "Liver": 
            return "12:00:00"; 
        case "Kidney": 
            return "36:00:00"; 
        case "Lung": 
            return "6:00:00"; 
        default: return "0:00:00"; 
    } 
}

private String checkHospitalAddress(String Name){
    String Address =null;
    if (connection != null) {
             String query = "Select Address FROM hospitals WHERE Name = ?; "; 
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query); 
              preparedStatement.setString(1, Name);  
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) { 
                Address = resultSet.getString("Address"); 
            } 
            return Address;
        } catch (SQLException e) { 
            e.printStackTrace(); 
            JOptionPane.showMessageDialog(this, "Error getting Hospital Address", "Error", JOptionPane.ERROR_MESSAGE); 
        } 
    } 
    return Address;
}


private void populateTable(){
        DefaultTableModel model = (DefaultTableModel) tblRequest.getModel();
        
        model.setRowCount(0); 
        if (connection != null) {
             String query = "SELECT * FROM deliveryTasks; "; // Query to fetch all Lawyer
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(query); 
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                String StartAddress = resultSet.getString("StartAddress"); 
                String EndAddress = resultSet.getString("EndAddress"); 
                String Category = resultSet.getString("Category");
                String TimeLimit = resultSet.getString("TimeLimit"); 
                String StartTime = resultSet.getString("StartTime"); 
                //String EndTime = resultSet.getString("EndTime"); 
                String Status = resultSet.getString("Status"); 
                
                Object[] row = new Object[6];
                //row[0] = ID;
                row[0] = StartAddress;
                row[1] = EndAddress;
                row[2] = Category;
                row[3] = StartTime;
                row[4] = TimeLimit;
                row[5] = Status;

                
            
            model.addRow(row);
            } 
        } catch (SQLException e) { 
            e.printStackTrace(); 
            JOptionPane.showMessageDialog(this, "Error getting deliveryTasks data", "Error", JOptionPane.ERROR_MESSAGE); 
        } 
         }
    }

 private void insertData(String StartHosAdd, String EndHosAdd, String Category, String TimeLimit,String Status) { 
        if (connection != null) { 
            String query = "INSERT INTO deliveryTasks (StartAddress, EndAddress, Category, TimeLimit, Status, StartTime, EndTime) VALUES (?, ?,?,?,?,?,?)";
        try { 
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, StartHosAdd); 
            preparedStatement.setString(2, EndHosAdd); 
            preparedStatement.setString(3, Category); 
            preparedStatement.setString(4, TimeLimit); 
            preparedStatement.setString(5, Status); 
            preparedStatement.setString(6, null); 
            preparedStatement.setString(7, null); 
            
            int affectedRows = preparedStatement.executeUpdate(); 
            if (affectedRows > 0) { 
                JOptionPane.showMessageDialog(this, "Insert Successfully");
            }  else { 
                JOptionPane.showMessageDialog(this, "Failed Insertion", "Error", JOptionPane.ERROR_MESSAGE); 
            }
        }  catch (SQLException e) { 
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(this, "Error inserting data", "Error", JOptionPane.ERROR_MESSAGE); 
                    }   
         
        }
    }   


}
