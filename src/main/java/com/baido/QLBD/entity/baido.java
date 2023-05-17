package com.baido.QLBD.entity;

public class baido {
	private String IDBD;
	private String TenBD;
	private int SLuong;
	
	public baido() {
		super();
	}
	public baido(String iDBD, String tenBD, int sLuong) {
		super();
		IDBD = iDBD;
		TenBD = tenBD;
		SLuong = sLuong;
	}
	public String getIDBD() {
		return IDBD;
	}
	public void setIDBD(String iDBD) {
		IDBD = iDBD;
	}
	public String getTenBD() {
		return TenBD;
	}
	public void setTenBD(String tenBD) {
		TenBD = tenBD;
	}
	public int getSLuong() {
		return SLuong;
	}
	public void setSLuong(int sLuong) {
		SLuong = sLuong;
	}
}
