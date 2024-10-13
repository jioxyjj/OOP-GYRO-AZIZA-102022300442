package terbang;

import java.util.ArrayList;
import java.util.Scanner;

public class Pembelian {
    public static void main(String[] args) {
        ArrayList<Penerbangan> daftarPenerbangan = new ArrayList<>();
        try (Scanner input = new Scanner(System.in)) {
            Penumpang penumpang = null;
            Penerbangan penerbanganTerpilih = null;
            
            // Menambahkan penerbangan (Contoh)
            daftarPenerbangan.add(new Penerbangan("GA101", "CGK, Jakarta", "DPS, Bali", "06:30", "08:15", 1200000));
            daftarPenerbangan.add(new Penerbangan("QZ202", "SUB, Surabaya", "KNO, Medan", "09:00", "11:45", 1350000));
            
            int pilihan;
            do {
                // Tampilkan Menu
                System.out.println("======= EAD Ticket Booking System =======");
                System.out.println("1. Tampilkan Daftar Penerbangan");
                System.out.println("2. Beli Tiket");
                System.out.println("3. Tampilkan Pesanan Tiket");
                System.out.println("4. Exit");
                System.out.print("Silahkan pilih menu: ");
                pilihan = input.nextInt();
                
                switch (pilihan) {
                    case 1 -> {
                        // Tampilkan Daftar Penerbangan
                        System.out.println("\nDaftar Penerbangan:");
                        for (int i = 0; i < daftarPenerbangan.size(); i++) {
                            System.out.println((i + 1) + ". ");
                            daftarPenerbangan.get(i).tampilDaftarPenerbangan();
                        }
                    }
                    case 2 -> {
                        // Beli Tiket
                        System.out.print("Masukkan NIK: ");
                        input.nextLine();  // Membersihkan buffer
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
                        
                        int pilihanPenerbangan = input.nextInt();
                        penerbanganTerpilih = daftarPenerbangan.get(pilihanPenerbangan - 1);
                    }
                    case 3 -> {
                        // Tampilkan Pesanan Tiket
                        if (penumpang != null && penerbanganTerpilih != null) {
                            System.out.println("\nDetail Pesanan:");
                            penumpang.tampilDaftarPenumpang();
                            penerbanganTerpilih.tampilDaftarPenerbangan();
                        } else {
                            System.out.println("Belum ada tiket yang dipesan.");
                        }
                    }
                    case 4 -> // Exit
                        System.out.println("Terima kasih telah menggunakan layanan kami!");
                    default -> System.out.println("Pilihan tidak valid!");
                }
            } while (pilihan != 4);
        }
    }
}