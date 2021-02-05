/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import model.Person;

/**
 *
 * @author khushbu
 */
public class ViewBankInfoJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewBankInfoJPanel
     */
    
    Person person;
    public ViewBankInfoJPanel(Person person) {
        initComponents();
        this.person = person;
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

        tabBodyBankInformation = new javax.swing.JPanel();
        jSplitPaneBankInfo = new javax.swing.JSplitPane();
        jPanelSavings = new javax.swing.JPanel();
        txtSavingsBankName = new javax.swing.JTextField();
        lblSavingsBankName = new javax.swing.JLabel();
        lblSavingsBankRoutingNo = new javax.swing.JLabel();
        txtSavingsBankRoutingNo = new javax.swing.JTextField();
        titleSavings = new javax.swing.JLabel();
        lblSavingsBankAccNo = new javax.swing.JLabel();
        txtSavingsBankAccNo = new javax.swing.JTextField();
        checkBoxSavings = new javax.swing.JCheckBox();
        txtSavingsAccBalance = new javax.swing.JTextField();
        lblSavingsBankAccBalance = new javax.swing.JLabel();
        jPanelChecking = new javax.swing.JPanel();
        lblCheckingBankName = new javax.swing.JLabel();
        txtCheckingBankName = new javax.swing.JTextField();
        checkBoxChecking = new javax.swing.JCheckBox();
        txtCheckingBankRoutingNo = new javax.swing.JTextField();
        titleChecking = new javax.swing.JLabel();
        txtCheckingBankAccNo = new javax.swing.JTextField();
        lblCheckingBankAccNo = new javax.swing.JLabel();
        lblSCheckingBankRoutingNo = new javax.swing.JLabel();
        txtCheckingAccBalance = new javax.swing.JTextField();
        lblCheckingBankAccBalance = new javax.swing.JLabel();

        jSplitPaneBankInfo.setDividerLocation(250);
        jSplitPaneBankInfo.setDividerSize(10);
        jSplitPaneBankInfo.setResizeWeight(0.5);

        jPanelSavings.setEnabled(false);

        txtSavingsBankName.setFocusTraversalKeysEnabled(false);
        txtSavingsBankName.setFocusable(false);
        txtSavingsBankName.setRequestFocusEnabled(false);
        txtSavingsBankName.setVerifyInputWhenFocusTarget(false);
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

        txtSavingsBankRoutingNo.setFocusTraversalKeysEnabled(false);
        txtSavingsBankRoutingNo.setFocusable(false);
        txtSavingsBankRoutingNo.setRequestFocusEnabled(false);
        txtSavingsBankRoutingNo.setVerifyInputWhenFocusTarget(false);
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

        txtSavingsBankAccNo.setFocusTraversalKeysEnabled(false);
        txtSavingsBankAccNo.setFocusable(false);
        txtSavingsBankAccNo.setRequestFocusEnabled(false);
        txtSavingsBankAccNo.setVerifyInputWhenFocusTarget(false);
        txtSavingsBankAccNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSavingsBankAccNoActionPerformed(evt);
            }
        });

        checkBoxSavings.setText("Savings Bank Account");
        checkBoxSavings.setFocusTraversalKeysEnabled(false);
        checkBoxSavings.setFocusable(false);
        checkBoxSavings.setRequestFocusEnabled(false);
        checkBoxSavings.setVerifyInputWhenFocusTarget(false);

        txtSavingsAccBalance.setFocusTraversalKeysEnabled(false);
        txtSavingsAccBalance.setFocusable(false);
        txtSavingsAccBalance.setRequestFocusEnabled(false);
        txtSavingsAccBalance.setVerifyInputWhenFocusTarget(false);
        txtSavingsAccBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSavingsAccBalanceActionPerformed(evt);
            }
        });

        lblSavingsBankAccBalance.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblSavingsBankAccBalance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSavingsBankAccBalance.setText("Account Balance");

        javax.swing.GroupLayout jPanelSavingsLayout = new javax.swing.GroupLayout(jPanelSavings);
        jPanelSavings.setLayout(jPanelSavingsLayout);
        jPanelSavingsLayout.setHorizontalGroup(
            jPanelSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSavingsLayout.createSequentialGroup()
                .addGroup(jPanelSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblSavingsBankRoutingNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleSavings)
                            .addComponent(lblSavingsBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanelSavingsLayout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanelSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanelSavingsLayout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(lblSavingsBankAccBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanelSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtSavingsBankName)
                                    .addComponent(txtSavingsBankRoutingNo, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(lblSavingsBankAccNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtSavingsBankAccNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                    .addComponent(checkBoxSavings, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(jPanelSavingsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtSavingsAccBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSavingsLayout.setVerticalGroup(
            jPanelSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSavingsLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(titleSavings)
                .addGap(18, 18, 18)
                .addComponent(lblSavingsBankName, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSavingsBankName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSavingsBankRoutingNo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSavingsBankRoutingNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSavingsBankAccNo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSavingsBankAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblSavingsBankAccBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(txtSavingsAccBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkBoxSavings)
                .addGap(15, 15, 15))
        );

        jSplitPaneBankInfo.setLeftComponent(jPanelSavings);

        jPanelChecking.setEnabled(false);

        lblCheckingBankName.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblCheckingBankName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCheckingBankName.setText("Bank Name");

        txtCheckingBankName.setFocusTraversalKeysEnabled(false);
        txtCheckingBankName.setFocusable(false);
        txtCheckingBankName.setRequestFocusEnabled(false);
        txtCheckingBankName.setVerifyInputWhenFocusTarget(false);
        txtCheckingBankName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckingBankNameActionPerformed(evt);
            }
        });

        checkBoxChecking.setText("Checking Bank Account");
        checkBoxChecking.setFocusTraversalKeysEnabled(false);
        checkBoxChecking.setFocusable(false);
        checkBoxChecking.setRequestFocusEnabled(false);
        checkBoxChecking.setVerifyInputWhenFocusTarget(false);

        txtCheckingBankRoutingNo.setFocusTraversalKeysEnabled(false);
        txtCheckingBankRoutingNo.setFocusable(false);
        txtCheckingBankRoutingNo.setRequestFocusEnabled(false);
        txtCheckingBankRoutingNo.setVerifyInputWhenFocusTarget(false);
        txtCheckingBankRoutingNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckingBankRoutingNoActionPerformed(evt);
            }
        });

        titleChecking.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        titleChecking.setText("Checking Account Details");

        txtCheckingBankAccNo.setFocusTraversalKeysEnabled(false);
        txtCheckingBankAccNo.setFocusable(false);
        txtCheckingBankAccNo.setRequestFocusEnabled(false);
        txtCheckingBankAccNo.setVerifyInputWhenFocusTarget(false);
        txtCheckingBankAccNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckingBankAccNoActionPerformed(evt);
            }
        });

        lblCheckingBankAccNo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblCheckingBankAccNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCheckingBankAccNo.setText("Bank Account Number");

        lblSCheckingBankRoutingNo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblSCheckingBankRoutingNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSCheckingBankRoutingNo.setText("Bank Routing Number");

        txtCheckingAccBalance.setFocusTraversalKeysEnabled(false);
        txtCheckingAccBalance.setFocusable(false);
        txtCheckingAccBalance.setRequestFocusEnabled(false);
        txtCheckingAccBalance.setVerifyInputWhenFocusTarget(false);
        txtCheckingAccBalance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckingAccBalanceActionPerformed(evt);
            }
        });

        lblCheckingBankAccBalance.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblCheckingBankAccBalance.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCheckingBankAccBalance.setText("Account Balance");

        javax.swing.GroupLayout jPanelCheckingLayout = new javax.swing.GroupLayout(jPanelChecking);
        jPanelChecking.setLayout(jPanelCheckingLayout);
        jPanelCheckingLayout.setHorizontalGroup(
            jPanelCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCheckingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblSCheckingBankRoutingNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titleChecking)
                            .addComponent(lblCheckingBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(lblCheckingBankAccNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtCheckingBankAccNo, javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(checkBoxChecking, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                        .addComponent(txtCheckingBankName)
                        .addComponent(txtCheckingBankRoutingNo))
                    .addGroup(jPanelCheckingLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblCheckingBankAccBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCheckingAccBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelCheckingLayout.setVerticalGroup(
            jPanelCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCheckingLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(titleChecking)
                .addGap(18, 18, 18)
                .addComponent(lblCheckingBankName, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCheckingBankName, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblSCheckingBankRoutingNo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCheckingBankRoutingNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblCheckingBankAccNo, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCheckingBankAccNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(lblCheckingBankAccBalance, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(txtCheckingAccBalance, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(checkBoxChecking)
                .addGap(14, 14, 14))
        );

        jSplitPaneBankInfo.setRightComponent(jPanelChecking);

        javax.swing.GroupLayout tabBodyBankInformationLayout = new javax.swing.GroupLayout(tabBodyBankInformation);
        tabBodyBankInformation.setLayout(tabBodyBankInformationLayout);
        tabBodyBankInformationLayout.setHorizontalGroup(
            tabBodyBankInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBodyBankInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSplitPaneBankInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addContainerGap())
        );
        tabBodyBankInformationLayout.setVerticalGroup(
            tabBodyBankInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBodyBankInformationLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSplitPaneBankInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(tabBodyBankInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabBodyBankInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 31, Short.MAX_VALUE))
        );
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

    private void txtCheckingBankNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckingBankNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckingBankNameActionPerformed

    private void txtCheckingBankRoutingNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckingBankRoutingNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckingBankRoutingNoActionPerformed

    private void txtCheckingBankAccNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckingBankAccNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckingBankAccNoActionPerformed

    private void txtCheckingAccBalanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckingAccBalanceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckingAccBalanceActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox checkBoxChecking;
    private javax.swing.JCheckBox checkBoxSavings;
    private javax.swing.JPanel jPanelChecking;
    private javax.swing.JPanel jPanelSavings;
    private javax.swing.JSplitPane jSplitPaneBankInfo;
    private javax.swing.JLabel lblCheckingBankAccBalance;
    private javax.swing.JLabel lblCheckingBankAccNo;
    private javax.swing.JLabel lblCheckingBankName;
    private javax.swing.JLabel lblSCheckingBankRoutingNo;
    private javax.swing.JLabel lblSavingsBankAccBalance;
    private javax.swing.JLabel lblSavingsBankAccNo;
    private javax.swing.JLabel lblSavingsBankName;
    private javax.swing.JLabel lblSavingsBankRoutingNo;
    private javax.swing.JPanel tabBodyBankInformation;
    private javax.swing.JLabel titleChecking;
    private javax.swing.JLabel titleSavings;
    private javax.swing.JTextField txtCheckingAccBalance;
    private javax.swing.JTextField txtCheckingBankAccNo;
    private javax.swing.JTextField txtCheckingBankName;
    private javax.swing.JTextField txtCheckingBankRoutingNo;
    private javax.swing.JTextField txtSavingsAccBalance;
    private javax.swing.JTextField txtSavingsBankAccNo;
    private javax.swing.JTextField txtSavingsBankName;
    private javax.swing.JTextField txtSavingsBankRoutingNo;
    // End of variables declaration//GEN-END:variables

    private void displayData() {
//        jPanelSavings.
        jPanelSavings.enableInputMethods(false);
        jPanelChecking.enableInputMethods(false);
        
        jPanelSavings.setEnabled(false);
        jPanelChecking.setEnabled(false);
        
        txtSavingsBankName.setText(person.getSavingBankName());
        txtSavingsBankAccNo.setText(person.getSavingBankAccountNumber());
        txtSavingsAccBalance.setText(person.getSavingAccountBalance());
        checkBoxSavings.setSelected(person.isIsSavingAccountType());
        
//        System.out.println(person.isIsSavingAccountType() + " savings view");
        
        txtCheckingBankName.setText(person.getCheckingBankName());
        txtCheckingBankAccNo.setText(person.getCheckingBankAccountNumber());
        txtCheckingAccBalance.setText(person.getCheckingAccountBalance());
        checkBoxChecking.setSelected(person.isIsCheckingAccountType());
        
//        System.out.println(person.isIsCheckingAccountType() + " checking view");
    }
}
