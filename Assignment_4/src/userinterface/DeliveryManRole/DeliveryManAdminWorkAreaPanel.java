/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.DeliveryMan.DeliveryMan;
import userinterface.RestaurantAdminRole.*;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author khushbu
 */

public class DeliveryManAdminWorkAreaPanel extends javax.swing.JPanel {

    /**
     * Creates new form RestaurantAdminWorkAreaPanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;

    DeliveryMan deliveryMan;

    public DeliveryManAdminWorkAreaPanel(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;

        deliveryMan = (DeliveryMan) userAccount;
        manageOrders();
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
        btnOrders = new javax.swing.JButton();
        btnInformation = new javax.swing.JButton();
        mainPanel = new javax.swing.JPanel();

        setBackground(new java.awt.Color(237, 255, 236));
        setLayout(new java.awt.BorderLayout());

        adminPanel.setBackground(new java.awt.Color(237, 255, 236));

        navbar.setBackground(new java.awt.Color(204, 255, 204));

        btnOrders.setBackground(new java.awt.Color(255, 255, 255));
        btnOrders.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/consumer.png"))); // NOI18N
        btnOrders.setText("Orders");
        btnOrders.setToolTipText("View Orders list");
        btnOrders.setAlignmentY(0.0F);
        btnOrders.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        btnOrders.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnOrders.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnOrders.setIconTextGap(10);
        btnOrders.setMargin(new java.awt.Insets(10, 5, 0, 2));
        btnOrders.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOrdersActionPerformed(evt);
            }
        });

        btnInformation.setBackground(new java.awt.Color(255, 255, 255));
        btnInformation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/delivery-man.png"))); // NOI18N
        btnInformation.setText("Information");
        btnInformation.setToolTipText("View Information list");
        btnInformation.setAlignmentY(0.0F);
        btnInformation.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 1, 0));
        btnInformation.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnInformation.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnInformation.setIconTextGap(10);
        btnInformation.setMargin(new java.awt.Insets(10, 5, 0, 2));
        btnInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInformationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navbarLayout = new javax.swing.GroupLayout(navbar);
        navbar.setLayout(navbarLayout);
        navbarLayout.setHorizontalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, navbarLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(btnOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(121, 121, 121)
                .addComponent(btnInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        navbarLayout.setVerticalGroup(
            navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navbarLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(navbarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnOrders, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        mainPanel.setBackground(new java.awt.Color(255, 255, 255));
        mainPanel.setLayout(new java.awt.CardLayout());

        javax.swing.GroupLayout adminPanelLayout = new javax.swing.GroupLayout(adminPanel);
        adminPanel.setLayout(adminPanelLayout);
        adminPanelLayout.setHorizontalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, adminPanelLayout.createSequentialGroup()
                .addGap(0, 31, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(662, 662, 662))
            .addComponent(navbar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        adminPanelLayout.setVerticalGroup(
            adminPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(adminPanelLayout.createSequentialGroup()
                .addComponent(navbar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 566, Short.MAX_VALUE)
                .addComponent(mainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        add(adminPanel, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOrdersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOrdersActionPerformed
        // TODO add your handling code here:
        manageOrders();
    }//GEN-LAST:event_btnOrdersActionPerformed

    private void btnInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInformationActionPerformed
        // TODO add your handling code here:
        manageInformation();
    }//GEN-LAST:event_btnInformationActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel adminPanel;
    private javax.swing.JButton btnInformation;
    private javax.swing.JButton btnOrders;
    private javax.swing.JPanel mainPanel;
    private javax.swing.JPanel navbar;
    // End of variables declaration//GEN-END:variables

    private void manageInformation() {
        ManageDeliveryManInformation manageDeliveryManInformation = new ManageDeliveryManInformation(userProcessContainer, ecosystem, userAccount);

        mainPanel.add("ManageDeliveryManInformation", manageDeliveryManInformation);

        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }

    private void manageOrders() {

        ManageDeliveryManOrders manageDeliveryManOrders = new ManageDeliveryManOrders(userProcessContainer, ecosystem, userAccount);

        mainPanel.add("ManageDeliveryManOrders", manageDeliveryManOrders);

        CardLayout layout = (CardLayout) mainPanel.getLayout();
        layout.next(mainPanel);
    }
}