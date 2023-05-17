package com.baido.QLBD.entity;

public class thegiuxe {
	private String IDThe;
	private String IDXeVao;
	private String Ngayvao; // datetime NOT NULL
	
	public thegiuxe() {
		super();
	}
	public thegiuxe(String iDThe, String iDXeVao, String ngayvao) {
		super();
		IDThe = iDThe;
		IDXeVao = iDXeVao;
		Ngayvao = ngayvao;
	}
	public String getIDThe() {
		return IDThe;
	}
	public void setIDThe(String iDThe) {
		IDThe = iDThe;
	}
	public String getIDXeVao() {
		return IDXeVao;
	}
	public void setIDXeVao(String iDXeVao) {
		IDXeVao = iDXeVao;
	}
	public String getNgayvao() {
		return Ngayvao;
	}
	public void setNgayvao(String ngayvao) {
		Ngayvao = ngayvao;
	}
}
