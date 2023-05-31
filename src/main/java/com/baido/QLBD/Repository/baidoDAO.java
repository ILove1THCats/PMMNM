package com.baido.QLBD.Repository;

import java.util.List;

import com.baido.QLBD.Model.baido;

public interface baidoDAO {
	
	public List<baido> list();
	
	public List<baido> search(String name);

}
