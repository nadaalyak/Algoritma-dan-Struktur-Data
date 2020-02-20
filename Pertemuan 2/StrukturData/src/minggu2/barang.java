package minggu2;

/**
 *
 * @author Nada Alya
 */
public class barang {

    public String namaBarang, jenisBarang;
    public int stok, hargaSatuan;

    public barang() {
    }

    public barang(String nm, String jn, int st, int hs) {
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = st;
    }

    public void tampilBarang() {
        System.out.println("Nama = " + namaBarang);
        System.out.println("Jenis = " + jenisBarang);
        System.out.println("Stok = " + stok);
        System.out.println("Harga satuan = " + hargaSatuan);
    }

    public void tambahStok(int n) {
        stok = stok + n;
    }

    public void kurangStok(int n) {
        stok = stok - n;
    }

    public int hitungHargaTotal(int jumlah) {
        return jumlah * hargaSatuan;
    }
}
