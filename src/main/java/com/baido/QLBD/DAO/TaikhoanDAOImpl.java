package com.baido.QLBD.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.baido.QLBD.Repository.TaikhoanDAO;
import com.baido.QLBD.entity.Taikhoan;

@Repository
public class TaikhoanDAOImpl implements TaikhoanDAO {
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public TaikhoanDAOImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<Taikhoan> list() {
		// TODO Auto-generated method stub
		String sql = "select * from taikhoan";
		List<Taikhoan> tk = jdbcTemplate.query(sql, (rs, rowNum) -> {
		    Taikhoan taikhoan = new Taikhoan();
		    taikhoan.setTenDN(rs.getString("TenDN"));
		    taikhoan.setSdt(rs.getString("Sdt"));
		    taikhoan.setMatkhau(rs.getString("Matkhau"));
		    // Ánh xạ các trường khác của đối tượng Taikhoan từ ResultSet

		    return taikhoan;
		});
		return tk;
	}

	@Override
	public Taikhoan get(int id) {
		// TODO Auto-generated method stub
		String sql = "Select * from taikhoan where TenDN = " + id;	
		return jdbcTemplate.query(sql, rs -> {
			
			if(rs.next()) {
				Taikhoan th = new Taikhoan();
				th.setTenDN(rs.getString("TenDN"));
			    th.setSdt(rs.getString("Sdt"));
			    th.setMatkhau(rs.getString("Matkhau"));
			    return th;
			}
			return null;
		});
	}

	@Override
	public Taikhoan KiemtraTK(Taikhoan tk) {
		// TODO Auto-generated method stub
		String sql = "SELECT TenDN, Matkhau FROM taikhoan WHERE TenDN = ? AND Matkhau = ?";
		Taikhoan tai = jdbcTemplate.query(sql, ps -> {
	        ps.setString(1, tk.getTenDN());
	        ps.setString(2, tk.getMatkhau());
	    }, rs -> {
	        if (rs.next()) {
	            Taikhoan th = new Taikhoan();
	            th.setTenDN(rs.getString("TenDN"));
	            th.setMatkhau(rs.getString("Matkhau"));
	            return th;
	        }
	        return null;
	    });
		return tai;
	}
	
	

}
