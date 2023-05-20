package com.baido.QLBD.api;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.support.DaoSupport;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.baido.QLBD.DAO.DAO;
import com.baido.QLBD.Repository.TaikhoanDAO;
import com.baido.QLBD.entity.Taikhoan;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class TaikhoanController {
	
	@Autowired
	private TaikhoanDAO dao;
	
	@PostMapping("/login") //Ánh xạ tới các request dạng Post.
	public ModelAndView kiemtraTaikhoan (ModelAndView model, @RequestParam String tendn, 
			@RequestParam String password, HttpServletRequest request) {
		//@ResponseBody trả về giá trị String là cái phản hồi, không phải là tên view
		//@RequestParam nhận lấy tham số từ GET hoặc POST
		Taikhoan tk = new Taikhoan();
		tk.setTenDN(tendn);
		tk.setMatkhau(password);
		
		Taikhoan ty = dao.KiemtraTK(tk);
		if(ty != null) {
			HttpSession session = request.getSession();
			model.setViewName("index");
			session.setAttribute("user", ty.getTenDN());
			return model;
		}
		
		model.setViewName("Login");
		return model;	
	}
	
//	@PutMapping(path="/editTK")
//	public @ResponseBody String editTaikhoan(@RequestParam String tenDN,
//			@RequestParam String sdt, @RequestParam String matkhau) {
//		
//		return "Trang nào đấy";
//	}
//	
//	@DeleteMapping(path = "/deleteTK")
//	public @ResponseBody void deleteTaikhoan(@RequestParam String tenDN) {
//		
//		System.out.println("Xong!");
//	}

}
