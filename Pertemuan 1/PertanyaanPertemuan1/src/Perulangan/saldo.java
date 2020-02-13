/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Perulangan;
import java.util.Scanner;
/**
 *
 * @author Nada Alya
 */
public class saldo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int saldo;
        double bunga;
        
        System.out.println("Saldo bank selama 12 bulan");
        System.out.print("Masukkan saldo awal: Rp ");
        saldo = sc.nextInt();
        System.out.println("Saldo bulan ke-1: Rp" + saldo);
        for (int i = 2; i <= 12; i++) {
            bunga = saldo * 0.02;
            saldo += bunga;
            System.out.println("Saldo bulan ke-" + (i) + ": Rp" + saldo);
        }
    }
}


