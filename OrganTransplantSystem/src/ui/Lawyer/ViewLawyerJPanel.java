/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.Lawyer;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JOptionPane;
import model.Lawyer.Lawyer;
import model.Lawyer.LawyerDirectory;

/**
 *
 * @author ivyju
 */
public class ViewLawyerJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewLawyerJPanel
     */
    Connection connection;
    LawyerDirectory LawyerDirectory;
    JPanel userProcessContainer = new JPanel();
    public ViewLawyerJPanel(JPanel userProcessContainer, Connection connection) {
        initComponents();
        this.connection = connection;
        this.userProcessContainer = userProcessContainer;
        this.populateLawyerTable();
    }
    
    public void populateLawyerTable(){ 
//        DefaultTableModel model = (DefaultTableModel) tblLawyer.getModel();
//        model.setRowCount(0);
//        
//        for (Lawyer lawyer : this.LawyerDirectory.getLawyerDirectory()){
//            Object[] row = new Object[5];
//            row[0] = lawyer;
//            row[1] = lawyer.getLawyerID();
//            row[2] = lawyer.getName();
//            row[3] = lawyer.getSpecialization();
//            row[4] = lawyer.getPhone();
//            row[5] = lawyer.getEmail();
//            
//            model.addRow(row);
//        }
        DefaultTableModel model = (DefaultTableModel) tblLawyer.getModel();
        
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
                String email = resultSet.getString("Email"); 
                
                
                Object[] row = new Object[4];
                row[0] = id;
                row[1] = name;
                row[2] = phone;
                row[3] = email;
                
            
            model.addRow(row);
            } 
        } catch (SQLException e) { 
            e.printStackTrace(); 
            JOptionPane.showMessageDialog(this, "Error getting Lawyer data", "Error", JOptionPane.ERROR_MESSAGE); 
            return;
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
        tblLawyer = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        txtLawyerName = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();

        setBackground(new java.awt.Color(111, 147, 146));
        setMaximumSize(new java.awt.Dimension(1200, 830));
        setMinimumSize(new java.awt.Dimension(1200, 830));

        tblLawyer.setBackground(new java.awt.Color(22, 29, 29));
        tblLawyer.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblLawyer.setForeground(new java.awt.Color(255, 255, 255));
        tblLawyer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Phone", "Email"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblLawyer.setRowHeight(18);
        tblLawyer.setSelectionBackground(new java.awt.Color(111, 147, 146));
        jScrollPane1.setViewportView(tblLawyer);
        if (tblLawyer.getColumnModel().getColumnCount() > 0) {
            tblLawyer.getColumnModel().getColumn(0).setResizable(false);
            tblLawyer.getColumnModel().getColumn(1).setResizable(false);
            tblLawyer.getColumnModel().getColumn(2).setResizable(false);
            tblLawyer.getColumnModel().getColumn(3).setResizable(false);
        }

        btnAdd.setBackground(new java.awt.Color(22, 29, 29));
        btnAdd.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnAdd.setForeground(new java.awt.Color(255, 255, 255));
        btnAdd.setText("ADD LAWYER");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnRemove.setBackground(new java.awt.Color(22, 29, 29));
        btnRemove.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("REMOVE LAWYER");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(22, 29, 29));
        btnSearch.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENTER LAWYER NAME");

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1127, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(btnRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBack, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtLawyerName, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(btnAdd, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                        .addComponent(btnRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(txtLawyerName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(313, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btnAdd, btnRemove});

    }// </editor-fold>//GEN-END:initComponents

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        AddLawyerJPanel addLawyerJpanel = new AddLawyerJPanel(this.userProcessContainer, this.LawyerDirectory, this.connection);
        userProcessContainer.add("AddLawyerJpanel", addLawyerJpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblLawyer.getSelectedRow();

        if (selectedRow != -1) { 
            Lawyer selectedLawyer = (Lawyer) tblLawyer.getValueAt(selectedRow, 0);
            LawyerDirectory.removeLawyer(selectedLawyer);
        } else { 
            JOptionPane.showMessageDialog(this, "Please select a row!"); 
        }
        populateLawyerTable();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
        if(!txtLawyerName.getText().isBlank()){
            String inputString = txtLawyerName.getText();
            Lawyer foundLawyer = LawyerDirectory.searchLawyerName(inputString);
            
            if(foundLawyer != null){
                
            }else{
                JOptionPane.showMessageDialog(null,"Lawyer not found. Please check the input and try again.", "Error", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            JOptionPane.showMessageDialog(null, "Please type the name to view.", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        
        txtLawyerName.setText("");
    }//GEN-LAST:event_btnSearchActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblLawyer;
    private javax.swing.JTextField txtLawyerName;
    // End of variables declaration//GEN-END:variables
}
