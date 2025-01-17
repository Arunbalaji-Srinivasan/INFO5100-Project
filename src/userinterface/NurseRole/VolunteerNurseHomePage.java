/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.NurseRole;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.NurseOrganization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author InfiniteLoops
 */
public class VolunteerNurseHomePage extends javax.swing.JPanel {

    private JPanel userProcessContainer;
    private NurseOrganization organization;
    private Enterprise enterprise;
    private UserAccount account;
    private EcoSystem business;

    /**
     * Creates new form VolunteerHomePage
     */
    public VolunteerNurseHomePage(JPanel userProcessContainer, UserAccount account, NurseOrganization organization, Enterprise enterprise, EcoSystem business) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.organization = organization;
        this.enterprise = enterprise;
        this.account = account;
        this.business = business;
        valueLabel.setText(enterprise.getName());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        enterpriseLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        valueLabel = new javax.swing.JLabel();
        manageOrganizationJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));

        enterpriseLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        enterpriseLabel.setText("ENTERPRISE:");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("My Work Area - Volunteer Camp Role");

        valueLabel.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        valueLabel.setText("<value>");

        manageOrganizationJButton.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        manageOrganizationJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Green/contact.png"))); // NOI18N
        manageOrganizationJButton.setText("HEALTH CAMP WORK REQUEST");
        manageOrganizationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageOrganizationJButtonActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Yellow/prev-48.png"))); // NOI18N
        jButton1.setText("BACK\n");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(195, 195, 195)
                        .addComponent(enterpriseLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(217, 217, 217)
                        .addComponent(manageOrganizationJButton))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLabel1)))
                .addContainerGap(240, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addGap(21, 21, 21)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(enterpriseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(valueLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addComponent(manageOrganizationJButton)
                .addContainerGap(300, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageOrganizationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageOrganizationJButtonActionPerformed

        HealthCampWorkRequestJPanel nurseCampArea = new HealthCampWorkRequestJPanel(userProcessContainer, account, (NurseOrganization) organization, business, enterprise);
        userProcessContainer.add("HealthCampWorkRequestJPanel", nurseCampArea);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageOrganizationJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel enterpriseLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton manageOrganizationJButton;
    private javax.swing.JLabel valueLabel;
    // End of variables declaration//GEN-END:variables
}
