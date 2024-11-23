<%@page import="dao.NhaCungCapThongKeDAO352"%>
<%@page import="model.NhaCungCapThongke352"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">   

        <title>Báo cáo nhà cung cấp</title>
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
            String startDate = request.getParameter("start-date");
            String endDate = request.getParameter("end-date");

            // Display the selected dates
            out.println("<h3>Báo cáo từ " + startDate + " đến " + endDate + "</h3>");

            // Create an instance of ThongKeNhaCungCapDAO352
            NhaCungCapThongKeDAO352 thongKeDAO = new NhaCungCapThongKeDAO352();

            // Call the thongKeNhaCungCap method to get the data
            List<NhaCungCapThongke352> danhSachNhaCungCap = thongKeDAO.thongKeNhaCungCap(startDate, endDate);
        %>

        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Tên nhà cung cấp</th>
                    <th>Tổng số lượng nhập</th>
                </tr>
            </thead>
            <tbody>
                <%
                    for (NhaCungCapThongke352 ncc : danhSachNhaCungCap) {
                        if (ncc.getTongSoLuongNhap() > 0) {
                %>

                <tr onclick="window.location.href = 'GDHoaDonThongKe352.jsp?id=<%= ncc.getId()%>&start-date=<%= startDate%>&end-date=<%= endDate%>'">
                    <td><%= ncc.getId()%></td>
                    <td><%= ncc.getTen()%></td>
                    <td><%= ncc.getTongSoLuongNhap()%></td>
                </tr>
                <%
                        }
                    }
                %>
            </tbody>
        </table>
    </body>
</html>