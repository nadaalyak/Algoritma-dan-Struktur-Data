/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas3;

/**
 *
 * @author Nada Alya
 */
public class Main {

    public static void main(String[] args) {
        Nilai dn = new Nilai();
        System.out.println("=======================");
        System.out.println("Daftar Nilai Mahasiswa");
        System.out.println("=======================");
        System.out.println("____________________________________");
        System.out.println("Nama \t| Nilai \t|");
        System.out.println("____________________________________");
        try {
            dn.addFirst("| Nada Alya", 95);
            dn.addLast("| Zhabiyan W", 90);
            dn.addLast("| Sela Aulia", 70);
            dn.addLast("| Indah Tri", 85);
            dn.addLast("| Diva Ardhia", 91);
            dn.addLast("| Salsabila R", 81);
            dn.addLast("| Firda Nindi", 77);
            dn.addLast("| Wawan D", 86);
            dn.addLast("| Hasan A", 88);
            dn.addLast("| Dipa Seta", 85);
            dn.add("| Ramadhania", 87, 3);
            dn.print();
            System.out.println("____________________________________");
            dn.selectionSort();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        System.out.println("=========================");
        System.out.println("Setelah diurutkan secara Descending");
        System.out.println("=========================");
        System.out.println("____________________________________");
        System.out.println("Nama \t| Nilai \t|");
        System.out.println("____________________________________");
        dn.print();
        System.out.println("____________________________________");
        dn.clear();
    }
}
