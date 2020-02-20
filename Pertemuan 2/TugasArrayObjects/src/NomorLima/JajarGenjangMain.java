/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NomorLima;

import java.util.Scanner;

/**
 *
 * @author Nada Alya
 */
public class JajarGenjangMain {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        JajarGenjang[] Cara = new JajarGenjang[5];

        for (int i = 0; i < Cara.length; i++) {
            Cara[i] = new JajarGenjang();
            System.out.println("Jajar Genjang Ke-" + (i + 1));
            System.out.print("Masukkan Panjang : ");
            Cara[i].panjang = sc.nextInt();
            System.out.print("Masukkan Tinggi : ");
            Cara[i].tinggi = sc.nextInt();
            System.out.print("Masukkan Sisi Miring : ");
            Cara[i].sisi = sc.nextInt();
            System.out.println();

        }
        for (int i = 0; i < Cara.length; i++) {
            System.out.println("Luas jajar genjang ke-" + (i + 1) + " adalah : " + Cara[i].hitunLuas());
            System.out.println();
            System.out.println("Keliling jajar genjang ke-" + (i + 1) + " adalah : " + Cara[i].hitungKeliling());
            System.out.println("-------------------------------------------");
            System.out.println();
        }
    }
}
