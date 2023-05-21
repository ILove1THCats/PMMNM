package com.baido.QLBD.Repository;

import java.util.List;

import com.baido.QLBD.entity.thanhtoan;

public interface thanhtoanDAO {
	
	public List<thanhtoan> list();
	
	public void themThanhT(thanhtoan tht);
}
