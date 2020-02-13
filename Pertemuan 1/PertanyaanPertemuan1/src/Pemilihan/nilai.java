/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pemilihan;
import java.util.Scanner;
/**
 *
 * @author Nada Alya
 */
public class nilai {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tugas, uts, uas;
        String nama;
        double akhir;

        System.out.print("Nama Mahasiswa \t: ");
        nama = sc.nextLine();
        System.out.print("Nilai Tugas \t: ");
        tugas = sc.nextInt();
        if (tugas > 100 || tugas < 0) {
            System.out.println("Nilai yang dimasukkan salah");
        } else {
            System.out.print("Nilai UTS \t: ");
            uts = sc.nextInt();
            if (uts > 100 || uts < 0) {
                System.out.println("Nilai yang dimasukkan salah");
            } else {
                System.out.print("Nilai UAS \t: ");
                uas = sc.nextInt();
                if (uas > 100 || uas < 0) {
                    System.out.println("Nilai yang dimasukkan salah");
                } else {
                    akhir = (tugas * 0.2) + (uts * 0.35) + (uas * 0.45);
                    System.out.printf("Nilai Akhir \t: %.2f", akhir);
                    System.out.println();
                }
            }
        }

    }
}
