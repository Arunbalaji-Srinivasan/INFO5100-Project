/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.VolunteerCampRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.VolunteerCampOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author InfiniteLoops
 */
public class VolunteerCampChooserJPanel extends javax.swing.JPanel {

    /**
     * Creates new form VolunteerCampChooserJPanel
     */
    JPanel userProcessContainer;
    Enterprise enterprise;
    UserAccount account;
    EcoSystem ecosystem;
    VolunteerCampOrganization organization;
    Network network;

    public VolunteerCampChooserJPanel(JPanel userProcessContainer, UserAccount account, VolunteerCampOrganization organization, Network network, Enterprise enterprise, EcoSystem business) {
        this.userProcessContainer = userProcessContainer;
        this.enterprise = enterprise;
        this.account = account;
        this.ecosystem = business;
        this.organization = organization;

        initComponents();
        //populateEnterprisetypecomboBox();
        populateNetworkComboBox();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        enterpriseTypeJComboBox = new javax.swing.JComboBox();
        enterpriseJComboBox = new javax.swing.JComboBox();
        submitButton = new javax.swing.JButton();
        networkJComboBox = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Enterprise");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Enterprise Type");

        enterpriseTypeJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseTypeJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseTypeJComboBoxActionPerformed(evt);
            }
        });

        enterpriseJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        enterpriseJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enterpriseJComboBoxActionPerformed(evt);
            }
        });

        submitButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        submitButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Yellow/user_ok.png"))); // NOI18N
        submitButton.setText("SUBMIT");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        networkJComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        networkJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                networkJComboBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Network");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Blue/user_download.png"))); // NOI18N
        jLabel2.setText("CAMP SELECTION");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(submitButton)
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel3))
                            .addGap(53, 53, 53)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(enterpriseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addGap(78, 78, 78))))
                .addContainerGap(243, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {enterpriseJComboBox, enterpriseTypeJComboBox, networkJComboBox});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel2)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(networkJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(enterpriseTypeJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseJComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(33, 33, 33)
                .addComponent(submitButton)
                .addContainerGap(337, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
        private void populateNetworkComboBox() {
        networkJComboBox.removeAllItems();

        for (Network network : ecosystem.getNetworkList()) {
            networkJComboBox.addItem(network);
        }
    }

    private void populateEnterprisetypecomboBox(Network network) {
        enterpriseTypeJComboBox.removeAllItems();
        for (Enterprise.EnterpriseType type : Enterprise.EnterpriseType.values()) {
            if (type.equals(Enterprise.EnterpriseType.Camp)) {
                enterpriseTypeJComboBox.addItem(type);
            }
        }
    }

    private void populateEnterpriseComboBox(Enterprise.EnterpriseType type, Network network) {
        enterpriseJComboBox.removeAllItems();

        for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
            if (type.getValue().equals(enterprise.getEnterpriseType().getValue())) {
                enterpriseJComboBox.addItem(enterprise);
            }

        }
    }
    private void enterpriseTypeJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseTypeJComboBoxActionPerformed
        // TODO add your handling code here:
        Network network = (Network) networkJComboBox.getSelectedItem();
        Enterprise.EnterpriseType type = (Enterprise.EnterpriseType) enterpriseTypeJComboBox.getSelectedItem();
        if (type != null) {
            populateEnterpriseComboBox(type, network);
        }
    }//GEN-LAST:event_enterpriseTypeJComboBoxActionPerformed

    private void enterpriseJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enterpriseJComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_enterpriseJComboBoxActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        UserAccount userAccount = ecosystem.getUserAccountDirectory().authenticateUser(account.getUsername(), account.getPassword());
        System.out.println(ecosystem.getUserAccountDirectory().getUserAccountList());
        Enterprise e = (Enterprise) enterpriseJComboBox.getSelectedItem();

        Enterprise inEnterprise = null;
        Organization inOrganization = null;

        if (userAccount == null) {
            //Step 2: Go inside each network and check each enterprise
            for (Network network : ecosystem.getNetworkList()) {
                //Step 2.a: check against each enterprise
                for (Enterprise enterprise : network.getEnterpriseDirectory().getEnterpriseList()) {
                    if (enterprise.equals(e)) {
                        userAccount = enterprise.getUserAccountDirectory().authenticateUser(account.getUsername(), account.getPassword());
                        if (userAccount == null) {
                            //Step 3:check against each organization for each enterprise
                            for (Organization organization : enterprise.getOrganizationDirectory().getOrganizationList()) {
                                userAccount = organization.getUserAccountDirectory().authenticateUser(account.getUsername(), account.getPassword());
                                if (userAccount != null) {
                                    inEnterprise = enterprise;
                                    //System.out.println(inEnterprise);
                                    inOrganization = organization;
                                    //System.out.println(inOrganization);
                                    //break;
                                }
                            }

                        } else {
                            inEnterprise = enterprise;
                            //System.out.println(inEnterprise);
                            //break;
                        }
                        if (inOrganization != null) {
                            //System.out.println(inOrganization);
                            //break;
                        }
                    }
                    if (inEnterprise != null) {
                        //System.out.println(inEnterprise);
                        //break;
                    }
                }
            }
        }

        if (userAccount == null) {
            JOptionPane.showMessageDialog(null, "User Account does not exist");
            return;
        } else {
            VolunteerHomePage volunteerHome = new VolunteerHomePage(userProcessContainer, account, (VolunteerCampOrganization) organization, (Enterprise) enterpriseJComboBox.getSelectedItem(), ecosystem);
            userProcessContainer.add("VolunteerHomePage", volunteerHome);
            CardLayout layout = (CardLayout) userProcessContainer.getLayout();
            layout.next(userProcessContainer);
        }

        /*if(userAccount!=null){
        VolunteerHomePage volunteerHome = new VolunteerHomePage(userProcessContainer, account, (VolunteerCampOrganization) organization, (Enterprise) enterpriseJComboBox.getSelectedItem(), ecosystem);
        userProcessContainer.add("VolunteerHomePage", volunteerHome);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        }
        else
        JOptionPane.showMessageDialog(this, "User Account does not exist");*/
    }//GEN-LAST:event_submitButtonActionPerformed

    private void networkJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_networkJComboBoxActionPerformed

        Network network = (Network) networkJComboBox.getSelectedItem();
        if (network != null) {
            populateEnterprisetypecomboBox(network);
        }

    }//GEN-LAST:event_networkJComboBoxActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox enterpriseJComboBox;
    private javax.swing.JComboBox enterpriseTypeJComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox networkJComboBox;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables

}
