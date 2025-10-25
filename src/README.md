
# Program Login Mahasiswa (Java)

Program ini merupakan contoh sederhana penggunaan **class**, **constructor**, dan **method static** pada Java untuk sistem login mahasiswa.

## Deskripsi Program

Class `mahasiswa` menyimpan data `nama` dan `nim` sebagai **variabel static**, sehingga nilainya berlaku secara global untuk seluruh objek. Program ini memungkinkan proses login dengan mencocokkan input pengguna terhadap data yang telah disimpan sebelumnya.

## Fitur

* **Menyimpan data mahasiswa** melalui constructor
* **Fungsi login** untuk memvalidasi nama dan NIM
* **Menampilkan informasi mahasiswa** jika login berhasil


## Cara Kerja

1. Buat objek baru `mahasiswa("Nurul", "126")` → otomatis menyimpan data
2. Lakukan proses `login("Nurul", "126")`
3. Jika data cocok → tampil pesan sukses melalui `display_info()`

## Catatan

* Variabel `nama` dan `nim` menggunakan **static**, artinya hanya 1 data yang disimpan untuk seluruh objek.
* Cocok untuk konsep **OOP dasar & validasi login sederhana**.

