/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestSearching;

import java.util.Scanner;

/**
 *
 * @author Nada Alya
 */
public class MainModifSearching {
    public static void main(String[] args) {
       //int data[] = {10,40,30,50,70,20,100,90};
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukkan jumlah data : ");
        int jumlah = sc.nextInt();
        int data[] = new int[jumlah];
        
        for (int i = 0; i < jumlah; i++) {
            System.out.print("Data ke-" + (i + 1) + " : ");
            data[i] = sc.nextInt();
        }

        ModifSearching pencarian = new ModifSearching(data, jumlah);

        System.out.println("Isi Array : ");
        pencarian.TampilData();

        int cari = 30;
        System.out.println("Menggunakan Sequential Search");
        int posisi = pencarian.FindSeqSearch(cari);

     /**if (posisi != -1) {
        System.out.println("data : " + cari + " ditemukan pada indeks " + posisi);
    } else {
          System.out.println("data " + cari + " tidak ditemukan");
     }*/
        
        pencarian.Tampilposisi(cari, posisi);
        System.out.println("================================");
        System.out.println("menggunakan binary search");
        posisi = pencarian.FindBinarySearch(cari, 0, data.length - 1);
        pencarian.Tampilposisi(cari, posisi);
    }
}
