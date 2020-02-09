package Tugas4;
import java.util.Scanner;
/**
 *
 * @author Nada Alya
 */
public class Luas {
    public static void main(String[] args) {
      menuutama();
    }
    static Scanner sc = new Scanner (System.in);
    static void menuutama(){
    int pilihan;
        System.out.println("1. Luas Segitiga");
        System.out.println("2. Luas Segiempat");
        System.out.println("3. Luas Lingkaran");
        pilihan = sc.nextInt();
        switch (pilihan){
            case 1 : 
                luas1();
            break;
            case 2 :
                luas2();
            break;
            case 3 :
                luas3();
            break;
        }
}
    static void luas1(){
        int luas,alas,tinggi;
        System.out.println("Masukkan alas : ");
        alas = sc.nextInt();
        System.out.println("Masukkan tinggi : ");
        tinggi = sc.nextInt();
        System.out.println("Luas segitiga ");
        luas = alas*tinggi/2;
        System.out.println(luas);
}
    static void luas2(){
        int luas,sisi;
        System.out.println("Masukkan sisi : ");
        sisi = sc.nextInt();
        System.out.println("Luas segiempat ");
        luas = sisi*sisi;
        System.out.println(luas);
}
    static void luas3(){
        int jari2;
        double luas,phi=3.14; 
        System.out.println("Masukkan jari-jari : ");
        jari2= sc.nextInt();
        System.out.println("Luas segitiga ");
        luas = phi*jari2*jari2;
        System.out.println(luas);
}
}
