/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas3;

/**
 *
 * @author Nada Alya
 */
public class Mississipi {
    public static void main(String[] args) {
        char [] huruf = {'M','I','S','S','I','S','S','I','P','I'};
        int M = 0,I = 0,S = 0,P = 0;
        for (int i=0; i<huruf.length; i++){
            if (huruf[i] == 'M') M++;
        }
        System.out.println("Jumlah M pada kalimat tersebut adalah : " + M);
        for (int i=0; i<huruf.length; i++){
            if (huruf[i] == 'I') I++;
        }
        System.out.println("Jumlah I pada kalimat tersebut adalah : " + I);
        for (int i=0; i<huruf.length; i++){
            if (huruf[i] == 'S') S++;
        }
        System.out.println("Jumlah S pada kalimat tersebut aadalah : " + S);
        for (int i=0; i<huruf.length; i++){
            if (huruf[i] == 'P') P++;
        }
        System.out.println("Jumlah P pada kalimat tersebut adalah : " + P);
        for (int i=0; i<huruf.length; i++){
        }
    }
}
