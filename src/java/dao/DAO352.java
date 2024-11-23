/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author hieug
 */
public class DAO352 {
    private static String DB_URL = "jdbc:mysql://localhost:3306/lib_man";
    private static String USER_NAME = "root";
    private static String PASSWORD = "1234";
    
    public static Connection conn;
    
    public DAO352(){
        if(conn==null){
            try{
                Class.forName("com.mysql.cj.jdbc.Driver");
                conn = DriverManager.getConnection(DB_URL, USER_NAME, PASSWORD);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}
