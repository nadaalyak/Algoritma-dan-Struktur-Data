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
public class Mahasiswa {

    String nama;
    int nilai;
    Mahasiswa next, prev;

    public Mahasiswa(Mahasiswa prev, String nama, int nilai, Mahasiswa next) {
        this.prev = prev;
        this.nama = nama;
        this.nilai = nilai;
        this.next = next;
    }
}
