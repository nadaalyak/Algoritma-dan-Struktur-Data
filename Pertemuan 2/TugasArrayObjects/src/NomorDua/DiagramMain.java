/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NomorDua;

import java.util.Scanner;

/**
 *
 * @author Nada Alya
 */
public class DiagramMain {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Diagram peminjaman = new Diagram();
        do {
            System.out.println("------Menu Peminjaman Game-----");
            System.out.println("1. GTA V");
            System.out.println("2. PES 2020");
            System.out.println("3. The Sims 4");
            System.out.println("4. Keluar");
            System.out.print("Pilih Game Yg diinginkan : ");
            peminjaman.namagame = sc.nextInt();
            if (peminjaman.namagame == 1) {
                System.out.print("Masukkan ID member Anda : ");
                peminjaman.id = sc.nextInt();
                System.out.print("Masukkan Nama Anda : ");
                peminjaman.nama = sc.next();
                System.out.print("Masukkan Waktu Meminjam : ");
                peminjaman.lamapinjam = sc.nextInt();
                System.out.println();
                System.out.println("========================");
                System.out.println("Nama Anda : " + peminjaman.nama);
                System.out.println("ID Anda : " + peminjaman.id);
                System.out.println("pilihan Game : GTA V");
                System.out.println("Waktu Pinjam : " + peminjaman.lamapinjam);
                System.out.println("Harga : Rp." + peminjaman.harga1);
                System.out.println("Total : Rp." + peminjaman.hargaPinjam1());
                System.out.println("========================");
            } else if (peminjaman.namagame == 2) {
                System.out.print("Input ID member Anda: ");
                peminjaman.id = sc.nextInt();
                System.out.print("Input Nama Anda: ");
                peminjaman.nama = sc.next();
                System.out.print("Input Waktu Meminjam: ");
                peminjaman.lamapinjam = sc.nextInt();
                System.out.println("========================");
                System.out.println("Nama Anda : " + peminjaman.nama);
                System.out.println("ID Anda : " + peminjaman.id);
                System.out.println("pilihan Game : PES 2020");
                System.out.println("Waktu Pinjam : " + peminjaman.lamapinjam);
                System.out.println("Harga : Rp." + peminjaman.harga1);
                System.out.println("Total : Rp." + peminjaman.hargaPinjam1());
                System.out.println("========================");
            } else if (peminjaman.namagame == 3) {
                System.out.print("Input ID member Anda: ");
                peminjaman.id = sc.nextInt();
                System.out.print("Input Nama Anda: ");
                peminjaman.nama = sc.next();
                System.out.print("Input Waktu Meminjam: ");
                peminjaman.lamapinjam = sc.nextInt();
                System.out.println("========================");
                System.out.println("Nama Anda : " + peminjaman.nama);
                System.out.println("ID Anda : " + peminjaman.id);
                System.out.println("pilihan Game : The Sims 4");
                System.out.println("Waktu Pinjam : " + peminjaman.lamapinjam);
                System.out.println("Harga : Rp." + peminjaman.harga2);
                System.out.println("Total : Rp." + peminjaman.hargaPinjam2());
                System.out.println("========================");
            } else {
                System.out.println("--TERIMA KASIH--");
            }
        } while (peminjaman.namagame > 0 && peminjaman.namagame < 3);
    }
}
