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
public class ViewMedicalRecordJPanel extends javax.swing.JPanel {
    Person person;
    /**
     * Creates new form CreateAddressJPanel
     */
    public ViewMedicalRecordJPanel(Person person) {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        tabBodyAddressInformation = new javax.swing.JPanel();
        lblMedicalRecordNo = new javax.swing.JLabel();
        txtMedicalRecordNo = new javax.swing.JFormattedTextField();
        jScrollPaneAlergy1 = new javax.swing.JScrollPane();
        txtAlergy1 = new javax.swing.JTextArea();
        lblAlergy1 = new javax.swing.JLabel();
        lblAlergy2 = new javax.swing.JLabel();
        jScrollPaneAlergy2 = new javax.swing.JScrollPane();
        txtAlergy2 = new javax.swing.JTextArea();
        lblAlergy3 = new javax.swing.JLabel();
        jScrollPaneAlergy3 = new javax.swing.JScrollPane();
        txtAlergy3 = new javax.swing.JTextArea();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        lblMedicalRecordNo.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblMedicalRecordNo.setText("Medical Record Number :");

        txtMedicalRecordNo.setEditable(false);
        txtMedicalRecordNo.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#######"))));
        txtMedicalRecordNo.setFocusable(false);

        txtAlergy1.setEditable(false);
        txtAlergy1.setColumns(4);
        txtAlergy1.setRows(5);
        txtAlergy1.setFocusable(false);
        jScrollPaneAlergy1.setViewportView(txtAlergy1);

        lblAlergy1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAlergy1.setText("Alergy1 :");

        lblAlergy2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAlergy2.setText("Alergy2 :");

        txtAlergy2.setEditable(false);
        txtAlergy2.setColumns(4);
        txtAlergy2.setRows(5);
        txtAlergy2.setFocusable(false);
        jScrollPaneAlergy2.setViewportView(txtAlergy2);

        lblAlergy3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblAlergy3.setText("Alergy3 :");

        txtAlergy3.setEditable(false);
        txtAlergy3.setColumns(4);
        txtAlergy3.setRows(5);
        txtAlergy3.setFocusable(false);
        jScrollPaneAlergy3.setViewportView(txtAlergy3);

        javax.swing.GroupLayout tabBodyAddressInformationLayout = new javax.swing.GroupLayout(tabBodyAddressInformation);
        tabBodyAddressInformation.setLayout(tabBodyAddressInformationLayout);
        tabBodyAddressInformationLayout.setHorizontalGroup(
            tabBodyAddressInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBodyAddressInformationLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(tabBodyAddressInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(tabBodyAddressInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(tabBodyAddressInformationLayout.createSequentialGroup()
                            .addComponent(lblMedicalRecordNo, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(txtMedicalRecordNo, javax.swing.GroupLayout.PREFERRED_SIZE, 377, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, tabBodyAddressInformationLayout.createSequentialGroup()
                            .addGap(45, 45, 45)
                            .addComponent(lblAlergy1, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(jScrollPaneAlergy1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(tabBodyAddressInformationLayout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addGroup(tabBodyAddressInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(tabBodyAddressInformationLayout.createSequentialGroup()
                                .addComponent(lblAlergy3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPaneAlergy3, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(tabBodyAddressInformationLayout.createSequentialGroup()
                                .addComponent(lblAlergy2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPaneAlergy2, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(572, Short.MAX_VALUE))
        );
        tabBodyAddressInformationLayout.setVerticalGroup(
            tabBodyAddressInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(tabBodyAddressInformationLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(tabBodyAddressInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMedicalRecordNo)
                    .addComponent(txtMedicalRecordNo, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(tabBodyAddressInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneAlergy1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabBodyAddressInformationLayout.createSequentialGroup()
                        .addComponent(lblAlergy1)
                        .addGap(21, 21, 21)))
                .addGap(18, 18, 18)
                .addGroup(tabBodyAddressInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneAlergy2, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabBodyAddressInformationLayout.createSequentialGroup()
                        .addComponent(lblAlergy2)
                        .addGap(21, 21, 21)))
                .addGap(18, 18, 18)
                .addGroup(tabBodyAddressInformationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneAlergy3, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, tabBodyAddressInformationLayout.createSequentialGroup()
                        .addComponent(lblAlergy3)
                        .addGap(21, 21, 21)))
                .addContainerGap(67, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabBodyAddressInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tabBodyAddressInformation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPaneAlergy1;
    private javax.swing.JScrollPane jScrollPaneAlergy2;
    private javax.swing.JScrollPane jScrollPaneAlergy3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblAlergy1;
    private javax.swing.JLabel lblAlergy2;
    private javax.swing.JLabel lblAlergy3;
    private javax.swing.JLabel lblMedicalRecordNo;
    private javax.swing.JPanel tabBodyAddressInformation;
    private javax.swing.JTextArea txtAlergy1;
    private javax.swing.JTextArea txtAlergy2;
    private javax.swing.JTextArea txtAlergy3;
    private javax.swing.JFormattedTextField txtMedicalRecordNo;
    // End of variables declaration//GEN-END:variables

    private void displayData() {
        txtMedicalRecordNo.setText(person.getMedicalRecordNumber());
        txtAlergy1.setText(person.getAlergy1());
        txtAlergy2.setText(person.getAlergy2());
        txtAlergy3.setText(person.getAlergy3()); 
    }
}
