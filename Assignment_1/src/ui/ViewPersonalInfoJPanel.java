/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import model.Person;

/**
 *
 * @author khushbu
 */
public class ViewPersonalInfoJPanel extends javax.swing.JPanel {

    Person person;
    
    /**
     * Creates new form PersonalInformationPanel
     */
    
    public ViewPersonalInfoJPanel(Person person) {
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

        tabBodyPersonalInformation = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblLastName = new javax.swing.JLabel();
        txtDateOfBirth = new javax.swing.JTextField();
        lblMobileNumber = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        lblHeight = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        txtWeight = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        lblSsn = new javax.swing.JLabel();
        txtSsn = new javax.swing.JTextField();
        txtMobileNumber = new javax.swing.JFormattedTextField();
        txtLastName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();

        lblFirstName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFirstName.setText("First Name");

        txtFirstName.setEditable(false);
        txtFirstName.setFocusTraversalKeysEnabled(false);
        txtFirstName.setFocusable(false);
        txtFirstName.setRequestFocusEnabled(false);
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        lblLastName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblLastName.setText("Last Name");

        txtDateOfBirth.setEditable(false);
        txtDateOfBirth.setFocusTraversalKeysEnabled(false);
        txtDateOfBirth.setFocusable(false);
        txtDateOfBirth.setRequestFocusEnabled(false);
        txtDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfBirthActionPerformed(evt);
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

        txtHeight.setEditable(false);
        txtHeight.setFocusTraversalKeysEnabled(false);
        txtHeight.setFocusable(false);
        txtHeight.setRequestFocusEnabled(false);
        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });

        txtWeight.setEditable(false);
        txtWeight.setFocusTraversalKeysEnabled(false);
        txtWeight.setFocusable(false);
        txtWeight.setRequestFocusEnabled(false);
        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        lblWeight.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblWeight.setText("Weight (pounds)");

        lblSsn.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblSsn.setText("Social Security Number");

        txtSsn.setEditable(false);
        txtSsn.setFocusTraversalKeysEnabled(false);
        txtSsn.setFocusable(false);
        txtSsn.setRequestFocusEnabled(false);

        txtMobileNumber.setEditable(false);
        try {
            txtMobileNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtMobileNumber.setFocusTraversalKeysEnabled(false);
        txtMobileNumber.setFocusable(false);
        txtMobileNumber.setRequestFocusEnabled(false);

        txtLastName.setEditable(false);
        txtLastName.setFocusTraversalKeysEnabled(false);
        txtLastName.setFocusable(false);
        txtLastName.setRequestFocusEnabled(false);
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        txtAge.setEditable(false);
        txtAge.setFocusTraversalKeysEnabled(false);
        txtAge.setFocusable(false);
        txtAge.setRequestFocusEnabled(false);

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
                                .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(lblSsn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(12, 12, 12)
                .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtSsn, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(txtFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(txtMobileNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                    .addComponent(txtAge, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                .addGap(44, 44, 44)
                .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                        .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(lblDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                                .addComponent(txtDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                                .addGap(9, 9, 9))
                            .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                                .addComponent(txtLastName, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                                .addContainerGap())))
                    .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                        .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblHeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblWeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE)
                            .addComponent(txtHeight, javax.swing.GroupLayout.DEFAULT_SIZE, 189, Short.MAX_VALUE))
                        .addGap(12, 12, 12))))
        );
        tabBodyPersonalInformationLayout.setVerticalGroup(
            tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblLastName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtLastName)))
                    .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtFirstName)
                        .addComponent(lblFirstName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDateOfBirth, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                            .addComponent(txtDateOfBirth)))
                    .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtMobileNumber)
                        .addComponent(lblMobileNumber, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(8, 8, 8)
                .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge))
                .addGap(12, 12, 12)
                .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtSsn)
                        .addComponent(lblSsn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(lblWeight))
                    .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
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

    private void txtDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfBirthActionPerformed

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMobileNumber;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JPanel tabBodyPersonalInformation;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtDateOfBirth;
    private javax.swing.JTextField txtFirstName;
    private javax.swing.JTextField txtHeight;
    private javax.swing.JTextField txtLastName;
    private javax.swing.JFormattedTextField txtMobileNumber;
    private javax.swing.JTextField txtSsn;
    private javax.swing.JTextField txtWeight;
    // End of variables declaration//GEN-END:variables

    private void displayData() {
        txtFirstName.setText(person.getFirstName());
        txtLastName.setText(person.getLastName());
        txtMobileNumber.setText(person.getMobileNumber());
        txtAge.setText(Integer.toString(person.getAge()));
        txtHeight.setText(Float.toString(person.getHeight()));
        txtWeight.setText(Float.toString(person.getWeight()));
        txtSsn.setText(person.getSsn());
        txtDateOfBirth.setText(person.getDateOfBirth());
    }
    
//    public void displayPersonalInformation(){
//        System.out.println("displayPersonalInformation called");
//        System.out.println(person.getFirstName());
//        displayData(); 
//    }
}
