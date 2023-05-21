<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
        /* CSS for Thêm xe ra form */
        body {
        font-family: Arial, sans-serif;
        }

        h1 {
        color: #333;
        }

        form {
        max-width: 400px;
        margin: 0 auto;
        }

        label {
        display: block;
        margin-bottom: 10px;
        font-weight: bold;
        }

        input[type="text"],
        input[type="number"],
        input[type="file"] {
        width: 100%;
        padding: 8px;
        border: 1px solid #ccc;
        border-radius: 4px;
        box-sizing: border-box;
        margin-bottom: 10px;
        }

        input[type="submit"] {
        background-color: #4CAF50;
        color: white;
        padding: 10px 15px;
        border: none;
        border-radius: 4px;
        cursor: pointer;
        }

        input[type="submit"]:hover {
        background-color: #45a049;
        }

        .error {
        color: red;
        font-size: 14px;
        margin-top: 5px;
        }

        .success {
        color: green;
        font-size: 14px;
        margin-top: 5px;
        }
      </style>
      
</head>
<body>
    <form method="post" action="/QLProject/themxR" enctype="multipart/form-data">
        <label for="iDXeRa">ID Xe Ra:</label>
        <select id="iDXeRa" name="iDXeRa" required>
	    	<c:forEach var="xevao" items="${xev}">
				<option value="${xevao.idThe}">${xevao.idThe}</option>
			</c:forEach>
	    </select><br><br>

        <label for="iDThe">ID Thẻ:</label>
        <input type="text" id="iDThe" name="iDThe" required><br><br>

		<label for="bsxImage">Ảnh biển số xe:</label>
        <input type="file" id="bsxImage" name="bsxImage" accept="image/*" required><br><br>

        <label for="ngayra">Ngày ra:</label>
        <input type="date" id="ngayra" name="ngayra" required><br><br>

        <label for="gio">Giờ:</label>
        <input type="number" id="gio" name="gio" required><br><br>

        <label for="dongia">Đơn giá:</label>
        <input type="number" id="dongia" name="dongia" step="0.01" required><br><br>

        <input type="submit" value="Thêm xe ra">
    </form>
</body>
</html>