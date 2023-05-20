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
.container1 {
    display: flex;
    justify-content: center;
    align-items: flex-start;
    height: 100vh;
  }

  form {
    background-color: #fff;
    padding: 20px;
    border-radius: 5px;
    box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    width: 400px;
    margin-top: auto;
    margin-bottom: auto;
  }

    h2 {
      color: #333;
    }
  
    form {
      background-color: #fff;
      padding: 20px;
      border-radius: 5px;
      box-shadow: 0 2px 5px rgba(0, 0, 0, 0.1);
    }
  
    label {
      display: block;
      margin-bottom: 5px;
      color: #666;
    }
  
    input[type="text"],
    input[type="number"],
    select {
      width: 100%;
      padding: 10px;
      border-radius: 3px;
      border: 1px solid #ccc;
      box-sizing: border-box;
      font-size: 14px;
      margin-bottom: 10px;
    }
  
    input[type="submit"] {
      background-color: #4CAF50;
      color: #fff;
      border: none;
      padding: 10px 20px;
      border-radius: 3px;
      cursor: pointer;
    }
  
    input[type="submit"]:hover {
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
				<% if (session.getAttribute("user") != null) { %>
					<li><a href="/QLProject/logout"><i class="fa fa-sign-in"></i> Đăng xuất</a></li>
					<li><p>Tên người dùng: <%=session.getAttribute("user")%></p></li>
				<% } else { %>
					<li><a href="/QLProject/lon"><i class="fa fa-sign-in"></i> Đăng nhập</a></li>
				<% } %>
			</ul>
		</div>
		<div class="main">
			<h1>Thanh toán</h1>
			<div class="container1">
			    <form action="/thanh-toan" method="POST">
			        <div>
			          <label for="id_xe">ID Xe:</label>
			          <input type="text" id="id_xe" name="id_xe" required>
			        </div>
			        <div>
			          <label for="bien_so">Biển số:</label>
			          <input type="text" id="bien_so" name="bien_so" required>
			        </div>
			        <div>
			          <label for="hinh_thuc_thanh_toan">Hình thức thanh toán:</label>
			          <select id="hinh_thuc_thanh_toan" name="hinh_thuc_thanh_toan" required>
			            <option value="tien_mat">Tiền mặt</option>
			            <option value="the_ngan_hang">Thẻ ngân hàng</option>
			            <option value="vi_dien_tu">Ví điện tử</option>
			          </select>
			        </div>
			        <div>
			          <label for="so_tien">Số tiền:</label>
			          <input type="number" id="so_tien" name="so_tien" required>
			        </div>
			        <div>
			          <input type="submit" value="Thanh toán">
			        </div>
			      </form>
			  </div>
		</div>
</div>
</body>
</html>