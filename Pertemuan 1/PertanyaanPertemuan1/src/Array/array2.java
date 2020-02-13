/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;
import java.util.Scanner;
/**
 *
 * @author Nada Alya
 */
public class array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int array1[][] = new int[4][5];
        int jumlah=0;
        
        System.out.println("Input elemen Array1");
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1[0].length; j++) {
                System.out.print("Masukkan elemen ke-[" + i + "][" + j + "]: ");
                array1[i][j] = sc.nextInt();
                jumlah += array1[i][j];
            }
        }
        System.out.println("Total jumlah Array = " + jumlah);
    }
}
