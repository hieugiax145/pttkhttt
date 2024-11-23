/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hieug
 */
public class NhaCungCap352 {
    int id;
    String ten;
    String diaChi;
    String sdt;

    public NhaCungCap352() {
    }

    public NhaCungCap352(int id, String ten, String diaChi,String sdt) {
        this.id = id;
        this.ten = ten;
        this.diaChi = diaChi;
        this.sdt=sdt;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public String getSdt() {
        return sdt;
    }

    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }
    
}
