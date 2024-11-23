<%-- 
    Document   : GDHoaDonThongKe352
    Created on : Nov 23, 2024, 7:48:26 AM
    Author     : hieug
--%>

<%@page import="model.HoaDonNhapThongKe352"%>
<%-- 
    Document   : GDHoaDonThongKe352
    Created on : Nov 23, 2024, 9:02:01 AM
    Author     : hieug
--%>

<%@page import="dao.HoaDonThongKeDAO352"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thống kê hóa đơn</title>
        <style>
            body {
                font-family: sans-serif; 
                display: flex;
                flex-direction: column; 
                align-items: center; 
                min-height: 100vh; 
                margin: 0; 
            }

            h2 {
                color: #333; 
                text-align: center; 
            }

            table {
                border-collapse: collapse;
                width: 50%;
                margin: 20px auto;
                border: 1px solid #ccc; /* Add border to the table */
            }

            th, td {
                border: 1px solid #ccc; /* Add border to cells */
                padding: 8px;
                text-align: left;
            }

            a {
                display: inline-block;
                padding: 10px 20px;
                margin-top: 20px;
                background-color: #4CAF50; 
                color: white;
                text-decoration: none; 
                border: none;
                border-radius: 5px; 
                cursor: pointer;
            }
            
            tr { 
                cursor: pointer; /* Make rows clickable */
            }

            tr:hover { 
                background-color: #f5f5f5; /* Change color on hover */
            }
        </style>
    </head>
    <body>
        <%
            // Get the parameters from the request
            String startDate = request.getParameter("start-date");
            String endDate = request.getParameter("end-date");
            int nhaCungCapId = Integer.parseInt(request.getParameter("id"));

            // Create an instance of HoaDonThongKeDAO352
            HoaDonThongKeDAO352 hoaDonDAO = new HoaDonThongKeDAO352();

            // Call the getHoaDonTheoNhaCungCap method to get the data
            List<HoaDonNhapThongKe352> danhSachHoaDon = hoaDonDAO.getHoaDonTheoNhaCungCap(nhaCungCapId, startDate, endDate);
        %>

        <h2>Danh sách hóa đơn</h2>

        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Ngày nhập</th>
                    <th>Tổng số lượng</th>
                    <th>Tổng tiền</th>

                    <!--                    <th>ID Nhà cung cấp</th>
                                        <th>ID Nhân viên</th>-->
                </tr>
            </thead>
            <tbody>
                <%
                    // Iterate through the list and display the data
                    for (HoaDonNhapThongKe352 hoaDon : danhSachHoaDon) {
                %>
                <tr onclick="window.location.href='GDHoaDonChiTiet352.jsp?id=<%= hoaDon.getId() %>'">
                    <td><%= hoaDon.getId()%></td>
                    <td><%= hoaDon.getNgayNhap()%></td>
                    <td><%= hoaDon.getTongSoluong()%></td>
                    <td><%= hoaDon.getTongTien()%></td>
                    <!--<td><%= hoaDon.getId()%></td>-->
                    <!--<td><%= hoaDon.getId()%></td>-->
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>


    </body>
</html>
