/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author Lab Informatika
 */
public class Transaksi {
    private int id;
    private String user;
    private String plat;
    private String merk;
    private int durasi;
    private double harga;
    private double totalHarga;
    private double tambahan;
    private double totalBayar;
    private LocalDate tanggal;
    
    public Transaksi(int id, String user, String plat, String merk, int durasi){
    this.id = id;
    this.user = user;
    this.plat = plat;
    this.merk = merk;
    this.durasi = durasi;
    this.harga = 5000;
    this.totalHarga = durasi * harga;
    this.tambahan = (durasi>4)? (durasi - 4) * 2000 :0;
    this.totalBayar = totalHarga + tambahan;
    this.tanggal = LocalDate.now();
    }
    
    public void setTotalHarga(double total){
    this.totalHarga = total;
    }
    
    public void setTambahan(double tambahan){
    this.tambahan = tambahan;
    }
    
    public void setTotalBayar(double bayar){
    this.totalBayar = bayar;
    }
    
    public void setTanggal(LocalDate tanggal){
    this.tanggal = tanggal;
    }
    
    public int getId(){
    return id;
    }
    
    public String getUser(){
    return user;
    }
    
    public String getPlat(){
    return plat;
    }
    
    public String getMerk(){
    return merk;
    }
    public int getDurasi(){
    return durasi;
    }
    
    public double getTotalHarga(){
    return totalHarga;
    }
    
    public double getTambahan(){
    return tambahan;
    }
    
    public double getTotalBayar(){
    return totalBayar;
    }
    
    public LocalDate getTanggal(){
    return tanggal;
    }
}
