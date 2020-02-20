/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NomorDua;

/**
 *
 * @author Nada Alya
 */
public class Diagram {

    public int id, lamapinjam, harga, harga1 = 5000, harga2 = 3000, namagame;
    public String nama;

    int hargaPinjam1() {
        return lamapinjam * harga1;
    }

    int hargaPinjam2() {
        return lamapinjam * harga2;
    }
}
