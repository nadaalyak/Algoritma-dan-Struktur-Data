/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;

import java.util.Scanner;

/**
 *
 * @author Nada Alya
 */
public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarMahasiswaBerprestasi data = new DaftarMahasiswaBerprestasi();
        int jumMhs = 5;

        for (int i = 0; i < jumMhs; i++) {
            System.out.println("===================");
            System.out.println("DATA MAHASISWA");
            System.out.println("===================");
            System.out.print("Nama : ");
            String nama = s1.nextLine();
            System.out.print("Tahun Masuk : ");
            int thnMasuk = s.nextInt();
            System.out.print("Umur : ");
            int umur = s.nextInt();
            System.out.print("IPK : ");
            double ipk = s.nextDouble();

            Mahasiswa m = new Mahasiswa(nama, thnMasuk, umur, ipk);
            data.tambah(m);
        }
        System.out.println("======================================");
        System.out.println("Data mahasiswa sebelum sorting");
        System.out.println("======================================");
        data.tampil();
        System.out.println("======================================");
        System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk");
        System.out.println("======================================");
        data.bubbleSort();
        data.tampil();
        System.out.println("======================================");
        System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
        System.out.println("======================================");
        data.selectionSort();
        data.tampil();
        System.out.println("======================================");
        System.out.println("Data setelah di insertion sort");
        System.out.println("======================================");
        data.insertionSort();
        data.tampil();
    }
}
