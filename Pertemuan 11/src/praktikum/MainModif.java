/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package praktikum;
import java.util.Scanner;

/**
 *
 * @author Nada Alya
 */
public class MainModif {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        ModifikasiLinkedList data = new ModifikasiLinkedList();
        try {
            data.addFirst(7);
            data.print();
            data.add(8, 1);
            data.print();
            data.addFirst(1);
            data.print();
            data.addByValue(7, 3);
            data.print(); 
            data.removeByValue(8);
            data.print();
            data.clear();
            
            
            int pilih, pilih1, nilai, index;
            do {
                System.out.println("===Menu===");
                System.out.println("1. Tambah");
                System.out.println("2. Hapus");
                System.out.println("3. Cari");
                System.out.println("4. Keluar");
                System.out.print("Masukkan pilihan : ");
                pilih = sc.nextInt();

                switch (pilih) {
                    case 1:
                        System.out.println("---Submenu Tambah---");
                        System.out.println("1. Tambah (First)");
                        System.out.println("2. Tambah (Index)");
                        System.out.println("3. Tambah (Last)");
                        System.out.print("Masukkan pilihan : ");
                        pilih1 = sc.nextInt();
                        switch (pilih1) {
                            case 1:
                                System.out.println("Tambah (First)");
                                System.out.print("Masukkan Data : ");
                                nilai = sc.nextInt();
                                data.addFirst(nilai);
                                break;
                            case 2:
                                System.out.println("Tambah (Index)");
                                System.out.print("Masukkan Data : ");
                                nilai = sc.nextInt();
                                System.out.print("Masukkan index : ");
                                index = sc.nextInt();
                                data.add(nilai, index);
                                break;
                            case 3:
                                System.out.println("Tambah (Last)");
                                System.out.print("Masukkan Data : ");
                                nilai = sc.nextInt();
                                data.addLast(nilai);
                                break;
                        }
                        data.print();
                        break;
                    case 2:
                        System.out.println("---Submenu Hapus---");
                        System.out.println("1. Hapus (Index)");
                        System.out.println("2. Hapus (Key)");
                        System.out.println("3. Clear");
                        System.out.print("Masukkan pilihan : ");
                        pilih1 = sc.nextInt();
                        switch (pilih1) {
                            case 1:
                                System.out.println("Hapus (Index)");
                                System.out.print("Masukkan Index : ");
                                index = sc.nextInt();
                                data.remove(index);
                                break;
                            case 2:
                                System.out.println("Hapus (Key)");
                                System.out.print("Masukkan Data : ");
                                nilai = sc.nextInt();
                                data.removeByValue(nilai);
                                break;
                            case 3:
                                data.clear();
                                break;
                        }
                        data.print();
                        break;
                    case 3:
                        System.out.println("Submenu Cari");
                        System.out.println("1. Cari (Index)");
                        System.out.println("2. Cari (Key)");
                        System.out.print("Masukkan pilihan : ");
                        pilih1 = sc.nextInt();
                        switch (pilih1) {
                            case 1:
                                System.out.println("Cari (Index)");
                                System.out.print("Masukkan Index : ");
                                index = sc.nextInt();
                                data.cari(index);
                                break;
                            case 2:
                                System.out.println("Cari (Key)");
                                System.out.print("Masukkan Data : ");
                                nilai = sc.nextInt();
                                data.cariKey(nilai);
                                break;
                        }
                        break;
                    case 4:
                        System.out.println("---Selesai---");
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Pilihan Salah!");
                }
            } while (pilih != 4);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
