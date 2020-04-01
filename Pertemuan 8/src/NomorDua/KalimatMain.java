/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NomorDua;

import java.util.Scanner;

/**
 *
 * @author Nada Alya
 */
public class KalimatMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        String kalimatAwal;
        System.out.print("Masukkan kalimat : ");
        kalimatAwal = sc.nextLine();
        
        Stack pembalik = new Stack(kalimatAwal);
        
        pembalik.exchange();
        pembalik.show();
    }
}
