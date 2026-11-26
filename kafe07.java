import java.util.Scanner;
public class kafe07 {
    // public static void ubahNama(String nama) {
    //     nama = "Tamu";
    //     System.out.println("Di dalam fungsi: " + nama);
    // }
    // public static void main(String[] args) {
    //     String nama = "Andi";
    //     ubahNama(nama);
    //     System.out.println("Di main: " + nama);
    // }

    // public static void Menu(String namaPelanggan, String isMember, int jamKumjung) {
    //     if (isMember.equalsIgnoreCase("y")) {
    //         System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
    //     }

    //     if (jamKumjung >= 14 && jamKumjung <= 16) {
    //         System.out.println("Happy Hour! Diskon 20% untuk semua minuman.");
    //     }
        
    //     System.out.println("==== MENU RESTO KAFE ====");
    //     System.out.println("1. Kopi Hitam - Rp 15,000");
    //     System.out.println("2. Cappuccino - Rp 20,000");
    //     System.out.println("3. Latte - Rp 22,000");
    //     System.out.println("4. Teh Tarik - Rp 12,000");
    //     System.out.println("5. Roti Bakar - Rp 10,000");
    //     System.out.println("6. Mie Goreng - Rp 18,000");
    //     System.out.println("==========================");
    //     System.out.println("Silahkan pilih menu yang Anda inginkan.");
    // }

    public static void Menu(String namaPelanggan, boolean isMember) {
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }
        
        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan.");
    }

    public static int hitungTotalHarga07(int pilihanMenu, int banyakItem) {
        int[] hargaItem = {15000, 20000, 22000, 12000, 10000, 18000};

        int hargaTotal = hargaItem[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }
    
    public static boolean menuValid(int pilihanMenu) {
        return pilihanMenu >=1 && pilihanMenu <= 6;
    }

    public static double hitungDiskon(int totBayar, String kodePromo, boolean isMember) {
        double diskon = 0, diskonMember = 0;
        if (kodePromo.equals("DISKON50")) {
            diskon = 0.5;
        } else if (kodePromo.equals("DISKON30")) {
            diskon = 0.3;
        } else {
            System.out.println("Kode promo invalid");
        }
        if (isMember) {
            diskonMember = 0.1;
        } else {
            diskonMember = 0;
        }
        double besarDiskon = totBayar*diskon + totBayar*diskonMember;
        return besarDiskon;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totBayar = 0;
        System.out.print("Masukkan nama Anda: ");
        String nama = sc.nextLine();
        System.out.print("Status Member? (true/false): ");
        boolean status = sc.nextBoolean(); sc.nextLine();
        System.out.print("Kode Promo: ");
        String proomo = sc.nextLine().toUpperCase();

        Menu(nama, status);

        do {
            System.out.print("\nMasukkan nomor menu (0 untuk keluar): ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) {
                break;
            }

            if (menuValid(pilihanMenu)) {
                System.out.print("Masukkan jumlah item: ");
                int banyakItem = sc.nextInt();

                int harga = hitungTotalHarga07(pilihanMenu, banyakItem);
                totBayar += harga;
            } else {
                System.out.println("Pilihan tidak ada di menu.");
            }

        } while (true);

        double hargaBersih = totBayar - hitungDiskon(totBayar, proomo, status);
        System.out.println("Total Bayar: " + totBayar);
        System.out.println("Diskon yg didapat: " + hitungDiskon(totBayar, proomo, status));
        System.out.println("Harga yang perlu dibayar: " + hargaBersih);
        // int totBayar = hitungTotalHarga07(pilihanMenu, banyakItem);
        
        // System.out.println("Total harga untuk pesanan Anda: Rp" + hitungTotalHarga07(pilihanMenu, banyakItem));

        
        // System.out.print("Masukkan nama Anda: ");
        // String nama = sc.nextLine();
        // System.out.print("Status Member? (y/n): ");
        // String status = sc.nextLine();
        // System.out.print("Jam Kunjung: ");
        // int jam = sc.nextInt();

        // Menu(nama, status, jam);    
        
    }    

    // public static int jmlMenu() {
        //     int jumlah = 6;
        //     return jumlah;
        // }
}