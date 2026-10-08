package Main;

import Controller.AlatController;
import View.AlatView;

public class Main {
    public static void main(String[] args) {
        AlatController controller = new AlatController();
        AlatView view = new AlatView();

        view.tampilkanHeader();

        // Menggunakan Overloading pada Controller
        controller.tambahAlat("DIG-01", "Timbangan Bayi Digital", 5, "AA (2 Biji)", true);
        controller.tambahAlat("DIG-02", "Tensimeter Digital", 3, "Li-Ion Rechargeable", true);
        controller.tambahAlat("MAN-01", "Pita LILA (Lingkar Lengan)", 20, "Kain Sintetis", false);
        controller.tambahAlat("MAN-02", "Stadiometer Manual", 2); // Menggunakan method overloading kedua

        // Menampilkan seluruh data alat
        view.tampilkanDaftarAlat(controller.getDaftarAlat());
    }
}