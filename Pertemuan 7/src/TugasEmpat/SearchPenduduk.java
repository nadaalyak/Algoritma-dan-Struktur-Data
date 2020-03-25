/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TugasEmpat;

/**
 *
 * @author Nada Alya
 */
public class SearchPenduduk {
    public int jumData;
    public Penduduk daftarPenduduk[];
    public int indeks;
    
    public SearchPenduduk(int jumlah) {
        this.jumData = jumlah;
        daftarPenduduk = new Penduduk[jumlah];
    }
    
    public void Tambah(Penduduk P) {
        if (indeks<daftarPenduduk.length) {
            daftarPenduduk[indeks] = P;
            indeks++;
        } else {
            System.out.println("Data sudah penuh!!");
        }
    }
    
    public int FindSeqSearch(int cari) {
        int posisi = -1;
        for (int i = 0; i < jumData; i++) {
            if (daftarPenduduk[i].NIK == cari) {
                posisi = i;
                break;
            }
        }
        return posisi;
    }
    
    public void TampilPosisi(int x, int pos)
    {
        if (pos != -1) {
            System.out.println("NIK : " + x + " ditemukan pada indeks " + pos);
            System.out.println("Data Penduduk ke-" + (pos + 1));
            System.out.println("NIK : " + daftarPenduduk[pos].NIK);
            System.out.println("Nama : " + daftarPenduduk[pos].nama);
            System.out.println("Alamat : " + daftarPenduduk[pos].alamat);
            System.out.println("Jenis : " + daftarPenduduk[pos].jenisK);
            System.out.println("===========================================================");
        }
        else {
            System.out.println("Data " + x + " tidak ditemukan");
        }
    }
}
