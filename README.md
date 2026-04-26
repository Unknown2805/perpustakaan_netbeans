# Aplikasi Manajemen Perpustakaan 📚

Aplikasi desktop berbasis Java untuk mengelola data buku, anggota, dan transaksi peminjaman di perpustakaan. Dibangun menggunakan Java Swing (NetBeans) dan MySQL/MariaDB.

## 🚀 Fitur Utama

- **Sistem Autentikasi (Role-Based):** Login terpisah untuk `Admin` dan `Anggota` (berdasarkan tabel `roles`).
- **Manajemen Buku:** Mendata buku beserta stok (`j_baik` & `j_rusak`), Penulis, Penerbit, dan Kategori.
- **Sirkulasi / Transaksi:** - Mencatat peminjaman buku oleh user.
  - Mencatat pengembalian buku beserta kalkulasi denda otomatis.

## 🗄️ Struktur Database (Flowchart / ERD)

Berikut adalah alur relasi antar tabel dalam sistem ini:

```text
+-----------+       +--------------+       +--------------+
|   roles   |       |    users     |       |  peminjaman  |
+-----------+       +--------------+       +--------------+
| id (PK)   |<------| role_id (FK) |       | id (PK)      |
| nama      |       | id (PK)      |<------| user_id (FK) |
+-----------+       | nama         |       | buku_id (FK) |----->+
                    | username     |       | tgl          |      |
                    | pass         |       +--------------+      |
                    +--------------+              | 1            |
                                                  |              |
                                                  v * |
                                           +--------------+      |
                                           | pengembalian |      |
                                           +--------------+      |
                                           | id (PK)      |      |
                                           | tgl          |      |
                                           | denda        |      |
                                           | peminj_id(FK)|      |
                                           +--------------+      |
                                                                 |
                                     +---------------------------+
                                     |
                                     v
+-----------+       +--------------+       +--------------+
| kategori  |       |     buku     |       |   penulis    |
+-----------+       +--------------+       +--------------+
| id (PK)   |<------| kategori_id  |       | id (PK)      |
| nama      |       | id (PK)      |------>| nama         |
+-----------+       | nama         |       +--------------+
                    | j_rusak      |
                    | j_baik       |       +--------------+
                    | penerbit_id  |------>|   penerbit   |
                    | penulis_id   |       +--------------+
                    +--------------+       | id (PK)      |
                                           | nama         |
                                           +--------------+
