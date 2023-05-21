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
    <form method="post" action="/QLProject/themxV" enctype="multipart/form-data">
        <label for="iDXeRa">ID Xe vào:</label>
        <input type="text" id="iDXeVao" name="iDXeVao" required><br><br>

        <label for="iDThe">ID Xe ra:</label>
        <input type="text" id="iDThe" name="iDThe" required><br><br>

		<label for="iDThe">ID Bãi đỗ:</label>
        <select id="khuvucdo" name="khuvucdo" required>
	    	<c:forEach var="bai" items="${baido}">
				<option value="${bai.IDBD}">${bai.IDBD}</option>
			</c:forEach>
	    </select><br><br>
        
        <label for="bsxImage">Bảng số xe:</label>
        <input type="file" id="bsxImage" name="bsxImage" accept="image/*" required><br><br>

		<label for="gio">Loại xe:</label>
        <input type="number" id="loai" name="loai" required><br><br>

        <label for="ngayra">Ngày vào:</label>
        <input type="date" id="ngayvao" name="ngayvao" required><br><br>

        <input type="submit" value="Thêm xe vào">
    </form>
</body>
</html>