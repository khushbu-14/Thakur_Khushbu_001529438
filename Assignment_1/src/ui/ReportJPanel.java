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
public class ReportJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ReportJPanel
     */
    
    Person person;
    
    public ReportJPanel(Person person) {
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

        panePersonalInfo = new javax.swing.JPanel();
        lblTitlePersonalInfo = new javax.swing.JLabel();
        jPaneFirstName = new javax.swing.JPanel();
        lblFirstName = new javax.swing.JLabel();
        txtFirstName = new javax.swing.JLabel();
        jPaneLastName = new javax.swing.JPanel();
        lblLastName = new javax.swing.JLabel();
        txtLastName = new javax.swing.JLabel();
        jPaneMobileNo = new javax.swing.JPanel();
        lblMobileNo = new javax.swing.JLabel();
        txtMobileNumber = new javax.swing.JLabel();
        jPaneDob = new javax.swing.JPanel();
        lblDob = new javax.swing.JLabel();
        txtDateOfBirth = new javax.swing.JLabel();
        jPaneAge = new javax.swing.JPanel();
        lblAge = new javax.swing.JLabel();
        txtAge = new javax.swing.JLabel();
        jPaneHeight = new javax.swing.JPanel();
        lblHeight = new javax.swing.JLabel();
        txtHeight = new javax.swing.JLabel();
        jPaneWeight = new javax.swing.JPanel();
        lblWeight = new javax.swing.JLabel();
        txtWeight = new javax.swing.JLabel();
        jPaneSsn = new javax.swing.JPanel();
        lblSsn = new javax.swing.JLabel();
        txtSsn = new javax.swing.JLabel();
        paneBankInfo = new javax.swing.JPanel();
        lblTitleAddressInfo = new javax.swing.JLabel();
        jPaneStreetAddress = new javax.swing.JPanel();
        lblStreetAddress = new javax.swing.JLabel();
        txtStreetAddress = new javax.swing.JLabel();
        jPaneCity = new javax.swing.JPanel();
        lblCity = new javax.swing.JLabel();
        txtCity = new javax.swing.JLabel();
        jPaneState = new javax.swing.JPanel();
        lblState = new javax.swing.JLabel();
        txtState = new javax.swing.JLabel();
        jPaneZipcode = new javax.swing.JPanel();
        lblZipcode = new javax.swing.JLabel();
        txtZipcode = new javax.swing.JLabel();

        panePersonalInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTitlePersonalInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitlePersonalInfo.setLabelFor(panePersonalInfo);
        lblTitlePersonalInfo.setText("Personal Information");
        lblTitlePersonalInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTitlePersonalInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblFirstName.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblFirstName.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblFirstName.setText("First Name : ");

        javax.swing.GroupLayout jPaneFirstNameLayout = new javax.swing.GroupLayout(jPaneFirstName);
        jPaneFirstName.setLayout(jPaneFirstNameLayout);
        jPaneFirstNameLayout.setHorizontalGroup(
            jPaneFirstNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneFirstNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblFirstName)
                .addGap(18, 18, 18)
                .addComponent(txtFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPaneFirstNameLayout.setVerticalGroup(
            jPaneFirstNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneFirstNameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneFirstNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFirstName)
                    .addComponent(txtFirstName))
                .addContainerGap())
        );

        lblLastName.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblLastName.setText("Last Name : ");

        javax.swing.GroupLayout jPaneLastNameLayout = new javax.swing.GroupLayout(jPaneLastName);
        jPaneLastName.setLayout(jPaneLastNameLayout);
        jPaneLastNameLayout.setHorizontalGroup(
            jPaneLastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneLastNameLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPaneLastNameLayout.setVerticalGroup(
            jPaneLastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneLastNameLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneLastNameLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblLastName)
                    .addComponent(txtLastName))
                .addContainerGap())
        );

        lblMobileNo.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblMobileNo.setText("Mobile Number :");

        javax.swing.GroupLayout jPaneMobileNoLayout = new javax.swing.GroupLayout(jPaneMobileNo);
        jPaneMobileNo.setLayout(jPaneMobileNoLayout);
        jPaneMobileNoLayout.setHorizontalGroup(
            jPaneMobileNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneMobileNoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtMobileNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPaneMobileNoLayout.setVerticalGroup(
            jPaneMobileNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneMobileNoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneMobileNoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMobileNo)
                    .addComponent(txtMobileNumber))
                .addContainerGap())
        );

        lblDob.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblDob.setText("Date of birth :");

        javax.swing.GroupLayout jPaneDobLayout = new javax.swing.GroupLayout(jPaneDob);
        jPaneDob.setLayout(jPaneDobLayout);
        jPaneDobLayout.setHorizontalGroup(
            jPaneDobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneDobLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblDob, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtDateOfBirth, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPaneDobLayout.setVerticalGroup(
            jPaneDobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneDobLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneDobLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblDob)
                    .addComponent(txtDateOfBirth))
                .addContainerGap())
        );

        lblAge.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblAge.setText("Age :");

        javax.swing.GroupLayout jPaneAgeLayout = new javax.swing.GroupLayout(jPaneAge);
        jPaneAge.setLayout(jPaneAgeLayout);
        jPaneAgeLayout.setHorizontalGroup(
            jPaneAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneAgeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAge, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPaneAgeLayout.setVerticalGroup(
            jPaneAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneAgeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneAgeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAge)
                    .addComponent(txtAge))
                .addContainerGap())
        );

        lblHeight.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblHeight.setText("Height :");

        javax.swing.GroupLayout jPaneHeightLayout = new javax.swing.GroupLayout(jPaneHeight);
        jPaneHeight.setLayout(jPaneHeightLayout);
        jPaneHeightLayout.setHorizontalGroup(
            jPaneHeightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneHeightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtHeight, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPaneHeightLayout.setVerticalGroup(
            jPaneHeightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneHeightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneHeightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHeight)
                    .addComponent(txtHeight))
                .addContainerGap())
        );

        lblWeight.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblWeight.setText("Weight :");

        javax.swing.GroupLayout jPaneWeightLayout = new javax.swing.GroupLayout(jPaneWeight);
        jPaneWeight.setLayout(jPaneWeightLayout);
        jPaneWeightLayout.setHorizontalGroup(
            jPaneWeightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneWeightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtWeight, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPaneWeightLayout.setVerticalGroup(
            jPaneWeightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneWeightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneWeightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblWeight)
                    .addComponent(txtWeight))
                .addContainerGap())
        );

        lblSsn.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblSsn.setText("Social Security Number :");

        javax.swing.GroupLayout jPaneSsnLayout = new javax.swing.GroupLayout(jPaneSsn);
        jPaneSsn.setLayout(jPaneSsnLayout);
        jPaneSsnLayout.setHorizontalGroup(
            jPaneSsnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneSsnLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtSsn, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPaneSsnLayout.setVerticalGroup(
            jPaneSsnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneSsnLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneSsnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSsn)
                    .addComponent(txtSsn))
                .addContainerGap())
        );

        javax.swing.GroupLayout panePersonalInfoLayout = new javax.swing.GroupLayout(panePersonalInfo);
        panePersonalInfo.setLayout(panePersonalInfoLayout);
        panePersonalInfoLayout.setHorizontalGroup(
            panePersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitlePersonalInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panePersonalInfoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(panePersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPaneSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPaneWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPaneHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPaneAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPaneDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPaneMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPaneLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPaneFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        panePersonalInfoLayout.setVerticalGroup(
            panePersonalInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panePersonalInfoLayout.createSequentialGroup()
                .addComponent(lblTitlePersonalInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPaneFirstName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPaneLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPaneMobileNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaneDob, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaneAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaneHeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaneWeight, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaneSsn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        paneBankInfo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblTitleAddressInfo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblTitleAddressInfo.setLabelFor(panePersonalInfo);
        lblTitleAddressInfo.setText("Address Information");
        lblTitleAddressInfo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        lblTitleAddressInfo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblStreetAddress.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblStreetAddress.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblStreetAddress.setText("Street Address : ");

        javax.swing.GroupLayout jPaneStreetAddressLayout = new javax.swing.GroupLayout(jPaneStreetAddress);
        jPaneStreetAddress.setLayout(jPaneStreetAddressLayout);
        jPaneStreetAddressLayout.setHorizontalGroup(
            jPaneStreetAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneStreetAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblStreetAddress)
                .addGap(18, 18, 18)
                .addComponent(txtStreetAddress, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPaneStreetAddressLayout.setVerticalGroup(
            jPaneStreetAddressLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneStreetAddressLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblStreetAddress)
                .addContainerGap(33, Short.MAX_VALUE))
            .addGroup(jPaneStreetAddressLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtStreetAddress, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        lblCity.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblCity.setText("City : ");

        javax.swing.GroupLayout jPaneCityLayout = new javax.swing.GroupLayout(jPaneCity);
        jPaneCity.setLayout(jPaneCityLayout);
        jPaneCityLayout.setHorizontalGroup(
            jPaneCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneCityLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCity, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCity, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPaneCityLayout.setVerticalGroup(
            jPaneCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneCityLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneCityLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(txtCity))
                .addContainerGap())
        );

        lblState.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblState.setText("State :");

        javax.swing.GroupLayout jPaneStateLayout = new javax.swing.GroupLayout(jPaneState);
        jPaneState.setLayout(jPaneStateLayout);
        jPaneStateLayout.setHorizontalGroup(
            jPaneStateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneStateLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblState, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtState, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPaneStateLayout.setVerticalGroup(
            jPaneStateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneStateLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneStateLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblState)
                    .addComponent(txtState))
                .addContainerGap())
        );

        lblZipcode.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        lblZipcode.setText("Zipcode :");

        javax.swing.GroupLayout jPaneZipcodeLayout = new javax.swing.GroupLayout(jPaneZipcode);
        jPaneZipcode.setLayout(jPaneZipcodeLayout);
        jPaneZipcodeLayout.setHorizontalGroup(
            jPaneZipcodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneZipcodeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPaneZipcodeLayout.setVerticalGroup(
            jPaneZipcodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPaneZipcodeLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPaneZipcodeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZipcode)
                    .addComponent(txtZipcode))
                .addContainerGap())
        );

        javax.swing.GroupLayout paneBankInfoLayout = new javax.swing.GroupLayout(paneBankInfo);
        paneBankInfo.setLayout(paneBankInfoLayout);
        paneBankInfoLayout.setHorizontalGroup(
            paneBankInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblTitleAddressInfo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(paneBankInfoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(paneBankInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPaneZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPaneState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPaneCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPaneStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        paneBankInfoLayout.setVerticalGroup(
            paneBankInfoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(paneBankInfoLayout.createSequentialGroup()
                .addComponent(lblTitleAddressInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPaneStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jPaneCity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPaneState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPaneZipcode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 88, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(panePersonalInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(paneBankInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(paneBankInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(panePersonalInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(333, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPaneAge;
    private javax.swing.JPanel jPaneCity;
    private javax.swing.JPanel jPaneDob;
    private javax.swing.JPanel jPaneFirstName;
    private javax.swing.JPanel jPaneHeight;
    private javax.swing.JPanel jPaneLastName;
    private javax.swing.JPanel jPaneMobileNo;
    private javax.swing.JPanel jPaneSsn;
    private javax.swing.JPanel jPaneState;
    private javax.swing.JPanel jPaneStreetAddress;
    private javax.swing.JPanel jPaneWeight;
    private javax.swing.JPanel jPaneZipcode;
    private javax.swing.JLabel lblAge;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblFirstName;
    private javax.swing.JLabel lblHeight;
    private javax.swing.JLabel lblLastName;
    private javax.swing.JLabel lblMobileNo;
    private javax.swing.JLabel lblSsn;
    private javax.swing.JLabel lblState;
    private javax.swing.JLabel lblStreetAddress;
    private javax.swing.JLabel lblTitleAddressInfo;
    private javax.swing.JLabel lblTitlePersonalInfo;
    private javax.swing.JLabel lblWeight;
    private javax.swing.JLabel lblZipcode;
    private javax.swing.JPanel paneBankInfo;
    private javax.swing.JPanel panePersonalInfo;
    private javax.swing.JLabel txtAge;
    private javax.swing.JLabel txtCity;
    private javax.swing.JLabel txtDateOfBirth;
    private javax.swing.JLabel txtFirstName;
    private javax.swing.JLabel txtHeight;
    private javax.swing.JLabel txtLastName;
    private javax.swing.JLabel txtMobileNumber;
    private javax.swing.JLabel txtSsn;
    private javax.swing.JLabel txtState;
    private javax.swing.JLabel txtStreetAddress;
    private javax.swing.JLabel txtWeight;
    private javax.swing.JLabel txtZipcode;
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
}
