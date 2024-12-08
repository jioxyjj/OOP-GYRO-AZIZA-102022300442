public class Album {

    private String judulAlbum;
    private String namaArtis;
    private int jumlahTotal;
    private int tersedia;
    private int sewa;


    public Album(String judulAlbum, String namaArtis, int jumlahTotal, int tersedia, int sewa) {
        this.judulAlbum = judulAlbum;
        this.namaArtis = namaArtis;
        this.jumlahTotal = jumlahTotal;
        this.tersedia = tersedia;
        this.sewa = sewa;
    }

    public String getJudulAlbum() {
        return judulAlbum;
    }

    public void setjudulAlbum(String judulAlbum) {
        this.judulAlbum = judulAlbum;
    }

    public String getNamaArtis() {
        return namaArtis;
    }

    public void setnamaArtis(String namaArtis) {
        this.namaArtis = namaArtis;
    }

    public int getJumlahTotal() {
        return jumlahTotal;
    }

    public void setjumlahTotal(int jumlahTotal) {
        this.jumlahTotal = jumlahTotal;
    }

    public int getTersedia() {
        return tersedia;
    }

    public void settersedia(int tersedia) {
        this.tersedia = tersedia;
    }

    public int getSewa() {
        return sewa;
    }

    public void setsewa(int sewa) {
        this.sewa = sewa;
    }
}
