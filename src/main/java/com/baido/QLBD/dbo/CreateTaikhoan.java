package com.baido.QLBD.dbo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.baido.QLBD.entity.Taikhoan;
import com.baido.QLBD.entity.TaikhoanRepository;

@Controller //Biến đổi class này thành 1 controller
@RequestMapping(path="/demo") //Điều này có nghĩa là khi đoạn url khởi động thì sẽ dò cái /demo này
public class CreateTaikhoan {
	
	@Autowired //Lấy bean có tên là TaikhoanRepository, dùng phần bên dưới để xử lý dữ liệu.
	private TaikhoanRepository taikhoanrep;
	
	@PostMapping(path="/addTK") //Ánh xạ tới các request dạng Post.
	public @ResponseBody String addTaikhoan (@RequestParam String tenDN,
			@RequestParam String sdt, @RequestParam String matkhau) {
		//@ResponseBody trả về giá trị String là cái phản hồi, không phải là tên view
		//@RequestParam nhận lấy tham số từ GET hoặc POST
		
		Taikhoan tk = new Taikhoan();
		tk.setTenDN(tenDN);
		tk.setSdt(sdt);
		tk.setMatkhau(matkhau);
		
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
