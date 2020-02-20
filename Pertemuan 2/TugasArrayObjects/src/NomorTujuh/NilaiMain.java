/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NomorTujuh;

import java.util.Scanner;

/**
 *
 * @author Nada Alya
 */
public class NilaiMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Nilai n = new Nilai();

        System.out.print("\nMasukkan jumlah mahasiswa : ");
        n.jumlah = input.nextInt();

        Nilai[] nilai = new Nilai[n.jumlah];

        for (int i = 0; i < nilai.length; i++) {
            nilai[i] = new Nilai();

            System.out.println("\nMahasiswa ke-" + (i + 1) + " : ");
            System.out.print("Masukkan Nilai ke 1 : ");
            nilai[i].nilai1 = input.nextInt();
            System.out.print("Masukkan Nilai ke 2 : ");
            nilai[i].nilai2 = input.nextInt();
        }

        System.out.println();

        for (int i = 0; i < nilai.length; i++) {
            System.out.println("Nilai Terbaik Mahasiswa ke-" + (i + 1) + " : " + n.max(nilai[i].nilai1, nilai[i].nilai2));
        }
    }
}
