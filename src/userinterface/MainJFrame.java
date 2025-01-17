/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface;

import Business.EcoSystem;
import Business.DB4OUtil.DB4OUtil;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.awt.Color;
import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.GeneralRole.SponsorRegistrationPanel;
import userinterface.VolunteerCampRole.VolunteerRegistrationPanel;
import java.util.logging.*;

/**
 *
 * @author Lingfeng
 */
public class MainJFrame extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    private EcoSystem system;
    private DB4OUtil dB4OUtil = DB4OUtil.getInstance();
    private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
 //   private static Logger log = Logger.getLogger(MainJFrame.class);
    

    public MainJFrame() {
        initComponents();
        system = dB4OUtil.retrieveSystem();
        this.setSize(1680, 1050);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jSplitPane1 = new javax.swing.JSplitPane();
        jPanel1 = new javax.swing.JPanel();
        loginJButton = new javax.swing.JButton();
        userNameJTextField = new javax.swing.JTextField();
        passwordField = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        loginJLabel = new javax.swing.JLabel();
        logoutJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        descriptionBtn = new javax.swing.JButton();
        VolunteerRegistrationBtn = new javax.swing.JButton();
        SponsorRegistrationBtn = new javax.swing.JButton();
        container = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jSplitPane1.setDividerLocation(250);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));

        loginJButton.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        loginJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Yellow/Login-55.png"))); // NOI18N
        loginJButton.setText("SIGN IN");
        loginJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginJButtonActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel1.setText("User Name");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("Password");

        logoutJButton.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        logoutJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Yellow/user_up.png"))); // NOI18N
        logoutJButton.setText("SIGN OUT");
        logoutJButton.setEnabled(false);
        logoutJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutJButtonActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("Volunteer");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel5.setText("Sponsors");

        descriptionBtn.setFont(new java.awt.Font("Verdana", 1, 16)); // NOI18N
        descriptionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Yellow/About-40.png"))); // NOI18N
        descriptionBtn.setText("ABOUT US");
        descriptionBtn.setToolTipText("");
        descriptionBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descriptionBtnActionPerformed(evt);
            }
        });

        VolunteerRegistrationBtn.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        VolunteerRegistrationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Yellow/signup-64.png"))); // NOI18N
        VolunteerRegistrationBtn.setText("JOIN US");
        VolunteerRegistrationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VolunteerRegistrationBtnActionPerformed(evt);
            }
        });

        SponsorRegistrationBtn.setFont(new java.awt.Font("Verdana", 0, 16)); // NOI18N
        SponsorRegistrationBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Yellow/signup-64.png"))); // NOI18N
        SponsorRegistrationBtn.setText("REGISTER");
        SponsorRegistrationBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SponsorRegistrationBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(loginJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(logoutJButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(loginJLabel)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addGap(40, 40, 40)))
                            .addComponent(jLabel3)
                            .addComponent(jLabel5))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(descriptionBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(userNameJTextField)
                    .addComponent(passwordField, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(VolunteerRegistrationBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(SponsorRegistrationBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(userNameJTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(loginJButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(logoutJButton)
                .addGap(48, 48, 48)
                .addComponent(loginJLabel)
                .addGap(44, 44, 44)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VolunteerRegistrationBtn)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SponsorRegistrationBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 589, Short.MAX_VALUE)
                .addComponent(descriptionBtn)
                .addGap(30, 30, 30))
        );

        jSplitPane1.setLeftComponent(jPanel1);

        container.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        container.setLayout(new java.awt.CardLayout());

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 102, 0)));
        jPanel2.setPreferredSize(new java.awt.Dimension(1546, 471));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Green/ngo.jpg"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 1662, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        container.add(jPanel2, "card2");

        jSplitPane1.setRightComponent(container);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void loginJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginJButtonActionPerformed
        // Get user name
        //logger.info("Nitrogen Value changed: {}{}{}");
        logr.info("LoggingIn");
        String userName = userNameJTextField.getText();
        // Get Password
        char[] passwordCharArray = passwordField.getPassword();
        String password = String.valueOf(passwordCharArray);
        
        if((userName==null || userName.equals("")) && (password==null || password.equals(""))){
                 jLabel1.setForeground(Color.RED);
                 jLabel2.setForeground(Color.RED);
                 JOptionPane.showMessageDialog(null, "Please enter user name and password!");
                 return;
            }
        if(userName==null || userName.equals("")){
                 jLabel1.setForeground(Color.RED);
                 JOptionPane.showMessageDialog(null, "Please enter user name!");
                 return;
            }else{
                 jLabel1.setForeground(Color.BLACK);
            }
        
        if(password==null || password.equals("")){
            jLabel2.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Please enter password!");
            return;
        } else{
            jLabel2.setForeground(Color.BLACK);
        }
        //Step1: Check in the system admin user account directory if you have the user
        UserAccount userAccount = system.getUserAccountDirectory().authenticateUser(userName, password);

        Enterprise inEnterprise = null;
        Organization inOrganization = null;
        Network inNetwork = null;

        if (userAccount == null) {
            //Step 2: Go inside each network and check each enterprise
            for (Network network : system.getNetworkList()) {

                //Step 2.a: check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    userAccount = enterprise.getUserAccountDirectory().authenticateUser(userName, password);
                    if (userAccount == null) {
                        //Step 3:check against each organization for each enterprise
                        for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                            userAccount = organization.getUserAccountDirectory().authenticateUser(userName, password);
                            if (userAccount != null) {
                                inNetwork = network;
                                inEnterprise = enterprise;
                                //System.out.println(inNetwork);
                                //System.out.println(inEnterprise);
                                inOrganization = organization;
                                //System.out.println(inOrganization);
                                break;
                            }
                        }

                    } else {
                        inEnterprise = enterprise;
                        inNetwork = network;
                        //System.out.println(inEnterprise);
                        break;
                    }
                    if (inOrganization != null) {
                        //System.out.println(inOrganization);
                        break;
                    }
                }
                if (inEnterprise != null) {
                    //System.out.println(inEnterprise);
                    break;
                }
            }
        }

        if (userAccount == null) {
            jLabel1.setForeground(Color.RED);
            jLabel2.setForeground(Color.RED);
            JOptionPane.showMessageDialog(null, "Invalid Credentials! Please re-enter!");            
            return;
        } else {
            CardLayout layout = (CardLayout) container.getLayout();
            //System.out.println(userAccount.getRole());
            //System.out.println(userAccount.getRole().getEcoSystem());
            //System.out.println(inEnterprise);
            //System.out.println(inOrganization);
            container.add("workArea", userAccount.getRole().createWorkArea(container, userAccount, inOrganization, inEnterprise, inNetwork, system));
            layout.next(container);
        }
//      
//        log.info("Current Enterprise\t" +inEnterprise);
//        log.info("Current Organization\t" +inOrganization);
//        log.info("Current Network\t" +inNetwork);

        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
    }//GEN-LAST:event_loginJButtonActionPerformed

    private void logoutJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutJButtonActionPerformed
        
        logoutJButton.setEnabled(false);
        userNameJTextField.setEnabled(true);
        passwordField.setEnabled(true);
        loginJButton.setEnabled(true);

        userNameJTextField.setText("");
        passwordField.setText("");

        container.removeAll();
        JPanel blankJP = new JPanel();
        container.add("blank", jPanel2);
        CardLayout crdLyt = (CardLayout) container.getLayout();
        crdLyt.next(container);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Green/ngo.jpg"))); // NOI18N
        dB4OUtil.storeSystem(system);
        logr.info("successfully Logged out");
    }//GEN-LAST:event_logoutJButtonActionPerformed

    private void descriptionBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descriptionBtnActionPerformed
        // TODO add your handling code here:
         logr.info("Entering into About US");
         if((!userNameJTextField.getText().isEmpty()) && (!loginJButton.isEnabled())){
        int selectionButton = JOptionPane.YES_NO_OPTION;
        int selectionResult = JOptionPane.showConfirmDialog(null, "The current user session" +userNameJTextField.getText() + " will be terminated, Do you want to proceed?", 
                "Warning", selectionButton);
        if (selectionResult == JOptionPane.YES_OPTION) {
        AboutUsJPanel sp = new AboutUsJPanel(container, system);
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("AboutUs", sp);
        layout.next(container);
        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
        userNameJTextField.setText("");
        passwordField.setText("");
        }
        }else{
        AboutUsJPanel sp = new AboutUsJPanel(container, system);
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("AboutUs", sp);
        layout.next(container);

        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
        }
    }//GEN-LAST:event_descriptionBtnActionPerformed

    private void VolunteerRegistrationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VolunteerRegistrationBtnActionPerformed
        // TODO add your handling code here:
        logr.info("Entering the volunteer RegistrationScreen");
        if((!userNameJTextField.getText().isEmpty()) && (!loginJButton.isEnabled())){
        int selectionButton = JOptionPane.YES_NO_OPTION;
        int selectionResult = JOptionPane.showConfirmDialog(null, "The current user session" +userNameJTextField.getText() + " will be terminated, Do you want to proceed?", 
                "Warning", selectionButton);
        if (selectionResult == JOptionPane.YES_OPTION) {
        VolunteerRegistrationPanel vp = new VolunteerRegistrationPanel(container, system);
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("VolunteerRegistration", vp);
        layout.next(container);

        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
        userNameJTextField.setText("");
        passwordField.setText("");
        }
        }else{
        VolunteerRegistrationPanel vp = new VolunteerRegistrationPanel(container, system);
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("VolunteerRegistration", vp);
        layout.next(container);

        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
        }
        
    }//GEN-LAST:event_VolunteerRegistrationBtnActionPerformed

    private void SponsorRegistrationBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SponsorRegistrationBtnActionPerformed
        // TODO add your handling code here:
        logr.info("Entering the Sponsor RegistrationScreen");
        if((!userNameJTextField.getText().isEmpty()) && (!loginJButton.isEnabled())){
        int selectionButton = JOptionPane.YES_NO_OPTION;
        int selectionResult = JOptionPane.showConfirmDialog(null, "The current user session" +userNameJTextField.getText() + " will be terminated, Do you want to proceed?", 
                "Warning", selectionButton);
        if (selectionResult == JOptionPane.YES_OPTION) {
        SponsorRegistrationPanel sp = new SponsorRegistrationPanel(container, system);
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("SponsorRegistration", sp);
        layout.next(container);

        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
        userNameJTextField.setText("");
        passwordField.setText("");
        }
        }else{
        SponsorRegistrationPanel sp = new SponsorRegistrationPanel(container, system);
        CardLayout layout = (CardLayout) container.getLayout();
        container.add("SponsorRegistration", sp);
        layout.next(container);

        loginJButton.setEnabled(false);
        logoutJButton.setEnabled(true);
        userNameJTextField.setEnabled(false);
        passwordField.setEnabled(false);
        }
    }//GEN-LAST:event_SponsorRegistrationBtnActionPerformed

    /**
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
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
        try{
            FileHandler fh= new FileHandler("myLogger.log");
            fh.setLevel(Level.INFO);
            fh.setFormatter(new SimpleFormatter());
            logr.addHandler(fh); 
            } catch(IOException e){
                ConsoleHandler ch = new ConsoleHandler();
                ch.setLevel(Level.SEVERE);
                logr.addHandler(ch);
            
            }
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton SponsorRegistrationBtn;
    private javax.swing.JButton VolunteerRegistrationBtn;
    private javax.swing.JPanel container;
    private javax.swing.JButton descriptionBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton loginJButton;
    private javax.swing.JLabel loginJLabel;
    private javax.swing.JButton logoutJButton;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JTextField userNameJTextField;
    // End of variables declaration//GEN-END:variables
}
