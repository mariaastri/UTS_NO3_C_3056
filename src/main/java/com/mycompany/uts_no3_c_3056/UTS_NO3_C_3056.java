/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_c_3056;

/**
 *
 * @author WIN 11
 * Maria Astri T
 * 21103056
 * S1SI-05-C
 */
public class UTS_NO3_C_3056 {

    public static void main(String[] args) {
        AsistenPraktikum_3056 asprak = new AsistenPraktikum_3056("PBO", 12, "Ahmad", "220001", "Sistem Informasi", 3.56);
        asprak.totalPendapatan();
        asprak.cetakAsistenPraktikum_3056();
        
        StudentStaff_3056 SStaff = new StudentStaff_3056(123, 8, "Ria", "220002", "Sistem Informasi", 3.75);
        SStaff.totalPendapatan_3056();
        SStaff.tampilSStaff_3056();
                
    }
}
