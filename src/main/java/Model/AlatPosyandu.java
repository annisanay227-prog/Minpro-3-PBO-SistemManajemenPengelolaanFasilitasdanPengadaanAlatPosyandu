package Model;

public abstract class AlatPosyandu {
    private String idAlat;
    private String namaAlat;
    private int jumlah;

    public AlatPosyandu(String idAlat, String namaAlat, int jumlah) {
        this.idAlat = idAlat;
        this.namaAlat = namaAlat;
        this.jumlah = jumlah;
    }

    public String getIdAlat() { return idAlat; }
    public void setIdAlat(String idAlat) { this.idAlat = idAlat; }
    public String getNamaAlat() { return namaAlat; }
    public void setNamaAlat(String namaAlat) { this.namaAlat = namaAlat; }
    public int getJumlah() { return jumlah; }
    public void setJumlah(int jumlah) { this.jumlah = jumlah; }

    // Abstract method (Abstraction)
    public abstract void tampilkanDetail();
}