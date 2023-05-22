package com.baido.QLBD.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.baido.QLBD.Repository.thanhtoanDAO;
import com.baido.QLBD.entity.thanhtoan;

@Repository
public class thanhtoanDAOImpl implements thanhtoanDAO {
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public thanhtoanDAOImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<thanhtoan> list() {
		// TODO Auto-generated method stub
		String sql = "Select * from thanhtoan";
		List<thanhtoan> tk = jdbcTemplate.query(sql, (rs, rowNum) -> {
			thanhtoan tToan = new thanhtoan();
			tToan.setiDThanhToan(rs.getString("idthanhtoan"));
			tToan.setBienSo(rs.getString("bienso"));
			tToan.setHinhThucThanhToan(rs.getString("hinhthucthanhtoan"));
			tToan.setSoTien(rs.getFloat("sotien"));
			return tToan;
		});
		return tk;
	}

	@Override
	public void themThanhT(thanhtoan tht) {
		// TODO Auto-generated method stub
		String sql = "Insert into thanhtoan(idthanhtoan, bienso, hinhthucthanhtoan, sotien) values (?,?,?,?)";
		jdbcTemplate.update(sql, tht.getiDThanhToan(), tht.getBienSo(), tht.getHinhThucThanhToan(), tht.getSoTien());
	}

}
