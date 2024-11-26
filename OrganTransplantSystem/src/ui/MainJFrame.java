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
    JPanel userProcessContainer = new JPanel();

    public MainJFrame() {
        initComponents();
        setSize(1200, 900);         // Set fixed size
setResizable(false);       // Prevent resizing
setMinimumSize(new java.awt.Dimension(1200, 900)); // Enforce minimum size
setMaximumSize(new java.awt.Dimension(1200, 900)); // Enforce maximum size
setPreferredSize(new java.awt.Dimension(1200, 900)); // Optional for layout managers
this.userProcessContainer.setLayout(new CardLayout());

        this.setContainerBackground("src/images/bg.png");
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        loginJButton1 = new javax.swing.JButton();
        container = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GROUP 19 ");
        setMaximumSize(new java.awt.Dimension(600, 570));
        setMinimumSize(new java.awt.Dimension(600, 570));
        setPreferredSize(new java.awt.Dimension(600, 570));
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

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PASSWORD");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("USER NAME");

        loginJButton1.setBackground(new java.awt.Color(22, 29, 29));
        loginJButton1.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        loginJButton1.setForeground(new java.awt.Color(255, 255, 255));
        loginJButton1.setText("REGISTER");
        loginJButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(124, 124, 124)
                        .addComponent(loginJLabel)
                        .addGap(313, 313, 313))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(205, 205, 205)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)))
                .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(loginJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(395, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(loginJButton, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(loginJButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(loginJLabel)
                .addContainerGap(3, Short.MAX_VALUE))
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
        // Get user name
        String userName = userNameJTextField.getText();
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);

        if (authenticateUser(userName, password)){
            JOptionPane.showMessageDialog(this, "Login Successful", "Error", JOptionPane.INFORMATION_MESSAGE);
            
            AdminRoleJPanel AdminRoleJPanel = new AdminRoleJPanel();
        container.add("AdminRoleJPanel", AdminRoleJPanel);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
            

        }

        //        Step1: Check in the system admin user account directory if you have the user
        //        UserAccount userAccount=system.getUserAccountDirectory().authenticateUser(userName, password);
        //
        //        Enterprise inEnterprise=null;
        //        Organization inOrganization=null;
        //
        //        if(userAccount==null){
            //            //Step 2: Go inside each network and check each enterprise
            //            for(Network network:system.getNetworkList()){
                //                //Step 2.a: check against each enterprise
                //                for(Enterprise enterprise:network.getEnterpriseDirectory().getEnterpriseList()){
                    //                    userAccount=enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    //                    if(userAccount==null){
                        //                       //Step 3:check against each organization for each enterprise
                        //                       for(Organization organization:enterprise.getOrganizationDirectory().getOrganizationList()){
                            //                           userAccount=organization.getUserAccountDirectory().authenticateUser(userName, password);
                            //                           if(userAccount!=null){
                                //                               inEnterprise=enterprise;
                                //                               inOrganization=organization;
                                //                               break;
                                //                           }
                            //                       }
                        //
                        //                    }
                    //                    else{
                        //                       inEnterprise=enterprise;
                        //                       break;
                        //                    }
                    //                    if(inOrganization!=null){
                        //                        break;
                        //                    }
                    //                }
                //                if(inEnterprise!=null){
                    //                    break;
                    //                }
                //            }
            //        }
        //
        //        if(userAccount==null){
            //            JOptionPane.showMessageDialog(null, "Invalid credentials");
            //            return;
            //        }
        //        else{
            //            CardLayout layout=(CardLayout)container.getLayout();
            //            container.add("workArea",userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, system));
            //            layout.next(container);
            //        }
        //
        //        loginJButton.setEnabled(false);
        //        logoutJButton.setEnabled(true);
        //        userNameJTextField.setEnabled(false);
        //        passwordField.setEnabled(false);
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void loginJButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButton1ActionPerformed
        // TODO add your handling code here:
        
        DonorRegistrationWorkArea donorRegistrationWorkArea = new DonorRegistrationWorkArea();
        container.add("DonorRegistrationWorkArea", donorRegistrationWorkArea);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.next(container);
    }//GEN-LAST:event_loginJButton1ActionPerformed

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
    final String PASSWORD = ""; 

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
    Connection conn = connectToDatabase();
    if (conn != null) {
        try {
            String query = "SELECT * FROM user WHERE username = '"+username+"' AND password = '"+password+"'"; // Query to fetch all users
            PreparedStatement stmt = conn.prepareStatement(query);  
            ResultSet resultSet = stmt.executeQuery();
            while (resultSet.next()) {
                String userName= resultSet.getString("username");
                String passWord = resultSet.getString("password");              
                return !(userName.isBlank() || passWord.isBlank());
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error fetching user data.", "Error", JOptionPane.ERROR_MESSAGE);
        }             
    }
    return false;
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



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel container;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JButton loginJButton1;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
