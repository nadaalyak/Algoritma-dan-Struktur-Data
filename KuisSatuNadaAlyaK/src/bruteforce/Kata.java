/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bruteforce;

/**
 *
 * @author Nada Alya
 */
public class Kata {

    private static void match(char[] teks, char[] pola) {
        int j;
        int n = 0;
        for (int i = 0; i <= teks.length - pola.length; i++) {
            j = 0;
            while (j < pola.length && teks[i + j] == pola[j]) {
                j++;
            }
            if (j >= pola.length) {
                n++;
            }
        }
        if (n > 0) {
            System.out.println("COCOK");
        } else {
            System.out.println("TIDAK COCOK");
        }
    }

    public static void main(String[] args) {
        char[] x = {'N', 'G', 'A'};
        char[] y = {'S', 'E', 'M', 'A', 'N', 'G', 'A', 'T'};
        match(y, x);
    }
}
