/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomorDua;

import java.util.Scanner;

/**
 *
 * @author Nada Alya
 */
public class MainQueue {
    public static void menu() {
        System.out.println("Masukkan operasi yang diinginkan : ");
        System.out.println("1. Enqueue");
        System.out.println("2. Dequeue");
        System.out.println("3. Print");
        System.out.println("4. Peek");
        System.out.println("5. Peek Rear");
        System.out.println("6. Peek Position");
        System.out.println("7. Peek At");
        System.out.println("----------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah maksimal antrian : ");
        int n = sc.nextInt();

        Queue Q = new Queue(n);
        
        int pilih;
        do {
            menu();
            pilih = sc.nextInt();
            switch (pilih) {
                case 1:
                    System.out.print("Masukkan rekening baru : ");
                    int dataMasuk = sc.nextInt();
                    Q.Enqueue(dataMasuk);
                    break;
                case 2:
                    int dataKeluar = Q.Dequeue();
                    if (dataKeluar != 0) {
                        System.out.println("Nomor rekening yang dikeluarkan: " + dataKeluar);
                    }
                    break;
                case 3:
                    Q.print();
                    break;
                case 4:
                    Q.peek();
                    break;
                case 5:
                    Q.peekRear();
                    break;
                case 6:
                    System.out.print("Masukkan rekening yang ingin diketahui antriannya : ");
                    int cari = sc.nextInt();
                    Q.peekPosition(cari);
                    break;
                case 7:
                    System.out.print("Masukkan posisi antrian yang ingin diketahui datanya : ");
                    int pos = sc.nextInt();
                    Q.printNasabah(pos);//
                    break;
            }
        } while(pilih > 0 || pilih < 8);   
    }
}
