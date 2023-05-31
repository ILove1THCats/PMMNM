package com.baido.QLBD.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.baido.QLBD.Model.baido;
import com.baido.QLBD.Repository.baidoDAO;

@Repository
public class baidoDAOImpl implements baidoDAO {
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public baidoDAOImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<baido> list() {
		// TODO Auto-generated method stub
		String sql = "Select * from baido";
		List<baido> bd = jdbcTemplate.query(sql, (rs, rowNum) -> {
			baido baid = new baido();
			baid.setIDBD(rs.getString("IDBD"));
			baid.setTenBD(rs.getString("TenBD"));
			baid.setSLuong(rs.getInt("SLuong"));
			return baid;
		});
		return bd;
	}

	@Override
	public List<baido> search(String name) {
		// TODO Auto-generated method stub
		String sql = "Select * from baido where IDBD LIKE ?";
		List<baido> bd = jdbcTemplate.query(sql ,ps -> {
			String pre = "%" + name + "%";
			ps.setString(1, pre);
		}, (rs, rowNum) -> {
			baido baid = new baido();
			baid.setIDBD(rs.getString("IDBD"));
			baid.setTenBD(rs.getString("TenBD"));
			baid.setSLuong(rs.getInt("SLuong"));
			return baid;
		});	
		return bd;
	}	

}
