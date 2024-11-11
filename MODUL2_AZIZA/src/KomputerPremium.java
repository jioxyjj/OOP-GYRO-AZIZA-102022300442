class KomputerPremium extends Komputer {
    // To do: Buatlah 1 variable sesuai ketentuan
    protected boolean ruangPrivat;
    
    // To do: Buatlah constructor pada class KomputerPremium
    public KomputerPremium(int jumlahKomputer, String namaWarnet, float hargaPerJam, boolean ruangPrivat) {
        super(jumlahKomputer, namaWarnet, hargaPerJam);
        this.ruangPrivat = ruangPrivat;
    }

    // To do: Buatlah Method Informasi memakai Polymorphism Override dengan isi yang sesuai dengan ketentuan 
    @Override
    public void Informasi(){
        super.Informasi();
        if(ruangPrivat){
        System.out.println("Status ruangan : Ruang Premium");  
        System.out.println("\nFasilitas ruang premium :");
        System.out.println("- Ruangan ber AC");
        System.out.println("- Kursi gaming");
        System.out.println("- Komputer spek tinggi");
        System.out.println("- Koneksi pake biznet 1000mbps");
        }
        else{
            System.out.println("Status ruangan: Ruangan standard");
            System.out.println("\nFasilitas ruang standard");
            System.out.println("- Pake kipas cosmos");
            System.out.println("- Kursi nikahan");
            System.out.println("- Komputer merek toshiba");
            System.out.println("- Koneksi pake myNet 5mbps");
        }

    }
    // (boleh berbeda dengan output jurnal tetapi dengan cangkupan masih sesuai oleh materi modul!)
    
    // To do: Buatlah method Pesan sesuai dengan ketentuan
    public void Pesan(int nomorKomputer){
        System.out.println("\nMemesan komputer nomor : " + nomorKomputer);
    }
    // To do: Buatlah method TambahLayanan sesuai dengan ketentuan
    public void TambahLayanan(String makanan){
        System.out.println("Menambah layanan makanan : " + makanan);
    }
    // To do: Buatlah method TambahLayanan memakai Polymorphism Overloading sesuai dengan ketentuan
    public void TambahLayanan(String makanan, String minuman){
        System.out.println("Menambah layanan makanan : " + makanan + "dan minuman : " + minuman);
    }


}
