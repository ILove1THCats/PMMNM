package com.baido.QLBD.Repository;

import java.util.List;

import com.baido.QLBD.entity.xera;
import com.baido.QLBD.entity.xevao;

public interface xeraDAO {
	
	public List<xera> list();
	
	public void themXeRa(xera xr);
	
	public void xoaXeRa(String id);

}
