package com.baido.QLBD.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.baido.QLBD.Repository.xevaoDAO;
import com.baido.QLBD.entity.xevao;

@Controller
public class xevaoController {
	
	@Autowired
	private xevaoDAO xeVao;
	
	@GetMapping("/xe_vao")
	public ModelAndView showView(ModelAndView model) {
		
		List<xevao> xv = xeVao.list();
		model.addObject("xeV", xv);
		model.setViewName("xevao");
		return model;
	}
	
	@PostMapping("/themxV")
	public String addXeVao(@RequestParam String iDXeVao, @RequestParam String iDThe , @RequestParam String baiDo, @RequestParam String bsxImage
			, @RequestParam String loai, @RequestParam String ngayvao) {
		if(iDXeVao == null) {
			return "themXeVao";
		}
		xevao xv = new xevao();
		xv.setIdXe(iDXeVao);
		xv.setIdThe(iDThe);
		xv.setIdBD(baiDo);
		xv.setBsx(bsxImage);
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

}
