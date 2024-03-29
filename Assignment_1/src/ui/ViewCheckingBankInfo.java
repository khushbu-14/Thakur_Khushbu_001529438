/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Checking;
import model.Person;

/**
 *
 * @author khushbu
 */
public class ViewCheckingBankInfo extends javax.swing.JPanel {

//    Person person;
    Checking checking;
    
    /**
     * Creates new form PersonalInformationPanel
     */
//    public ViewCheckingBankInfo(Person person) {
//        initComponents();
//        this.person = person;
//        displayData();
//    }
    public ViewCheckingBankInfo(Checking checking) {
        initComponents();
        this.checking = checking;
        displayData();
    }
    
//     private String pattern = "dd-MMM-yyyy";
//     private SimpleDateFormat dateFormat = new SimpleDateFormat(pattern);

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateComponentFormatter1 = new org.jdatepicker.DateComponentFormatter();
        buttonGroup1 = new javax.swing.ButtonGroup();
        tabBodyBankInformation = new javax.swing.JPanel();
        lblSCheckingBankRoutingNo = new javax.swing.JLabel();
        lblCheckingBankAccNo = new javax.swing.JLabel();
        txtCheckingBankRoutingNo = new javax.swing.JTextField();
        checkBoxChecking = new javax.swing.JCheckBox();
        titleChecking = new javax.swing.JLabel();
        txtCheckingBankName = new javax.swing.JTextField();
        lblCheckingBankName = new javax.swing.JLabel();
        lblCheckingBankAccBalance = new javax.swing.JLabel();
        txtCheckingAccBalance = new javax.swing.JTextField();
        txtCheckingBankAccNo = new javax.swing.JTextField();

        setBackground(new java.awt.Color(249, 244, 244));

        tabBodyBankInformation.setBackground(new java.awt.Color(249, 244, 244));

        lblSCheckingBankRoutingNo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblSCheckingBankRoutingNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSCheckingBankRoutingNo.setText("Bank Routing Number");

        lblCheckingBankAccNo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblCheckingBankAccNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCheckingBankAccNo.setText("Bank Account Number");

        txtCheckingBankRoutingNo.setEditable(false);
        txtCheckingBankRoutingNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtCheckingBankRoutingNo.setFocusTraversalKeysEnabled(false);
        txtCheckingBankRoutingNo.setFocusable(false);
        txtCheckingBankRoutingNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckingBankRoutingNoActionPerformed(evt);
            }
        });

        checkBoxChecking.setSelected(true);
        checkBoxChecking.setText("Checking Bank Account");
        checkBoxChecking.setEnabled(false);
        checkBoxChecking.setFocusTraversalKeysEnabled(false);
        checkBoxChecking.setFocusable(false);

        titleChecking.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        titleChecking.setText("View Checking Account Details");

        txtCheckingBankName.setEditable(false);
        txtCheckingBankName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtCheckingBankName.setFocusTraversalKeysEnabled(false);
        txtCheckingBankName.setFocusable(false);
        txtCheckingBankName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckingBankNameActionPerformed(evt);
            }
        });

        lblCheckingBankName.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblCheckingBankName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCheckingBankName.setText("Bank Name");

        lblCheckingBankAccBalance.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblCheckingBankAccBalance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCheckingBankAccBalance.setText("Account Balance");

        txtCheckingAccBalance.setEditable(false);
        txtCheckingAccBalance.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtCheckingAccBalance.setFocusTraversalKeysEnabled(false);
        txtCheckingAccBalance.setFocusable(false);
        txtCheckingAccBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckingAccBalanceActionPerformed(evt);
            }
        });

        txtCheckingBankAccNo.setEditable(false);
        txtCheckingBankAccNo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtCheckingBankAccNo.setFocusTraversalKeysEnabled(false);
        txtCheckingBankAccNo.setFocusable(false);
        txtCheckingBankAccNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckingBankAccNoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabBodyBankInformationLayout = new javax.swing.GroupLayout(tabBodyBankInformation);
        tabBodyBankInformation.setLayout(tabBodyBankInformationLayout);
        tabBodyBankInformationLayout.setHorizontalGroup(
            tabBodyBankInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBodyBankInformationLayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(tabBodyBankInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCheckingBankRoutingNo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCheckingBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblSCheckingBankRoutingNo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCheckingBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCheckingAccBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(tabBodyBankInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(txtCheckingBankAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(tabBodyBankInformationLayout.createSequentialGroup()
                            .addComponent(titleChecking)
                            .addGap(12, 12, 12)))
                    .addComponent(checkBoxChecking, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCheckingBankAccBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblCheckingBankAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        tabBodyBankInformationLayout.setVerticalGroup(
            tabBodyBankInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBodyBankInformationLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(titleChecking)
                .addGap(30, 30, 30)
                .addComponent(lblCheckingBankName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCheckingBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblSCheckingBankRoutingNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCheckingBankRoutingNo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblCheckingBankAccNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCheckingBankAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(lblCheckingBankAccBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCheckingAccBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(checkBoxChecking)
                .addGap(88, 88, 88))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabBodyBankInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabBodyBankInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtCheckingBankRoutingNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckingBankRoutingNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckingBankRoutingNoActionPerformed

    private void txtCheckingBankNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckingBankNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckingBankNameActionPerformed

    private void txtCheckingAccBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckingAccBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckingAccBalanceActionPerformed

    private void txtCheckingBankAccNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckingBankAccNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckingBankAccNoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkBoxChecking;
    private org.jdatepicker.DateComponentFormatter dateComponentFormatter1;
    private javax.swing.JLabel lblCheckingBankAccBalance;
    private javax.swing.JLabel lblCheckingBankAccNo;
    private javax.swing.JLabel lblCheckingBankName;
    private javax.swing.JLabel lblSCheckingBankRoutingNo;
    private javax.swing.JPanel tabBodyBankInformation;
    private javax.swing.JLabel titleChecking;
    private javax.swing.JTextField txtCheckingAccBalance;
    private javax.swing.JTextField txtCheckingBankAccNo;
    private javax.swing.JTextField txtCheckingBankName;
    private javax.swing.JTextField txtCheckingBankRoutingNo;
    // End of variables declaration//GEN-END:variables
       
    private void displayData() {
//        System.out.println(person.isIsSavingAccountType() + " savings view");
        
        txtCheckingBankName.setText(checking.getCheckingBankName());
        txtCheckingBankAccNo.setText(checking.getCheckingBankAccountNumber());
        txtCheckingAccBalance.setText(checking.getCheckingAccountBalance());
        checkBoxChecking.setSelected(checking.isIsCheckingAccountType());
        txtCheckingBankRoutingNo.setText(checking.getCheckingBankRoutingNumber());
//        System.out.println(person.isIsCheckingAccountType() + " checking view");
    }
}
