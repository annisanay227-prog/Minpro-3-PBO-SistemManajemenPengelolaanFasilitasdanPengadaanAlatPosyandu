# Sistem Manajemen Posyandu
Sistem sederhana berbasis CLI (Command Line Interface) untuk membantu kader dan pengelola posyandu dalam mencatat inventaris alat kesehatan serta mengelola rencana pengadaan fasilitas baru menggunakan konsep Pemrograman Berbasis Objek (PBO) di Java.

---

## 1. Deskripsi Singkat Program
Program ini dirancang untuk memudahkan pengelola posyandu dalam mencatat, memantau, serta mengelola daftar alat kesehatan dan rencana pengadaan fasilitas secara dinamis. Fitur utama mencakup operasi **CRUD (Create, Read, Update, Delete)** yang memungkinkan pengguna menambahkan alat kesehatan atau pengajuan fasilitas baru, melihat daftar fasilitas dalam bentuk tabel, memperbarui status pengadaan atau kondisi alat, dan menghapus data yang tidak lagi relevan.

## 2. Struktur Class & Package
Program ini menggunakan arsitektur MVC (Model-View-Controller) untuk memisahkan tanggung jawab tiap kelas agar struktur kode rapi dan mudah dirawat:

**model**
berisi kelas-kelas Utama yang mempresentasikan entitas barang/alat di posyandu
*AlatPosyandu
*AlatDigital
*AlatManual

**Conroller**
berisi AlatAlatController yang mengatur logika bisnis, menyimpan data dalam list, dan mengelola penambahan alat.

**View**
AlatController yang mengatur logika bisnis, menyimpan data dalam list, dan mengelola penambahan alat.

**Main**
Menjadi entry point (titik awal) untuk menjalankan seluruh alur program

## Penjelasan Alur Program
Saat Main.java dijalankan, program mengawali proses dengan melakukan inisialisasi berupa pembuatan objek dari AlatController dan AlatView. Selanjutnya, program memanggil fungsi tampilkanHeader() milik AlatView untuk mencetak judul sistem pada layar konsol. Setelah antarmuka tampil, program melakukan penginputan data dengan menambahkan beberapa sampel alat digital dan manual ke dalam sistem menggunakan method tambahAlat() pada AlatController. Sebagai penutup, AlatController mengirimkan daftar seluruh alat yang telah tersimpan kepada AlatView, yang kemudian memanggil fungsi tampilkanDetail() dari masing-masing alat secara otomatis untuk menyajikan rincian data secara lengkap ke layar konsol
penerapan Polymorphidm dan abstraction. Penerapan abstraction pada program ini dilakukan dengan mendeklarasikan AlatPosyandu sebagai sebuah abstract class karena sifatnya yang masih berupa gambaran umum dan tidak diinstansiasi secara langsung. Di dalamnya terdapat abstract method berupa public abstract void tampilkanDetail(); yang mewajibkan seluruh kelas turunan, yaitu AlatDigital dan AlatManual, untuk memberikan implementasi cetak detailnya masing-masing.
Sementara itu, polymorphism diterapkan melalui dua mekanisme, yaitu method overriding dan method overloading. Penerapan method overriding terlihat saat kelas AlatDigital dan AlatManual mengesampingkan serta mendefinisikan ulang method tampilkanDetail() milik parent class sesuai dengan karakteristik data khas masing-masing. Adapun method overloading diterapkan pada kelas AlatController, di mana terdapat dua variasi method tambahAlat() dengan jumlah dan tipe parameter yang berbeda—satu untuk menginput detail jenis alat secara spesifik, dan satu lagi untuk input default alat manual tanpa harus menyebutkan jenisnya
