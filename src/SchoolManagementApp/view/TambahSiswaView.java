/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SchoolManagementApp.view;

import AppManajemenSekolah.AppManajemenSekolah;
import AppManajemenSekolah.entity.Siswa;

/**
 *
 * @author asus
 */
public class TambahSiswaView extends javax.swing.JPanel {
    private AppManajemenSekolah app;
    /**
     * Creates new form TambahSiswaView
     */
    public TambahSiswaView(AppManajemenSekolah app) {
        initComponents();
        this.app = app;
        inputNis.setText(Integer.toString(app.sekolah.getJumlahSiswa()+1));
        inputNis.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        inputKelas = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        inputNamaAwal = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnDaftar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        inputNamaAkhir = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        inputNis = new javax.swing.JTextField();

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel5.setText("Kelas:");

        inputKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7", "8", "9" }));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nama Awal:");

        inputNamaAwal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputNamaAwal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaAwalActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tambah Siswa");

        btnDaftar.setBackground(new java.awt.Color(51, 153, 0));
        btnDaftar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenSekolah/asset/add.png"))); // NOI18N
        btnDaftar.setText("Tambah");
        btnDaftar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDaftarActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Nama Akhir:");

        inputNamaAkhir.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputNamaAkhir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaAkhirActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("NIS:");

        inputNis.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputNis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNisActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)
                            .addComponent(inputNamaAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addComponent(inputNamaAwal, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(inputNis, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(btnDaftar)))
                .addContainerGap(92, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNamaAwal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNamaAkhir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNis, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addComponent(btnDaftar)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void inputNamaAwalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaAwalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaAwalActionPerformed

    private void btnDaftarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDaftarActionPerformed
        String namaAwal = inputNamaAwal.getText();
        String namaAkhir = inputNamaAkhir.getText();
        int nis = Integer.parseInt(inputNis.getText());
        int kelas = Integer.parseInt((String) inputKelas.getSelectedItem());
        Siswa tambahSiswa = new Siswa(namaAwal,namaAkhir,nis,kelas);
        app.sekolah.tambahSiswa(tambahSiswa);
        app.showListSiswaView();
    }//GEN-LAST:event_btnDaftarActionPerformed

    private void inputNamaAkhirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaAkhirActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaAkhirActionPerformed

    private void inputNisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNisActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDaftar;
    private javax.swing.JComboBox<String> inputKelas;
    private javax.swing.JTextField inputNamaAkhir;
    private javax.swing.JTextField inputNamaAwal;
    private javax.swing.JTextField inputNis;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables
}
