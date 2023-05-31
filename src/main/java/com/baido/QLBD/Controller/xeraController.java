package com.baido.QLBD.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.baido.QLBD.Model.baido;
import com.baido.QLBD.Model.xera;
import com.baido.QLBD.Model.xevao;
import com.baido.QLBD.Repository.xeraDAO;
import com.baido.QLBD.Repository.xevaoDAO;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

@Controller
public class xeraController {
	
	@Autowired
	private xeraDAO xeRa;
	
	@Autowired
	private xevaoDAO xeVao;
	
	@GetMapping("/xe_ra")
	public ModelAndView showView(ModelAndView model, HttpServletRequest request) {
		
		HttpSession session = request.getSession();
		if(session.getAttribute("user") == null) {
			model.setViewName("Login");
			return model;
		}
		List<xera> xv = xeRa.list();
		model.addObject("xeV", xv);
		model.setViewName("xera");
		return model;
	}
	
	@PostMapping("/themxR")
	public ModelAndView addXeVao(@RequestParam String iDXeRa, @RequestParam String iDThe , @RequestParam MultipartFile bsxImage, 
			@RequestParam String ngayra, @RequestParam String gio, @RequestParam String dongia, 
			HttpServletRequest request, ModelAndView model) {
		
		List<xera> xev = xeRa.kiemtra(iDXeRa, iDThe);
		if(iDXeRa == null) {
			
			request.setAttribute("mes", "Thiếu ID xe ra!");
			model.setViewName("themXeRa");
			return model;
		}else if(xev.size() != 0) {		
			if (xev.get(0) != null || xev.get(1) != null) {
				List<xevao> xv = xeVao.list();
				request.setAttribute("mes", "Có vẻ như bạn đã nhập sai ID xe vào hay ID thanh toán rồi!");
				model.addObject("xev", xv);
				model.setViewName("themXeRa");
				return model;
			}	
		};
		String content = "/QLProject/img/" + bsxImage.getOriginalFilename();
		xera xr = new xera();
		xr.setiDXeRa(iDXeRa);
		xr.setiDThe(iDThe);
		xr.setbSX(content);
		xr.setNgayra(ngayra);
		xr.setGio(Integer.parseInt(gio));
		xr.setDongia(Float.parseFloat(dongia));
		
		xeRa.themXeRa(xr);
		model.setViewName("redirect:/xe_ra");
		return model;
	}
	
	@GetMapping("/xoaxeR")
	public String deleteXeVao(@RequestParam String id) {
		
		xeRa.xoaXeRa(id);
		return "redirect:/xe_ra";		
	}
	
	@GetMapping("/searchXR")
	public ModelAndView searchXR(ModelAndView model, @RequestParam String keyword) {
		
		List<xera> xv = xeRa.search(keyword);
		model.addObject("xeV", xv);
		model.setViewName("xera");
		return model;
	}

}
