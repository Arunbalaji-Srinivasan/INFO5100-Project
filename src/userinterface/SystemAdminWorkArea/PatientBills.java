/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EventEnterprise;
import Business.Enterprise.HospitalEnterprise;
import Business.Network.Network;
import Business.Organization.Organization;
import Business.Organization.ReceptionistOrganization;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import java.util.logging.*;


/**
 *
 * @author jo-ji
 */
public class PatientBills extends javax.swing.JPanel {

    /**
     * Creates new form PatientBills
     */
    private JPanel userProcessContainer;
    private EcoSystem ecosystem;
    private static int funds = 0;
    private final static Logger logr = Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    public PatientBills(JPanel userProcessContainer, EcoSystem ecosystem) {
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        initComponents();
        populateTable();
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
        workRequestJTable = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 204, 255));

        workRequestJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sender", "Status", "Request Type", "Message", "Fee"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
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
        jScrollPane1.setViewportView(workRequestJTable);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Yellow/prev-48.png"))); // NOI18N
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Green/Button-Refresh-icon.png"))); // NOI18N
        jButton1.setText("REFRESH");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Green/payment-icon.png"))); // NOI18N
        jButton3.setText("PAY");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/free_button_icons_icons_pack_120624/Green/user_download.png"))); // NOI18N
        jLabel1.setText("PATIENT BILLS");
        jLabel1.setBorder(new javax.swing.border.MatteBorder(null));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 999, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3)
                    .addComponent(jButton2))
                .addGap(0, 438, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        int selectedRow = workRequestJTable.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(null, "Please select a row!");
            return;
        }
        WorkRequest request = (WorkRequest) workRequestJTable.getValueAt(selectedRow, 2);
        if(!(request.getStatus().equals("Paid"))){
            if((funds - request.getApproxPatientFee())>=0){
            funds = funds -request.getApproxPatientFee();
            request.setStatus("Paid");
            JOptionPane.showMessageDialog(null, "Patient Bill Paid Successfully!" + "\n" +
                    "Thank you for your valuable contribution!");
        }else{
                JOptionPane.showMessageDialog(null, "Not Enough Funds!");
            }
        }else{
            JOptionPane.showMessageDialog(null, "Patient Bill Paid Already!");

        }
        populateTable();
        logr.info("Funds Paid for the treatment of the patient");
                        
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable workRequestJTable;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) workRequestJTable.getModel();

        model.setRowCount(0);
        for (UserAccount user : ecosystem.getUserAccountDirectory().getUserAccountList()) {
            for (WorkRequest work : user.getWorkQueue().getWorkRequestList()) {
                if ((work.getStatus().equals("Admin Pay")) || (work.getStatus().equals("Paid"))) {
                    Object[] row = new Object[5];
                    row[0] = work.getSender();
                    row[1] = work.getStatus();
                    row[2] = work;
                    row[3] = work.getMessage();
                    row[4] = work.getApproxPatientFee() == 0 ? 0 : work.getApproxPatientFee();
                    model.addRow(row);
                }
            }

        }
        for(Network network : ecosystem.getNetworkList()){
            for(Enterprise enter : network.getEnterpriseDirectory().getEnterpriseList()){
//                int count= 0;
//                if(count != 0){
                if (enter.getEnterpriseType().getValue().equals(Enterprise.EnterpriseType.Event.getValue())) {
                    EventEnterprise event = (EventEnterprise) enter;
                        int temp = event.getFundsCollected();
                        System.out.println(temp);
                        if (temp != funds) {
                            funds = temp;
                        }
                        System.out.println(funds);
//                    }
                }
                }
        }
    }
}
