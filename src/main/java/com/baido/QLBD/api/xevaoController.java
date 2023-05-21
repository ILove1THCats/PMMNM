package com.baido.QLBD.api;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.baido.QLBD.Repository.xevaoDAO;
import com.baido.QLBD.entity.baido;
import com.baido.QLBD.entity.xevao;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.jsp.PageContext;

@Controller
public class xevaoController {
	
	@Autowired
	private xevaoDAO xeVao;
	
	@GetMapping("/xe_vao")
	public ModelAndView showView(ModelAndView model, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		if(session.getAttribute("user") == null) {
			model.setViewName("Login");
			return model;
		}
		List<xevao> xv = xeVao.list();
		model.addObject("xeV", xv);
		model.setViewName("xevao");
		return model;
	}
	
	@PostMapping("/themxV")
	public String addXeVao(@RequestParam String iDXeVao, @RequestParam String iDThe , @RequestParam String khuvucdo, 
			@RequestParam MultipartFile bsxImage, @RequestParam String loai, @RequestParam String ngayvao) throws IOException {
		if(iDXeVao == null) {
			return "themXeVao";
		}
		String content = "/QLProject/img/" + bsxImage.getOriginalFilename();
		xevao xv = new xevao();
		xv.setIdXe(iDXeVao);
		xv.setIdThe(iDThe);
		xv.setIdBD(khuvucdo);
		xv.setBsx(content);
		xv.setLoai(loai);
		xv.setNgayVao(ngayvao);
		
		xeVao.themXeVao(xv);
		
		return "redirect:/xe_vao";
	}
	
	@GetMapping("/xoaxeV")
	public String deleteXeVao(@RequestParam String id) {
		
		xeVao.xoaXeVao(id);
		return "redirect:/xe_vao";		
	}
	
	@GetMapping("/searchXV")
	public ModelAndView searchXV(ModelAndView model, @RequestParam String keyword) {
		
		List<xevao> xv = xeVao.search(keyword);
		model.addObject("xeV", xv);
		model.setViewName("xevao");
		return model;
	}
	
	@RequestMapping("/themXeRa")
	public ModelAndView themXeRa(ModelAndView model) {

		List<xevao> xv = xeVao.list();
		model.addObject("xev", xv);
		model.setViewName("themXeRa");
		return model;
	}

}
