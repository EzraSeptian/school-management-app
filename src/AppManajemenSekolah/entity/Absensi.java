/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppManajemenSekolah.entity;

import java.util.Date;

/**
 *
 * @author asus
 */
public class Absensi {
    private String matapeljaran;
    private int kelas;
    private Date tanggalBuat;
    private Date tanggalBerakhir;
    private boolean status=false;
    public Absensi(String matapelajaran,Date tanggalBuat,Date tanggalBerakhir,int kelas)
    {
        this.matapeljaran = matapelajaran;
        this.tanggalBuat = tanggalBuat;
        this.tanggalBerakhir = tanggalBerakhir;
        this.kelas = kelas;
    }
    public void setStatus()
    {
        Date tercatat = new Date();
        if(tercatat.getTime() < tanggalBerakhir.getTime())
        {
        this.status = true;
        }
        
    }
    public boolean getStatus()
    {
      return this.status;
    }
    public String getMatapeljaran() {
        return matapeljaran;
    }

    public void setMatapeljaran(String matapeljaran) {
        this.matapeljaran = matapeljaran;
    }

    public int getKelas() {
        return kelas;
    }

    public void setKelas(int kelas) {
        this.kelas = kelas;
    }

    public Date getTanggalBuat() {
        return tanggalBuat;
    }

   

    public Date getTanggalBerakhir() {
        return tanggalBerakhir;
    }

    
    


    
}
