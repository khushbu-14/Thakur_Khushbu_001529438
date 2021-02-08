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
public class CreateAddressJPanel extends javax.swing.JPanel {
    Person person;
    /**
     * Creates new form CreateAddressJPanel
     */
    public CreateAddressJPanel(Person person) {
        initComponents();
        this.person = person;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tabBodyAddressInformation = new javax.swing.JPanel();
        lblZipcode = new javax.swing.JLabel();
        txtState = new javax.swing.JTextField();
        lblState = new javax.swing.JLabel();
        txtCity = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        lblStreetAddress = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtStreetAddress = new javax.swing.JTextArea();
        btnSaveAddressInfo = new javax.swing.JButton();
        txtzipcode = new javax.swing.JFormattedTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setBackground(new java.awt.Color(249, 244, 244));

        tabBodyAddressInformation.setBackground(new java.awt.Color(249, 244, 244));

        javax.swing.GroupLayout tabBodyAddressInformationLayout = new javax.swing.GroupLayout(tabBodyAddressInformation);
        tabBodyAddressInformation.setLayout(tabBodyAddressInformationLayout);
        tabBodyAddressInformationLayout.setHorizontalGroup(
            tabBodyAddressInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 979, Short.MAX_VALUE)
        );
        tabBodyAddressInformationLayout.setVerticalGroup(
            tabBodyAddressInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 312, Short.MAX_VALUE)
        );

        lblZipcode.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblZipcode.setText("Zipcode :");

        txtState.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblState.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblState.setText("State :");

        txtCity.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));

        lblCity.setBackground(new java.awt.Color(249, 244, 244));
        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCity.setText("City :");

        lblStreetAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblStreetAddress.setText("Street Address");

        txtStreetAddress.setColumns(4);
        txtStreetAddress.setRows(5);
        txtStreetAddress.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        jScrollPane2.setViewportView(txtStreetAddress);

        btnSaveAddressInfo.setBackground(new java.awt.Color(255, 255, 255));
        btnSaveAddressInfo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnSaveAddressInfo.setText("Save");
        btnSaveAddressInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, new java.awt.Color(238, 238, 238), java.awt.Color.white));
        btnSaveAddressInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveAddressInfoActionPerformed(evt);
            }
        });

        txtzipcode.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 10, true));
        txtzipcode.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#####"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(100, 100, 100)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSaveAddressInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtzipcode, javax.swing.GroupLayout.DEFAULT_SIZE, 317, Short.MAX_VALUE)
                            .addComponent(lblZipcode)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblCity)
                                .addComponent(txtCity)
                                .addComponent(lblState)
                                .addComponent(txtState, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                                .addComponent(lblStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jScrollPane2)))
                        .addGap(543, 543, 543)
                        .addComponent(tabBodyAddressInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txtState, txtzipcode});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(tabBodyAddressInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lblStreetAddress)
                        .addGap(12, 12, 12)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblCity)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblState)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lblZipcode)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtzipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(btnSaveAddressInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {txtCity, txtState, txtzipcode});

    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveAddressInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveAddressInfoActionPerformed
        // TODO add your handling code here:
        person.setStreetAddress(txtStreetAddress.getText());
        person.setCity(txtCity.getText());
        person.setState(txtState.getText());
        person.setZipcode(txtzipcode.getText());
        JOptionPane.showMessageDialog(this, "Address Information saved successfully!");
    }//GEN-LAST:event_btnSaveAddressInfoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveAddressInfo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreetAddress;
    private javax.swing.JLabel lblZipcode;
    private javax.swing.JPanel tabBodyAddressInformation;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtState;
    private javax.swing.JTextArea txtStreetAddress;
    private javax.swing.JFormattedTextField txtzipcode;
    // End of variables declaration//GEN-END:variables
}
