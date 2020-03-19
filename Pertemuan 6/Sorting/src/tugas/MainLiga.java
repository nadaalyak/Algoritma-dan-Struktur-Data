/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas;

/**
 *
 * @author Nada Alya
 */
public class MainLiga {

    public static void main(String[] args) {
        DaftarLiga data = new DaftarLiga();
        Liga[] l = new Liga[20];

        l[0] = new Liga("Manchester United", 28, 12, 42);
        l[1] = new Liga("Tottenham Hotspur", 29, 7, 41);
        l[2] = new Liga("Arsenal", 28, 4, 40);
        l[3] = new Liga("Burnley", 29, -6, 39);
        l[4] = new Liga("Crystal Palace", 29, -6, 39);
        l[5] = new Liga("Everton", 29, -6, 37);
        l[6] = new Liga("Liverpool", 29, 45, 82);
        l[7] = new Liga("Manchester City", 27, 39, 57);
        l[8] = new Liga("Leicester", 28, 26, 50);
        l[9] = new Liga("Newcastle United", 29, -16, 35);
        l[10] = new Liga("Southampton", 29, -17, 34);
        l[11] = new Liga("Brighton & Hove Albion", 29, -8, 29);
        l[12] = new Liga("Chelsea", 29, 9, 48);
        l[13] = new Liga("Wolverhampton Wanderers", 29, 7, 43);
        l[14] = new Liga("Sheffield United", 28, 5, 43);
        l[15] = new Liga("West Ham United", 29, -15, 27);
        l[16] = new Liga("Watford", 29, -17, 27);
        l[17] = new Liga("AFC Bournemouth", 29, -18, 27);
        l[18] = new Liga("Aston Villa", 27, -18, 25);
        l[19] = new Liga("Norwich City", 29, -27, 21);

        for (int i = 0; i < 20; i++) {
            data.tambah(l[i]);
        }

        System.out.println("Daftar Liga Inggris sebelum sorting : ");
        data.tampil();
        System.out.println();
        System.out.println("============================================");
        System.out.println("Daftar Liga Inggris setelah insertion sort secara asc : ");
        data.insertionSortA();
        data.tampil();
        System.out.println();
        System.out.println("============================================");
        System.out.println("Daftar Liga Inggris setelah insertion sort secara desc : ");
        data.insertionSortD();
        data.tampil();
    }
}

