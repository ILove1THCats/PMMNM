package com.baido.QLBD.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.baido.QLBD.entity.Taikhoan;

//Controller + ResponseBody 
@RestController
public class NewAPI {
	
	//Post + 
	@PostMapping(value = "/new")
	public Taikhoan createTK(@RequestBody Taikhoan model) {

        return model;
	}
	
	@PutMapping(value = "/new")
	public Taikhoan updateTK(@RequestBody Taikhoan model) {

        return model;
	}
	
	@DeleteMapping(value = "/new")
	public void deleteTK(@RequestBody long[] ids) {

	}	
}
