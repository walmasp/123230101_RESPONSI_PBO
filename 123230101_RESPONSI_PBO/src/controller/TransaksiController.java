/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import model.Transaksi;


/**
 *
 * @author Lab Informatika
 */
public class TransaksiController {

    private String user;
    private String plat;
    private String merk;
    private int durasi;
    private double total;
    private double tambahan;
    private double totalBayar;
    
    public void simpanTransaksi(Transaksi t){
    String sql = "INSERT INTO user(nama, plat, merk, durasi) VALUES (?, ?, ?, ?)";
    
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkir?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
                PreparedStatement stmt = conn.prepareStatement(sql)){
                
            stmt.setString(1, t.getUser());
            stmt.setString(2, t.getPlat());
            stmt.setString(3, t.getMerk());
            stmt.setInt(4, t.getDurasi());
            stmt.setDate(5, java.sql.Date.valueOf(t.getTanggal()));
            stmt.setDouble(6, t.getTotalHarga());
            stmt.setDouble(7, t.getTambahan());
            stmt.setDouble(8, t.getTotalBayar());
            
            stmt.executeUpdate();
            System.err.println("Data berhasil disimpan");
        }catch(Exception e){
        System.err.println("gagal menyimpan data : " + e.getMessage());
        e.printStackTrace();
        }
        
        }
    
    public List<Transaksi>getTransaksiHariIni() throws SQLException{
    List<Transaksi>list = new ArrayList<>();
    String sql = "SELECT * FROM user WHERE tanggal = CURDATE()";

        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkir?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
                PreparedStatement stmt = conn.prepareStatement(sql);
                ResultSet rs = stmt.executeQuery()){
        
            while(rs.next()){
            Transaksi t = new Transaksi(
            rs.getInt("id"),
            rs.getString("user"),
            rs.getString("merk"),
            rs.getString("plat"),
            rs.getInt("durasi")
            );
            
        t.setTotalHarga(rs.getDouble("total_harga"));
        t.setTambahan(rs.getDouble("tambahan"));
        t.setTotalBayar(rs.getDouble("total_bayar"));
        t.setTanggal(rs.getDate("tanggal").toLocalDate());
        
            list.add(t);
            }
        }catch(Exception e){
        e.printStackTrace();
        }
        return list;
    }
    
    public void hapusTransaksiById(int id){
    String sql = "DELETE FROM user WHERE id = ?";
        try(Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/parkir?zeroDateTimeBehavior=CONVERT_TO_NULL", "root", "");
            PreparedStatement stmt = conn.prepareStatement(sql)) {
            
            stmt.setString(1, user);
            stmt.setString(2, plat);
            stmt.setString(3, merk);
            stmt.setInt(4, durasi);
            stmt.setDouble(5, total);
            stmt.setDouble(6, tambahan);
            stmt.setDouble(7, totalBayar);
            stmt.setInt(8, id);
            stmt.executeUpdate();
            
            System.out.println("Data berhasil di update");
        }   catch(Exception e){ e.printStackTrace();}
                
    }
    }
    

