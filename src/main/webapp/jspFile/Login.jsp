<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
#wrapper {
  background-color: #f5f5f5;
  width: 400px;
  margin: 0 auto;
  padding: 20px;
  border: 1px solid #ccc;
  border-radius: 5px;
}

.form-heading {
  text-align: center;
  margin-bottom: 20px;
}

.form-input {
  display: block;
  width: 100%;
  padding: 10px;
  margin-bottom: 15px;
  font-size: 16px;
  border: 1px solid #ccc;
  border-radius: 3px;
  box-sizing: border-box;
}

.form-submit {
  display: block;
  width: 100%;
  padding: 10px;
  margin-top: 15px;
  font-size: 16px;
  font-weight: bold;
  color: #fff;
  background-color: #007bff;
  border: none;
  border-radius: 3px;
  cursor: pointer;
  transition: background-color 0.2s;
}

.form-submit:hover {
  background-color: #0069d9;
}

.forgot-password {
  display: block;
  margin-top: 15px;
  text-align: right;
  font-size: 14px;
  color: #007bff;
  text-decoration: none;
}

.forgot-password:hover {
  text-decoration: underline;
}
.password-toggle {
  position: absolute;
  top: 50%;
  right: 10px;
  transform: translateY(-50%);
  width: 20px;
  height: 20px;
  background-image: url(eye-icon.png);
  background-repeat: no-repeat;
  background-position: center;
  cursor: pointer;
}

</style>

</head>
<body>
	<div id="wrapper">
	  <form action="" id="form-login">
	    <h1 class="form-heading">Form đăng nhập</h1>
	    <div class="form-group">
	      <input type="text" class="form-input" placeholder="Tên đăng nhập">
	    </div>
	    <div class="form-group">
	      <input type="password" class="form-input" placeholder="Mật khẩu" id="password">
	      <label for="show-password">
	        <input type="checkbox" id="show-password"> Hiện mật khẩu
	      </label>
	    </div>
	    <input type="submit" value="Đăng Nhập" class="form-submit">
	    <a href="#" class="forgot-password">Quên mật khẩu?</a>
	  </form>
	</div>

	<script>
            const passwordInput = document.getElementById("password");
            const showPasswordCheckbox = document.getElementById("show-password");

            showPasswordCheckbox.addEventListener("change", function () {
            if (showPasswordCheckbox.checked) {
                passwordInput.type = "text";
            } else {
                passwordInput.type = "password";
            }
            });
    </script>
</body>
</html>