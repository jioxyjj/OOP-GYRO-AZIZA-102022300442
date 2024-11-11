package halo;

public class Hewan {
    protected String nama;
    protected int umur;

    public Hewan(String nama, int umur){
        this.nama = nama;
        this.umur = umur;
    }

    public void suara(){
        System.out.println(nama + "Bersuara");
    }
    public void makan(){
        System.out.println(nama + " sedang makan");
    }
    //overloading
    public void makan(String makanan){
        System.out.println(nama + " sedang makan " + makanan);
    }
    public void infoHewan(){
        System.out.println("Nama hewan : " + nama);
        System.out.println("Umur hewan : " + umur);
    }
}