/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DeliveryManRole;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.OrderList;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import userinterface.RestaurantAdminRole.ManageOrders;

/**
 *
 * @author khushbu
 */
public class ManageDeliveryManOrderDetails extends javax.swing.JPanel {

    /**
     * Creates new form ManageDeliveryManOrderDetails
     */
    JPanel userProcessContainer;
    UserAccount userAccount;
    EcoSystem ecosystem;
    WorkRequest workRequest;
    OrderList orderListData;
    
    public ManageDeliveryManOrderDetails(JPanel userProcessContainer, UserAccount userAccount, EcoSystem ecosystem, WorkRequest workRequest, OrderList orderListData) {
        this.userProcessContainer = userProcessContainer;
        this.userAccount = userAccount;
        this.ecosystem = ecosystem;
        this.workRequest = workRequest;
        this.orderListData = orderListData;
        initComponents();
        renderData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblPageTitle = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        lblCustomerAddress1 = new javax.swing.JLabel();
        lblOrderStatus = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblCustomerContact = new javax.swing.JLabel();
        lblCustomerName = new javax.swing.JLabel();
        lblCustomerName3 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        lblCustomerName2 = new javax.swing.JLabel();
        lblCustomerAddress = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblCustomerName1 = new javax.swing.JLabel();
        lblRestaurantName2 = new javax.swing.JLabel();
        lblRestaurantName = new javax.swing.JLabel();
        lblRestaurantAddress = new javax.swing.JLabel();
        lblRestaurantName1 = new javax.swing.JLabel();
        lblRestaurantContact = new javax.swing.JLabel();
        btnMarkDeliver = new javax.swing.JButton();
        btnPickupOrder1 = new javax.swing.JButton();

        setBackground(new java.awt.Color(237, 255, 236));

        lblPageTitle.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        lblPageTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPageTitle.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/dinner.png"))); // NOI18N
        lblPageTitle.setText("Order Details");

        btnBack.setBackground(new java.awt.Color(255, 255, 255));
        btnBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/back.png"))); // NOI18N
        btnBack.setText("Back");
        btnBack.setToolTipText("");
        btnBack.setActionCommand("University");
        btnBack.setAlignmentY(0.0F);
        btnBack.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true), new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true)));
        btnBack.setBorderPainted(false);
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBack.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnBack.setIconTextGap(10);
        btnBack.setMargin(new java.awt.Insets(10, 5, 0, 2));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        lblCustomerAddress1.setBackground(new java.awt.Color(249, 244, 244));
        lblCustomerAddress1.setForeground(new java.awt.Color(102, 102, 102));
        lblCustomerAddress1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomerAddress1.setText("Order Status :");

        lblOrderStatus.setBackground(new java.awt.Color(249, 244, 244));
        lblOrderStatus.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblOrderStatus.setText("NA");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        lblCustomerContact.setBackground(new java.awt.Color(249, 244, 244));
        lblCustomerContact.setForeground(new java.awt.Color(102, 102, 102));
        lblCustomerContact.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomerContact.setText("Customer Contact :");

        lblCustomerName.setBackground(new java.awt.Color(249, 244, 244));
        lblCustomerName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomerName.setText("NA");

        lblCustomerName3.setBackground(new java.awt.Color(249, 244, 244));
        lblCustomerName3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomerName3.setText("NA");

        lblName.setBackground(new java.awt.Color(249, 244, 244));
        lblName.setForeground(new java.awt.Color(102, 102, 102));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Customer Name :");

        lblCustomerName2.setBackground(new java.awt.Color(249, 244, 244));
        lblCustomerName2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomerName2.setText("NA");

        lblCustomerAddress.setBackground(new java.awt.Color(249, 244, 244));
        lblCustomerAddress.setForeground(new java.awt.Color(102, 102, 102));
        lblCustomerAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomerAddress.setText("Customer Address :");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerName2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerName3, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCustomerContact, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblName)
                .addGap(15, 15, 15)
                .addComponent(lblCustomerName, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblCustomerContact)
                .addGap(15, 15, 15)
                .addComponent(lblCustomerName3, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblCustomerAddress)
                .addGap(15, 15, 15)
                .addComponent(lblCustomerName2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        lblCustomerName1.setBackground(new java.awt.Color(249, 244, 244));
        lblCustomerName1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCustomerName1.setText("NA");

        lblRestaurantName2.setBackground(new java.awt.Color(249, 244, 244));
        lblRestaurantName2.setForeground(new java.awt.Color(102, 102, 102));
        lblRestaurantName2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRestaurantName2.setText("Restaurant Contact :");

        lblRestaurantName.setBackground(new java.awt.Color(204, 255, 204));
        lblRestaurantName.setForeground(new java.awt.Color(102, 102, 102));
        lblRestaurantName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRestaurantName.setText("Restaurant Name :");

        lblRestaurantAddress.setBackground(new java.awt.Color(249, 244, 244));
        lblRestaurantAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRestaurantAddress.setText("NA");

        lblRestaurantName1.setBackground(new java.awt.Color(249, 244, 244));
        lblRestaurantName1.setForeground(new java.awt.Color(102, 102, 102));
        lblRestaurantName1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRestaurantName1.setText("Restaurant Address :");

        lblRestaurantContact.setBackground(new java.awt.Color(249, 244, 244));
        lblRestaurantContact.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblRestaurantContact.setText("NA");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCustomerName1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRestaurantName, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRestaurantAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRestaurantName1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRestaurantContact, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRestaurantName2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblRestaurantName)
                .addGap(15, 15, 15)
                .addComponent(lblCustomerName1, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblRestaurantName2)
                .addGap(15, 15, 15)
                .addComponent(lblRestaurantContact, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblRestaurantName1)
                .addGap(15, 15, 15)
                .addComponent(lblRestaurantAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnMarkDeliver.setBackground(new java.awt.Color(255, 255, 255));
        btnMarkDeliver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnMarkDeliver.setText("Mark Delivered");
        btnMarkDeliver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnMarkDeliver.setBorderPainted(false);
        btnMarkDeliver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMarkDeliverActionPerformed(evt);
            }
        });

        btnPickupOrder1.setBackground(new java.awt.Color(255, 255, 255));
        btnPickupOrder1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnPickupOrder1.setText("Pickup Order");
        btnPickupOrder1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnPickupOrder1.setBorderPainted(false);
        btnPickupOrder1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPickupOrder1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(39, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(209, 209, 209))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblOrderStatus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCustomerAddress1, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(158, 158, 158))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnPickupOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMarkDeliver, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(101, 101, 101))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPageTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(lblCustomerAddress1)
                .addGap(15, 15, 15)
                .addComponent(lblOrderStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMarkDeliver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPickupOrder1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(56, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // back btn logic
        backAction();
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnMarkDeliverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMarkDeliverActionPerformed
        // TODO add your handling code here:
        orderListData.setStatus("COMPLETED");
        lblOrderStatus.setText("COMPLETED");
        orderListData.setResolveDate(new Date());
        changeBtns();
        JOptionPane.showMessageDialog(null, "Hey thanks for delivering the order to customer successfully!");
    }//GEN-LAST:event_btnMarkDeliverActionPerformed

    private void btnPickupOrder1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPickupOrder1ActionPerformed
        // TODO add your handling code here:
        orderListData.setStatus("OUT FOR DELIVERY");
        lblOrderStatus.setText("OUT FOR DELIVERY");
        orderListData.setResolveDate(new Date());
        changeBtns();
        JOptionPane.showMessageDialog(null, "Order pickup successful!");
    }//GEN-LAST:event_btnPickupOrder1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnMarkDeliver;
    private javax.swing.JButton btnPickupOrder1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblCustomerAddress;
    private javax.swing.JLabel lblCustomerAddress1;
    private javax.swing.JLabel lblCustomerContact;
    private javax.swing.JLabel lblCustomerName;
    private javax.swing.JLabel lblCustomerName1;
    private javax.swing.JLabel lblCustomerName2;
    private javax.swing.JLabel lblCustomerName3;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblOrderStatus;
    private javax.swing.JLabel lblPageTitle;
    private javax.swing.JLabel lblRestaurantAddress;
    private javax.swing.JLabel lblRestaurantContact;
    private javax.swing.JLabel lblRestaurantName;
    private javax.swing.JLabel lblRestaurantName1;
    private javax.swing.JLabel lblRestaurantName2;
    // End of variables declaration//GEN-END:variables

    private void backAction() {
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        
        Component component = componentArray[componentArray.length - 1];
        
        ManageOrders manageOrders = (ManageOrders) component;
        manageOrders.populateTable();
        
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
    }
    
    private void changeBtns() {
        String status = orderListData.getStatus().toUpperCase();
        switch (status) {
            case "COMPLETED":
                btnMarkDeliver.setVisible(false);
                btnPickupOrder1.setVisible(false);
                break;
            
            case "OUT FOR DELIVERY":
                btnMarkDeliver.setVisible(true);
                btnPickupOrder1.setVisible(false);
                break;
            
            default:
                btnMarkDeliver.setVisible(false);
                btnPickupOrder1.setVisible(true);
                break;
        }
    }
    
    private void renderData() {
        changeBtns();
        
        lblCustomerName.setText(orderListData.getCustomer().getName());
        lblCustomerAddress.setText(orderListData.getCustomer().getAddress());
        lblCustomerContact.setText(orderListData.getCustomer().getPhone());
        
        lblRestaurantName.setText(orderListData.getRestaurant().getName());
        lblRestaurantAddress.setText(orderListData.getRestaurant().getAddress());
        lblRestaurantContact.setText(orderListData.getRestaurant().getPhone());
        
        lblOrderStatus.setText(orderListData.getStatus());
    }
}
