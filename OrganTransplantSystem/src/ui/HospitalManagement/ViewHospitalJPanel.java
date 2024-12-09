/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui.HospitalManagement;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import model.HospitalManagement.*;
import java.sql.*;
import javax.swing.JOptionPane;
import ui.AdministrativeRole.*;

/**
 *
 * @author pranavb
 */
public class ViewHospitalJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewHospitalJPanel
     */
    Connection connection;
    HospitalDirectory hospitalDirectory;
    JPanel userProcessContainer = new JPanel();
    public ViewHospitalJPanel(JPanel userProcessContainer, HospitalDirectory hospitalDirectory, Connection connection) {
        initComponents();
        this.connection = connection;
        this.hospitalDirectory = hospitalDirectory;
        this.userProcessContainer = userProcessContainer;
        this.populateHospitalTable("");
    }
    
    public void populateHospitalTable(String name){
                DefaultTableModel model = (DefaultTableModel) tblHospital.getModel();
        
        model.setRowCount(0);
        
        for (Hospital hospital : this.hospitalDirectory.getHospitalDirectory()){
            if (!name.equals("") && hospital.getName().equals(name)){
            Object[] row = new Object[5];
            row[0] = hospital;
            row[1] = hospital.getAddress();
            row[2] = hospital.getCity();
            row[3] = hospital.getState();
            row[4] = hospital.getPhone();
            model.addRow(row);
            }
            
            if (name.equals("")){
            Object[] row = new Object[5];
            row[0] = hospital;
            row[1] = hospital.getAddress();
            row[2] = hospital.getCity();
            row[3] = hospital.getState();
            row[4] = hospital.getPhone();
            model.addRow(row);
            }

        }
    }
    
    private void loadHospitals(){
        
        try {
            String query = "SELECT * FROM Hospitals"; 
            PreparedStatement stmt = connection.prepareStatement(query); 
            ResultSet resultSet = stmt.executeQuery();
            this.hospitalDirectory = new HospitalDirectory();
            while(resultSet.next()){
                String id = resultSet.getString("HospitalID");
                String name = resultSet.getString("Name");
                String address = resultSet.getString("Address");
                String city = resultSet.getString("City");
                String state = resultSet.getString("State");
                String phone = resultSet.getString("Phone");
                String adminId = resultSet.getString("AdminId") == null ? "" : resultSet.getString("AdminId");
                String coordinatorId = resultSet.getString("coordinatorId") == null ? "" : resultSet.getString("coordinatorId");
                Hospital hospital = new Hospital();
                hospital.setId(id);
                hospital.setAddress(address);
                hospital.setCity(city);
                hospital.setName(name);
                hospital.setPhone(phone);
                hospital.setState(state);
                hospital.setAdminId(adminId);
                hospital.setCoordinatorId(coordinatorId);
                try {
                    String docquery = "SELECT * FROM doctors where HospitalId = '"+id+"'"; 
                    PreparedStatement doctstmt = connection.prepareStatement(docquery); 
                    ResultSet docresultSet = doctstmt.executeQuery();
            
                    while(docresultSet.next()){
                        String docid = docresultSet.getString("DoctorID");
                        String docname = docresultSet.getString("Name");
                        String docspecialization = docresultSet.getString("Specialization");
                        String docphone = docresultSet.getString("Phone");

                        Doctor doctor = new Doctor();
                        doctor.setDoctorId(docid);
                        doctor.setName(docname);
                        doctor.setSpecialization(docspecialization);
                        doctor.setPhone(docphone);
                                
                        hospital.getDoctorDirectory().addNewDoctor(doctor);      
                    }
            
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error fetching user data1.", "Error", JOptionPane.ERROR_MESSAGE);
        }        

                
                this.hospitalDirectory.addHospital(hospital);
                this.populateHospitalTable("");
            }
  
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error fetching user data2.", "Error", JOptionPane.ERROR_MESSAGE);
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
        tblHospital = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(111, 147, 146));
        setMaximumSize(new java.awt.Dimension(1200, 830));
        setMinimumSize(new java.awt.Dimension(1200, 830));

        tblHospital.setBackground(new java.awt.Color(22, 29, 29));
        tblHospital.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        tblHospital.setForeground(new java.awt.Color(255, 255, 255));
        tblHospital.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Hospital Name", "Address", "City", "State", "Phone"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblHospital.setRowHeight(18);
        tblHospital.setSelectionBackground(new java.awt.Color(111, 147, 146));
        tblHospital.setShowHorizontalLines(false);
        jScrollPane1.setViewportView(tblHospital);
        if (tblHospital.getColumnModel().getColumnCount() > 0) {
            tblHospital.getColumnModel().getColumn(0).setResizable(false);
            tblHospital.getColumnModel().getColumn(1).setResizable(false);
            tblHospital.getColumnModel().getColumn(2).setResizable(false);
            tblHospital.getColumnModel().getColumn(3).setResizable(false);
        }

        jButton1.setBackground(new java.awt.Color(22, 29, 29));
        jButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("ADD HOSPITAL");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(22, 29, 29));
        jButton2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("REMOVE HOSPITAL");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(22, 29, 29));
        jButton4.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("SEARCH");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("ENTER HOSPITAL NAME");

        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(22, 29, 29));
        jButton3.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("REFRESH");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
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
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 496, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(33, 33, 33))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton2});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(300, 300, 300))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton2, jButton3});

    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        AddHospitalJPanel addHospitalJpanel = new AddHospitalJPanel(this.userProcessContainer, this.hospitalDirectory, this.connection, "ADD");
        userProcessContainer.add("AddHospitalJpanel", addHospitalJpanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int selectedRowIndex = tblHospital.getSelectedRow();

        if (selectedRowIndex < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Hospital h = (Hospital) tblHospital.getValueAt(selectedRowIndex, 0);
        this.hospitalDirectory.getHospitalDirectory().remove(h);
        this.populateHospitalTable("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_btnBackActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.populateHospitalTable(txtSearch.getText());
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        this.loadHospitals();
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblHospital;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables
}
