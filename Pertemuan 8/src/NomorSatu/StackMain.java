/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NomorSatu;

/**
 *
 * @author Nada Alya
 */
public class StackMain {
        public static void main(String[] args) {
        Stack tumpukan = new Stack(4);
        
        tumpukan.push("Merah");
        tumpukan.push("Hijau");
        tumpukan.push("Biru");
        tumpukan.push("Kuning");
        
        tumpukan.print();
        System.out.println("=========================================================");
        
        tumpukan.pop();
        tumpukan.peek();
        tumpukan.print();
        System.out.println("=========================================================");
    }
    }

