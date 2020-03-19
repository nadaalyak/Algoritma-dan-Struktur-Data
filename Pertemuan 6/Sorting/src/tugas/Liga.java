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
public class Liga {
     String namaClub;
    int permainan;
    int agregat;
    int poin;
    
    Liga (String nama, int game, int score, int gd) {
        namaClub = nama;
        permainan = game;
        agregat = gd;
        poin = score;
    }
    
    void tampil() {
        System.out.println("==========================");
        System.out.println("Nama club : "+ namaClub);
        System.out.println("Jumlah permainan : "+ permainan);
        System.out.println("Jumlah agregat : "+ agregat);
        System.out.println("Poin yang didapat : "+ poin);
        
    }
}

