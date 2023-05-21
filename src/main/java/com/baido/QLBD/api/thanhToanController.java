package com.baido.QLBD.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.baido.QLBD.Repository.thanhtoanDAO;
import com.baido.QLBD.entity.thanhtoan;
import com.baido.QLBD.entity.xevao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class thanhToanController {
	
	@Autowired
	private thanhtoanDAO thanht;

	@GetMapping("/thanhtoan")
	public final ModelAndView showView(ModelAndView model, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		if(session.getAttribute("user") == null) {
			model.setViewName("Login");
			return model;
		}
		List<thanhtoan> tht = thanht.list();
		model.addObject("thanhT", tht);
		model.setViewName("thanhToan");
		return model;
	}
	
	@GetMapping("/phieuThanhT")
	public ModelAndView phieuThanhToan(ModelAndView model, @RequestParam String id) {
		
		model.addObject("id", id);
		model.setViewName("phieuThanhToan");
		return model;
	}
	
	@PostMapping("/themThanhToan")
	public ModelAndView themThanhToan(ModelAndView model, @RequestParam String id_xe, @RequestParam String bien_so
			, @RequestParam String hinh_thuc_thanh_toan, @RequestParam String so_tien) {
		
		thanhtoan tht = new thanhtoan(id_xe, bien_so, hinh_thuc_thanh_toan, Integer.parseInt(so_tien));
		thanht.themThanhT(tht);
		model.setViewName("index");	
		return model;
	}
}
