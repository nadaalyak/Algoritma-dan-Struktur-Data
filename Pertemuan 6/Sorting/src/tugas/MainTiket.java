package tugas;
import java.util.Scanner;
/**
 *
 * @author Nada Alya
 */
public class MainTiket {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        DaftarHargaTiket data = new DaftarHargaTiket();
        int jmlTiket = 5;
        
        for(int i=0; i<jmlTiket; i++){
            System.out.println("======MENU TIKET======");
            System.out.print("Nama Maskapai : ");
            String nama = s1.nextLine();
            System.out.print("Harga Tiket : Rp. ");
            float harga = sc.nextFloat();
            System.out.print("Transit Penerbangan : ");
            int transitCount = sc.nextInt();
            System.out.print("Jam Penerbangan : ");
            int flightTime = sc.nextInt();
            System.out.println();
            
            Tiket t = new Tiket(nama, harga, transitCount, flightTime);
            data.tambah(t);
        }
        System.out.println("==============================================");
        System.out.println("DAFTAR HARGA TIKET PESAWAT PER MASKAPAI PENERBANGAN");
        System.out.println("==============================================");
        data.tampil();
        
        System.out.println();
        System.out.println("=================================");
        System.out.println("DAFTAR HARGA TIKET SECARA BUBBLE SORT");
        System.out.println("=================================");
        data.bubbleSort();
        data.tampil();
        
        System.out.println();
        System.out.println("====================================");
        System.out.println("DAFTAR HARGA TIKET SECARA SELESCTION SORT");
        System.out.println("====================================");
        data.selectionSort();
        data.tampil();
    }
}

