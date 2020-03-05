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
public class MainFibonacci {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); // 0(1)
        Fibonacci f = new Fibonacci(); // 0(1)
        
       System.out.print("Masukkan banyak range: "); // 0(1)
        int a = sc.nextInt(); // 0(1)
        System.out.println("--Fibonacci Brute Force--");
            for (int i = 0; i < a; i++) { // 0(n)
                System.out.println("Fibonacci " + f.fibobf(i)); // 0(1)
            }
        System.out.println();
        System.out.println("--Fibonacci Divide Conquer--");
            for (int i = 0; i < a; i++) { // 0(n)
                System.out.println("Fibonacci " + f.fibodc(i)); // 0(1)
            }
        }
    } 


