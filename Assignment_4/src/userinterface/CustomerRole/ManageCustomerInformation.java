/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.CustomerRole;

import Business.Customer.Customer;
import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import constants.Utils;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author khushbu
 */
public class ManageCustomerInformation extends javax.swing.JPanel {

    /**
     * Creates new form ManageRestaurantInformation
     */
    JPanel userProcessContainer;
    EcoSystem ecosystem;
    UserAccount userAccount;
    Customer customer;
    Utils utils;

    public ManageCustomerInformation(JPanel userProcessContainer, EcoSystem ecosystem, UserAccount userAccount) {
        initComponents();

        this.userProcessContainer = userProcessContainer;
        this.ecosystem = ecosystem;
        this.userAccount = userAccount;
        customer = (Customer) userAccount;
        utils = new Utils();

        displayData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnUpdateSave = new javax.swing.JButton();
        lblTitle = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        lblUsername = new javax.swing.JLabel();
        lblAddress = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        lblPhoneNumber = new javax.swing.JLabel();
        txtPhoneNumber = new javax.swing.JFormattedTextField();
        txtPassword = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();

        setBackground(new java.awt.Color(237, 255, 236));

        btnUpdateSave.setBackground(new java.awt.Color(138, 177, 138));
        btnUpdateSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/save.png"))); // NOI18N
        btnUpdateSave.setText("Update");
        btnUpdateSave.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 255, 255), 1, true));
        btnUpdateSave.setBorderPainted(false);
        btnUpdateSave.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        btnUpdateSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateSaveActionPerformed(evt);
            }
        });

        lblTitle.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblTitle.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblTitle.setText(" Manage Customer Information");

        lblName.setBackground(new java.awt.Color(249, 244, 244));
        lblName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblName.setText("Customer Name :");

        txtUsername.setEditable(false);
        txtUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtUsername.setEnabled(false);

        txtName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblUsername.setBackground(new java.awt.Color(249, 244, 244));
        lblUsername.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblUsername.setText("Customer Username :");

        lblAddress.setBackground(new java.awt.Color(249, 244, 244));
        lblAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAddress.setText("Customer Address :");

        txtAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblPhoneNumber.setBackground(new java.awt.Color(249, 244, 244));
        lblPhoneNumber.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPhoneNumber.setText("Customer Phone Number :");

        txtPhoneNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        try {
            txtPhoneNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##########")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        txtPassword.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblPassword.setBackground(new java.awt.Color(249, 244, 244));
        lblPassword.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblPassword.setText("Customer Password :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblPassword, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(lblName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(lblPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 308, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(52, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnUpdateSave, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblTitle)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblName)
                        .addGap(15, 15, 15)
                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAddress)
                        .addGap(15, 15, 15)
                        .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblPhoneNumber)
                        .addGap(18, 18, 18)
                        .addComponent(txtPhoneNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblUsername)
                        .addGap(15, 15, 15)
                        .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(lblPassword)
                .addGap(15, 15, 15)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addComponent(btnUpdateSave, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(156, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateSaveActionPerformed
        // TODO add your handling code here:

        if (customer != null) {
            String name = txtName.getText().trim(),
                    address = txtAddress.getText().trim(),
                    password = txtPassword.getText().trim();

            String phoneNo = txtPhoneNumber.getText().trim();

            if (!utils.isStringInputValid(name)) {
                JOptionPane.showMessageDialog(this, "Please enter valid name");
            } else if (!utils.isStringInputValid(address)) {
                JOptionPane.showMessageDialog(this, "Please enter valid address");
            } else if (!utils.isStringInputValid(phoneNo) || phoneNo.length() != 10) {
                JOptionPane.showMessageDialog(this, "Please enter valid 10 digit phone number");
            } else if (!utils.isStringInputValid(password)) {
                JOptionPane.showMessageDialog(this, "Please enter valid password");
            } else {

//                btnUpdateSave.setVisible(false);

                customer.setName(name);
                customer.setAddress(address);
                customer.setPhone(phoneNo);
                customer.setPassword(password);

                JOptionPane.showMessageDialog(this, name + " updated successfully!");
            }
        }
    }//GEN-LAST:event_btnUpdateSaveActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdateSave;
    private javax.swing.JLabel lblAddress;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPhoneNumber;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JLabel lblUsername;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JFormattedTextField txtPhoneNumber;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables

    private void displayData() {
        txtName.setText(customer.getName());
        txtAddress.setText(customer.getAddress());
        txtPhoneNumber.setText(customer.getPhone());
        txtPassword.setText(customer.getPassword());
        txtUsername.setText(customer.getUsername());
    }
}