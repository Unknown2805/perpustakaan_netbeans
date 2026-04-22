/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package apk.perpustakaan.koneksi;
import java.sql.*;

/**
 *
 * @author daus
 */
public class koneksi {
    private Connection koneksi;
    public Connection connect(){
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("koneksi berhasil");
    } catch (SQLException ex){
    System.out.println("koneksi gagal"+ex);
    }
    String url = "jdbc:mysql://localhost/kelompok";//ganti kelompok pake nama database yang dimau
    try{
    koneksi = DriverManager.getConnection(url,"root","");
    System.out.println("berhasil tersambubng ke database");
    } catch (SQLException ex){
    System.out.println("gagal tersambung ke database"+ ex);
    }
    return koneksi;
    }
}
