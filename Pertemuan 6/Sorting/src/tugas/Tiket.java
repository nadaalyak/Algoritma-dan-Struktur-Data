/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Nada Alya
 */
public class Tiket {

    String maskapai;
    int transitCount, flightTime;
    float harga;

    Tiket(String m, float h, int t, int f) {
        maskapai = m;
        transitCount = t;
        flightTime = f;
        harga = h;
    }

    void tampil() {
        System.out.println("Maskapai : " + maskapai);
        System.out.println("Transit Count : " + transitCount);
        System.out.println("Flight Time : " + flightTime);
        System.out.println("Harga : " + harga);
    }
}
