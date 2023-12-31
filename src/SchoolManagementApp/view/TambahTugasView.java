/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SchoolManagementApp.view;

import AppManajemenSekolah.AppManajemenSekolah;
import AppManajemenSekolah.entity.Siswa;
import AppManajemenSekolah.entity.Tugas;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author asus
 */
public class TambahTugasView extends javax.swing.JPanel {

    private AppManajemenSekolah app;

    /**
     * Creates new form TambahTugasView
     */
    public TambahTugasView(AppManajemenSekolah app) {
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
        btnTambah = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        inputNamaTugas = new javax.swing.JTextField();
        TanggalTenggat = new com.toedter.calendar.JDateChooser();
        inputKelas = new javax.swing.JComboBox<>();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Tambah Tugas");

        btnTambah.setBackground(new java.awt.Color(51, 153, 0));
        btnTambah.setForeground(new java.awt.Color(255, 255, 255));
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenSekolah/asset/add.png"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel2.setText("Tenggat Pengumpulan:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel4.setText("Kelas:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel3.setText("Nama Tugas:");

        inputNamaTugas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        inputNamaTugas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inputNamaTugasActionPerformed(evt);
            }
        });

        inputKelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "7", "8", "9" }));

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
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(inputNamaTugas, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(inputKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(TanggalTenggat, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(btnTambah)))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputNamaTugas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(10, 10, 10)
                .addComponent(TanggalTenggat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(inputKelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(50, 50, 50)
                .addComponent(btnTambah)
                .addContainerGap(72, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
        String namaTugas = inputNamaTugas.getText();
        int indeksGuru = app.CurrentUser;
        Date tenggatPengumpulan = TanggalTenggat.getDate();
        String matapelajaran = app.sekolah.getGuru(indeksGuru).getMataPelajaran();
        int kelas = Integer.parseInt((String) inputKelas.getSelectedItem());

        // Iterasi melalui semua siswa di sekolah
        for (int i = 0; i < app.sekolah.getJumlahSiswa(); i++) {
            Siswa siswa = app.sekolah.getSiswa(i);
            if(siswa.getkelas() == kelas)
            {
                Tugas tugas = new Tugas(namaTugas, tenggatPengumpulan, kelas, matapelajaran);
                siswa.tambahTugas(tugas);
            } 
            
            
        }
        JOptionPane.showMessageDialog(this, "Tugas telah ditambahkan");

        app.showGuruHomeView();
    }//GEN-LAST:event_btnTambahActionPerformed

    private void inputNamaTugasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inputNamaTugasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_inputNamaTugasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser TanggalTenggat;
    private javax.swing.JButton btnTambah;
    private javax.swing.JComboBox<String> inputKelas;
    private javax.swing.JTextField inputNamaTugas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
