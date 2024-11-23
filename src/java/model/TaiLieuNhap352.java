/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hieug
 */
public class TaiLieuNhap352 {
    int id;
    TaiLieu352 tailieu;
    int soLuong;

    public TaiLieuNhap352() {
    }

    public TaiLieuNhap352(int id, TaiLieu352 tailieu, int soLuong) {
        this.id = id;
        this.tailieu = tailieu;
        this.soLuong = soLuong;
    }

    public int getId() {
        return id;
    }

    public TaiLieu352 getTailieu() {
        return tailieu;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTailieu(TaiLieu352 tailieu) {
        this.tailieu = tailieu;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    
}
