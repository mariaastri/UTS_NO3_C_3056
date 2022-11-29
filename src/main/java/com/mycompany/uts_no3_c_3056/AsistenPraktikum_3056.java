/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.uts_no3_c_3056;

/**
 *
 * @author WIN 11
 * Maria Astri T
 * 21103056
 * S1SI-05-C
 */
public class AsistenPraktikum_3056 extends Mahasiswa_3056 {
    protected String mkAsistensi_3056;
    protected int jmlPertemuan_3056, pendapatan_3056;

    public AsistenPraktikum_3056(String mkAsistensi_3056, int jmlPertemuan_3056, String Nama_3056, String NIM_3056, String Jurusan_3056, double IPK) {
        super(Nama_3056, NIM_3056, Jurusan_3056, IPK);
        this.mkAsistensi_3056 = mkAsistensi_3056;
        this.jmlPertemuan_3056 = jmlPertemuan_3056;
    }

    public double totalPendapatan(){
        int Pendapatan = jmlPertemuan_3056 * 50000;
        return Pendapatan;
    }
    
    public void cetakAsistenPraktikum_3056(){
        super.tampilMhs();
        System.out.println("MK Asisten          : "+mkAsistensi_3056);
        System.out.println("Jumlah Pertemuan    : "+jmlPertemuan_3056);
        System.out.println("Pendapatan          : "+pendapatan_3056);
        
    }
        
}
