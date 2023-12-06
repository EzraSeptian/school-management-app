/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package SchoolManagementApp.view;

import AppManajemenSekolah.AppManajemenSekolah;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class ListGuruView extends javax.swing.JPanel {
    private AppManajemenSekolah app;
    private DefaultTableModel tableModel;
    /**
     * Creates new form ListGuruView
     */
    public ListGuruView(AppManajemenSekolah app) {
        initComponents();
        this.app = app;
        tableModel = (DefaultTableModel) ListGuru.getModel();
        Dataview();
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
        jScrollPane1 = new javax.swing.JScrollPane();
        ListGuru = new javax.swing.JTable();
        btnKembali = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("List Guru");

        ListGuru.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
            },
            new String [] {
                "Nama Awal", "Nama Akhir","Mata Pelajaran"
            }
        ));
        ListGuru.setShowGrid(true);
        ListGuru.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ListGuruMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ListGuru);

        btnKembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenSekolah/asset/back.png"))); // NOI18N
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        btnTambah.setBackground(new java.awt.Color(0, 153, 0));
        btnTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/AppManajemenSekolah/asset/add.png"))); // NOI18N
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 388, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnKembali)
                        .addGap(70, 70, 70)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnTambah)
                        .addGap(19, 19, 19))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKembali, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnTambah))
                .addGap(14, 14, 14)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    public void Dataview()
    {
        for(int i=0;i<app.sekolah.getJumlahGuru();i++)
        {
            tableModel.addRow(new Object[]{
                   app.sekolah.getGuru(i).getNamaAwal(),
                   app.sekolah.getGuru(i).getNamaAkhir(),
                   app.sekolah.getGuru(i).getMataPelajaran()
                });
        }
    }
    private void ListGuruMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListGuruMouseClicked
        int selectedRow = ListGuru.getSelectedRow();
        String namaAwal = (String) tableModel.getValueAt(selectedRow,0);
        String namaAkhir = (String) tableModel.getValueAt(selectedRow, 1);
        String matapelajaran = (String) tableModel.getValueAt(selectedRow,2);
        app.showEditGuruView(namaAwal,namaAkhir,matapelajaran,selectedRow);
    }//GEN-LAST:event_ListGuruMouseClicked

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        app.showAdminHomeView();
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
       app.showTambahGuruView();
    }//GEN-LAST:event_btnTambahActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListGuru;
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnTambah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
