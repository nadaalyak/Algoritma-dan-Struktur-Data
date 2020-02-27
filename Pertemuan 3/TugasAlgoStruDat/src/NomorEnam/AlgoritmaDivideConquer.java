/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NomorEnam;
import java.util.Scanner;
/**
 *
 * @author Nada Alya
 */
public class AlgoritmaDivideConquer {
    public static void main(String[] args) {
        Scanner angka= new Scanner(System.in);
        Scanner huruf = new Scanner(System.in);
        
        System.out.println("===== PROGRAM PERHITUNGAN RATA-RATA DC=======");
        System.out.print("masukkan jumlah mahasiswa : ");
        int n= angka.nextInt();
        
        NilaiAlgoritma arr= new NilaiAlgoritma(n);
        System.out.println();
        for(int i=0;i<n; i++){
            System.out.print("Masukkan nama mahasiswa " + (i+1) + " : ");
            arr.namaMhs[i]=huruf.nextLine();
            System.out.print("Masukkan nilai : ");
            arr.rata[i] = angka.nextInt();
            System.out.println();
        }
        for(int i=0; i<arr.jmlh;i++){
            System.out.println("nilai " + arr.namaMhs[i]+" : "+ arr.rata[i]);
        }
        System.out.println();
        System.out.println("rata-rata nilai mahasiswa : "+ String.format("%.2f", arr.rataDC(arr.rata, 0, arr.jmlh)));
    }
}
