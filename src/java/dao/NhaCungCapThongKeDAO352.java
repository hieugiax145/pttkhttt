/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.util.*;
import model.NhaCungCapThongke352;
import java.sql.*;

/**
 *
 * @author hieug
 */
public class NhaCungCapThongKeDAO352 extends DAO352 {

    public List<NhaCungCapThongke352> thongKeNhaCungCap(String startDate, String endDate) {
        List<NhaCungCapThongke352> danhSachNhaCungCap = new ArrayList<>();
        String query = "SELECT ncc.id,ncc.ten, SUM(tln.soLuong) AS tongSoLuongNhap "
                + "FROM tblNhaCungCap352 ncc "
                + "JOIN tblHoaDonNhapHang352 hdn ON ncc.id = hdn.tblNhaCungCap352id "
                + "JOIN tblTaiLieuNhap352 tln ON hdn.id = tln.tblHoaDonNhapHang352id "
                + "WHERE hdn.ngayNhap >= ? AND hdn.ngayNhap <= ? "
                + "GROUP BY ncc.id, ncc.ten";
        try {
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, startDate);
            ps.setString(2, endDate);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                NhaCungCapThongke352 ncc = new NhaCungCapThongke352();
                ncc.setId(rs.getInt("id"));
                ncc.setTen(rs.getString("ten"));
                ncc.setTongSoLuongNhap(rs.getInt("tongSoLuongNhap"));
                danhSachNhaCungCap.add(ncc);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return danhSachNhaCungCap;
    }
}
