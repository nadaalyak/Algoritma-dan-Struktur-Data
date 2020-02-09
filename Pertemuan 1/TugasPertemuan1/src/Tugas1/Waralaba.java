
package Tugas1;
import java.util.Scanner;
/**
 *
 * @author Nada Alya
 */
public class Waralaba {
    public static void main(String[] args) {
        String paketchiken,paket,paketoke;
        int jumlah,total,chikenA,chikenB,chikenC,okeA,okeB,okeC,kembalian = 0,uang;
        chikenA = 12000;
        chikenB = 15000;
        chikenC = 20000;
        okeA = 10000;
        okeB = 12000;
        okeC = 15000;
        Scanner sc = new Scanner (System.in);
        
        System.out.println("MENU PAKET :");
        System.out.println("1. Paket Chiken");
        System.out.println("2. Paket OKE");
        System.out.print("Pilih Paket : ");
        paket = sc.nextLine();
        if (paket.equals ("1")){
            System.out.println("MENU PAKET CHIKEN :");
            System.out.println("Chiken A : Rp. 12.000");
            System.out.println("Chiken B : Rp. 15.000");
            System.out.println("Chiken C : Rp. 20.000");
            System.out.print("Pilih paket chiken : ");
            paketchiken = sc.nextLine();
            if (paketchiken.equals ("A")){
                System.out.print("Jumlah yang akan dipesan : ");
                jumlah = sc.nextInt();
                total = jumlah*chikenA;
                System.out.println(jumlah + " Paket Chiken A");
                System.out.println("Total = Rp " + total);
                System.out.print("Jumlah Uang = ");
                uang = sc.nextInt();
                kembalian = uang-total;
                System.out.println("Kembalian = " + kembalian);
            }
            else if (paketchiken.equals("B")){
                System.out.print("Jumlah yang akan dipesan : ");
                jumlah = sc.nextInt();
                total = jumlah*chikenB;
                System.out.println(jumlah + " Paket Chiken B");
                System.out.println("Total = Rp " + total);
                System.out.print("Jumlah Uang = ");
                uang = sc.nextInt();
                kembalian = uang-total;
                System.out.println("Kembalian = " + kembalian);
            }
            else if (paketchiken.equals("C")){
                System.out.print("Jumlah yang akan dipesan : ");
                jumlah = sc.nextInt();
                total = jumlah*chikenC;
                System.out.println(jumlah + " Paket Chiken C");
                System.out.println("Total = Rp " + total);
                System.out.print("Jumlah Uang = ");
                uang = sc.nextInt();
                kembalian = uang-total;
                System.out.println("Kembalian = " + kembalian);
            }
            else {
                System.out.println("Pesan Eror!");
            }
        }
        else if (paket.equals("2")){
            System.out.println("MENU PAKET OKE");
            System.out.println("Oke A : Rp. 10.000");
            System.out.println("Oke B : Rp. 12.000");
            System.out.println("Oke C : Rp. 15.000");
            System.out.print("Pilih paket chiken : ");
            paketoke = sc.nextLine();
            if (paketoke.equals ("A")){
                System.out.print("Jumlah yang akan dipesan : ");
                jumlah = sc.nextInt();
                total = jumlah*okeA;
                System.out.println(jumlah + " Paket OKE A");
                System.out.println("Total = Rp " + total);
                System.out.print("Jumlah Uang = ");
                uang = sc.nextInt();
                kembalian = uang-total;
                System.out.println("Kembalian = " + kembalian);
            }
            else if (paketoke.equals("B")){
                System.out.print("Jumlah yang akan dipesan : ");
                jumlah = sc.nextInt();
                total = jumlah*okeB;
                System.out.println(jumlah + " Paket OKE A");
                System.out.println("Total = Rp " + total);
                System.out.print("Jumlah Uang = ");
                uang = sc.nextInt();
                kembalian = uang-total;
                System.out.println("Kembalian = " + kembalian);
            }
            else if (paketoke.equals("C")){
                System.out.print("Jumlah yang akan dipesan : ");
                jumlah = sc.nextInt();
                total = jumlah*okeC;
                System.out.println(jumlah + " Paket OKE A");
                System.out.println("Total = Rp " + total);
                System.out.print("Jumlah Uang = ");
                uang = sc.nextInt();
                kembalian = uang-total;
                System.out.println("Kembalian = " + kembalian);
            }
            else {
                System.out.println("Pesan Eror!");
            }
        }
        
        }
        
    }
