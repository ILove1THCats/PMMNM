package com.baido.QLBD.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

public class Taikhoan {
	
	private String tenDN;
	private String sdt; 
	private String matkhau;
	
	public Taikhoan() {
		super();
	}
	
	public Taikhoan(String tenDN, String matkhau) {
		super();
		this.tenDN = tenDN;
		this.matkhau = matkhau;
	}
	public Taikhoan(String tenDN, String sdt, String matkhau) {
		super();
		this.tenDN = tenDN;
		this.sdt = sdt;
		this.matkhau = matkhau;
	}
	
	public String getTenDN() {
		return tenDN;
	}
	public void setTenDN(String tenDN) {
		this.tenDN = tenDN;
	}
	public String getSdt() {
		return sdt;
	}
	public void setSdt(String sdt) {
		this.sdt = sdt;
	}
	public String getMatkhau() {
		return matkhau;
	}
	public void setMatkhau(String matkhau) {
		this.matkhau = matkhau;
	}
}
