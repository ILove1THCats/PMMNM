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

import com.baido.QLBD.Repository.baidoDAO;
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
	
	@Autowired
	private baidoDAO baiDo;
	
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
	public ModelAndView addXeVao(@RequestParam String iDXeVao, @RequestParam String iDThe , @RequestParam String khuvucdo, 
			@RequestParam MultipartFile bsxImage, @RequestParam String loai, @RequestParam String ngayvao,
			HttpServletRequest request, ModelAndView model) throws IOException {
		List<xevao> xev = xeVao.kiemtra(iDXeVao, iDThe);
		if(iDXeVao == null) {
			
			model.setViewName("themXeVao");
			return model;
		}else if(xev.size() != 0) {		
			if (xev.get(0) != null || xev.get(1) != null) {
				List<baido> bd = baiDo.list();
				request.setAttribute("mes", "Có vẻ như bạn đã nhập sai ID xe vào hay ID xe ra rồi!");
				model.addObject("baido", bd);
				model.setViewName("themXeVao");
				return model;
			}	
		};
		
		String content = "/QLProject/img/" + bsxImage.getOriginalFilename();
		xevao xv = new xevao();
		xv.setIdXe(iDXeVao);
		xv.setIdThe(iDThe);
		xv.setIdBD(khuvucdo);
		xv.setBsx(content);
		xv.setLoai(loai);
		xv.setNgayVao(ngayvao);
		
		xeVao.themXeVao(xv);
		model.setViewName("redirect:/xe_vao");
		return model;
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
