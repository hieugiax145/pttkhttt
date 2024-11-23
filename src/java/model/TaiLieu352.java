/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hieug
 */
public class TaiLieu352 {
    int id;
    String ten;
    float gia;
    String nhaXuatBan;

    public TaiLieu352() {
    }

    public TaiLieu352(int id, String ten, Float gia, String nhaXuatBan) {
        this.id = id;
        this.ten = ten;
        this.gia = gia;
        this.nhaXuatBan = nhaXuatBan;
    }

    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public Float getGia() {
        return gia;
    }

    public String getNhaXuatBan() {
        return nhaXuatBan;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setGia(Float gia) {
        this.gia = gia;
    }

    public void setNhaXuatBan(String nhaXuatBan) {
        this.nhaXuatBan = nhaXuatBan;
    }
    
    
}
