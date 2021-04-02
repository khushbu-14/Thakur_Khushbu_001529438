/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.SystemAdminWorkArea;

import Business.Customer.Customer;
import Business.DeliveryMan.DeliveryMan;
import Business.EcoSystem;
import Business.Restaurant.Restaurant;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JPanel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author khushbu
 */
public class ManageTreePanel extends javax.swing.JPanel {

    /**
     * Creates new form ManageTreePanel
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;

    public ManageTreePanel(JPanel userProcessContainer, EcoSystem ecosystem) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;

        treePane.setVisible(true);

        populateTree();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        treePane = new javax.swing.JScrollPane();
        treePanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSelectedNode = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree = new javax.swing.JTree();

        setBackground(new java.awt.Color(237, 255, 236));

        treePanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setText("Selected Node:");

        lblSelectedNode.setText("<View_selected_node>");

        jTree.addTreeSelectionListener(new javax.swing.event.TreeSelectionListener() {
            public void valueChanged(javax.swing.event.TreeSelectionEvent evt) {
                jTreeValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(jTree);

        javax.swing.GroupLayout treePanelLayout = new javax.swing.GroupLayout(treePanel);
        treePanel.setLayout(treePanelLayout);
        treePanelLayout.setHorizontalGroup(
            treePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(treePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(treePanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(lblSelectedNode)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        treePanelLayout.setVerticalGroup(
            treePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(treePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(treePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblSelectedNode))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        treePane.setViewportView(treePanel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(treePane, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(treePane, javax.swing.GroupLayout.PREFERRED_SIZE, 336, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(363, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTreeValueChanged(javax.swing.event.TreeSelectionEvent evt) {//GEN-FIRST:event_jTreeValueChanged

        DefaultMutableTreeNode selectedNode = (DefaultMutableTreeNode) jTree.getLastSelectedPathComponent();
        if (selectedNode != null) {
            lblSelectedNode.setText(selectedNode.toString());
        }
    }//GEN-LAST:event_jTreeValueChanged

    public void populateTree() {
        DefaultTreeModel model = (DefaultTreeModel) jTree.getModel();
        // Add the code for draw your system structure shown by JTree

        ArrayList<Customer> customerList = ecosystem.getCustomerDirectory().getCustomerList();

        ArrayList<Restaurant> restaurantList = ecosystem.getRestaurantDirectory().getRestaurantList();

        ArrayList<DeliveryMan> deliveryManList = ecosystem.getDeliveryManDirectory().getDeliveryManList();

        Customer customer;
        Restaurant restaurant;
        DeliveryMan deliveryMan;
        List<WorkRequest> workRequestList;

        DefaultMutableTreeNode systemAdmin = new DefaultMutableTreeNode("SystemAdmin");

//        DefaultMutableTreeNode customers = new DefaultMutableTreeNode("Customers");
        DefaultMutableTreeNode root = (DefaultMutableTreeNode) model.getRoot();
        root.removeAllChildren();
//        root.insert(customers, 0);
        root.insert(systemAdmin, 0);

        DefaultMutableTreeNode customers = new DefaultMutableTreeNode("Customers");
        systemAdmin.insert(customers, 0);

        DefaultMutableTreeNode networkNode;
        DefaultMutableTreeNode orderNode;

        for (int i = 0; i < customerList.size(); i++) {
            customer = customerList.get(i);
            networkNode = new DefaultMutableTreeNode(customer.getName());
            customers.insert(networkNode, i);

            workRequestList = ecosystem.getWorkQueue().getCustomerRequestList(customer);
            int count = 0;
            for (WorkRequest req : workRequestList) {
                String txt = req.getRestaurant().getName() + " - " + req.getStatus();
                orderNode = new DefaultMutableTreeNode(txt);

                // orderNode = new DefaultMutableTreeNode(req.getRestaurant().getName());
                networkNode.insert(orderNode, count);
                count++;
            }
        }

        DefaultMutableTreeNode restaurants = new DefaultMutableTreeNode("Restaurants");
        systemAdmin.insert(restaurants, 1);

        for (int i = 0; i < restaurantList.size(); i++) {
            restaurant = restaurantList.get(i);
            networkNode = new DefaultMutableTreeNode(restaurant.getName());
            restaurants.insert(networkNode, i);

            workRequestList = ecosystem.getWorkQueue().getRestaurantRequestList(restaurant);
            int count = 0;
            for (WorkRequest req : workRequestList) {
//                orderNode = new DefaultMutableTreeNode(req.getCustomer().getName());
                String txt = req.getCustomer().getName() + " - " + req.getStatus();
                orderNode = new DefaultMutableTreeNode(txt);

                networkNode.insert(orderNode, count);
                count++;
            }
        }

        DefaultMutableTreeNode deliveryMans = new DefaultMutableTreeNode("Delivery Man");
        systemAdmin.insert(deliveryMans, 2);

        for (int i = 0; i < deliveryManList.size(); i++) {
            deliveryMan = deliveryManList.get(i);
            networkNode = new DefaultMutableTreeNode(deliveryMan.getName());
            deliveryMans.insert(networkNode, i);

            workRequestList = ecosystem.getWorkQueue().getDeliveryManRequestList(deliveryMan);
            int count = 0;
            for (WorkRequest req : workRequestList) {
                String name = req.getCustomer().getName() + " - " + req.getRestaurant().getName();
                orderNode = new DefaultMutableTreeNode(name);
                networkNode.insert(orderNode, count);
            }
        }
        model.reload();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree;
    private javax.swing.JLabel lblSelectedNode;
    private javax.swing.JScrollPane treePane;
    private javax.swing.JPanel treePanel;
    // End of variables declaration//GEN-END:variables
}