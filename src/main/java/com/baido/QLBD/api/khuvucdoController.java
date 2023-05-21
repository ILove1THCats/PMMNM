package com.baido.QLBD.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.baido.QLBD.Repository.baidoDAO;
import com.baido.QLBD.entity.baido;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class khuvucdoController {
	
	@Autowired
	private baidoDAO baiDo;
	
	@GetMapping("/khu_vuc_do")
	public ModelAndView showView(ModelAndView model, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		if(session.getAttribute("user") == null) {
			model.setViewName("Login");
			return model;
		}
		List<baido> bd = baiDo.list();
		model.addObject("kvd", bd);
		model.setViewName("khu_vuc_do");
		return model;
	}
	
	@GetMapping("/searchkvd")
	public ModelAndView searchKVD(ModelAndView model, @RequestParam String keyword) {
		
		List<baido> bd = baiDo.search(keyword);
		model.addObject("kvd", bd);
		model.setViewName("khu_vuc_do");
		return model;
	}
	
	@GetMapping("/themXeVao")
	public ModelAndView themXeVao(ModelAndView model) {
		
		List<baido> bd = baiDo.list();
		model.addObject("baido", bd);
		model.setViewName("themXeVao");
		return model;
	}

}
