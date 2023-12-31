/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SchoolManagementApp.view;

import AppManajemenSekolah.AppManajemenSekolah;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class GuruLoginView extends javax.swing.JPanel {
    private AppManajemenSekolah app;
    /**
     * Creates new form GuruLoginView
     */
    public GuruLoginView(AppManajemenSekolah app) {
        initComponents();
        this.app = app;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        inputNamaAwal = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        inputNamaAkhir = new javax.swing.JTextField();
        btnLogin = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setText("Login");

        jLabel2.setText("Nama Awal:");

        inputNamaAwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaAwalActionPerformed(evt);
            }
        });

        jLabel3.setText("Nama Akhir:");

        inputNamaAkhir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaAkhirActionPerformed(evt);
            }
        });

        btnLogin.setBackground(new java.awt.Color(0, 0, 204));
        btnLogin.setForeground(new java.awt.Color(255, 255, 255));
        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel2)
                            .addComponent(inputNamaAwal, javax.swing.GroupLayout.DEFAULT_SIZE, 210, Short.MAX_VALUE)
                            .addComponent(jLabel3)
                            .addComponent(inputNamaAkhir)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(btnLogin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(jLabel1)))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNamaAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNamaAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLogin)
                .addContainerGap(98, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputNamaAwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaAwalActionPerformed

    }//GEN-LAST:event_inputNamaAwalActionPerformed

    private void inputNamaAkhirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaAkhirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaAkhirActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        String namaAwal = inputNamaAwal.getText();
        String namaAkhir = inputNamaAkhir.getText();

        if(!(namaAwal.equals("") || namaAkhir.equals(""))){
            if(app.sekolah.getNamaAdmin().equals(namaAwal) &&
                app.sekolah.getNamaAdmin().equals(namaAkhir))
            {
                app.showAdminHomeView();
                return;
            }

            try {
                app.CurrentUser = app.sekolah.getIndexGuru(namaAwal,
                    namaAkhir);
                app.showGuruHomeView();

            }
            catch(Exception e){
                JOptionPane.showMessageDialog(this, "Your user "
                    + "is not found");
            }
        }
    }//GEN-LAST:event_btnLoginActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JTextField inputNamaAkhir;
    private javax.swing.JTextField inputNamaAwal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    // End of variables declaration//GEN-END:variables
}
