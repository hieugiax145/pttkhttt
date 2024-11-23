/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hieug
 */
public class NhaCungCapThongke352 {
    int id;
    String ten;
    String diaChi;
    int tongSoLuongNhap;
    static int n=1;

    public NhaCungCapThongke352() {
    }

    public NhaCungCapThongke352(String ten,  int tongSoLuongNhap) {
        this.id = n++;
        this.ten = ten;
//        this.diaChi = diaChi;
        this.tongSoLuongNhap = tongSoLuongNhap;
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

    public int getTongSoLuongNhap() {
        return tongSoLuongNhap;
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

    public void setTongSoLuongNhap(int tongSoLuongNhap) {
        this.tongSoLuongNhap = tongSoLuongNhap;
    }
    
}
