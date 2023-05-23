<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
<style>
* {
	box-sizing: border-box;
}
body {
	margin: 0;
	font-family: Arial, sans-serif;
}
.container {
    width: 100%;
	display: flex;
	flex-direction: row;
	justify-content: space-between;
	align-items: flex-start;
	max-width: 1200px;
	margin: 0 auto;
	padding: 20px;
}

.menu {
width: 200px;
background-color: #f2f2f2;
padding: 20px;
border-radius: 5px;
box-shadow: 0px 0px 5px 0px rgba(0, 0, 0, 0.2);
height: 100%;
position: fixed;
top: 0;
left: 0;
overflow-x: hidden;
}

.menu h3 {
font-size: 20px;
margin-bottom: 10px;
}
.menu ul {
list-style-type: none;
margin: 0;
padding: 0;
}

.menu li {
margin-bottom: 10px;
}

.menu a {
display: block;
color: #000;
text-decoration: none;
font-size: 16px;
padding: 10px;
border-radius: 5px;
transition: background-color 0.3s ease;
}

.menu a:hover {
background-color: #ddd;
}

.main {
	flex-grow: 1;
	background-color: #fff;
	padding: 20px;
	border-radius: 5px;
	box-shadow: 0px 0px 5px 0px rgba(0,0,0,0.2);
	margin-left: 20px;
}
.search-container {
  text-align: center;
  margin-top: 20px;
}

.search-container input[type=text] {
  padding: 8px;
  border: 1px solid #ccc;
  border-radius: 4px;
}

.search-container button {
  padding: 8px 12px;
  background: #4CAF50;
  color: white;
  border: none;
  border-radius: 4px;
  cursor: pointer;
}

.search-container button:hover {
  background: #45a049;
}

table {
        width: 100%;
        border-collapse: collapse;
    }

    th, td {
        padding: 8px;
        text-align: left;
        border-bottom: 1px solid #ddd;
    }

    th {
        background-color: #f2f2f2;
    }

    img {
        width: 100px;
        height: 100px;
    }
}
.add {
    text-align: center;
    margin-top: 20px;
}

.add button {
    background-color: #4CAF50;
    border: none;
    color: white;
    padding: 10px 20px;
    text-align: center;
    text-decoration: none;
    display: inline-block;
    font-size: 16px;
    cursor: pointer;
}

.add button a {
    color: white;
    text-decoration: none;
}

.add button:hover {
    background-color: #45a049;
}

</style>
</head>
<body>
<div class="container">
		<div class="menu">
			<h3>Menu</h3>
			<ul>
				<li><a href="/QLProject/"><i class="fa fa-home"></i> Trang chủ</a></li>
				<li><a href="/QLProject/xe_vao"><i class="fa fa-arrow-circle-right"></i> Xe vào</a></li>
				<li><a href="/QLProject/khu_vuc_do"><i class="fa fa-heart"></i> Khu vực đỗ</a></li>
				<li><a href="/QLProject/xe_ra"><i class="fa fa-arrow-circle-left"></i> Xe ra</a></li>
				<li><a href="/QLProject/thanhtoan"><i class="fa fa-money"></i> Thanh toán</a></li>
				<li><a href="/QLProject/logout"><i class="fa fa-sign-in"></i> Đăng xuất</a></li>
				<li><p>Tên người dùng: <%=session.getAttribute("user")%></p></li>
			</ul>
		</div>
		<div class="main">
			<h1>Thanh toán</h1>
			<table>
			    <tr>
			    	<th>ID thanh toán</th>
			        <th>Biển số</th>
			        <th>Hình thức thanh toán</th>
			        <th>Số tiền</th>
			    </tr>
			    <c:forEach var="tht" items="${thanhT}">
						<tr>
							<td>${tht.iDThanhToan}</td>
							<td><img src="${tht.bienSo}" style="width:50px; height:40px"></td>
							<td>${tht.hinhThucThanhToan}</td>
							<td>${tht.soTien}</td>
						</tr>			
				</c:forEach>
				<tr>
					<td colspan="3">Tổng tiền: </td>
					<td>${tongTien} </td>
				</tr>
			</table>
		</div>
</div>
</body>
</html>