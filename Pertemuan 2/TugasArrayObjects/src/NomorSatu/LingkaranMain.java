/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NomorSatu;

import java.util.Scanner;

/**
 *
 * @author Nada Alya
 */
public class LingkaranMain {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Lingkaran lingkaran = new Lingkaran();

        System.out.print("Input Jari Jari : ");
        lingkaran.r = sc.nextDouble();
        System.out.println();
        System.out.println("Luas : " + lingkaran.hitungLuas());
        System.out.println("Keliling : " + lingkaran.hitungKeliling());
    }
}
