package com.baido.QLBD.dbo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;


import org.springframework.stereotype.Repository;

import com.baido.QLBD.Repository.TaikhoanRepository;
import com.baido.QLBD.entity.Taikhoan;

@Repository
public class DAO implements TaikhoanRepository {
	
	private Connection con;
	
	@Override
	public boolean kiemtraTk (Taikhoan tk) {
		String sql = "select * from taikhoan where TenDN = ? and Maukhau = ?";
        PreparedStatement statement;
		try {
			statement = con.prepareStatement(sql);
			statement.setString(1, tk.getTenDN());
	        statement.setString(2, tk.getMatkhau());
	        ResultSet rs = statement.executeQuery();
	        if (rs.next()) {
	        	System.out.print("Dasdasd");
	            return true;
	        }
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        return false;
		
			
	}

	

}
