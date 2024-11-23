<%-- 
    Document   : GDDangKyThe352
    Created on : Nov 9, 2024, 2:20:05 PM
    Author     : hieug
--%>

<%@page import="model.BanDoc352"%>
<%@page import="dao.DangKyTheDAO352"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Đăng ký Thẻ Bạn Đọc</title>
    <style>
        body {
            font-family: sans-serif; 
            display: flex;
            flex-direction: column; /* Align items vertically */
            align-items: center; /* Center horizontally */
            min-height: 100vh; /* Ensure the body takes up full viewport height */
            margin: 0; /* Remove default body margins */
        }

        h2 {
            color: #333; 
            text-align: center; /* Center the heading */
        }

        form {
            display: flex;
            flex-direction: column;
            align-items: center; 
            width: 350px; /* Adjust width as needed */
            padding: 20px;
            border: 1px solid #ccc;
            border-radius: 5px; 
        }

        label {
            display: block; 
            margin-bottom: 5px;
            text-align: left; /* Align labels to the left */
            width: 100%; /* Make labels take full width */
        }

        input[type="text"],
        input[type="email"],
        input[type="date"] {
            width: 100%; 
            padding: 8px;
            border: 1px solid #ccc; 
            box-sizing: border-box; 
            margin-bottom: 15px;
        }

        button[type="submit"] {
            background-color: #4CAF50; 
            color: white;
            padding:   
 10px 20px;
            border: none;   

            cursor: pointer;
        }
    </style>
</head>
<body>
    <h2>Đăng ký Thẻ Bạn Đọc</h2>

    <%
        String message = "";
        if (request.getMethod().equalsIgnoreCase("post")) {
            DangKyTheDAO352 dao = new DangKyTheDAO352();
            BanDoc352 banDoc = new BanDoc352();
            banDoc.setTen(request.getParameter("ten"));
            banDoc.setMail(request.getParameter("email"));
            banDoc.setSdt(request.getParameter("sdt"));
            banDoc.setDiaChi(request.getParameter("diaChi"));
            banDoc.setNgaySinh(request.getParameter("ngaySinh"));
            if (dao.themBanDoc352(banDoc)) {
                message = "Đăng ký thành công!";
            } else {
                message = "Đăng ký thất bại!";
            }
        }
    %>

    <form method="post"> <%-- Removed action attribute --%>
        <label for="ten">Tên:</label>
        <input type="text" id="ten" name="ten" required maxlength="50">

        <label for="email">Email:</label>
        <input type="email" id="email" name="email" required maxlength="50">

        <label for="sdt">Số Điện Thoại:</label>
        <input type="text" id="sdt" name="sdt" required maxlength="10" pattern="[0-9]{10}" title="Nhập đúng 10 chữ số.">

        <label for="diaChi">Địa Chỉ:</label>
        <input type="text" id="diaChi" name="diaChi" required maxlength="150">

        <label for="ngaySinh">Ngày Sinh:</label>
        <input type="date" id="ngaySinh" name="ngaySinh" required>

        <button type="submit">Đăng ký</button>
    </form>

    <%
        if (!message.isEmpty()) {
    %>
    <script>
        alert("<%= message %>");
    </script>
    <%
        }
    %>

</body>
</html>
