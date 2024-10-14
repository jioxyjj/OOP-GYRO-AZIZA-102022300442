package terbang;

import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    public static void main(String[] args) {
        ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
        try (Scanner input = new Scanner(System.in)) {
            Penumpang penumpang = null;
            Penerbangan penerbanganTerpilih = null;

            daftarPenerbangan.add(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
            daftarPenerbangan.add(new Penerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));

            int pilihan;
            do {
                System.out.println("======= EAD Ticket Booking System =======");
                System.out.println("1. Tampilkan Daftar Penerbangan");
                System.out.println("2. Beli Tiket");
                System.out.println("3. Tampilkan Pesanan Tiket");
                System.out.println("4. Exit");
                System.out.print("Silahkan pilih menu: ");
                pilihan = input.nextInt();

                switch (pilihan) {
                    case 1:
                        System.out.println("\nDaftar Penerbangan:");
                        for (int i = 0; i < daftarPenerbangan.size(); i++) {
                            System.out.println((i + 1) + ". ");
                            daftarPenerbangan.get(i).tampilDaftarPenerbangan();
                        }
                        break;
                    case 2:
                        System.out.print("Masukkan NIK: ");
                        input.nextLine();  
                        String NIK = input.nextLine();
                        System.out.print("Masukkan Nama Depan: ");
                        String namaDepan = input.nextLine();
                        System.out.print("Masukkan Nama Belakang: ");
                        String namaBelakang = input.nextLine();

                        penumpang = new Penumpang(NIK, namaDepan, namaBelakang);

                        System.out.println("\nPilih nomor penerbangan:");
                        for (int i = 0; i < daftarPenerbangan.size(); i++) {
                            System.out.println((i + 1) + ". " + daftarPenerbangan.get(i).getnomorPenerbangan());
                        }

                        System.out.print("Masukkan pilihan: ");
                        int pilihanPenerbangan = input.nextInt();
                        if (pilihanPenerbangan > 0 && pilihanPenerbangan <= daftarPenerbangan.size()) {
                            penerbanganTerpilih = daftarPenerbangan.get(pilihanPenerbangan - 1);
                        } else {
                            System.out.println("Pilihan penerbangan tidak valid!");
                        }
                        break;
                    case 3:
                        if (penumpang != null && penerbanganTerpilih != null) {
                            System.out.println("\nDetail Pesanan:");
                            penumpang.tampilDaftarPenumpang();
                            penerbanganTerpilih.tampilDaftarPenerbangan();
                        } else {
                            System.out.println("Belum ada tiket yang dipesan.");
                        }
                        break;
                    case 4:
                        System.out.println("Terima kasih telah menggunakan layanan kami!");
                        break;
                    default:
                        System.out.println("Pilihan tidak valid!");
                        break;
                }
            } while (pilihan != 4);
        }
    }
}
