package com.baido.QLBD.api;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.baido.QLBD.entity.Taikhoan;

import jakarta.servlet.http.HttpServletRequest;

//Controller + ResponseBody = RestController
@Controller
public class NewAPI {

	@RequestMapping("/")
	public String index() {

		return "index";
	}

	@RequestMapping("/lon")
	public String lon() {

		return "Login";
	}

	@RequestMapping("/themXeVao")
	public String themXeVao() {

		return "themXeVao";
	}
	
	@RequestMapping("/themXeRa")
	public String themXeRa() {

		return "themXeRa";
	}
	
	@RequestMapping("/thanhtoan")
	public String thanhtoan() {

		
		return "thanhtoan";
	}
	
	@RequestMapping("/logout")
	public String dangxuat(HttpServletRequest request) {
		
		jakarta.servlet.http.HttpSession session = request.getSession();
		session.removeAttribute("user");
		return "index";
	}
//	@RequestMapping("/kvd")
//	public String kvd(M)
//	//Post + 
//	@PostMapping(value = "/new")
//	public Taikhoan createTK(@RequestBody Taikhoan model) {
//
//        return model;
//	}
//	
//	@PutMapping(value = "/new")
//	public Taikhoan updateTK(@RequestBody Taikhoan model) {
//
//        return model;
//	}
//	
//	@DeleteMapping(value = "/new")
//	public void deleteTK(@RequestBody long[] ids) {
//
//	}	
}
