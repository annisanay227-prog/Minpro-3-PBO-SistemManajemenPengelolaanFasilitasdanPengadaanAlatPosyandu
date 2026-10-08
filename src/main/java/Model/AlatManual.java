package Model;

public class AlatManual extends AlatPosyandu {
    private String bahanUtama;

    public AlatManual(String idAlat, String namaAlat, int jumlah, String bahanUtama) {
        super(idAlat, namaAlat, jumlah);
        this.bahanUtama = bahanUtama;
    }

    public String getBahanUtama() { return bahanUtama; }
    public void setBahanUtama(String bahanUtama) { this.bahanUtama = bahanUtama; }

    // Kode untuk menampilkan data Alat Manual
    @Override
    public void tampilkanDetail() {
        System.out.println("[MANUAL]  ID: " + getIdAlat() + " | Nama: " + getNamaAlat() + 
                           " | Jumlah: " + getJumlah() + " | Bahan: " + bahanUtama);
    }
}