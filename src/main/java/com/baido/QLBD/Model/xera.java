package com.baido.QLBD.Model;

public class xera {
	private String iDXeRa;
	private String iDThe;
	private String bSX;
	private String ngayra;
	private int gio;
	private float dongia;
	
	public xera() {
		super();
	}
	public xera(String iDXeRa, String iDThe, String bSX, String ngayra, int gio, float dongia) {
		super();
		this.iDXeRa = iDXeRa;
		this.iDThe = iDThe;
		this.bSX = bSX;
		this.ngayra = ngayra;
		this.gio = gio;
		this.dongia = dongia;
	}
	public String getiDXeRa() {
		return iDXeRa;
	}
	public void setiDXeRa(String iDXeRa) {
		this.iDXeRa = iDXeRa;
	}
	public String getiDThe() {
		return iDThe;
	}
	public void setiDThe(String iDThe) {
		this.iDThe = iDThe;
	}
	public String getbSX() {
		return bSX;
	}
	public void setbSX(String bSX) {
		this.bSX = bSX;
	}
	public String getNgayra() {
		return ngayra;
	}
	public void setNgayra(String ngayra) {
		this.ngayra = ngayra;
	}
	public int getGio() {
		return gio;
	}
	public void setGio(int gio) {
		this.gio = gio;
	}
	public float getDongia() {
		return dongia;
	}
	public void setDongia(float dongia) {
		this.dongia = dongia;
	}
	
	
}
