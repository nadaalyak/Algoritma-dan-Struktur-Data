/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nomorDua;

/**
 *
 * @author Nada Alya
 */
public class Nasabah {
    String noRekening, nama;
    public Nasabah(String noRek, String nm) {
        noRekening = noRek;
        nama = nm;
    }

    public void nasabah() {
    }

    void print() {
        System.out.println("Nama = " + nama);
        System.out.println("Nomor Rekening = " + noRekening);
    }
}
