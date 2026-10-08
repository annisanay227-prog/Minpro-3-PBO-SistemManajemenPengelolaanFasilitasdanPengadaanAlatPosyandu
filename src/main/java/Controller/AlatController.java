package Controller;

import java.util.ArrayList;
import java.util.List;
import Model.AlatPosyandu;
import Model.AlatDigital;
import Model.AlatManual;

public class AlatController {
    private final List<AlatPosyandu> daftarAlat = new ArrayList<>();

    // Polymorphism: Method Overloading (Untuk Alat Digital & Manual)
    public void tambahAlat(String id, String nama, int jumlah, String spesifik, boolean isDigital) {
        if (isDigital) {
            daftarAlat.add(new AlatDigital(id, nama, jumlah, spesifik));
        } else {
            daftarAlat.add(new AlatManual(id, nama, jumlah, spesifik));
        }
    }

    // Polymorphism: Method Overloading (Default Manual jika tidak menyebutkan jenis)
    public void tambahAlat(String id, String nama, int jumlah) {
        daftarAlat.add(new AlatManual(id, nama, jumlah, "Plastik/Logam Standard"));
    }

    public List<AlatPosyandu> getDaftarAlat() {
        return daftarAlat;
    }
}