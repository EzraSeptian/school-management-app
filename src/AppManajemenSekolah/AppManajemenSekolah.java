/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AppManajemenSekolah;

import AppManajemenSekolah.entity.Guru;
import AppManajemenSekolah.entity.Sekolah;
import AppManajemenSekolah.entity.Siswa;
import SchoolManagementApp.view.*;
import com.formdev.flatlaf.intellijthemes.FlatArcIJTheme;
import com.formdev.flatlaf.intellijthemes.FlatCobalt2IJTheme;
import com.formdev.flatlaf.intellijthemes.FlatLightFlatIJTheme;
import java.io.File;
import java.util.Date;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;

/**
 *
 * @author asus
 */
public class AppManajemenSekolah {
    private JFrame app;
    public Sekolah sekolah;
    public int CurrentUser;
    public static void main(String[] args) {
        try{
            UIManager.setLookAndFeel(new FlatLightFlatIJTheme());
        }catch (Exception e){
            e.printStackTrace();
        }
         SwingUtilities.invokeLater(() -> {
            AppManajemenSekolah app = new AppManajemenSekolah();
            app.sekolah.tambahSiswa(new Siswa("a","b",1,7));
            app.sekolah.tambahSiswa(new Siswa("e", "f", 3, 7));
            app.sekolah.tambahSiswa(new Siswa("c","d",2,8));
            app.sekolah.tambahGuru(new Guru("a", "b","Fisika"));
            app.sekolah.tambahGuru(new Guru ("c", "d","Matematika"));
            app.showLoginView();
         });
    }
    public AppManajemenSekolah(){
        this.app = new JFrame("Sekolah Tes");
        this.sekolah = new Sekolah();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setSize(350, 470);
        app.setVisible(true);
        app.setResizable(false);
        app.setLocationRelativeTo(null);
    }
    public void showEditNamaSiswaView()
    {
        changeView(new EditNamaSiswaView(this));
        app.setSize(400,300);
    }
    public void showListSiswaView()
    {
        changeView(new ListSiswaView(this));
        app.setSize(400,385);
    }
    public void showTambahSiswaView()
    {
        changeView(new TambahSiswaView(this));
        app.setSize(400,390);
               
    }
    public void showTambahGuruView()
    {
        changeView(new TambahGuruView(this));
        app.setSize(400,390);
    }
    public void showInformasiAbsensiView(Date tanggalBuat, Date tanggalBerakhir,int kelas)
    {
        changeView(new InformasiAbsensiView(this,tanggalBuat,tanggalBerakhir,kelas));
        app.setSize(405,500);
               
    }
    public void showTambahAbsensiView()
    {
        changeView(new TambahAbsensiView(this));
        app.setSize(400, 300);
    }
    public void showEditSiswaView(int nis, String namaAwal, String namaAkhir, int kelas, Date tanggalMaksimalAkses)
    {
        changeView(new EditSiswaView(this,nis,namaAwal,namaAkhir,kelas,tanggalMaksimalAkses));
        app.setSize(401,390);
    }
    public void showEditGuruView(String namaAwal, String namaAkhir, String matapelajaran,int indeks)
    {
        changeView(new EditGuruView(this,namaAwal,namaAkhir,matapelajaran,indeks));
        app.setSize(401, 390);
    }
    public void showListGuruView()
    {
        changeView(new ListGuruView(this)); 
        app.setSize(410,340);
    }
    public void showInputNilaiView(AppManajemenSekolah apps ,int indeksSiswa,int indeksTugas)
    {
        changeView(new InputNilaiView(apps,indeksSiswa,indeksTugas));
        app.setSize(410,400);
    }
    public void showSiswaHomeView()
    {
        changeView(new SiswaHomeView(this));
        app.setSize(312, 350);
    }
    public void showUploadTugasView(AppManajemenSekolah apps,String namaTugas,Date tanggalDeadline,String statusTugas,int selectedRow,String matapelajaran, File file)
    {
        changeView(new UploadTugasView(apps,namaTugas,tanggalDeadline,statusTugas,selectedRow,matapelajaran,file));
        app.setSize(410,400);
    }
    public void showListAbsensiSiswaView()
    {
        changeView(new ListAbsensiSiswaView(this));
        app.setSize(420,410);
    }
    public void showListTugasView()
    {
        changeView(new ListTugasView(this));
        app.setSize(540, 420);
    }
    public void showListAbsensiView()
    {
        changeView(new ListAbsensiView(this));
        app.setSize(481,420);
    }
    public void showGuruHomeView()
    {
        changeView(new GuruHomeView(this));
        app.setSize(312, 450);
    }
    public void showTambahTugasView()
    {
        changeView(new TambahTugasView(this));
        app.setSize(405, 370);
    }
    public void showListNilaiView()
    {
        changeView(new ListNilaiView(this));
        app.setSize(405, 500);
    }
    public void showLoginView()
    {
        changeView(new LoginView(this));
        app.setSize(312, 500);
    }
    public void showAdminHomeView()
    {
        changeView(new AdminHomeView(this));
        app.setSize(345, 240);
    }
    public void showGuruLoginView()
    {
        changeView(new GuruLoginView(this));
        app.setSize(248, 300);
    }
    public void showSiswaLoginView()
    {
        changeView(new SiswaLoginView(this));
        app.setSize(248, 300);
    }
    public void showRegistrasiView()
    {
        changeView(new RegistrasiView(this));
        app.setSize(405, 500);
    }
     public void changeView(JPanel view) {
        app.getContentPane().removeAll();
        app.getContentPane().add(view);
        app.revalidate();
        app.repaint();
        app.setLocationRelativeTo(null);
    }
    
}
