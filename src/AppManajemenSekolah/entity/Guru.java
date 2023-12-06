/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppManajemenSekolah.entity;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author asus
 */
public class Guru  {
    private String namaAwal;
    private String namaAkhir;
    private String matapelajaran;
    private ArrayList<Absensi> absensi;
    
    public Guru(String namaAwal, String namaAkhir,String matapelajaran)
    {
        this.namaAwal = namaAwal;
        this.matapelajaran = matapelajaran;
        this.namaAkhir = namaAkhir;
        this.absensi = new ArrayList<>();
    }
    public int getAbsensiSize() {
        return absensi.size();
    }
    public void tambahAbsensi(Absensi absensi)
    {
        this.absensi.add(absensi);
    }
    

    public ArrayList<Absensi> getAbsensi() {
        return absensi;
    }
    public String getMataPelajaran()
    {
        return matapelajaran;
    }
    public void setNamaAwal(String namaAwal)
    {
        this.namaAwal = namaAwal;
    }
    public void setNamaAkhir(String namaAkhir)
    {
        this.namaAkhir = namaAkhir;
    }
    public void setMatapelajaran(String matapelajaran)
    {
        this.matapelajaran = matapelajaran;
    }
    public String getNamaAwal()
    {
        return namaAwal;
    }
    public String getNamaAkhir()
    {
        return namaAkhir;
    }

   
    
}
