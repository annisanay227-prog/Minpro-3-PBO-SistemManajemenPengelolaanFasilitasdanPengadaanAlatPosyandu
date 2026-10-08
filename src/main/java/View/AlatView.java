package View;

import java.util.List;
import Model.AlatPosyandu;

public class AlatView {
    public void tampilkanHeader() {
        System.out.println("==================================================");
        System.out.println("   SISTEM MANAJEMEN PENGADAAN ALAT POSYANDU       ");
        System.out.println("==================================================");
    }

    public void tampilkanDaftarAlat(List<AlatPosyandu> daftarAlat) {
        if (daftarAlat.isEmpty()) {
            System.out.println("Belum ada data alat posyandu.");
            return;
        }
        System.out.println("\n--- DAFTAR ALAT POSYANDU ---");
        for (AlatPosyandu alat : daftarAlat) {
            // Memanggil method override secara polimorfin
            alat.tampilkanDetail();
        }
        System.out.println("--------------------------------------------------");
    }
}