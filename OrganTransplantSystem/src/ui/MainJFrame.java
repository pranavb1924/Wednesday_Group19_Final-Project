/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.users.User;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.imageio.*;
import java.sql.*;
import model.users.UserDirectory;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;
import ui.DonorManagement.*;
import ui.AdministrativeRole.*;
import model.HospitalManagement.*;
import ui.HospitalManagement.*;
import ui.AdministrativeRole.HomePanel;
/**
 *
 * @author Pranav
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */

    
    User currentUser = new User();
    UserDirectory userDirectory = new UserDirectory();
    HospitalDirectory hospitalDirectory = new HospitalDirectory();
    DoctorDirectory doctorDirectory = new DoctorDirectory();
    JPanel userProcessContainer = new JPanel();
    String currentUserRole;
    Connection currentConnection;

    public MainJFrame() {
        initComponents();
        setSize(1200, 900);         // Set fixed size
        setResizable(false);       // Prevent resizing
        setMinimumSize(new java.awt.Dimension(1200, 900)); // Enforce minimum size
        setMaximumSize(new java.awt.Dimension(1200, 900)); // Enforce maximum size
        setPreferredSize(new java.awt.Dimension(1200, 900)); // Optional for layout managers
        this.setComponentsVisibility(true);
        this.userProcessContainer.setLayout(new CardLayout());
        this.setContainerBackground("src/images/bg.png");
        this.currentConnection = connectToDatabase();
        this.createUser();
        this.loadHospitals();
        this.loadDoctors();
        //fetchAndDisplayUsers();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        lblPassword = new javax.swing.JLabel();
        lblUserName = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        btnRegisterDonor = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GROUP 19 ");
        setMinimumSize(new java.awt.Dimension(600, 570));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 570));
        getContentPane().setLayout(new java.awt.CardLayout());

        jSplitPane1.setOrientation(javax.swing.JSplitPane.VERTICAL_SPLIT);

        jPanel1.setBackground(new java.awt.Color(111, 147, 146));
        jPanel1.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(1200, 70));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 70));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 70));

        loginJButton.setBackground(new java.awt.Color(22, 29, 29));
        loginJButton.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        loginJButton.setForeground(new java.awt.Color(255, 255, 255));
        loginJButton.setText("LOGIN");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        lblPassword.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblPassword.setForeground(new java.awt.Color(255, 255, 255));
        lblPassword.setText("PASSWORD");

        lblUserName.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblUserName.setText("USER NAME");

        btnRegisterDonor.setBackground(new java.awt.Color(22, 29, 29));
        btnRegisterDonor.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnRegisterDonor.setForeground(new java.awt.Color(255, 255, 255));
        btnRegisterDonor.setText("REGISTER");
        btnRegisterDonor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegisterDonorActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(41, 28, 28));
        btnBack.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("HOME");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(104, 104, 104)
                        .addComponent(loginJLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblPassword)
                    .addComponent(lblUserName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnRegisterDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(415, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnRegisterDonor, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(12, 12, 12))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblUserName)
                                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lblPassword)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addComponent(loginJLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setBackground(new java.awt.Color(91, 192, 222));
        container.setMaximumSize(new java.awt.Dimension(1200, 830));
        container.setMinimumSize(new java.awt.Dimension(1200, 830));
        container.setPreferredSize(new java.awt.Dimension(1200, 830));
        container.setLayout(new java.awt.CardLayout());
        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed

        String userName = userNameJTextField.getText();
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        if (authenticateUser(userName, password)){
            JOptionPane.showMessageDialog(this, "Login Successful", "Welcome!", JOptionPane.INFORMATION_MESSAGE);
        
        
        JPanel profilePanel = this.loadProfile();
        container.add("profilePanel", profilePanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        this.setComponentsVisibility(true);
                loginJButton.setEnabled(true);
        btnBack.setEnabled(true);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
            

        }
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void btnRegisterDonorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegisterDonorActionPerformed
        DonorRegistrationWorkArea donorRegistrationWorkArea = new DonorRegistrationWorkArea(container);
        container.add("DonorRegistrationWorkArea", donorRegistrationWorkArea);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
        this.setComponentsVisibility(false);        // TODO add your handling code here:
    }//GEN-LAST:event_btnRegisterDonorActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);

        userNameJTextField.setText("");
        passwordField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", blankJP);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
                this.setContainerBackground("src/images/bg.png");
                        this.setComponentsVisibility(true);
    }//GEN-LAST:event_btnBackActionPerformed

    /**
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
          
            
            }
        });
    }
    
    private static Connection connectToDatabase() {
    final String URL = "jdbc:mysql://localhost:3306/OrganTransplantDb";
    final String USER = "root";
    final String PASSWORD = "sql123456"; 

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");

        return DriverManager.getConnection(URL, USER, PASSWORD);
    } catch (Exception e) {
        e.printStackTrace();
        //JOptionPane.showMessageDialog(this, "Failed to connect to the database.", "Error", JOptionPane.ERROR_MESSAGE);
        return null;
    }
    }
    
    private boolean authenticateUser(String username, String password) {

        for (User u: this.userDirectory.getUserList()){
            if (u.getUsername().equalsIgnoreCase(username) && u.getPassword().equals(password)){
                this.currentUser = u;
                this.currentUserRole = u.getRole();
                return true;
            }
        }
   
    return false;
    }
    
    public void createUser(){
        
        Connection connection = connectToDatabase();
        
        try {
            String query = "SELECT * FROM user"; // Query to fetch all users
            PreparedStatement stmt = connection.prepareStatement(query); 
            ResultSet resultSet = stmt.executeQuery();
 
            while (resultSet.next()) {
                String userName= resultSet.getString("username");
                String passWord = resultSet.getString("password");
                String email = resultSet.getString("email");
                String role = resultSet.getString("Role");
                String id = resultSet.getString("ReferenceId");
                User user = new User();
                user.setUsername(userName);
                user.setEmail(email);
                user.setPassword(passWord);
                user.setId(id);
                String getRoles = "SELECT * FROM Roles where RoleId = '"+role+"'";
                PreparedStatement stmt2 = connection.prepareCall(getRoles);
                ResultSet roleResultSet = stmt2.executeQuery();
                while (roleResultSet.next()){
                    String userRole = roleResultSet.getString("Role");
                    user.setRole(userRole);
                    this.userDirectory.AddUser(user);
                }

            }
            connection.close();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error fetching user data.", "Error", JOptionPane.ERROR_MESSAGE);
        }        
    }
    
    private JPanel loadProfile(){
        
            switch (this.currentUserRole.toUpperCase()) {
                case "UNOS ADMIN":
                    AdminRoleJPanel adminRoleJPanel = new AdminRoleJPanel(container, this.hospitalDirectory, this.currentConnection);
                    return adminRoleJPanel;
                    // Add logic for admin role
                case "HOSPITAL ADMIN":
                    Hospital currentHospital = this.hospitalDirectory.findHospitalByAdminId(this.currentUser.getId());
                    HospitalAdminRoleJPanel hospitalAdminRoleJPanel = new HospitalAdminRoleJPanel(container, this.hospitalDirectory, this.doctorDirectory, this.currentConnection, currentHospital, this.currentUser);
                    return hospitalAdminRoleJPanel;

                case "COORDINATOR":
                    Hospital currentCoordinatorHospital = this.hospitalDirectory.findHospitalByAdminId(this.currentUser.getId());
                    TransplantCoordinatorJPanel transplantCoordinatorJPanel = new TransplantCoordinatorJPanel(container, currentCoordinatorHospital);
                    return transplantCoordinatorJPanel;             
                    
                case "DOCTOR":
                    Hospital currentHospitalDetails = this.hospitalDirectory.findHospitalByAdminId(this.currentUser.getId());
                    DoctorWorkAreaJPanel doctorWorkAreaJPanel = new DoctorWorkAreaJPanel(container, this.hospitalDirectory, this.doctorDirectory, this.currentConnection, currentHospitalDetails, this.currentUser);
                    return doctorWorkAreaJPanel;
                default:
                    System.out.println("Unrecognized role. Access denied.");
                    // Handle unrecognized role
                    break;
                }
            return null;

    }
    
    public void setComponentsVisibility(boolean isVisible) {
        loginJButton.setVisible(isVisible);
        userNameJTextField.setVisible(isVisible);
        passwordField.setVisible(isVisible);
        lblPassword.setVisible(isVisible);
        lblUserName.setVisible(isVisible);
        loginJLabel.setVisible(isVisible);
        btnRegisterDonor.setVisible(isVisible);
        btnBack.setVisible(!isVisible);
    }

    
    private void setContainerBackground(String imagePath) {
    try {
        Image backgroundImage = javax.imageio.ImageIO.read(new java.io.File(imagePath));

        container = new javax.swing.JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                if (backgroundImage != null) {
                    g.drawImage(backgroundImage, 0, 0, getWidth(), getHeight(), this);
                }
            }
        };

        container.setLayout(new java.awt.CardLayout()); // Keep layout for dynamic UI
        jSplitPane1.setRightComponent(container); // Attach the updated panel to the split pane

    } catch (Exception e) {
        e.printStackTrace();
        javax.swing.JOptionPane.showMessageDialog(this, "Failed to load background image.", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
    }
}
    
    private void loadHospitals(){
        Connection connection = connectToDatabase();
        
        try {
            String query = "SELECT * FROM Hospitals"; // Query to fetch all users
            PreparedStatement stmt = connection.prepareStatement(query); 
            ResultSet resultSet = stmt.executeQuery();
            
            while(resultSet.next()){
                String id = resultSet.getString("HospitalID");
                String name = resultSet.getString("Name");
                String address = resultSet.getString("Address");
                String city = resultSet.getString("City");
                String state = resultSet.getString("State");
                String phone = resultSet.getString("Phone");
                String adminId = resultSet.getString("AdminId") == null ? "" : resultSet.getString("AdminId");
                
                Hospital hospital = new Hospital();
                hospital.setId(id);
                hospital.setAddress(address);
                hospital.setCity(city);
                hospital.setName(name);
                hospital.setPhone(phone);
                hospital.setState(state);
                hospital.setAdminId(adminId);
                
                
                this.hospitalDirectory.addHospital(hospital);
                        
            }
            connection.close();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error fetching user data.", "Error", JOptionPane.ERROR_MESSAGE);
        }        
        
    }
    
        private void loadDoctors(){
        Connection connection = connectToDatabase();
        
        try {
            String query = "SELECT * FROM Doctors"; // Query to fetch all users
            PreparedStatement stmt = connection.prepareStatement(query); 
            ResultSet resultSet = stmt.executeQuery();
            
            while(resultSet.next()){
                String id = resultSet.getString("DoctorID");
                String name = resultSet.getString("Name");
                String specialization = resultSet.getString("Specialization");
                String hospitalId = resultSet.getString("HospitalID");
                String phone = resultSet.getString("Phone");

                
                Doctor doctor = new Doctor();
                doctor.setDoctorId(id);
                doctor.setHospitalId(hospitalId);
                doctor.setName(name);
                doctor.setSpecialization(specialization);
                doctor.setPhone(phone);
                
                this.doctorDirectory.addNewDoctor(doctor);
                        
            }
            connection.close();
        } 
        catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error fetching user data.", "Error", JOptionPane.ERROR_MESSAGE);
        }        
        
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnRegisterDonor;
    private javax.swing.JPanel container;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUserName;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
