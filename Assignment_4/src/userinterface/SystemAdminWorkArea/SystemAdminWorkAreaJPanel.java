/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.EcoSystem;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author khushbu
 */
public class SystemAdminWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form SystemAdminWorkAreaJPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;

    public SystemAdminWorkAreaJPanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        manageCustomer();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adminPanel = new javax.swing.JPanel();
        navbar = new javax.swing.JPanel();
        btnCustomer = new javax.swing.JButton();
        btnRestaurant = new javax.swing.JButton();
        btnDeliveryMan = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.BorderLayout());

        adminPanel.setBackground(new java.awt.Color(255, 255, 255));

        navbar.setBackground(new java.awt.Color(204, 255, 204));

        btnCustomer.setBackground(new java.awt.Color(255, 255, 255));
        btnCustomer.setText("Customer");
        btnCustomer.setToolTipText("View Customer list");
        btnCustomer.setAlignmentY(0.0F);
        btnCustomer.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        btnCustomer.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnCustomer.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnCustomer.setIconTextGap(10);
        btnCustomer.setMargin(new java.awt.Insets(10, 5, 0, 2));
        btnCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCustomerActionPerformed(evt);
            }
        });

        btnRestaurant.setBackground(new java.awt.Color(255, 255, 255));
        btnRestaurant.setText("Restaurants");
        btnRestaurant.setToolTipText("View Restaurants list");
        btnRestaurant.setAlignmentY(0.0F);
        btnRestaurant.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        btnRestaurant.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRestaurant.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnRestaurant.setIconTextGap(10);
        btnRestaurant.setMargin(new java.awt.Insets(10, 5, 0, 2));
        btnRestaurant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestaurantActionPerformed(evt);
            }
        });

        btnDeliveryMan.setBackground(new java.awt.Color(255, 255, 255));
        btnDeliveryMan.setText("Delivery Man");
        btnDeliveryMan.setToolTipText("View Delivery Man list");
        btnDeliveryMan.setAlignmentY(0.0F);
        btnDeliveryMan.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        btnDeliveryMan.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnDeliveryMan.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnDeliveryMan.setIconTextGap(10);
        btnDeliveryMan.setMargin(new java.awt.Insets(10, 5, 0, 2));
        btnDeliveryMan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeliveryManActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navbarLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(btnRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(btnDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnDeliveryMan, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRestaurant, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(navbar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(adminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCustomerActionPerformed
        // TODO add your handling code here:
        manageCustomer();
    }//GEN-LAST:event_btnCustomerActionPerformed

    private void btnRestaurantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaurantActionPerformed


    }//GEN-LAST:event_btnRestaurantActionPerformed

    private void btnDeliveryManActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeliveryManActionPerformed
        // TODO add your handling code here:


    }//GEN-LAST:event_btnDeliveryManActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminPanel;
    private javax.swing.JButton btnCustomer;
    private javax.swing.JButton btnDeliveryMan;
    private javax.swing.JButton btnRestaurant;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel navbar;
    // End of variables declaration//GEN-END:variables

    private void manageCustomer() {

        userinterface.SystemAdminWorkArea.ManageCustomerPanel manageCustomer = new userinterface.SystemAdminWorkArea.ManageCustomerPanel(mainPanel, ecosystem);

        mainPanel.add("ManageCustomerJPanel", manageCustomer);

        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }
}
