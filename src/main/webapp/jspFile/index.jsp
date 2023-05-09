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

.main .mySlides {
    display: none;
}

.main img {
vertical-align: middle;
}


.main .slideshow-container {
max-width: 1000px;
position: relative;
margin: auto;
}


.main .prev,
.main .next {
cursor: pointer;
position: absolute;
top: 50%;
width: auto;
padding: 16px;
margin-top: -22px;
color: white;
font-weight: bold;
font-size: 18px;
transition: 0.6s ease;
border-radius: 0 3px 3px 0;
user-select: none;
}


.main .next {
right: 0;
border-radius: 3px 0 0 3px;
}


.main .prev:hover,
.main .next:hover {
background-color: rgba(0, 0, 0, 0.8);
}


.main .text {
color: #f2f2f2;
font-size: 15px;
padding: 8px 12px;
position: absolute;
bottom: 8px;
width: 100%;
text-align: center;
}


.main .numbertext {
color: #f2f2f2;
font-size: 12px;
padding: 8px 12px;
position: absolute;
top: 0;
}

.main .dot {
cursor: pointer;
height: 15px;
width: 15px;
margin: 0 2px;
background-color: #bbb;
border-radius: 50%;
display: inline-block;
transition: background-color 0.6s ease;
}

.main .active,
.main .dot:hover {
background-color: #717171;
}


.main .fade {
animation-name: fade;
animation-duration: 1.5s;
}

@keyframes fade {
from {
opacity: 0.4;
}
to {
opacity: 1;
}
}


@media only screen and (max-width: 300px) {
.main .prev,
.main .next,
.main .text {
font-size: 11px;
}}
</style>
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
			<div class="slideshow-container">
                <div class="mySlides fade">
                  <div class="numbertext">1 / 6</div>
                  <a href="index.jsp">
                  <img src="./img/anh1.jpg" style="width:100%; height:500px" >
                  <div class="text">Trang Chủ</div>
                </div>
            
                <div class="mySlides fade">
                  <div class="numbertext">2 / 6</div>
                  <a href="xe_vao.jsp">
                  <img src="./img/anh2.jpg" style="width:100%; height:500px">
                  <div class="text">Xe Vào</div>
                </div>
            
                <div class="mySlides fade">
                  <div class="numbertext">3 / 6</div>
                  <a href="khu_vuc_do.jsp">
                  <img src="./img/anh3.jpg" style="width:100%; height:500px">
                  <div class="text">Khu vực đỗ</div>
                </div>

                <div class="mySlides fade">
                    <div class="numbertext">4 / 6</div>
                    <a href="xe_ra.jsp">
                    <img src="./img/anh4.jpg" style="width:100%; height:500px">
                    <div class="text">Xe Ra</div>
                </div>

                <div class="mySlides fade">
                    <div class="numbertext">5 / 6</div>
                    <a href="thanh_toan.jsp">
                    <img src="./img/anh5.jpg" style="width:100%; height:500px">
                    <div class="text">Thanh Toán</div>
                </div>

                <div class="mySlides fade">
                    <div class="numbertext">6 / 6</div>
                    <img src="./img/anh6.jpg" style="width:100%; height:500px">
                    <div class="text">Caption Three</div>
                </div>
            
                <a class="prev" onclick="plusSlides(-1)">❮</a>
                <a class="next" onclick="plusSlides(1)">❯</a>
            
                </div>
                <br>
            
                <div style="text-align:center">
                  <span class="dot" onclick="currentSlide(1)"></span> 
                  <span class="dot" onclick="currentSlide(2)"></span> 
                  <span class="dot" onclick="currentSlide(3)"></span> 
                  <span class="dot" onclick="currentSlide(4)"></span>
                  <span class="dot" onclick="currentSlide(5)"></span>
                  <span class="dot" onclick="currentSlide(6)"></span>
                </div>
            <script>
            let slideIndex = 1;
            showSlides(slideIndex);
            
            function plusSlides(n) {
              showSlides(slideIndex += n);
            }
            
            function currentSlide(n) {
              showSlides(slideIndex = n);
            }
            
            function showSlides(n) {
              let i;
              let slides = document.getElementsByClassName("mySlides");
              let dots = document.getElementsByClassName("dot");
              if (n > slides.length) {slideIndex = 1}    
              if (n < 1) {slideIndex = slides.length}
              for (i = 0; i < slides.length; i++) {
                slides[i].style.display = "none";  
              }
              for (i = 0; i < dots.length; i++) {
                dots[i].className = dots[i].className.replace(" active", "");
              }
              slides[slideIndex-1].style.display = "block";  
              dots[slideIndex-1].className += " active";
            }
            </script>
		</div>
	</div>
</body>
</html>