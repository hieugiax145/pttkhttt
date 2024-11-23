/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.*;
import java.sql.*;
import model.HoaDonNhapHang352;
import model.HoaDonNhapThongKe352;
import model.NhaCungCap352;
import model.NhanVien352;
import model.TaiLieu352;
import model.TaiLieuNhap352;

/**
 *
 * @author hieug
 */
public class HoaDonThongKeDAO352 extends DAO352 {

    public List<HoaDonNhapThongKe352> getHoaDonTheoNhaCungCap(int nhaCungCapId, String startDate, String endDate) {
        List<HoaDonNhapThongKe352> danhSachHoaDon = new ArrayList<>();
        String query = "SELECT * "
                + "FROM tblHoaDonNhapHang352 "
                + "WHERE tblNhaCungCap352id = ? "
                + "  AND ngayNhap >= ? "
                + "  AND ngayNhap <= ?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, nhaCungCapId);
            ps.setString(2, startDate);
            ps.setString(3, endDate);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                HoaDonNhapThongKe352 hoaDon = new HoaDonNhapThongKe352();
                hoaDon.setId(rs.getInt("id"));
                hoaDon.setNgayNhap(rs.getDate("ngayNhap").toString());
                hoaDon.setTongTien(rs.getInt("tongTien"));
                hoaDon.setTongSoluong(rs.getInt("tongSoLuong"));
//                hoaDon.setTblNhaCungCap352id(rs.getInt("tblNhaCungCap352id"));
//                hoaDon.setTblNhanVien352id(rs.getInt("tblNhanVien352id"));
                danhSachHoaDon.add(hoaDon);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return danhSachHoaDon;
    }

    public HoaDonNhapHang352 getHoaDonById(int hoaDonId) {
        String query = "SELECT hdn.*, ncc.ten AS nhaCungCapTen, nv.ten AS nhanVienTen "
                + "FROM tblHoaDonNhapHang352 hdn "
                + "JOIN tblNhaCungCap352 ncc ON hdn.tblNhaCungCap352id = ncc.id "
                + "JOIN tblNhanVien352 nv ON hdn.tblNhanVien352id = nv.id "
                + "WHERE hdn.id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, hoaDonId);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                HoaDonNhapHang352 hoaDon = new HoaDonNhapHang352();
                hoaDon.setId(rs.getInt("id"));
                hoaDon.setNgayNhap(rs.getString("ngayNhap")); // Assuming ngayNhap is a String in your model

                // Set NhaCungCap352
                NhaCungCap352 nhaCungCap = new NhaCungCap352();
                nhaCungCap.setTen(rs.getString("nhaCungCapTen"));
                hoaDon.setNhaCungCap(nhaCungCap);

                // Set NhanVien352
                NhanVien352 nhanVien = new NhanVien352();
                nhanVien.setTen(rs.getString("nhanVienTen"));
                hoaDon.setNhanVien(nhanVien);

                hoaDon.setTongSoLuong(rs.getInt("tongSoLuong"));
                hoaDon.setTongTien(rs.getFloat("tongTien"));

                // Fetch associated TaiLieuNhap352 records
                hoaDon.setTaiLieuNhap(getTaiLieuNhapByHoaDonId(hoaDonId));
                return hoaDon;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<TaiLieuNhap352> getTaiLieuNhapByHoaDonId(int hoaDonId) {
        List<TaiLieuNhap352> danhSachTaiLieuNhap = new ArrayList<>();
        String query = "SELECT tln.*, tl.ten AS taiLieuTen, tl.gia AS taiLieuGia "
                + "FROM tblTaiLieuNhap352 tln "
                + "JOIN tblTaiLieu352 tl ON tln.tblTaiLieu352id = tl.id "
                + "WHERE tln.tblHoaDonNhapHang352id = ?";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setInt(1, hoaDonId);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                TaiLieuNhap352 taiLieuNhap = new TaiLieuNhap352();
                taiLieuNhap.setId(rs.getInt("id"));
                taiLieuNhap.setSoLuong(rs.getInt("soLuong"));

                // Set TaiLieu352
                TaiLieu352 taiLieu = new TaiLieu352();
                taiLieu.setTen(rs.getString("taiLieuTen"));
                taiLieu.setGia(rs.getFloat("taiLieuGia"));
                taiLieuNhap.setTailieu(taiLieu);

                danhSachTaiLieuNhap.add(taiLieuNhap);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return danhSachTaiLieuNhap;
    }


}
