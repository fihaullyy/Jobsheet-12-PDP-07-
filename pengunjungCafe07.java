public class pengunjungCafe07 {
    static void daftarPengunjung(int nomorMeja, String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung Meja " + nomorMeja + ": ");
        for (String nama : namaPengunjung) {
            System.out.println("- " + nama);
        }
        // for (int i = 0; i < namaPengunjung.length; i++) {
        //     System.out.println("- " + namaPengunjung[i]);
        // }
    }
    static int hitungTotBelanja(int... harga) {
        int total = 0;
        for (int i = 0; i < harga.length; i++) {
            total += harga[i];
        }
        return total;
    }
    public static void main(String[] args) {
        daftarPengunjung(1, "Andi");
        // hitungTotBelanja(15000);
        System.out.println("Total Belanja: " + hitungTotBelanja(15000));
        daftarPengunjung(2, "Ali", "Budi", "Citra");
        System.out.println("Total Belanja: " + hitungTotBelanja(10000, 20000, 13000));
        // hitungTotBelanja(10000, 20000, 13000);
        daftarPengunjung(3, "Doni", "Eti", "Fahmi", "Galih", "Rufina");
        System.out.println("Total Belanja: " + hitungTotBelanja(8000, 10000, 17000, 20000, 25000));
        // hitungTotBelanja(8000, 10000, 17000, 20000, 25000);
        // String[] tamu = {"Ali", "Budi", "Citra"};
        // daftarPengunjung(tamu);
    }
}