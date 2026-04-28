package apk.perpustakaan.utils;

import java.util.logging.Logger;

public class UserSession {
    private static final Logger LOGGER = Logger.getLogger(UserSession.class.getName());
    
    // Variabel statis untuk menyimpan status login dan username
    private static boolean isLoggedIn = false;
    private static String currentUsername;

    // Method untuk mengatur status saat login berhasil
    public static void setLoginStatus(boolean status, String username) {
        isLoggedIn = status;
        currentUsername = username;
        LOGGER.info("Session diperbarui: User '" + username + "' berhasil login.");
    }

    // Method untuk mengecek status login
    public static boolean checkStatus() {
        return isLoggedIn;
    }

    // Method untuk mengambil nama user yang sedang login (misal untuk menyapa di dashboard)
    public static String getCurrentUsername() {
        return currentUsername;
    }

    // Method untuk logout
    public static void clearSession() {
        isLoggedIn = false;
        currentUsername = null;
        LOGGER.info("Session dihapus: User telah logout.");
    }
}