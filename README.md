# WarnetAPP
Aplikasi manajemen warnet berbasis Java Desktop menggunakan Java Swing dan MySQL. Project ini dibuat sebagai tugas Project Akhir Semester untuk membantu pengelolaan member, sistem billing waktu bermain, login multi-role (admin &amp; member), serta monitoring penggunaan komputer warnet secara sederhana dan efisien.

## 📌 Tentang Project

WarnetApp adalah aplikasi desktop sederhana yang dibuat untuk memenuhi tugas Project Akhir Semester. Aplikasi ini digunakan untuk membantu pengelolaan warnet seperti login admin, login member, manajemen member, penambahan billing, dan monitoring sisa waktu penggunaan member.

Project ini dibuat menggunakan:

* Java NetBeans (Java Swing)
* MySQL Database
* JDBC Connection

---

# 🎯 Tujuan Project

Project ini dibuat untuk:

* Mempelajari konsep CRUD pada Java
* Menghubungkan aplikasi Java dengan database MySQL
* Memahami sistem login dan hak akses user
* Mengimplementasikan timer billing warnet
* Melatih pembuatan GUI menggunakan Java Swing

---

# 🛠️ Teknologi yang Digunakan

| Teknologi  | Keterangan                |
| ---------- | ------------------------- |
| Java       | Bahasa pemrograman utama  |
| Java Swing | Pembuatan tampilan GUI    |
| MySQL      | Database penyimpanan data |
| JDBC       | Koneksi Java ke MySQL     |
| NetBeans   | IDE pengembangan aplikasi |

---

# ✨ Fitur Utama

## 1. Role Menu

User dapat memilih role sebelum login:

* Login sebagai Admin
* Login sebagai Member

File:

* `Rolemenu.java`

---

## 2. Login Admin

Admin memiliki akses penuh terhadap sistem.

Fitur:

* Validasi username dan password
* Sistem login admin
* Alert jika login gagal

File:

* `AdminLogin.java`

---

## 3. Dashboard Admin

Dashboard utama untuk pengelolaan warnet.

Fitur:

* Membuat akun member baru
* Melihat data member
* Menambahkan billing/waktu bermain
* Generate kode member
* Logout sistem
* Menu about aplikasi

File:

* `DashboardAdmin.java`

---

## 4. Login Member

Member dapat login menggunakan akun yang telah dibuat admin.

Fitur:

* Login member
* Validasi akun
* Tampilan alert login

File:

* `MemberLogin.java`

---

## 5. Dashboard Member

Dashboard yang digunakan member saat memakai komputer warnet.

Fitur:

* Menampilkan username member
* Menampilkan sisa waktu bermain
* Timer berjalan otomatis
* Penyimpanan sisa waktu ke database
* Auto logout saat waktu habis

File:

* `DashboardMember.java`

---

## 6. Forgot Password

Fitur reset password sederhana untuk member.

File:

* `ForgotPasswordMember.java`

---

## 7. Database Connection

Menghubungkan aplikasi Java dengan database MySQL menggunakan JDBC.

Fitur:

* Koneksi database otomatis
* Menggunakan localhost MySQL

File:

* `DBConnection.java`

Contoh koneksi:

```java
String url = "jdbc:mysql://localhost:3306/warnetapp";
String user = "root";
String password = "";
```

---

# 🗄️ Database

Database yang digunakan bernama:

```sql
warnetapp
```

Database digunakan untuk menyimpan:

* Data admin
* Data member
* Username dan password
* Saldo waktu member
* Data billing

---

# 📂 Struktur Project

```bash
WarnetApp/
│
├── src/
│   ├── warnetapp/
│   │   ├── admin/
│   │   │   ├── AdminLogin.java
│   │   │   └── DashboardAdmin.java
│   │   │
│   │   ├── member/
│   │   │   ├── MemberLogin.java
│   │   │   ├── DashboardMember.java
│   │   │   └── ForgotPasswordMember.java
│   │   │
│   │   ├── Rolemenu/
│   │   │   └── Rolemenu.java
│   │   │
│   │   ├── DBConnection.java
│   │   └── Main.java
│
└── database/
```

---

# ▶️ Cara Menjalankan Project

## 1. Clone Repository

```bash
git clone [URL_REPOSITORY]
```

---

## 2. Import Database

1. Buka phpMyAdmin
2. Buat database bernama:

```sql
warnetapp
```

3. Import file SQL database

---

## 3. Jalankan XAMPP

Aktifkan:

* Apache
* MySQL

---

## 4. Buka Project di NetBeans

* Open Project
* Pilih folder `WarnetApp`
* Run Project

---

# 📸 Tampilan Aplikasi

## Role Menu

* Pilihan login admin atau member

## Admin Dashboard

* Pengelolaan data member dan billing

## Member Dashboard

* Monitoring sisa waktu bermain

---

# 🔐 Sistem Keamanan

Beberapa sistem keamanan sederhana yang diterapkan:

* Validasi login
* Pembatasan role admin dan member
* Auto logout saat waktu habis
* Penyimpanan data menggunakan database MySQL

---

# 📖 Pembelajaran yang Didapat

Melalui project ini, pembelajaran yang didapat antara lain:

* Membuat aplikasi desktop Java
* Menggunakan Java Swing
* Koneksi database MySQL dengan JDBC
* Konsep CRUD
* Sistem login multi role
* Penggunaan timer pada aplikasi desktop
* Pengelolaan data menggunakan SQL

---

# 👨‍💻 Author

Kelompok 4: Raja Antawijaya, Mardiani, Gempar Dirgantoro Saputra Dewa
Project: Tugas Project Akhir Semester
Jurusan: Teknik Informatika

---

# ⭐ Penutup

WarnetApp merupakan aplikasi sederhana berbasis Java Desktop yang dibuat sebagai media pembelajaran dalam memahami pengembangan aplikasi desktop, database, dan sistem billing warnet.

Terima kasih telah melihat project ini 🙌
