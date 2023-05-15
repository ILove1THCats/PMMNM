package com.baido.QLBD.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.baido.QLBD.Repository.TaikhoanDAO;
import com.baido.QLBD.entity.Taikhoan;

@Repository
public class DAO {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public DAO(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	public boolean kiemtraTk (Taikhoan tk) throws SQLException {
		String sql = "select TenDN, Matkhau from taikhoan where TenDN = ? and Maukhau = ?";
        
		return false;			
	}

	

}
