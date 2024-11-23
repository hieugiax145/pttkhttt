/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.*;

/**
 *
 * @author hieug
 */
public class HoaDonNhapHang352 {
    int id;
    List<TaiLieuNhap352> taiLieuNhap;
    String ngayNhap;
    NhaCungCap352 nhaCungCap;
    int tongSoLuong;
    float tongTien;
    NhanVien352 nhanVien;

    public HoaDonNhapHang352() {
    }

    public HoaDonNhapHang352(int id, List<TaiLieuNhap352> taiLieuNhap, String ngayNhap, NhaCungCap352 nhaCungCap, int tongSoLuong, float tongTien, NhanVien352 nhanVien) {
        this.id = id;
        this.taiLieuNhap = taiLieuNhap;
        this.ngayNhap = ngayNhap;
        this.nhaCungCap = nhaCungCap;
        this.tongSoLuong = tongSoLuong;
        this.tongTien = tongTien;
        this.nhanVien = nhanVien;
    }

    public int getId() {
        return id;
    }

    public List<TaiLieuNhap352> getTaiLieuNhap() {
        return taiLieuNhap;
    }

    public String getNgayNhap() {
        return ngayNhap;
    }

    public NhaCungCap352 getNhaCungCap() {
        return nhaCungCap;
    }

    public int getTongSoLuong() {
        return tongSoLuong;
    }

    public float getTongTien() {
        return tongTien;
    }

    public NhanVien352 getNhanVien() {
        return nhanVien;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setTaiLieuNhap(List<TaiLieuNhap352> taiLieuNhap) {
        this.taiLieuNhap = taiLieuNhap;
    }

    public void setNgayNhap(String ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public void setNhaCungCap(NhaCungCap352 nhaCungCap) {
        this.nhaCungCap = nhaCungCap;
    }

    public void setTongSoLuong(int tongSoLuong) {
        this.tongSoLuong = tongSoLuong;
    }

    public void setTongTien(float tongTien) {
        this.tongTien = tongTien;
    }

    public void setNhanVien(NhanVien352 nhanVien) {
        this.nhanVien = nhanVien;
    }
    
    
}
