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
public class ViewReports extends javax.swing.JPanel {

    Person person;
    /**
     * Creates new form ViewReports
     */
    public ViewReports(Person person) {
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

        jPanel1 = new javax.swing.JPanel();
        lblFullName = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        lblDob2 = new javax.swing.JLabel();
        txtDob2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        txtDob3 = new javax.swing.JLabel();
        lblDob3 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        txtWeight = new javax.swing.JLabel();
        lblWeight = new javax.swing.JLabel();
        lblPicture = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        txtMobileNo = new javax.swing.JLabel();
        lblSsn = new javax.swing.JLabel();
        jPanel8 = new javax.swing.JPanel();
        txtSsn = new javax.swing.JLabel();
        lblSsn1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblDob = new javax.swing.JLabel();
        txtDob4 = new javax.swing.JLabel();
        jPanelStreetAddress = new javax.swing.JPanel();
        txtStreetAddress = new javax.swing.JLabel();
        lblDob1 = new javax.swing.JLabel();
        jPanelCity = new javax.swing.JPanel();
        txtCity = new javax.swing.JLabel();
        lblCity = new javax.swing.JLabel();
        jPanelState = new javax.swing.JPanel();
        txtState = new javax.swing.JLabel();
        lblState = new javax.swing.JLabel();
        jPanelState1 = new javax.swing.JPanel();
        txtState1 = new javax.swing.JLabel();
        lblState1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(243, 243, 243));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        lblFullName.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        lblFullName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFullName.setText("Khushbu Thakur");

        jPanel4.setBackground(new java.awt.Color(236, 236, 245));

        lblDob2.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblDob2.setForeground(new java.awt.Color(153, 153, 153));
        lblDob2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDob2.setText("Age");

        txtDob2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtDob2.setForeground(new java.awt.Color(51, 51, 51));
        txtDob2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDob2.setText("27");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDob2, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(txtDob2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDob2, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDob2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel5.setBackground(new java.awt.Color(236, 236, 245));

        txtDob3.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtDob3.setForeground(new java.awt.Color(51, 51, 51));
        txtDob3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtDob3.setText("5.5 inch");

        lblDob3.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblDob3.setForeground(new java.awt.Color(153, 153, 153));
        lblDob3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDob3.setText("Height");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDob3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtDob3, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDob3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDob3)
                .addContainerGap())
        );

        jPanel6.setBackground(new java.awt.Color(236, 236, 245));

        txtWeight.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        txtWeight.setForeground(new java.awt.Color(51, 51, 51));
        txtWeight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtWeight.setText("60 kg");

        lblWeight.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblWeight.setForeground(new java.awt.Color(153, 153, 153));
        lblWeight.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblWeight.setText("Weight");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 76, Short.MAX_VALUE)
                    .addComponent(lblWeight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblWeight)
                .addContainerGap())
        );

        lblPicture.setIcon(new javax.swing.ImageIcon("/Users/vaisansar/Desktop/Screenshot 2021-01-29 at 9.19.11 AM.png")); // NOI18N
        lblPicture.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        lblPicture.setMaximumSize(new java.awt.Dimension(120, 120));
        lblPicture.setMinimumSize(new java.awt.Dimension(120, 120));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        txtMobileNo.setForeground(new java.awt.Color(51, 51, 51));
        txtMobileNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtMobileNo.setText("123456789");

        lblSsn.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblSsn.setForeground(new java.awt.Color(153, 153, 153));
        lblSsn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSsn.setText("Mobile Number");
        lblSsn.setIconTextGap(10);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSsn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMobileNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addComponent(lblSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));

        txtSsn.setForeground(new java.awt.Color(51, 51, 51));
        txtSsn.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtSsn.setText("123456789");

        lblSsn1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblSsn1.setForeground(new java.awt.Color(153, 153, 153));
        lblSsn1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblSsn1.setText("Social Security Number");
        lblSsn1.setIconTextGap(10);

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblSsn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSsn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addContainerGap(14, Short.MAX_VALUE)
                .addComponent(lblSsn1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(lblFullName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jPanel4, jPanel5, jPanel6});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblPicture, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblFullName)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(193, Short.MAX_VALUE))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jPanel4, jPanel5, jPanel6});

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(177, 80));

        lblDob.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblDob.setForeground(new java.awt.Color(153, 153, 153));
        lblDob.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDob.setText("Birthday");

        txtDob4.setForeground(new java.awt.Color(51, 51, 51));
        txtDob4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtDob4.setText("14th Jan, 1994");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtDob4, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(lblDob, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblDob)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtDob4, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanelStreetAddress.setBackground(new java.awt.Color(255, 255, 255));
        jPanelStreetAddress.setPreferredSize(new java.awt.Dimension(177, 80));

        txtStreetAddress.setForeground(new java.awt.Color(51, 51, 51));
        txtStreetAddress.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtStreetAddress.setText("75 St. Alphonsus");

        lblDob1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblDob1.setForeground(new java.awt.Color(153, 153, 153));
        lblDob1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblDob1.setText("Street Address");

        javax.swing.GroupLayout jPanelStreetAddressLayout = new javax.swing.GroupLayout(jPanelStreetAddress);
        jPanelStreetAddress.setLayout(jPanelStreetAddressLayout);
        jPanelStreetAddressLayout.setHorizontalGroup(
            jPanelStreetAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStreetAddressLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelStreetAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtStreetAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(lblDob1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelStreetAddressLayout.setVerticalGroup(
            jPanelStreetAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStreetAddressLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblDob1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanelCity.setBackground(new java.awt.Color(255, 255, 255));
        jPanelCity.setPreferredSize(new java.awt.Dimension(177, 80));

        txtCity.setForeground(new java.awt.Color(51, 51, 51));
        txtCity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtCity.setText("75 St. Alphonsus");

        lblCity.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblCity.setForeground(new java.awt.Color(153, 153, 153));
        lblCity.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblCity.setText("City");

        javax.swing.GroupLayout jPanelCityLayout = new javax.swing.GroupLayout(jPanelCity);
        jPanelCity.setLayout(jPanelCityLayout);
        jPanelCityLayout.setHorizontalGroup(
            jPanelCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCityLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtCity, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(lblCity, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelCityLayout.setVerticalGroup(
            jPanelCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCityLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblCity)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanelState.setBackground(new java.awt.Color(255, 255, 255));
        jPanelState.setPreferredSize(new java.awt.Dimension(177, 80));

        txtState.setForeground(new java.awt.Color(51, 51, 51));
        txtState.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtState.setText("MA");

        lblState.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblState.setForeground(new java.awt.Color(153, 153, 153));
        lblState.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblState.setText("State");

        javax.swing.GroupLayout jPanelStateLayout = new javax.swing.GroupLayout(jPanelState);
        jPanelState.setLayout(jPanelStateLayout);
        jPanelStateLayout.setHorizontalGroup(
            jPanelStateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStateLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelStateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtState, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(lblState, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelStateLayout.setVerticalGroup(
            jPanelStateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelStateLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblState)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        jPanelState1.setBackground(new java.awt.Color(255, 255, 255));
        jPanelState1.setPreferredSize(new java.awt.Dimension(177, 80));

        txtState1.setForeground(new java.awt.Color(51, 51, 51));
        txtState1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        txtState1.setText("MA");

        lblState1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblState1.setForeground(new java.awt.Color(153, 153, 153));
        lblState1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblState1.setText("State");

        javax.swing.GroupLayout jPanelState1Layout = new javax.swing.GroupLayout(jPanelState1);
        jPanelState1.setLayout(jPanelState1Layout);
        jPanelState1Layout.setHorizontalGroup(
            jPanelState1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelState1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanelState1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtState1, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE)
                    .addComponent(lblState1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelState1Layout.setVerticalGroup(
            jPanelState1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelState1Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(lblState1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtState1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanelCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanelState1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanelStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelState1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanelCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanelCity;
    private javax.swing.JPanel jPanelState;
    private javax.swing.JPanel jPanelState1;
    private javax.swing.JPanel jPanelStreetAddress;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblDob1;
    private javax.swing.JLabel lblDob2;
    private javax.swing.JLabel lblDob3;
    private javax.swing.JLabel lblFullName;
    private javax.swing.JLabel lblPicture;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblSsn1;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblState1;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel txtCity;
    private javax.swing.JLabel txtDob2;
    private javax.swing.JLabel txtDob3;
    private javax.swing.JLabel txtDob4;
    private javax.swing.JLabel txtMobileNo;
    private javax.swing.JLabel txtSsn;
    private javax.swing.JLabel txtState;
    private javax.swing.JLabel txtState1;
    private javax.swing.JLabel txtStreetAddress;
    private javax.swing.JLabel txtWeight;
    // End of variables declaration//GEN-END:variables

    private void displayData() {
        
    }
}
