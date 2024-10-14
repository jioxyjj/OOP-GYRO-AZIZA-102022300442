package wow;
public class BarangElektronik extends Barang {
    private String garansi;

    // Constructor BarangElektronik
    public BarangElektronik (String garansi, String nama, int jumlah, double harga){
        super(nama, jumlah, harga);
        this.garansi = garansi;
    }


    // Getter dan Setter untuk garansi
    public String getGaransi(){
        return garansi;
    }
    public void setGaransi(String garansi){
        this.garansi = garansi;
    }

    // Override method tampilkanData
    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Garansi: " + garansi);

    }
}