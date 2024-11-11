package wow;
public class BarangNonElektronik extends Barang {
    private String material;

    // Constructor BarangNonElektronik
    public BarangNonElektronik(String material, String nama, int jumlah, double harga){
        super(nama, jumlah, harga);
        this.material = material;
    }

    // Getter dan Setter untuk material
    public String getMaterial(){
        return material;
    }
    public void setMaterial(String material){
        this.material = material;
    }
    // Override method tampilkanData
    @Override
    public void tampilkanData() {
        super.tampilkanData();
        System.out.println("Material: " + material);

    }
}