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
public class BarangMain {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Barang barang = new Barang();

        System.out.print("Masukkan nama barang : ");
        barang.nama = input.nextLine();
        System.out.print("Harga barang : Rp.");
        barang.hargaSatuan = input.nextInt();
        System.out.print("Jumlah barang : ");
        barang.jumlah = input.nextInt();

        System.out.println("Nama\t\t\t : " + barang.nama);
        System.out.println("Harga Satuan Barang\t : " + barang.hargaSatuan);
        System.out.println("Harga Total \t\t : " + barang.hitungHargaBayar());
    }
}
