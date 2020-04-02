/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semester2;

import java.util.Scanner;

/**
 *
 * @author Nada Alya
 */
public class Searching {
    public void BinarySearch(String string[]) {
        int batasAtas = string.length - 1;
        int batasBawah = 0;
        Scanner sc = new Scanner (System.in);
        
        System.out.print("Masukkan buku yang dicari :");
        String cari = sc.nextLine();
        boolean notFound = true;
        while (notFound) {
            int posisiSekarang = (batasAtas + batasAtas) / 2;
            if (string[posisiSekarang].equals(cari)) {
                notFound = false;
                System.out.println("ditemukan " + cari);
            } else if (batasBawah > batasAtas) {
                System.out.println("Tidak ditemukan " + cari);
                break;
            } else {
                if (string[posisiSekarang].compareTo(cari) < 0)
                    batasBawah = posisiSekarang + 1;
                else
                    batasAtas = posisiSekarang - 1;
            }
        }
    }
}