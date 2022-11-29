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
public class Mahasiswa_3056 {
    protected String NIM_3056, Nama_3056, Jurusan_3056;
    protected double IPK;

    public Mahasiswa_3056(String Nama_3056, String NIM_3056, String Jurusan_3056, double IPK) {
        this.NIM_3056 = NIM_3056;
        this.Nama_3056 = Nama_3056;
        this.Jurusan_3056 = Jurusan_3056;
        this.IPK = IPK;
    }
    
    public void tampilMhs(){
        System.out.println("NIM         : "+NIM_3056);
        System.out.println("Nama        : "+Nama_3056);
        System.out.println("Jurusan     : "+Jurusan_3056);
        System.out.println("IPK         : "+IPK);
    }
}
