package com.baido.QLBD.Model;

public class thanhtoan {
	private String iDThanhToan;
	private String bienSo;
	private String hinhThucThanhToan;
	private float soTien;
	public thanhtoan() {
		super();
	}
	public thanhtoan(String iDThanhToan, String bienSo, String hinhThucThanhToan, float soTien) {
		super();
		this.iDThanhToan = iDThanhToan;
		this.bienSo = bienSo;
		this.hinhThucThanhToan = hinhThucThanhToan;
		this.soTien = soTien;
	}
	public String getiDThanhToan() {
		return iDThanhToan;
	}
	public void setiDThanhToan(String iDThanhToan) {
		this.iDThanhToan = iDThanhToan;
	}
	public String getBienSo() {
		return bienSo;
	}
	public void setBienSo(String bienSo) {
		this.bienSo = bienSo;
	}
	public String getHinhThucThanhToan() {
		return hinhThucThanhToan;
	}
	public void setHinhThucThanhToan(String hinhThucThanhToan) {
		this.hinhThucThanhToan = hinhThucThanhToan;
	}
	public float getSoTien() {
		return soTien;
	}
	public void setSoTien(float soTien) {
		this.soTien = soTien;
	}
	
	
}
