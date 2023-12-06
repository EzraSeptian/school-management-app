/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppManajemenSekolah.entity;

/**
 *
 * @author asus
 */
import java.io.File;
import java.util.Date;

public class Tugas {
    private String namaTugas;
    private int kelas;
    private String matapelajaran;
    private int nilai;
    private File fileTugas;
    private Date tanggalDeadline;
    private boolean telahDikumpulkan;

    public Tugas(String namaTugas, Date tanggalDeadline, int kelas,String matapelajaran) {
        this.namaTugas = namaTugas;
        this.matapelajaran = matapelajaran;
        this.kelas = kelas;
        this.tanggalDeadline = tanggalDeadline;
        this.telahDikumpulkan = false; 
    }
    public File getFiles()
    {
        return fileTugas;
    }
    public int getNilai()
    {
        return nilai;
    }
    public String getMataPelajaran()
    {
        return matapelajaran;
    }
    public int getKelas()
    {
        return kelas;
    }
    public String getNamaTugas() {
        return namaTugas;
    }
    public void setNilai(int nilai)
    {
        this.nilai = nilai;
    }
    public void setNamaTugas(String namaTugas) {
        this.namaTugas = namaTugas;
    }

    public Date getTanggalDeadline() {
        return tanggalDeadline;
    }

    public void setTanggalDeadline(Date tanggalDeadline) {
        this.tanggalDeadline = tanggalDeadline;
    }
    public String getStatus()
    {
        if(!telahDikumpulkan)
        {
            return "Belum Terkumpul";
        }
        else
        {
            return "Terkumpul";
        }
    }
    public boolean TelahDikumpulkan() {
        return telahDikumpulkan;
    }
    public void setFileTugas(File file)
    {
        fileTugas = file;
    }
    
    public void setTelahDikumpulkan(boolean telahDikumpulkan) {
        this.telahDikumpulkan = telahDikumpulkan;
    }
}

