<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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

</style>
</head>
<body>
<div class="container">
		<div class="menu">
			<h3>Menu</h3>
			<ul>
				<li><a href="index.jsp"><i class="fa fa-home"></i> Trang chủ</a></li>
				<li><a href="xe_vao.jsp"><i class="fa fa-arrow-circle-right"></i> Xe vào</a></li>
				<li><a href="khu_vuc_do.jsp"><i class="fa fa-heart"></i> Khu vực đỗ</a></li>
				<li><a href="xe_ra.jsp"><i class="fa fa-arrow-circle-left"></i> Xe ra</a></li>
				<li><a href="thanh_toan.jsp"><i class="fa fa-money"></i> Thanh toán</a></li>
				<li><a href="Login.jsp"><i class="fa fa-sign-in"></i> Đăng nhập</a></li>
			</ul>
		</div>
		<div class="main">
			<h1>Xe Vào</h1>
		</div>
</div>
</body>
</html>