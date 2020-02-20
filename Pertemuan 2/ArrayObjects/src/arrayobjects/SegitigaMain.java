/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrayobjects;

/**
 *
 * @author Nada Alya
 */
public class SegitigaMain {
    public static void main(String[] args) {
        arrayobjects.Segitiga [] b1Array = new arrayobjects.Segitiga [3];
        b1Array [0] = new arrayobjects.Segitiga (20,30);
        b1Array [1] = new arrayobjects.Segitiga (25,15);
        b1Array [2] = new arrayobjects.Segitiga (40,50);
        
        for (int i=0; i<3; i++){
            System.out.println("Luas segitiga ke-" + i + " : " + b1Array[i].hitungLuas());
        }
        for (int i=0; i<3; i++){
            System.out.println("Keliling segitiga ke-" + i + " : " + b1Array[i].hitungKeliling());
        }
    }
}
