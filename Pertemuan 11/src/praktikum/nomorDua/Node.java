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
public class Node {

    int id;
    String nama, alamat;
    Node next;
    static Scanner in = new Scanner(System.in);
    static Scanner str = new Scanner(System.in);

    public void input() {
        System.out.print("Masukkan id       : ");
        id = in.nextInt();
        System.out.print("Masukkan nama   : ");
        nama = str.nextLine();
        System.out.print("Masukkan alamat : ");
        alamat = str.nextLine();
        next = null;
    }

    public void read() {
        System.out.println("|| " + id + " \t|| " + nama + " \t|| " + alamat + " \t||");
    }
}
