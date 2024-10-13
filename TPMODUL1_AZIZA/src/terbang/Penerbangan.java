package terbang;

class Penerbangan {
    private String nomorPenerbangan;
    private String bandaraKeberangkatan;
    private String bandaraTujuan;
    private String waktuKeberangkatan;
    private String waktuKedatangan;
    private float hargaTiket;

    public Penerbangan(String np, String bk, String bt, String wkb, String wkd, float ht){
        this.nomorPenerbangan = np;
        this.bandaraKeberangkatan = bk;
        this.bandaraTujuan = bt;
        this.waktuKeberangkatan = wkb;
        this.waktuKedatangan = wkd;
        this.hargaTiket = ht;
    }

    public Penerbangan(String bandaraKeberangkatan, String bandaraTujuan, float hargaTiket, String nomorPenerbangan, String waktuKeberangkatan, String waktuKedatangan) {
        this.bandaraKeberangkatan = bandaraKeberangkatan;
        this.bandaraTujuan = bandaraTujuan;
        this.hargaTiket = hargaTiket;
        this.nomorPenerbangan = nomorPenerbangan;
        this.waktuKeberangkatan = waktuKeberangkatan;
        this.waktuKedatangan = waktuKedatangan;
    }

    public String getnomorPenerbangan(){
        return nomorPenerbangan;
    }
    public String getbandaraKeberangkatan(){
        return bandaraKeberangkatan;
    }
    public String getbandaraTujuan(){
        return bandaraTujuan;
    }
    public String getwaktuKeberangkatan(){
        return waktuKeberangkatan;
    }
    public String getwaktuKedatangan(){
        return waktuKeberangkatan;
    }

    public void tampilDaftarPenerbangan() {
        System.out.println("Nomor Penerbangan: " + nomorPenerbangan);
        System.out.println("Bandara Keberangkatan: " + bandaraKeberangkatan + " ---> Bandara Tujuan: " + bandaraTujuan);
        System.out.println("Waktu Keberangkatan: " + waktuKeberangkatan + " ---> Waktu Kedatangan: " + waktuKedatangan);
        System.out.println("Harga Tiket: Rp." + hargaTiket);
        System.out.println();
    }


}
