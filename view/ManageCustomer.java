/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import bll.ManageCustomerBll;
import dao.ManageCustomerDao;
import dao.ManageCustomerDaoImpl;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class ManageCustomer extends javax.swing.JFrame {
    ManageCustomerBll mcb = new ManageCustomerBll();
    ManageCustomerDao mcd = new ManageCustomerDaoImpl();
    /**
     * Creates new form AdminDashboard
     */
    public ManageCustomer() {
        initComponents();
        lblNewUsername.setVisible(false);
        txtNewUsername.setVisible(false);
        lblNewPasswd.setVisible(false);
        txtNewPasswd.setVisible(false);
        lblNewAddress.setVisible(false);
        txtAddress.setVisible(false);
        lblNewContactNo.setVisible(false);
        txtNewContactNo.setVisible(false);
        btnSubmit.setVisible(false);
        ImageIcon img = new ImageIcon("src/media/shoppingbag.png");
       this.setIconImage(img.getImage());
    }
    public void editCustomer(){
        
        txtUsername.setVisible(false);
        txtUserId.setVisible(false);
        lblUsername.setVisible(false);
        lblCustomerId.setVisible(false);
        btnRemove.setVisible(false);
        btnEdit.setVisible(false);
        
        lblNewUsername.setVisible(true);
        txtNewUsername.setVisible(true);
        lblNewPasswd.setVisible(true);
        txtNewPasswd.setVisible(true);
        lblNewAddress.setVisible(true);
        txtAddress.setVisible(true);
        lblNewContactNo.setVisible(true);
        txtNewContactNo.setVisible(true);
        btnSubmit.setVisible(true);
        int userId = Integer.parseInt(txtUserId.getText());
        mcb.setCustomerId(userId);
        mcb.setUsername(txtUsername.getText());
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblWelcomeAdminPanel = new javax.swing.JLabel();
        lblUsername = new javax.swing.JLabel();
        txtNewUsername = new javax.swing.JTextField();
        lblCustomerId = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        btnRemove = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        lblNewUsername = new javax.swing.JLabel();
        lblNewAddress = new javax.swing.JLabel();
        lblNewPasswd = new javax.swing.JLabel();
        txtNewPasswd = new javax.swing.JTextField();
        txtUsername = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        lblNewContactNo = new javax.swing.JLabel();
        txtNewContactNo = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lblDashboard = new javax.swing.JLabel();
        lblPendingOrders = new javax.swing.JLabel();
        lblDailyReport = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        lblSignout = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Panel");
        setMaximumSize(new java.awt.Dimension(1070, 611));
        setMinimumSize(new java.awt.Dimension(1070, 611));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,70));
        jPanel1.setDoubleBuffered(false);
        jPanel1.setFocusable(false);
        jPanel1.setOpaque(false);
        jPanel1.setRequestFocusEnabled(false);
        jPanel1.setVerifyInputWhenFocusTarget(false);

        lblWelcomeAdminPanel.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        lblWelcomeAdminPanel.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcomeAdminPanel.setText("                                                        Manage Customers");

        lblUsername.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        lblUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblUsername.setText("Customer Username: ");

        lblCustomerId.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        lblCustomerId.setForeground(new java.awt.Color(255, 255, 255));
        lblCustomerId.setText("Customer ID:");

        btnRemove.setBackground(new java.awt.Color(200, 28, 28));
        btnRemove.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        btnRemove.setForeground(new java.awt.Color(255, 255, 255));
        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnEdit.setBackground(new java.awt.Color(200, 28, 28));
        btnEdit.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        btnEdit.setForeground(new java.awt.Color(255, 255, 255));
        btnEdit.setText("EDIT");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });

        lblNewUsername.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        lblNewUsername.setForeground(new java.awt.Color(255, 255, 255));
        lblNewUsername.setText("New Username:");

        lblNewAddress.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        lblNewAddress.setForeground(new java.awt.Color(255, 255, 255));
        lblNewAddress.setText("New Address:");

        lblNewPasswd.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        lblNewPasswd.setForeground(new java.awt.Color(255, 255, 255));
        lblNewPasswd.setText("New Password:");

        lblNewContactNo.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        lblNewContactNo.setForeground(new java.awt.Color(255, 255, 255));
        lblNewContactNo.setText("New Contact No:");

        btnSubmit.setBackground(new java.awt.Color(200, 28, 28));
        btnSubmit.setFont(new java.awt.Font("Algerian", 0, 14)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(255, 255, 255));
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblWelcomeAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 890, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(280, 280, 280)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnRemove)
                        .addGap(143, 143, 143)
                        .addComponent(btnEdit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lblCustomerId, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNewUsername, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNewAddress, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNewPasswd, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblNewContactNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNewPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNewContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addComponent(btnSubmit)))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblWelcomeAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewUsername)
                    .addComponent(txtNewUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewPasswd)
                    .addComponent(txtNewPasswd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblNewAddress))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerId))
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNewContactNo)
                    .addComponent(txtNewContactNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRemove)
                    .addComponent(btnEdit))
                .addGap(18, 18, 18)
                .addComponent(btnSubmit)
                .addContainerGap(164, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 890, 610));

        jPanel2.setBackground(new java.awt.Color(204, 22, 22));

        lblDashboard.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        lblDashboard.setForeground(new java.awt.Color(255, 255, 255));
        lblDashboard.setText("Dashboard");
        lblDashboard.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblDashboard.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblDashboardMouseClicked(evt);
            }
        });

        lblPendingOrders.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        lblPendingOrders.setForeground(new java.awt.Color(255, 255, 255));
        lblPendingOrders.setText("Pending orders");
        lblPendingOrders.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblDailyReport.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        lblDailyReport.setForeground(new java.awt.Color(255, 255, 255));
        lblDailyReport.setText("Daily Report");
        lblDailyReport.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel5.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Weekly Report");
        jLabel5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        lblSignout.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        lblSignout.setForeground(new java.awt.Color(255, 255, 255));
        lblSignout.setText("Sign out");
        lblSignout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblSignout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblSignoutMouseClicked(evt);
            }
        });

        lblExit.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        lblExit.setForeground(new java.awt.Color(255, 255, 255));
        lblExit.setText("Exit");
        lblExit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPendingOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDailyReport, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSignout, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(lblDashboard, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPendingOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDailyReport, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSignout, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(183, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 610));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/bacground image.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        editCustomer();
    }//GEN-LAST:event_btnEditActionPerformed

    private void lblExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblExitMouseClicked
        // TODO add your handling code here:
        int res;
        res = JOptionPane.showConfirmDialog(this, "Are You sure to exit?");
        System.out.println(res);
        if (res == 0){  //If the user selects Yes then the Window closes.
            this.dispatchEvent(new WindowEvent(this, WindowEvent.WINDOW_CLOSING));
        }
    }//GEN-LAST:event_lblExitMouseClicked

    private void lblSignoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblSignoutMouseClicked

        // TODO add your handling code here:
        LoginType lt = new LoginType();
        int res;
        res = JOptionPane.showConfirmDialog(this, "Are you sure to Logout?" );
        switch (res) {
            case 0:
                
                lt.setVisible(true);    //opens the LoginType Jframe.
                this.setVisible(false);     //closes the current JFrame form.
                break;
        //this.setVisible(true);
            default:
                break;
        }
    }//GEN-LAST:event_lblSignoutMouseClicked

    private void lblDashboardMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblDashboardMouseClicked
        // TODO add your handling code here:
        AdminDashboard ad = new AdminDashboard();
        ad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_lblDashboardMouseClicked

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
       int userId = Integer.parseInt(txtUserId.getText());
       mcb.setCustomerId(userId);
       mcb.setUsername(txtUsername.getText());
       int res = JOptionPane.showConfirmDialog(this, "Are you sure to remove the account?");
       if(res == 0){
            mcd.removeUser(mcb);
            txtUsername.setText(null);
            txtUserId.setText(null);
       }
       else{
           txtUsername.setText(null);
           txtUserId.setText(null);
       }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
        mcb.setNewUsername(txtNewUsername.getText());
        mcb.setNewPassword(txtNewPasswd.getText());
        mcb.setNewAddress(txtAddress.getText());
        mcb.setNewPhoneNo(txtNewContactNo.getText());
        
        mcd.editUser(mcb);
        
        JOptionPane.showMessageDialog(this, "Profile edited Successfully.");
        txtNewUsername.setText(null);
        txtNewPasswd.setText(null);
        txtAddress.setText(null);
        txtNewContactNo.setText(null);
        
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new ManageCustomer().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCustomerId;
    private javax.swing.JLabel lblDailyReport;
    private javax.swing.JLabel lblDashboard;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblNewAddress;
    private javax.swing.JLabel lblNewContactNo;
    private javax.swing.JLabel lblNewPasswd;
    private javax.swing.JLabel lblNewUsername;
    private javax.swing.JLabel lblPendingOrders;
    private javax.swing.JLabel lblSignout;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JLabel lblWelcomeAdminPanel;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtNewContactNo;
    private javax.swing.JTextField txtNewPasswd;
    private javax.swing.JTextField txtNewUsername;
    private javax.swing.JTextField txtUserId;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
