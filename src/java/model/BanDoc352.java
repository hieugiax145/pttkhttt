/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author hieug
 */
public class BanDoc352 {
    int id;
    String ten;
    String mail;
    String sdt;
    String diaChi;
    String ngaySinh;

    public BanDoc352() {
    }

    public BanDoc352(String ten, String mail, String sdt, String diaChi, String ngaySinh) {
//        this.id = id;
        this.ten = ten;
        this.mail = mail;
        this.sdt = sdt;
        this.diaChi = diaChi;
        this.ngaySinh = ngaySinh;
    }

    public int getId() {
        return id;
    }

    public String getTen() {
        return ten;
    }

    public String getMail() {
        return mail;
    }

    public String getSdt() {
        return sdt;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setSdt(String sdt) {
        this.sdt = sdt;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
    
    
}
