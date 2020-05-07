/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author Nada Alya
 */
public class Main {

    public static void menu() {
        System.out.println("====DOUBLE LINK LIST DENGAN MENU====");
        System.out.println("____________________________________");
        System.out.println("| MENU \t\t|");
        System.out.println("| 1. Tambah awal \t|");
        System.out.println("| 2. Tambah Akhir \t|");
        System.out.println("| 3. Tambah Data Indeks Tertentu |");
        System.out.println("| 4. Hapus Awal \t\t|");
        System.out.println("| 5. Hapus Akhir \t\t|");
        System.out.println("| 6. Hapus Indeks Tertentu \t|");
        System.out.println("| 7. Cetak Data \t\t|");
        System.out.println("| 8. Cari \t\t|");
        System.out.println("| 9. Urutkan data (kecil-besar) \t|");
        System.out.println("| 10. Keluar \t\t|");
        System.out.println("____________________________________");
        System.out.print("Pilih menu : ");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        DoubleLinkedList dll = new DoubleLinkedList();

        int pilih, data, index;
        do {
            menu();
            pilih = sc.nextInt();
            System.out.println("____________________________________");
            try {
                switch (pilih) {
                    case 1:
                        System.out.println();
                        System.out.print("Masukkan data : ");
                        data = sc.nextInt();
                        dll.addFirst(data);
                        System.out.println();
                        break;
                    case 2:
                        System.out.println();
                        System.out.print("Masukkan data : ");
                        data = sc.nextInt();
                        dll.addLast(data);
                        System.out.println();
                        break;
                    case 3:
                        System.out.println();
                        System.out.print("Masukkan data : ");
                        data = sc.nextInt();
                        System.out.print("Masukkan posisi indeks data : ");
                        index = sc.nextInt();
                        dll.add(data, index);
                        System.out.println();
                        break;
                    case 4:
                        System.out.println();
                        dll.removeFirst();
                        System.out.println();
                        break;
                    case 5:
                        System.out.println();
                        dll.removeLast();
                        System.out.println();
                        break;
                    case 6:
                        System.out.println();
                        System.out.print("Masukkan indeks : ");
                        index = sc.nextInt();
                        dll.remove(index);
                        System.out.println();
                        break;
                    case 7:
                        System.out.println();
                        dll.print();
                        System.out.println();
                        break;
                    case 8:
                        System.out.println();
                        System.out.print("Masukkan data yang ingin dicari : ");
                        data = sc.nextInt();
                        dll.cari(data);
                        System.out.println();
                        break;
                    case 9:
                        System.out.println();
                        dll.selectionSort();
                        dll.print();
                        System.out.println();
                        break;
                    case 10:
                        System.out.println("Anda Telah Keluar");
                        System.out.println("Terima Kasih");
                        System.out.println("____________________________________");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan tidak tersedia");
                }
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (pilih > 0 || pilih <= 10);
    }
}
