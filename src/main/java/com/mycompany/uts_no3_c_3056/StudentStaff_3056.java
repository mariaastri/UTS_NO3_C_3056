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
public class StudentStaff_3056 extends Mahasiswa_3056{
    protected int unitKerja_3056, jamKerja_3056;

    public StudentStaff_3056(int unitKerja_3056, int jamKerja_3056, String Nama_3056, String NIM_3056, String Jurusan_3056, double IPK) {
        super(Nama_3056, NIM_3056, Jurusan_3056, IPK);
        this.unitKerja_3056 = unitKerja_3056;
        this.jamKerja_3056 = jamKerja_3056;
    }

    public double totalPendapatan_3056(){
        int Pendapatan = jamKerja_3056 * 30000;
        return Pendapatan;
    }       
    
    public void tampilSStaff_3056(){
        super.tampilMhs();
        System.out.println("Unit Kerja      : "+unitKerja_3056);
        System.out.println("Jam Kerja       : "+jamKerja_3056);
    }

    
}
