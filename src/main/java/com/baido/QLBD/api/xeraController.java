package com.baido.QLBD.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.baido.QLBD.Repository.xeraDAO;
import com.baido.QLBD.entity.xera;
import com.baido.QLBD.entity.xevao;

@Controller
public class xeraController {
	
	@Autowired
	private xeraDAO xeRa;
	
	@GetMapping("/xe_ra")
	public ModelAndView showView(ModelAndView model) {
		
		List<xera> xv = xeRa.list();
		model.addObject("xeV", xv);
		model.setViewName("xera");
		return model;
	}
	
	@PostMapping("/themxR")
	public String addXeVao(@RequestParam String iDXeRa, @RequestParam String iDThe , @RequestParam MultipartFile bsxImage, @RequestParam String ngayra
			, @RequestParam String gio, @RequestParam String dongia) {
		if(iDXeRa == null) {
			return "themXeRa";
		}
		String content = "/QLProject/img/" + bsxImage.getOriginalFilename();
		xera xr = new xera();
		xr.setiDXeRa(iDXeRa);
		xr.setiDThe(iDThe);
		xr.setbSX(content);
		xr.setNgayra(ngayra);
		xr.setGio(Integer.parseInt(gio));
		xr.setDongia(Float.parseFloat(dongia));
		
		xeRa.themXeRa(xr);
		
		return "redirect:/xe_ra";
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
