/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Lab Informatika
 */
public class Pelanggan {
    private int id;
    private String user;
    
    public Pelanggan(int id, String user){
    this.id = id;
    this.user = user;
    }
    
    public int getId(){return id;}
    public String getNama() {return user;}
}
