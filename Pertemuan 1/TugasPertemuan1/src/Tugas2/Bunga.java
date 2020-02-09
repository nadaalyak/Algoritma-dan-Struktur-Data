/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas2;

/**
 *
 * @author Nada Alya
 */
public class Bunga {
    public static void main(String[] args) {
        double bunga = 0.02,totalbunga,saldo1,saldo2,saldotambahan,bulan;
        saldo1 = 1000000;
        saldo2 = 1500000;
         System.out.println("Saldo awal = 1.000.000");
         totalbunga = 2*1000000/100;
         System.out.println("Jumlah bunga perbulan = " + totalbunga);
         System.out.println("Saldo akhir = 1.500.000");
         saldotambahan = saldo2 - saldo1;
         System.out.println("Saldo bertambah " + saldotambahan);
         bulan =  saldotambahan/totalbunga;
         System.out.println("Total bulan = " + bulan);
    }
}
