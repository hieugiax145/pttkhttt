/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hieug
 */
public class HoaDonNhapThongKe352 {
    int id;
    String ngayNhap;
    int tongSoluong;
    float tongTien;

    public HoaDonNhapThongKe352() {
    }

    public HoaDonNhapThongKe352(int id, String ngayNhap, int tongSoluong, float tongTien) {
        this.id = id;
        this.ngayNhap = ngayNhap;
        this.tongSoluong = tongSoluong;
        this.tongTien = tongTien;
    }

    public int getId() {
        return id;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public int getTongSoluong() {
        return tongSoluong;
    }

    public float getTongTien() {
        return tongTien;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void setTongSoluong(int tongSoluong) {
        this.tongSoluong = tongSoluong;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }
    
    
}
