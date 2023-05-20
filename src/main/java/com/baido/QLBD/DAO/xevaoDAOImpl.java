package com.baido.QLBD.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.baido.QLBD.Repository.xevaoDAO;
import com.baido.QLBD.entity.Taikhoan;
import com.baido.QLBD.entity.xevao;

@Repository
public class xevaoDAOImpl implements xevaoDAO {
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public xevaoDAOImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<xevao> list() {
		// TODO Auto-generated method stub
		String sql = "Select * from Xevao";
		List<xevao> xv = jdbcTemplate.query(sql, (rs, rowNum) -> {
			xevao xe = new xevao();
			xe.setIdXe(rs.getString("IDXeVao"));
			xe.setIdThe(rs.getString("IDThe"));
			xe.setIdBD(rs.getString("IDBD"));
			xe.setLoai(rs.getString("Loai"));
			String str = rs.getTimestamp("Ngayvao").toString();
			xe.setNgayVao(str);
			xe.setBsx(rs.getString("BSX"));
			
			return xe;
		});
		return xv;
	}

	@Override
	public void themXeVao(xevao xv) {
		// TODO Auto-generated method stub
		String sql = "Insert into Xevao(IDXeVao, IDThe, IDBD, Loai , Ngayvao, BSX) values (?,?,?,?,?,?)";
		jdbcTemplate.update(sql, xv.getIdXe(), xv.getIdThe(), xv.getIdBD(), xv.getLoai()
				, xv.getNgayVao(), xv.getBsx());
	}

	@Override
	public void xoaXeVao(String id) {
		// TODO Auto-generated method stub
		String sql = "Delete from Xevao where IDXeVao = ?";
		jdbcTemplate.update(sql, id);
		
	}

	@Override
	public List<xevao> search(String name) {
		// TODO Auto-generated method stub
		String sql = "Select * from Xevao where IDXeVao Like ?";
		List<xevao> xv = jdbcTemplate.query(sql ,ps -> {
			String pre = "%" + name + "%";
			ps.setString(1, pre);
		}, (rs, rowNum) -> {
			xevao xe = new xevao();
			xe.setIdXe(rs.getString("IDXeVao"));
			xe.setIdThe(rs.getString("IDThe"));
			xe.setIdBD(rs.getString("IDBD"));
			xe.setLoai(rs.getString("Loai"));
			String str = rs.getTimestamp("Ngayvao").toString();
			xe.setNgayVao(str);
			xe.setBsx(rs.getString("BSX"));
			
			return xe;
		});
		return xv;
	}
	

}
