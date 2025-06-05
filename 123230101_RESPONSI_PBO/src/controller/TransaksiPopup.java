/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import javax.swing.JOptionPane;

/**
 *
 * @author Lab Informatika
 */
public class TransaksiPopup {
    
    public static void tampilkanPopupPembayaran(double harga, int durasi){
    double totalHarga = harga * durasi;
    double tambahan = (durasi>4)? (durasi - 4) * 2000 :0;
    double totalBayar = totalHarga + tambahan;
    
    JOptionPane.showMessageDialog(null, "Total Hrga : Rp. " + totalHarga + "\nTambahan : Rp. "+tambahan+"Total Bayar : Rp. "+totalBayar, "Rincian Pembayaran", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
