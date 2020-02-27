/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NomorTiga;
import java.util.Scanner;

/**
 *
 * @author Nada Alya
 */
public class ModifNilaiAlgoritma {
     public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("             Menghitung Nilai Mahasiswa             ");
        System.out.println("====================================================");
        double total=0;
        double rata=0;
        System.out.print("Masukkan jumlah Mahasiswa = ");
        int jumlah = sc.nextInt();
        NomorTiga.NilaiAlgoritma[] na = new NomorTiga.NilaiAlgoritma[jumlah];
        
        for (int i = 0; i < jumlah; i++){
            na[i] = new NomorTiga.NilaiAlgoritma();
            System.out.println("------------------------------------------------");
            System.out.println("Masukkan nilai Mahasiswa ke-"+(i+1));
            System.out.print("Nama Mahasiswa = ");
            na[i].namaMhs = sc.next();
            System.out.print("Nilai Tugas = ");
            na[i].nilaiTugas = sc.nextInt();
            System.out.print("Nilai Kuis = ");
            na[i].nilaiKuis = sc.nextInt();
            System.out.print("Nilai UTS = ");
            na[i].nilaiUts = sc.nextInt();
            System.out.print("Nilai UAS = ");
            na[i].nilaiUas = sc.nextInt();
            System.out.println("Total Nilai Mahasiswa = "+na[i].hitungTotalNilai());
        }
        for (int i = 0; i < jumlah; i++){
            total += na[i].hitungTotalNilai();
            rata = total/jumlah;
        }
        System.out.println("====================================================");
        System.out.print("Rata-rata Nilai Total Seluruh Mahasiswa = "+rata);
    }
}
