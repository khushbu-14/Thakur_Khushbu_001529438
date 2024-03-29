/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import model.Person;
import model.PersonalInformation;

/**
 *
 * @author khushbu
 */
public class ViewPersonalInfoJPanel1 extends javax.swing.JPanel {

    Person person;
    PersonalInformation personalInformation;
    
    /**
     * Creates new form PersonalInformationPanel
     * @param personalInformation
     */
    public ViewPersonalInfoJPanel1(PersonalInformation personalInformation) {
        initComponents();
        this.personalInformation = personalInformation;
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
        tabBodyPersonalInformation = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JTextField();
        lblMobileNumber = new javax.swing.JLabel();
        lblAge = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JFormattedTextField();
        lblLastName = new javax.swing.JLabel();
        txtDateOfBirth = new javax.swing.JTextField();
        lblAge1 = new javax.swing.JLabel();
        lblDateOfBirth = new javax.swing.JLabel();
        txtHeight = new javax.swing.JTextField();
        lblHeight = new javax.swing.JLabel();
        txtSsn = new javax.swing.JTextField();
        lblSsn = new javax.swing.JLabel();
        txtWeight = new javax.swing.JTextField();
        lblWeight = new javax.swing.JLabel();
        txtLastName = new javax.swing.JTextField();
        txtAge = new javax.swing.JTextField();
        titleChecking = new javax.swing.JLabel();

        setBackground(new java.awt.Color(249, 244, 244));

        tabBodyPersonalInformation.setBackground(new java.awt.Color(246, 243, 243));

        lblFirstName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblFirstName.setText("First Name");

        txtFirstName.setEditable(false);
        txtFirstName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtFirstName.setBounds(new java.awt.Rectangle(10, 10, 0, 0));
        txtFirstName.setFocusTraversalKeysEnabled(false);
        txtFirstName.setFocusable(false);
        txtFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFirstNameActionPerformed(evt);
            }
        });

        lblMobileNumber.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMobileNumber.setText("Mobile Number");

        lblAge.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAge.setText("Age");

        txtMobileNumber.setEditable(false);
        txtMobileNumber.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        try {
            txtMobileNumber.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###-###-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        txtMobileNumber.setFocusTraversalKeysEnabled(false);
        txtMobileNumber.setFocusable(false);

        lblLastName.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLastName.setText("Last Name");

        txtDateOfBirth.setEditable(false);
        txtDateOfBirth.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtDateOfBirth.setBounds(new java.awt.Rectangle(10, 10, 0, 0));
        txtDateOfBirth.setFocusTraversalKeysEnabled(false);
        txtDateOfBirth.setFocusable(false);
        txtDateOfBirth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateOfBirthActionPerformed(evt);
            }
        });

        lblAge1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblAge1.setText("Age");

        lblDateOfBirth.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblDateOfBirth.setText("Date of Birth");

        txtHeight.setEditable(false);
        txtHeight.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtHeight.setBounds(new java.awt.Rectangle(10, 10, 0, 0));
        txtHeight.setFocusTraversalKeysEnabled(false);
        txtHeight.setFocusable(false);
        txtHeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHeightActionPerformed(evt);
            }
        });

        lblHeight.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblHeight.setText("Height (inches)");

        txtSsn.setEditable(false);
        txtSsn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtSsn.setBounds(new java.awt.Rectangle(10, 10, 0, 0));
        txtSsn.setFocusTraversalKeysEnabled(false);
        txtSsn.setFocusable(false);
        txtSsn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSsnActionPerformed(evt);
            }
        });

        lblSsn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSsn.setText("Social Security Number");

        txtWeight.setEditable(false);
        txtWeight.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtWeight.setBounds(new java.awt.Rectangle(10, 10, 0, 0));
        txtWeight.setFocusTraversalKeysEnabled(false);
        txtWeight.setFocusable(false);
        txtWeight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtWeightActionPerformed(evt);
            }
        });

        lblWeight.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblWeight.setText("Weight (Kgs)");

        txtLastName.setEditable(false);
        txtLastName.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtLastName.setBounds(new java.awt.Rectangle(10, 10, 0, 0));
        txtLastName.setFocusTraversalKeysEnabled(false);
        txtLastName.setFocusable(false);
        txtLastName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLastNameActionPerformed(evt);
            }
        });

        txtAge.setEditable(false);
        txtAge.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtAge.setBounds(new java.awt.Rectangle(10, 10, 0, 0));
        txtAge.setFocusTraversalKeysEnabled(false);
        txtAge.setFocusable(false);
        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        titleChecking.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        titleChecking.setText("View Personal Information");

        javax.swing.GroupLayout tabBodyPersonalInformationLayout = new javax.swing.GroupLayout(tabBodyPersonalInformation);
        tabBodyPersonalInformation.setLayout(tabBodyPersonalInformationLayout);
        tabBodyPersonalInformationLayout.setHorizontalGroup(
            tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtSsn, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txtMobileNumber, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                        .addComponent(lblFirstName)
                        .addComponent(txtFirstName)
                        .addComponent(lblMobileNumber))
                    .addComponent(lblSsn)
                    .addComponent(txtAge))
                .addGap(100, 100, 100)
                .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE)
                    .addComponent(lblLastName)
                    .addComponent(txtDateOfBirth)
                    .addComponent(lblDateOfBirth)
                    .addComponent(lblHeight)
                    .addComponent(txtHeight)
                    .addComponent(lblAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtLastName))
                .addGap(62, 62, 62))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabBodyPersonalInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleChecking)
                .addGap(253, 253, 253))
        );

        tabBodyPersonalInformationLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtAge, txtDateOfBirth, txtFirstName, txtHeight, txtLastName, txtMobileNumber, txtSsn, txtWeight});

        tabBodyPersonalInformationLayout.setVerticalGroup(
            tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabBodyPersonalInformationLayout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(titleChecking)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                        .addComponent(lblLastName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lblHeight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblWeight))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabBodyPersonalInformationLayout.createSequentialGroup()
                        .addComponent(lblFirstName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblMobileNumber)
                        .addGap(18, 18, 18)
                        .addComponent(txtMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24)
                        .addComponent(lblSsn)))
                .addGroup(tabBodyPersonalInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(tabBodyPersonalInformationLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(123, 123, 123)
                .addComponent(lblAge1, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabBodyPersonalInformationLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtAge, txtDateOfBirth, txtFirstName, txtHeight, txtLastName, txtMobileNumber, txtSsn, txtWeight});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabBodyPersonalInformation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(tabBodyPersonalInformation, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 6, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtWeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtWeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtWeightActionPerformed

    private void txtSsnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSsnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSsnActionPerformed

    private void txtHeightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHeightActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHeightActionPerformed

    private void txtDateOfBirthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateOfBirthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateOfBirthActionPerformed

    private void txtFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFirstNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFirstNameActionPerformed

    private void txtLastNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLastNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLastNameActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdatepicker.DateComponentFormatter dateComponentFormatter1;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblAge1;
    private javax.swing.JLabel lblDateOfBirth;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMobileNumber;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JPanel tabBodyPersonalInformation;
    private javax.swing.JLabel titleChecking;
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
        txtFirstName.setText(personalInformation.getFirstName());
        txtLastName.setText(personalInformation.getLastName());
        txtDateOfBirth.setText(personalInformation.getLastName());
        txtMobileNumber.setText(personalInformation.getMobileNumber());
        txtAge.setText(Integer.toString(personalInformation.getAge()));
        txtHeight.setText(Float.toString(personalInformation.getHeight()));
        txtWeight.setText(Float.toString(personalInformation.getWeight()));
        txtSsn.setText(personalInformation.getSsn());
        txtDateOfBirth.setText(personalInformation.getDateOfBirth());
    }
}
