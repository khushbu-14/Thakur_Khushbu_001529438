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
public class CreatePersonalInfoJPanel extends javax.swing.JPanel {

    Person person;
    
    /**
     * Creates new form PersonalInformationPanel
     */
    public CreatePersonalInfoJPanel(Person person) {
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
        tabBodyPersonalInformation = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        lblMobileNumber = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        lblSsn = new javax.swing.JLabel();
        txtSsn = new javax.swing.JTextField();
        btnSavePersonalInformation = new javax.swing.JButton();
        txtAge = new javax.swing.JSpinner();
        txtMobileNumber = new javax.swing.JFormattedTextField();
        txtDob = new org.jdatepicker.JDatePicker();

        lblFirstName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFirstName.setText("First Name");

        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        lblLastName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLastName.setText("Last Name");

        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        lblMobileNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMobileNumber.setText("Mobile Number");

        lblDateOfBirth.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDateOfBirth.setText("Date of birth");

        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAge.setText("Age");

        lblHeight.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblHeight.setText("Height (inches)");

        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });

        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        lblWeight.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblWeight.setText("Weight (pounds)");

        lblSsn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSsn.setText("Social Security Number");

        btnSavePersonalInformation.setBackground(new java.awt.Color(255, 255, 255));
        btnSavePersonalInformation.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnSavePersonalInformation.setText("Save");
        btnSavePersonalInformation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSavePersonalInformationActionPerformed(evt);
            }
        });

        txtAge.setModel(new javax.swing.SpinnerNumberModel(1, 1, 100, 1));
        txtAge.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtAgeKeyPressed(evt);
            }
        });

        try {
            txtMobileNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        javax.swing.GroupLayout tabBodyPersonalInformationLayout = new javax.swing.GroupLayout(tabBodyPersonalInformation);
        tabBodyPersonalInformation.setLayout(tabBodyPersonalInformationLayout);
        tabBodyPersonalInformationLayout.setHorizontalGroup(
            tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblMobileNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                                .addGap(28, 28, 28)
                                .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addComponent(lblSsn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(txtSsn, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(txtMobileNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                        .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                            .addComponent(txtDob, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addGap(15, 15, 15))
                    .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                        .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(txtHeight, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                        .addGap(12, 12, 12))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabBodyPersonalInformationLayout.createSequentialGroup()
                .addGap(307, 307, 307)
                .addComponent(btnSavePersonalInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addGap(231, 231, 231))
        );
        tabBodyPersonalInformationLayout.setVerticalGroup(
            tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                        .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtFirstName)
                                .addComponent(txtLastName)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(lblDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtMobileNumber)
                                .addComponent(lblMobileNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(txtDob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(8, 8, 8)
                        .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtAge)
                            .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                                .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(txtSsn)
                                    .addComponent(lblSsn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28))
                            .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                                .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(lblWeight))
                                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                        .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(159, 159, 159)))
                .addComponent(btnSavePersonalInformation, javax.swing.GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabBodyPersonalInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabBodyPersonalInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void btnSavePersonalInformationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSavePersonalInformationActionPerformed
        // TODO add your handling code here:
        
        person.setFirstName(txtFirstName.getText());
        person.setLastName(txtLastName.getText());
        person.setMobileNumber(txtMobileNumber.getText());
        String age = txtAge.getValue() + "";
        person.setAge(Integer.parseInt(age));
        
        person.setHeight(Float.parseFloat(txtHeight.getText()));
        person.setWeight(Float.parseFloat(txtWeight.getText()));
        person.setSsn(txtSsn.getText());
        person.setDateOfBirth(txtDob.getFormattedTextField().getText());
        
//        System.out.println(SimpleDateFormat.format(txtDob.getModel().getValue()));
//        String dob = dateFormat.format(txtDob.getValue());
//        int day = txtDob.getModel().getDay();
//        int month = txtDob.getModel().getMonth();
//        int year = txtDob.getModel().getYear();
        
//        person.setDobDay(txtDob.getModel().getDay());
//        person.setDobMonth(txtDob.getModel().getMonth());
//        person.setDobYear(txtDob.getModel().getYear());
        
//        System.out.println("" + day +"-"+ month +"-"+ year);
//        person.setDob(day +"-"+ month +"-"+ year);
        
        JOptionPane.showMessageDialog(this, "Personal Information saved successfully!");
    }//GEN-LAST:event_btnSavePersonalInformationActionPerformed

    private void txtAgeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAgeKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSavePersonalInformation;
    private org.jdatepicker.DateComponentFormatter dateComponentFormatter1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMobileNumber;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JPanel tabBodyPersonalInformation;
    private javax.swing.JSpinner txtAge;
    private org.jdatepicker.JDatePicker txtDob;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JFormattedTextField txtMobileNumber;
    private javax.swing.JTextField txtSsn;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables
}
