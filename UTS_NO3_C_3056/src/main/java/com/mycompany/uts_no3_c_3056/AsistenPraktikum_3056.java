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
    String mkAsistensi_3056;
    int jmlPertemuan_3056;

    public double totalPendapatan_3056(){
        return (jmlPertemuan_3056 * 50000);
    }
    
    public void cetakAsistenPraktikum_3056(){
        super.tampilMhs();
        System.out.println("MK Asisten          : "+mkAsistensi_3056);
        System.out.println("Jumlah Pertemuan    : "+jmlPertemuan_3056);
        System.out.println("Pendapatan AsPrak   : "+totalPendapatan_3056());
        
    }
        
}
