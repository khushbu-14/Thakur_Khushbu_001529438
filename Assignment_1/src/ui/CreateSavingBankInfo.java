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
import model.Person;

/**
 *
 * @author khushbu
 */
public class CreateSavingBankInfo extends javax.swing.JPanel {

    Person person;
    
    /**
     * Creates new form PersonalInformationPanel
     */
    public CreateSavingBankInfo(Person person) {
        initComponents();
        this.person = person;
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
        btnSaveBankInfo = new javax.swing.JButton();
        txtSavingsBankAccNo = new javax.swing.JTextField();
        checkBoxSavings = new javax.swing.JCheckBox();
        txtSavingsAccBalance = new javax.swing.JTextField();
        lblSavingsBankAccBalance = new javax.swing.JLabel();
        txtSavingsBankName = new javax.swing.JTextField();
        lblSavingsBankName = new javax.swing.JLabel();
        lblSavingsBankRoutingNo = new javax.swing.JLabel();
        txtSavingsBankRoutingNo = new javax.swing.JTextField();
        titleSavings = new javax.swing.JLabel();
        lblSavingsBankAccNo = new javax.swing.JLabel();

        btnSaveBankInfo.setBackground(new java.awt.Color(255, 255, 255));
        btnSaveBankInfo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnSaveBankInfo.setText("Save");
        btnSaveBankInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveBankInfoActionPerformed(evt);
            }
        });

        txtSavingsBankAccNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSavingsBankAccNoActionPerformed(evt);
            }
        });

        checkBoxSavings.setSelected(true);
        checkBoxSavings.setText("Savings Bank Account");
        checkBoxSavings.setEnabled(false);

        txtSavingsAccBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSavingsAccBalanceActionPerformed(evt);
            }
        });

        lblSavingsBankAccBalance.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblSavingsBankAccBalance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSavingsBankAccBalance.setText("Account Balance");

        txtSavingsBankName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSavingsBankNameActionPerformed(evt);
            }
        });

        lblSavingsBankName.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblSavingsBankName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSavingsBankName.setText("Bank Name");

        lblSavingsBankRoutingNo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblSavingsBankRoutingNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSavingsBankRoutingNo.setText("Bank Routing Number");

        txtSavingsBankRoutingNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSavingsBankRoutingNoActionPerformed(evt);
            }
        });

        titleSavings.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        titleSavings.setText("Savings Account Details");

        lblSavingsBankAccNo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblSavingsBankAccNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSavingsBankAccNo.setText("Bank Account Number");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(154, 154, 154)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblSavingsBankRoutingNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(titleSavings)
                                    .addComponent(lblSavingsBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(lblSavingsBankAccBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSavingsBankName)
                                    .addComponent(txtSavingsBankRoutingNo, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(lblSavingsBankAccNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSavingsBankAccNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(checkBoxSavings, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(txtSavingsAccBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(btnSaveBankInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtSavingsBankAccNo, txtSavingsBankName, txtSavingsBankRoutingNo});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(titleSavings)
                .addGap(18, 18, 18)
                .addComponent(lblSavingsBankName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSavingsBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSavingsBankRoutingNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSavingsBankRoutingNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSavingsBankAccNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSavingsBankAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSavingsBankAccBalance, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(txtSavingsAccBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkBoxSavings)
                .addGap(30, 30, 30)
                .addComponent(btnSaveBankInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtSavingsBankAccNo, txtSavingsBankName, txtSavingsBankRoutingNo});

    }// </editor-fold>//GEN-END:initComponents

    private void txtSavingsBankNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSavingsBankNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSavingsBankNameActionPerformed

    private void txtSavingsBankRoutingNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSavingsBankRoutingNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSavingsBankRoutingNoActionPerformed

    private void txtSavingsBankAccNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSavingsBankAccNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSavingsBankAccNoActionPerformed

    private void txtSavingsAccBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSavingsAccBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSavingsAccBalanceActionPerformed

    private void btnSaveBankInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveBankInfoActionPerformed
        // TODO add your handling code here:

        person.setSavingBankName(txtSavingsBankName.getText());
        person.setSavingBankAccountNumber(txtSavingsBankAccNo.getText());
        person.setSavingBankRoutingNumber(txtSavingsBankRoutingNo.getText());
        person.setSavingAccountBalance(txtSavingsAccBalance.getText());
        person.setIsSavingAccountType(checkBoxSavings.isSelected());

        JOptionPane.showMessageDialog(this, "Saving bank information saved successfully!");
    }//GEN-LAST:event_btnSaveBankInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveBankInfo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JCheckBox checkBoxSavings;
    private org.jdatepicker.DateComponentFormatter dateComponentFormatter1;
    private javax.swing.JLabel lblSavingsBankAccBalance;
    private javax.swing.JLabel lblSavingsBankAccNo;
    private javax.swing.JLabel lblSavingsBankName;
    private javax.swing.JLabel lblSavingsBankRoutingNo;
    private javax.swing.JLabel titleSavings;
    private javax.swing.JTextField txtSavingsAccBalance;
    private javax.swing.JTextField txtSavingsBankAccNo;
    private javax.swing.JTextField txtSavingsBankName;
    private javax.swing.JTextField txtSavingsBankRoutingNo;
    // End of variables declaration//GEN-END:variables
}
