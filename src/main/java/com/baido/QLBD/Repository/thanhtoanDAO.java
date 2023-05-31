package com.baido.QLBD.Repository;

import java.util.List;

import com.baido.QLBD.Model.thanhtoan;

public interface thanhtoanDAO {
	
	public List<thanhtoan> list();
	
	public void themThanhT(thanhtoan tht);
}
