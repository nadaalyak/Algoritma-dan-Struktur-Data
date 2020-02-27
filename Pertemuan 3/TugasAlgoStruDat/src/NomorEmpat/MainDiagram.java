/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NomorEmpat;
import java.util.Scanner;
/**
 *
 * @author Nada Alya
 */
public class MainDiagram {
    public static void main(String[]args){
        Scanner input = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("  Pemilihan Suara untuk Memilih Ketua BEM thn 2020  ");
        System.out.println("====================================================");
        Diagram dg = new Diagram();
        Diagram[] dia = new Diagram[dg.jumlahKandidat];
		
        for (int i = 0; i < dg.jumlahKandidat  ; i++) {
            dia[i] = new Diagram();
            System.out.print("Nama Kandidat ke-" + (i+1) + " : ");
            dia[i].kandidat = input.nextLine();
        }
         System.out.println("====================================================");
        for (int i = 0; i < dg.jumlahKandidat ; i++) {
            System.out.print("Jumlah Suara kandidat ke -" + (i+1) + " : ");
            dia[i].suara = input.nextInt();
            dg.jumlahSuara += dia[i].suara;
	}
         System.out.println("====================================================");
	int hasil = dg.hitung(dg.jumlahSuara , dia[0].suara , dia[1].suara, dia[2].suara, dia[3].suara);
	if (hasil == 0) {
            System.out.println("Masing-masing kandidat memiliki mayoritas yang hampir sama");
	}else{
            System.out.println("Ketua BEM yang terpilih adalah " + dia[hasil-1].kandidat);
	}
    }
}
