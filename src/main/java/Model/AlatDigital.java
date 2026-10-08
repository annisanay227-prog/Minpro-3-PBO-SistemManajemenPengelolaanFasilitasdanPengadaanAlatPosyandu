package Model;

public class AlatDigital extends AlatPosyandu {
    private String jenisBaterai;

    public AlatDigital(String idAlat, String namaAlat, int jumlah, String jenisBaterai) {
        super(idAlat, namaAlat, jumlah);
        this.jenisBaterai = jenisBaterai;
    }

    public String getJenisBaterai() { return jenisBaterai; }
    public void setJenisBaterai(String jenisBaterai) { this.jenisBaterai = jenisBaterai; }

    // Kode untuk menampilkan data Alat Digital
    @Override
    public void tampilkanDetail() {
        System.out.println("[DIGITAL] ID: " + getIdAlat() + " | Nama: " + getNamaAlat() + 
                           " | Jumlah: " + getJumlah() + " | Baterai: " + jenisBaterai);
    }
}