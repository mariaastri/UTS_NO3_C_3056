/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.uts_no3_c_3056;
import java.io.InputStreamReader;
import java.io.BufferedReader;
/**
 *
 * @author WIN 11
 * Maria Astri T
 * 21103056
 * S1SI-05-C
 */
public class UTS_NO3_C_3056 {

    public static void main(String[] args) {     
        //Membuat object menggunakan array
        AsistenPraktikum_3056[] AsPrak_3056 = new AsistenPraktikum_3056[1];
        StudentStaff_3056[] SStaff_3056 = new StudentStaff_3056[1];
        
        AsPrak_3056[0] = new AsistenPraktikum_3056();
        SStaff_3056[0] = new StudentStaff_3056();

        //program input menggunakan buffered reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
        try {
            //mengisi data ke array pada data Asisten Praktikum
            for(int i = 0; i < 1; i++){
                System.out.println("Jumlah Asisten Praktikum : 1");
                System.out.println("=== Input Data Asisten Praktikum ===");
                System.out.print("NIM              : ");
                AsPrak_3056[i].NIM_3056 = br.readLine();
                System.out.print("Nama             : ");
                AsPrak_3056[i].Nama_3056 = br.readLine();
                System.out.print("Jurusan          : ");
                AsPrak_3056[i].Jurusan_3056 =br.readLine();
                System.out.print("IPK              : ");
                AsPrak_3056[i].IPK_3056 =Integer.parseInt(br.readLine());
                System.out.print("Mata Kuliah      : ");
                AsPrak_3056[i].mkAsistensi_3056 = br.readLine();
                System.out.print("Jumlah Pertemuan : ");
                AsPrak_3056[i].jmlPertemuan_3056 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //mengisi data ke array pada data Student Staff 
            for(int i = 0; i < 1; i++){
                System.out.println("Jumlah Student Staff : 1");
                System.out.println("=== Input Data Student Staff ===");
                System.out.print("NIM         : ");
                SStaff_3056[i].NIM_3056 = br.readLine();
                System.out.print("Nama        : ");
                SStaff_3056[i].Nama_3056 = br.readLine();
                System.out.print("Jurusan     : ");
                SStaff_3056[i].Jurusan_3056 =br.readLine();
                System.out.print("IPK         : ");
                SStaff_3056[i].IPK_3056 =Integer.parseInt(br.readLine());
                System.out.print(" Unit Kerja : ");
                SStaff_3056[i].unitKerja_3056 = br.readLine();
                System.out.print("Jam Kerja   : ");
                SStaff_3056[i].jamKerja_3056 = Integer.parseInt(br.readLine());
                System.out.println();
            }
            
            //Menampilkan semua isi array pada data Asisten Praktikum 
            System.out.println("=== DATA ASISTEN PRAKTIKUM ===");
            for(AsistenPraktikum_3056 AP_3056 : AsPrak_3056){
                AP_3056.cetakAsistenPraktikum_3056();
                System.out.println("");
            }
            
            //Menampilkan semua isi array pada data Student Staff 
            System.out.println("DATA STUDENT STAFF");
            for(StudentStaff_3056 SS_3056 : SStaff_3056){
                SS_3056.tampilSStaff_3056();
                System.out.println("");
            }
        } 
        catch (Exception ex){ // menangkap kesalahan
            System.out.println(ex);
        }
    }
}
