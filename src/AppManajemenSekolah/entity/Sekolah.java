/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package AppManajemenSekolah.entity;

import java.util.ArrayList;

/**
 *
 * @author asus
 */
public class Sekolah {
    private ArrayList<Siswa> siswa;
    private ArrayList<Guru> guru;
    private int jumlahSiswa;
    private int jumlahGuru;
    
    public int getBanyakSiswaByKelas(int kelas)
    {
        int banyak=0;
        for(int i=0;i<siswa.size();i++)
        {
            if(siswa.get(i).getkelas()==kelas)
            {
                banyak++;
            }
        }
        return banyak;
    }
    public void tambahGuru(Guru tambahguru) {
         if (guru == null) {
            guru = new ArrayList<>();
        }
        guru.add(tambahguru);
    }
    public void tambahSiswa(Siswa tambahsiswa) {
        if(siswa == null)
        {
            siswa = new ArrayList<>();
        }
        siswa.add(tambahsiswa);
        
    }
    public void ubahSiswa (int indeks, String namaAwal,String namaAkhir)
    {
        siswa.get(indeks).setNamaAwal(namaAwal);
        siswa.get(indeks).setNamaAkhir(namaAkhir);
    }
    public void ubahSiswaAdmin(int indeks,int kelas)
    {
        siswa.get(indeks).setKelas(kelas);
    }
    public void hapusSiswa(int indeks)
    {
        siswa.remove(indeks);
    }
    public void hapusGuru(int indeks)
    {
        guru.remove(indeks);
    }
    public void ubahGuru(String namaAwal,String namaAkhir, String matapelajaran, int indeks) {
        guru.get(indeks).setNamaAwal(namaAwal);
        guru.get(indeks).setNamaAkhir(namaAkhir);
        guru.get(indeks).setMatapelajaran(matapelajaran);
        
    }
    public Guru getGuru(int indeks) {
        return guru.get(indeks);
    }
    public int getJumlahSiswa()
    {
        if(siswa == null)
        {
            return 0;
        }
        else
        {
            return siswa.size();
        }
    }
    public int getJumlahGuru()
    {
        if(guru == null)
        {
            return 0;
        }
        else
        {
            return guru.size();
        }
    }
    public Siswa getSiswa(int indeks)
    {
        return siswa.get(indeks);
    }
   
     public String getNamaAdmin()
     {
         return "admin";
     }
     public int getIndexSiswa(int nis)throws Exception
     {
        int i = 0;
        for(Siswa n :this.siswa){
            if(n.getnis() == nis){
                
                return i;
            }
            i++;
        }
         throw new Exception("Siswa tidak ditemukan");
     }
     public int getIndexSiswaLogin(String namaAwal, String namaAkhir)throws Exception
     {
        int i = 0;
        for(Siswa n :this.siswa){
            if(n.getNamaAwal().equals(namaAwal) && 
                    n.getNamaAkhir().equals(namaAkhir)){
                
                return i;
            }
            i++;
        }
         throw new Exception("Siswa tidak ditemukan");
     }
     public int getIndexGuru(String namaAwal, String namaAkhir)throws Exception
     {
        int i = 0;
        for(Guru n :this.guru){
            if(n.getNamaAwal().equals(namaAwal) && 
                    n.getNamaAkhir().equals(namaAkhir)){
                
                return i;
            }
            i++;
        }
         throw new Exception("Siswa tidak ditemukan");
     }
    
}
