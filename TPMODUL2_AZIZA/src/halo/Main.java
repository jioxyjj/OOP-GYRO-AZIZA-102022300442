package halo;

public class Main {
    public static void main(String[] args) {
        System.out.println("Detail Hewan\n");
        Kucing kucing = new Kucing("asep", 3, "Persia");
        System.out.println("ini adalah " + kucing.nama + "!");
        kucing.suara();
        kucing.makan();
        kucing.makan("ikan asin");
        kucing.infoHewan();

        Burung burung = new Burung("alibaba", 1, "merah");
        System.out.println("\nini adalah " + burung.nama + "!");
        burung. suara();
        burung.makan();
        burung.makan("kacang");
        burung.infoHewan();
    }
}
