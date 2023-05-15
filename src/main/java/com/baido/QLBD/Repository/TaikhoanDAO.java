package com.baido.QLBD.Repository;

import java.util.List;

import com.baido.QLBD.entity.Taikhoan;

public interface TaikhoanDAO {
	
	public List<Taikhoan> list();
	
	public Taikhoan get(int id);

	public Taikhoan KiemtraTK(Taikhoan tk);

}
