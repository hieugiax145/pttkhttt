<%-- 
    Document   : GDTrangChu352
    Created on : Nov 16, 2024, 1:42:25 PM
    Author     : hieug
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%--<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>--%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Trang chủ</title>
        <style>
            body {
                font-family: sans-serif;
                display: flex;
                flex-direction: column; /* Align items vertically */
                align-items: center; /* Center horizontally */
                min-height: 100vh; /* Ensure the body takes up full viewport height */
                margin: 0; /* Remove default body margins */
            }

            .toolbar {
                background-color: #f0f0f0; /* Light gray background */
                padding: 10px;
                border-bottom: 1px solid #ddd; /* Add a subtle bottom border */
            }

            .toolbar a {
                display: inline-block; /* Keep items in line */
                padding: 8px 15px; /* Add some padding */
                text-decoration: none; /* Remove underlines */
                color: #333; /* Dark gray text */
                margin-right: 20px; /* Space between items */
            }

            .dropdown {
                position: relative;
                display: inline-block;
            }

            .dropdown-content {
                display: none;
                position: absolute;
                background-color: #f9f9f9;
                min-width: 200px; /* Adjust width as needed */
                box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
                z-index: 1;
                left: 0;
                margin-top: 5px; /* Small space above dropdown */
            }

            .dropdown-content a {
                display: block;
                padding: 10px;
                text-decoration: none;
                color: #333;
            }

            .dropdown-content a:hover {
                background-color: #ddd;
            }

            .dropdown:hover .dropdown-content {
                display: block;
            }

            .popup {
                display: none;
                position: fixed;
                top: 50%;
                left: 50%;
                transform: translate(-50%, -50%);
                background-color: white;
                padding: 20px;
                border: 1px solid #ddd;
                box-shadow: 0px 4px 8px rgba(0, 0, 0, 0.2);
                z-index: 10;
                border-radius: 8px;
            }

            .popup h3 {
                margin-top: 0;
            }

            .popup input {
                margin-bottom: 10px;
                padding: 8px;
                width: 100%;
                box-sizing: border-box;
            }

            .popup-buttons {
                text-align: right;
            }

            .popup-buttons button {
                padding: 8px 15px;
                margin-left: 5px;
                cursor: pointer;
            }

            .overlay {
                display: none;
                position: fixed;
                top: 0;
                left: 0;
                width: 100%;
                height: 100%;
                background: rgba(0, 0, 0, 0.5);
                z-index: 5;
            }
        </style>
    </head>
    <body>
        <h2>Trang chủ</h2>

        <div class="toolbar">
            <a href="dangky/GDDangKyThe352.jsp">Đăng ký thẻ bạn đọc</a>
            <div class="dropdown">
                <a href="#">Xem báo cáo</a>
                <div class="dropdown-content">
                    <a href="#" id="open-popup">Thống kê nhà cung cấp theo số lượng nhập</a>
                </div>
            </div>
        </div>

        <!-- Popup HTML -->
        <div class="overlay" id="overlay"></div>
        <div class="popup" id="popup">
            <h3>Chọn thời gian báo cáo</h3>
            <form id="report-form" method="post">
                <label for="start-date">Ngày bắt đầu:</label>
                <input type="date" id="start-date" name="start-date" required>
                <label for="end-date">Ngày kết thúc:</label>
                <input type="date" id="end-date" name="end-date" required>
                <div class="popup-buttons">
                    <button type="button" id="cancel-popup">Hủy</button>
                    <button type="button" id="confirm-popup">Xác nhận</button>
                </div>
            </form>
        </div>

        <script>
            // JavaScript to handle popup
            const openPopup = document.getElementById('open-popup');
            const popup = document.getElementById('popup');
            const overlay = document.getElementById('overlay');
            const cancelPopup = document.getElementById('cancel-popup');
            const confirmPopup = document.getElementById('confirm-popup');
            const startDate = document.getElementById('start-date');
            const endDate = document.getElementById('end-date');


            openPopup.addEventListener('click', () => {
                popup.style.display = 'block';
                overlay.style.display = 'block';
            });

            cancelPopup.addEventListener('click', () => {
                popup.style.display = 'none';
                overlay.style.display = 'none';
            });

            overlay.addEventListener('click', () => {
                popup.style.display = 'none';
                overlay.style.display = 'none';
            });

            confirmPopup.addEventListener('click', () => {
                const startDate = document.getElementById('start-date').value;
                const endDate = document.getElementById('end-date').value;


              
                let url = `report/GDNhaCungCap352.jsp`;
//                if (startDate) {
                url += `?start-date=`+startDate;
//                    if (endDate) {
                url += `&end-date=`+endDate;
//                    }
//                } else if (endDate) {
//                    url += `?end-date=${endDate}`;
//                }

                // Redirect to the constructed URL
                window.location.href = url;
            });
        </script>
    </body>
</html>