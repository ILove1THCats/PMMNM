package com.baido.QLBD.Repository;

import org.springframework.data.repository.CrudRepository;
import com.baido.QLBD.entity.Taikhoan;

public interface TaikhoanRepository {
	
	public boolean kiemtraTk(Taikhoan tk);

}
