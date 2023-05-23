package com.baido.QLBD.Repository;

import java.util.List;

import com.baido.QLBD.entity.xevao;

public interface xevaoDAO {
	
	public List<xevao> list();
	
	public List<xevao> search(String name);
	
	public void themXeVao(xevao xv);
	
	public void xoaXeVao(String id);

	public List<xevao> kiemtra(String iDXeVao, String iDThe);
	
	public String kiemtra_Tontai(String id);
}
