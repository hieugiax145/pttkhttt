<%-- 
    Document   : GDHoaDonChiTiet352
    Created on : Nov 23, 2024, 8:31:27 AM
    Author     : hieug
--%><%@page import="model.TaiLieuNhap352"%>
<%@page import="model.HoaDonNhapHang352"%>
<%@page import="dao.HoaDonThongKeDAO352"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">   

        <title>Chi tiết hóa đơn</title>   

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
            
            .thong-tin-chung {
                width: 80%;
                margin: 20px auto;
                border: 1px solid #ccc;
                padding: 15px;
                border-radius: 5px;
            }

            .thong-tin-chung p {
                margin-bottom: 10px;
            }
            
        </style>
    </head>
    <body>
        <%
            // Get the hoaDonId from the request parameter
            int hoaDonId = Integer.parseInt(request.getParameter("id"));

            // Create an instance of HoaDonThongKeDAO352
            HoaDonThongKeDAO352 hoaDonDAO = new HoaDonThongKeDAO352();

            // Get the HoaDonNhapHang352 object with the given ID
            HoaDonNhapHang352 hoaDon = hoaDonDAO.getHoaDonById(hoaDonId);
        %>

        <h2>HOÁ ĐƠN NHẬP HÀNG</h2>

        <% if (hoaDon != null) { %>
        <div class="thong-tin-chung">
            <h3>Thông tin chung</h3>
            <p>Ngày nhập: <%= hoaDon.getNgayNhap() %></p>
            <p>Nhà cung cấp: <%= hoaDon.getNhaCungCap().getTen() %></p>
            <p>Nhân viên: <%= hoaDon.getNhanVien().getTen() %></p>
            <p>Tổng số lượng: <%= hoaDon.getTongSoLuong() %></p>
            <p>Tổng tiền: <%= hoaDon.getTongTien() %></p>
        </div>

        <h3>Danh sách tài liệu nhập</h3>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Tên tài liệu</th>
                    <th>Số lượng</th>
                    <th>Đơn giá</th>
                    <th>Tổng</th>
                </tr>
            </thead>
            <tbody>
                <%
                    for (TaiLieuNhap352 taiLieuNhap : hoaDon.getTaiLieuNhap()) {
                %>
                <tr>
                    <td><%= taiLieuNhap.getId() %></td>
                    <td><%= taiLieuNhap.getTailieu().getTen() %></td>
                    <td><%= taiLieuNhap.getSoLuong() %></td>
                    <td><%= taiLieuNhap.getTailieu().getGia() %></td>
                    <td><%= taiLieuNhap.getTailieu().getGia()*taiLieuNhap.getSoLuong() %></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>
        <% } else { %>
        <p>Không tìm thấy hóa đơn.</p>
        <% } %>

    </body>
</html>
