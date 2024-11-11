package wow;
public class Barang {
    private String nama;
    private int jumlah;
    private double harga;

    // Constructor Barang
    public Barang(String nama, int jumlah, double harga){
        this.nama = nama;
        this.jumlah = jumlah;
        this. harga = harga;
    }

    // Getter dan Setter
    public String getNama(){
        return nama;
    }
    public int getJumlah(){
        return jumlah;
    }
    public double getHarga(){
        return harga;
    }

    public void setNama(String nama){
        this.nama = nama;
    }
    public void setJumlah(int jumlah){
        this.jumlah = jumlah;
    }
    public void setHarga(double harga){
        this.harga = harga;
    }

    // Method tampilkanData
    public void tampilkanData(){
        System.out.println("Nama Barang: " +  nama);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Harga: " + harga);
    }
}