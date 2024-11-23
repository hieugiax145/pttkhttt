/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.PreparedStatement;
import model.BanDoc352;

/**
 *
 * @author hieug
 */
public class DangKyTheDAO352 extends DAO352 {

    public boolean themBanDoc352(BanDoc352 bandoc) {
        boolean res = false;
        String insertBanDocSQL = "INSERT INTO tblBanDoc352 (ten, email, sdt, diaChi, ngaySinh) VALUES (?, ?, ?, ?, ?)";

        try {
            PreparedStatement prepareStatement = conn.prepareStatement(insertBanDocSQL);
            prepareStatement.setString(1, bandoc.getTen());
            prepareStatement.setString(2, bandoc.getMail());
            prepareStatement.setString(3, bandoc.getSdt());
            prepareStatement.setString(4, bandoc.getDiaChi());
            prepareStatement.setString(5, bandoc.getNgaySinh());

            res = prepareStatement.executeUpdate() > 0;
        } catch (Exception e) {
        }

        return res;
    }
}
