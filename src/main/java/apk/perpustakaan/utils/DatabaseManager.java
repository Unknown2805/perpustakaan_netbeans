package apk.perpustakaan.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DatabaseManager {
    
    // Variabel statis untuk pola Singleton
    private static Connection connection;
    
    // Inisialisasi sistem Logger bawaan Java
    private static final Logger LOGGER = Logger.getLogger(DatabaseManager.class.getName());

    // Konfigurasi Database (Sesuaikan jika ada perubahan)
    private static final String URL = "jdbc:mysql://localhost:3306/db_perpustakaan";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    /**
     * Method untuk mengambil koneksi database.
     * Hanya akan membuka satu koneksi untuk menghemat memori.
     */
    public static Connection getConnection() {
        if (connection == null) {
            try {
                // Mendaftarkan Driver MySQL
                DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
                
                // Membuka koneksi
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
                
                // Mencatat log keberhasilan berwarna standar (INFO)
                LOGGER.info("Koneksi ke database 'db_perpustakaan' berhasil diinisialisasi.");
                
            } catch (SQLException e) {
                // Mencatat log kegagalan berwarna merah (SEVERE) beserta akar masalahnya
                LOGGER.log(Level.SEVERE, "Gagal terhubung ke MySQL! Pastikan XAMPP menyala.", e);
            }
        }
        return connection;
    }

    /**
     * Method Main khusus untuk TESTING (Uji Coba).
     * Ini memungkinkan kamu menjalankan file ini sendirian tanpa membuka form aplikasi.
     */
    public static void main(String[] args) {
        LOGGER.info("--- Memulai Pengujian Sistem Koneksi Database ---");
        
        Connection testConn = DatabaseManager.getConnection();
        
        if (testConn != null) {
            LOGGER.info("HASIL: Pengujian SUKSES! Database siap digunakan oleh form lain.");
        } else {
            LOGGER.warning("HASIL: Pengujian GAGAL! Silakan periksa kembali pengaturan port atau nama database.");
        }
    }
}