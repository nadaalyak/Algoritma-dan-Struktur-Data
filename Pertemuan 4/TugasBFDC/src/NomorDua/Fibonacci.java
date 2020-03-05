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
public class Fibonacci {
      static int fibobf(int a){
       int b[]; // 0(1)
        b = new int[(int ) a + 2]; // 0(1)
        b[0] = 0; // 0(1)
        b[1] = 1; // 0(1)
        for (int i = 2; i<=a; i++){ // 0(n)
            b[i] = b[i-1] + b[i-2]; // 0(1)
        }
        return b [(int) a]; // 0(1)
      }
      static int fibodc(int a){
         if (a <= 1) {  // 0(1)
            return a; // 0(1)
        } else {
            return fibodc(a - 1) + fibodc(a - 2); // 0(1)
        }
    }
}

