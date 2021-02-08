/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import model.Person;

/**
 *
 * @author khushbu
 */
public class CreateDriverLicenseInfoJPanel extends javax.swing.JPanel {

    Person person;
    
    /**
     * Creates new form PersonalInformationPanel
     */
    public CreateDriverLicenseInfoJPanel(Person person) {
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

        tabBodyBankInformation = new javax.swing.JPanel();
        jSplitPaneBankInfo = new javax.swing.JSplitPane();
        jPanelSavings = new javax.swing.JPanel();
        txtLicenseNo = new javax.swing.JTextField();
        lblLicenseNo = new javax.swing.JLabel();
        lblIssueDate = new javax.swing.JLabel();
        txtIssueDate = new org.jdatepicker.JDatePicker();
        jPanelChecking = new javax.swing.JPanel();
        txtBloodType = new javax.swing.JTextField();
        lblBloodType = new javax.swing.JLabel();
        lblIssueDate1 = new javax.swing.JLabel();
        txtExpiryDate = new org.jdatepicker.JDatePicker();
        btnUploadProfilePicture = new javax.swing.JButton();
        txtProfilePicture = new javax.swing.JTextField();
        btnSaveLicenseInfo = new javax.swing.JButton();
        lblProfilePicture = new javax.swing.JLabel();

        jSplitPaneBankInfo.setDividerLocation(250);
        jSplitPaneBankInfo.setDividerSize(10);
        jSplitPaneBankInfo.setResizeWeight(0.5);

        txtLicenseNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLicenseNoActionPerformed(evt);
            }
        });

        lblLicenseNo.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblLicenseNo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblLicenseNo.setText("License Number");

        lblIssueDate.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblIssueDate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIssueDate.setText("License Issue Date");

        javax.swing.GroupLayout jPanelSavingsLayout = new javax.swing.GroupLayout(jPanelSavings);
        jPanelSavings.setLayout(jPanelSavingsLayout);
        jPanelSavingsLayout.setHorizontalGroup(
            jPanelSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSavingsLayout.createSequentialGroup()
                .addGroup(jPanelSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(lblLicenseNo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelSavingsLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(txtLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanelSavingsLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lblIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanelSavingsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtIssueDate, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelSavingsLayout.setVerticalGroup(
            jPanelSavingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelSavingsLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(lblLicenseNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtLicenseNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblIssueDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIssueDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(246, 246, 246))
        );

        jSplitPaneBankInfo.setLeftComponent(jPanelSavings);

        txtBloodType.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtBloodTypeActionPerformed(evt);
            }
        });

        lblBloodType.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblBloodType.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblBloodType.setText("Blood Type");

        lblIssueDate1.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        lblIssueDate1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lblIssueDate1.setText("License Date of Expiry");

        javax.swing.GroupLayout jPanelCheckingLayout = new javax.swing.GroupLayout(jPanelChecking);
        jPanelChecking.setLayout(jPanelCheckingLayout);
        jPanelCheckingLayout.setHorizontalGroup(
            jPanelCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCheckingLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanelCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(lblIssueDate1, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanelCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblBloodType, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(txtExpiryDate, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        jPanelCheckingLayout.setVerticalGroup(
            jPanelCheckingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelCheckingLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblBloodType, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtBloodType, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblIssueDate1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtExpiryDate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(249, 249, 249))
        );

        jSplitPaneBankInfo.setRightComponent(jPanelChecking);

        btnUploadProfilePicture.setText("Upload Profile Picture");
        btnUploadProfilePicture.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUploadProfilePictureActionPerformed(evt);
            }
        });

        txtProfilePicture.setEditable(false);
        txtProfilePicture.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtProfilePictureMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtProfilePictureMousePressed(evt);
            }
        });

        btnSaveLicenseInfo.setBackground(new java.awt.Color(255, 255, 255));
        btnSaveLicenseInfo.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        btnSaveLicenseInfo.setText("Save");
        btnSaveLicenseInfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveLicenseInfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout tabBodyBankInformationLayout = new javax.swing.GroupLayout(tabBodyBankInformation);
        tabBodyBankInformation.setLayout(tabBodyBankInformationLayout);
        tabBodyBankInformationLayout.setHorizontalGroup(
            tabBodyBankInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBodyBankInformationLayout.createSequentialGroup()
                .addGroup(tabBodyBankInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(tabBodyBankInformationLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jSplitPaneBankInfo, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE))
                    .addGroup(tabBodyBankInformationLayout.createSequentialGroup()
                        .addGroup(tabBodyBankInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblProfilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(tabBodyBankInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(tabBodyBankInformationLayout.createSequentialGroup()
                                    .addGap(189, 189, 189)
                                    .addComponent(btnSaveLicenseInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(tabBodyBankInformationLayout.createSequentialGroup()
                                    .addGap(8, 8, 8)
                                    .addComponent(txtProfilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 315, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(btnUploadProfilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        tabBodyBankInformationLayout.setVerticalGroup(
            tabBodyBankInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBodyBankInformationLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jSplitPaneBankInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(tabBodyBankInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtProfilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUploadProfilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblProfilePicture, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnSaveLicenseInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
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

    private void txtLicenseNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLicenseNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLicenseNoActionPerformed

    private void btnSaveLicenseInfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveLicenseInfoActionPerformed
        // TODO add your handling code here:
        person.setBloodType(txtBloodType.getText());
        person.setLicenseNumber(txtLicenseNo.getText());
        person.setDateIssued(txtIssueDate.getFormattedTextField().getText());
        person.setDateOfExpiry(txtExpiryDate.getFormattedTextField().getText());
//        System.out.println(txtExpiryDate.getFormattedTextField().getText());
//        System.out.println(txtIssueDate.getFormattedTextField().getText());

        JOptionPane.showMessageDialog(this, "Driver License Information saved successfully!");
    }//GEN-LAST:event_btnSaveLicenseInfoActionPerformed

    private void txtBloodTypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtBloodTypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtBloodTypeActionPerformed

    private void btnUploadProfilePictureActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUploadProfilePictureActionPerformed
        // TODO add your handling code here:
        uploadPicture();
    }//GEN-LAST:event_btnUploadProfilePictureActionPerformed

    private void txtProfilePictureMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProfilePictureMouseClicked
        // TODO add your handling code here:
        uploadPicture();
    }//GEN-LAST:event_txtProfilePictureMouseClicked

    private void txtProfilePictureMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtProfilePictureMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtProfilePictureMousePressed

    public static BufferedImage scaleImage(int w, int h, BufferedImage img) throws Exception {
            BufferedImage bi;
                bi = new BufferedImage(w, h, BufferedImage.TRANSLUCENT);
                Graphics2D g2d = (Graphics2D) bi.createGraphics();
                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2d.addRenderingHints(new RenderingHints(RenderingHints.KEY_RENDERING, RenderingHints.VALUE_RENDER_QUALITY));
                g2d.drawImage(img, 0, 0, w, h, null);
                g2d.dispose();
            return bi;
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveLicenseInfo;
    private javax.swing.JButton btnUploadProfilePicture;
    private javax.swing.JPanel jPanelChecking;
    private javax.swing.JPanel jPanelSavings;
    private javax.swing.JSplitPane jSplitPaneBankInfo;
    private javax.swing.JLabel lblBloodType;
    private javax.swing.JLabel lblIssueDate;
    private javax.swing.JLabel lblIssueDate1;
    private javax.swing.JLabel lblLicenseNo;
    private javax.swing.JLabel lblProfilePicture;
    private javax.swing.JPanel tabBodyBankInformation;
    private javax.swing.JTextField txtBloodType;
    private org.jdatepicker.JDatePicker txtExpiryDate;
    private org.jdatepicker.JDatePicker txtIssueDate;
    private javax.swing.JTextField txtLicenseNo;
    private javax.swing.JTextField txtProfilePicture;
    // End of variables declaration//GEN-END:variables

    private void uploadPicture() {
      JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        final File f = chooser.getSelectedFile();
        
        if (f == null) {
            return;
        }
        
        String filename = f.getAbsolutePath();
        txtProfilePicture.setText(filename);
        
        try {
           BufferedImage profilePicture = ImageIO.read(new File(f.getAbsolutePath()));
           ImageIcon scaledProfilePicture = new ImageIcon(scaleImage(120, 120, profilePicture));//get the image from file chooser and scale it to match JLabel size
            
           lblProfilePicture.setIcon(scaledProfilePicture);
//           person.setPicture(profilePicture);
           
           person.setPicture(scaledProfilePicture);
            
        } catch (Exception ex) {
            ex.printStackTrace();
        }  
    }
}
