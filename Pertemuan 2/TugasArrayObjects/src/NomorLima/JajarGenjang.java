/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NomorLima;

/**
 *
 * @author Nada Alya
 */
public class JajarGenjang {

    public int tinggi, sisi;
    public int panjang;

    int hitunLuas() {
        return panjang * tinggi;
    }

    int hitungKeliling() {
        return (2 * panjang) + (2 * sisi);
    }
}
