package com.baido.QLBD.Controller;

import java.util.ArrayList;
import java.util.List;
import com.baido.QLBD.dbo.DAO;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.baido.QLBD.dbo.DAO;
import com.baido.QLBD.entity.Taikhoan;

@RestController
@RequestMapping("/taikhoan")
public class TaikhoanController {
	
	@PostMapping(path="/login") //Ánh xạ tới các request dạng Post.
	public String kiemtraTk (@RequestParam String tenDN, @RequestParam String matkhau) {
		//@ResponseBody trả về giá trị String là cái phản hồi, không phải là tên view
		//@RequestParam nhận lấy tham số từ GET hoặc POST
		Taikhoan tk = new Taikhoan();
		tk.setTenDN(tenDN);
		tk.setMatkhau(matkhau);
		
		List<Taikhoan> taik = new ArrayList<Taikhoan>();
		taik.add(tk);
		kiemtraTk(tenDN, matkhau);
		
		return "Saved";	
	}
	
	@PutMapping(path="/editTK")
	public @ResponseBody String editTaikhoan(@RequestParam String tenDN,
			@RequestParam String sdt, @RequestParam String matkhau) {
		
		return "Trang nào đấy";
	}
	
	@DeleteMapping(path = "/deleteTK")
	public @ResponseBody void deleteTaikhoan(@RequestParam String tenDN) {
		
		System.out.println("Xong!");
	}

}
