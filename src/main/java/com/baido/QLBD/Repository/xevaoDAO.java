package com.baido.QLBD.Repository;

import java.util.List;

import com.baido.QLBD.entity.xevao;

public interface xevaoDAO {
	
	public List<xevao> list();
	
	public void themXeVao(xevao xv);
	
	public void xoaXeVao(String id);
}
