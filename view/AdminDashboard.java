/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.WindowEvent;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class AdminDashboard extends javax.swing.JFrame {

    /**
     * Creates new form AdminDashboard
     */
    public AdminDashboard() {
        initComponents();
        ImageIcon img = new ImageIcon("src/media/shoppingbag.png");
       this.setIconImage(img.getImage());
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
        btnAddCustomer = new javax.swing.JButton();
        lblWelcomeAdminPanel = new javax.swing.JLabel();
        btnAddProduct = new javax.swing.JButton();
        btnViewCustomer = new javax.swing.JButton();
        btnManageProd = new javax.swing.JButton();
        btnManageCustomer = new javax.swing.JButton();
        btnProdAvailable = new javax.swing.JButton();
        btnOrderList = new javax.swing.JButton();
        btnLogout = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblSignout = new javax.swing.JLabel();
        lblExit = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Panel");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0,70));

        btnAddCustomer.setBackground(new java.awt.Color(195, 17, 17));
        btnAddCustomer.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        btnAddCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnAddCustomer.setText("Add Customer");
        btnAddCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCustomerMouseClicked(evt);
            }
        });

        lblWelcomeAdminPanel.setFont(new java.awt.Font("Algerian", 1, 24)); // NOI18N
        lblWelcomeAdminPanel.setForeground(new java.awt.Color(255, 255, 255));
        lblWelcomeAdminPanel.setText("                                  Welcome to Admin Panel");

        btnAddProduct.setBackground(new java.awt.Color(195, 17, 17));
        btnAddProduct.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        btnAddProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProduct.setText("Add Product");
        btnAddProduct.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAddProduct.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddProductMouseClicked(evt);
            }
        });
        btnAddProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProductActionPerformed(evt);
            }
        });

        btnViewCustomer.setBackground(new java.awt.Color(195, 17, 17));
        btnViewCustomer.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        btnViewCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnViewCustomer.setText("View Customer");
        btnViewCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnViewCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnViewCustomerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnViewCustomerMouseEntered(evt);
            }
        });
        btnViewCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewCustomerActionPerformed(evt);
            }
        });

        btnManageProd.setBackground(new java.awt.Color(195, 17, 17));
        btnManageProd.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        btnManageProd.setForeground(new java.awt.Color(255, 255, 255));
        btnManageProd.setText("Manage Product");
        btnManageProd.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageProd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageProdMouseClicked(evt);
            }
        });

        btnManageCustomer.setBackground(new java.awt.Color(195, 17, 17));
        btnManageCustomer.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        btnManageCustomer.setForeground(new java.awt.Color(255, 255, 255));
        btnManageCustomer.setText("Manage Customer");
        btnManageCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnManageCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnManageCustomerMouseClicked(evt);
            }
        });

        btnProdAvailable.setBackground(new java.awt.Color(195, 17, 17));
        btnProdAvailable.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        btnProdAvailable.setForeground(new java.awt.Color(255, 255, 255));
        btnProdAvailable.setText("Products Available");
        btnProdAvailable.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnProdAvailable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnProdAvailableMouseClicked(evt);
            }
        });

        btnOrderList.setBackground(new java.awt.Color(195, 17, 17));
        btnOrderList.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        btnOrderList.setForeground(new java.awt.Color(255, 255, 255));
        btnOrderList.setText("Order Lists");
        btnOrderList.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnOrderList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnOrderListMouseClicked(evt);
            }
        });
        btnOrderList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrderListActionPerformed(evt);
            }
        });

        btnLogout.setBackground(new java.awt.Color(195, 17, 17));
        btnLogout.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("Log Out");
        btnLogout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
        });
        btnLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogoutActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblWelcomeAdminPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnViewCustomer)
                        .addGap(18, 18, 18)
                        .addComponent(btnManageCustomer))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnProdAvailable)
                        .addGap(34, 34, 34)
                        .addComponent(btnManageProd)
                        .addGap(29, 29, 29)
                        .addComponent(btnOrderList)
                        .addGap(18, 18, 18)
                        .addComponent(btnLogout)))
                .addContainerGap(161, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(lblWelcomeAdminPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddProduct, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnViewCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnProdAvailable, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnManageProd, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnOrderList, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnLogout, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(317, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, 890, 610));

        jPanel2.setBackground(new java.awt.Color(204, 22, 22));

        jLabel2.setFont(new java.awt.Font("Algerian", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 153, 153));
        jLabel2.setText("Dashboard");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

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
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSignout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblExit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblSignout, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblExit, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(366, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 180, 610));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/media/bacground image.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1070, 610));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProductActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddProductActionPerformed

    private void btnViewCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewCustomerActionPerformed
        
    }//GEN-LAST:event_btnViewCustomerActionPerformed

    private void btnOrderListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrderListActionPerformed
        // TODO add your handling code here:
        OrderList ol;
        try {
            ol = new OrderList();
            ol.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
       
    }//GEN-LAST:event_btnOrderListActionPerformed

    private void btnLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutActionPerformed

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        // TODO add your handling code here:
        LoginType lt = new LoginType();
        int res;
        res = JOptionPane.showConfirmDialog(this, "Are you sure to Logout?" );
        switch (res) {
            case 0:
                lt.setVisible(true);
                this.setVisible(false);
                break;
            case 1:
                this.setVisible(true);
                break;
        //this.setVisible(true);
            default:
                break;
        }
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnAddCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCustomerMouseClicked
        // TODO add your handling code here:
        AddCustomer ac = new AddCustomer();
        ac.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddCustomerMouseClicked

    private void btnAddProductMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddProductMouseClicked
        // TODO add your handling code here:
        AddProduct ap = new AddProduct();
        ap.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnAddProductMouseClicked

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

    private void btnViewCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewCustomerMouseClicked
        try {
            // TODO add your handling code here:
            ViewCustomer vc = new ViewCustomer();
            vc.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnViewCustomerMouseClicked

    private void btnManageCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageCustomerMouseClicked
        // TODO add your handling code here:
        ManageCustomer mc =new ManageCustomer();
        mc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnManageCustomerMouseClicked

    private void btnProdAvailableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnProdAvailableMouseClicked
        try {
            // TODO add your handling code here:
            AvailableProducts ap = new AvailableProducts();
            ap.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnProdAvailableMouseClicked

    private void btnManageProdMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnManageProdMouseClicked
        // TODO add your handling code here:
        ManageProduct mp = new ManageProduct();
        mp.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_btnManageProdMouseClicked

    private void btnOrderListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOrderListMouseClicked
        // TODO add your handling code here:
        OrderList ol;
        try {
            ol = new OrderList();
            ol.setVisible(true);
            this.setVisible(false);
        } catch (IOException ex) {
            Logger.getLogger(AdminDashboard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnOrderListMouseClicked

    private void btnViewCustomerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnViewCustomerMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnViewCustomerMouseEntered

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
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCustomer;
    private javax.swing.JButton btnAddProduct;
    private javax.swing.JButton btnLogout;
    private javax.swing.JButton btnManageCustomer;
    private javax.swing.JButton btnManageProd;
    private javax.swing.JButton btnOrderList;
    private javax.swing.JButton btnProdAvailable;
    private javax.swing.JButton btnViewCustomer;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblExit;
    private javax.swing.JLabel lblSignout;
    private javax.swing.JLabel lblWelcomeAdminPanel;
    // End of variables declaration//GEN-END:variables
}
