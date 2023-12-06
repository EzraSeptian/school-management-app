/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppManajemenSekolah.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.Calendar;

public class Siswa {

    private String namaAwal;
    private String namaAkhir;
    private int nis;
    private int kelas;
    private ArrayList<Absensi> absensi;
    private Date tanggalMaksimalAkses;
    private ArrayList<Tugas> daftarTugasSiswa;

    public Siswa(String namaAwal, String namaAkhir, int nis, int kelas) {
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
        this.kelas = kelas;
        this.nis = nis;
        this.tanggalMaksimalAkses = new Date();
        this.absensi = new ArrayList<>();
        this.daftarTugasSiswa = new ArrayList<>();
        bayarSPP();

    }
    
    public void tambahTugas(Tugas tugas) {
        daftarTugasSiswa.add(tugas);
    }

    public void tambahAbsensi(Absensi absensi) {
        this.absensi.add(absensi);
    }

    public void setNamaAwal(String namaAwal) {
        this.namaAwal = namaAwal;
    }

    public void setNamaAkhir(String namaAkhir) {
        this.namaAkhir = namaAkhir;
    }

    public void setKelas(int kelas) {
        this.kelas = kelas;
    }

    public ArrayList<Absensi> getAbsensi() {
        return absensi;
    }

    public int getIndexTugas(String namaTugas) {
        int i = 0;
        for (Tugas tugas : daftarTugasSiswa) {
            if (tugas.getNamaTugas().equals(namaTugas)) {
                break;
            }
            i++;
        }
        return i;
    }

    public int getkelas() {
        return kelas;
    }

    public int getnis() {
        return nis;
    }

    public String getNamaAwal() {
        return namaAwal;
    }

    public String getNamaAkhir() {
        return namaAkhir;
    }

    public void bayarSPP() {
        int jumlahHariDitambahkan = 30;
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(tanggalMaksimalAkses);
        calendar.add(Calendar.DAY_OF_MONTH, jumlahHariDitambahkan);

        // Menyimpan tanggal yang telah diubah ke dalam variabel tanggalMaksimalAkses
        tanggalMaksimalAkses = calendar.getTime();
    }

    public Date getTanggalMaksimalAkses() {
        return tanggalMaksimalAkses;
    }

    public ArrayList<Tugas> getDaftarTugas() {
        return daftarTugasSiswa;
    }

}
