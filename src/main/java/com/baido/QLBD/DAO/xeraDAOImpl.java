package com.baido.QLBD.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.baido.QLBD.Repository.xeraDAO;
import com.baido.QLBD.entity.xera;
import com.baido.QLBD.entity.xevao;

@Repository
public class xeraDAOImpl implements xeraDAO {
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public xeraDAOImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<xera> list() {
		// TODO Auto-generated method stub
		String sql = "Select * from xera";
		List<xera> xr = jdbcTemplate.query(sql, (rs, rowNum) -> {
			xera xe = new xera();
			xe.setiDXeRa(rs.getString("IDXeRa"));
			xe.setiDThe(rs.getString("IDThe"));
			xe.setbSX(rs.getString("BSX"));
			xe.setNgayra(rs.getTimestamp("Ngayra").toString());
			xe.setGio(rs.getInt("Gio"));
			xe.setDongia(rs.getFloat("Dongia"));
			
			return xe;
		});
		return xr;
	}

	@Override
	public void themXeRa(xera xr) {
		// TODO Auto-generated method stub
		String sql = "Insert into xera(IDXeRa, IDThe, BSX, Ngayra , Gio, Dongia) values (?,?,?,?,?,?)";
		jdbcTemplate.update(sql, xr.getiDXeRa(), xr.getiDThe(), xr.getbSX(), xr.getNgayra()
				, xr.getGio(), xr.getDongia());
	}

	@Override
	public void xoaXeRa(String id) {
		// TODO Auto-generated method stub
		String sql = "Delete from xera where IDXeRa = ?";
		jdbcTemplate.update(sql, id);
	}

	@Override
	public List<xera> search(String name) {
		// TODO Auto-generated method stub
		String sql = "Select * from xera where IDXeRa LIKE ?";
		List<xera> xr = jdbcTemplate.query(sql ,ps -> {
			String pre = "%" + name + "%";
			ps.setString(1, pre);
		}, (rs, rowNum) -> {
			xera xe = new xera();
			xe.setiDXeRa(rs.getString("IDXeRa"));
			xe.setiDThe(rs.getString("IDThe"));
			xe.setbSX(rs.getString("BSX"));
			xe.setNgayra(rs.getTimestamp("Ngayra").toString());
			xe.setGio(rs.getInt("Gio"));
			xe.setDongia(rs.getFloat("Dongia"));
			
			return xe;
		});
		return xr;
	}
	
	
}
