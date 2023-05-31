package com.baido.QLBD.DAO;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.baido.QLBD.Model.Taikhoan;
import com.baido.QLBD.Model.xera;
import com.baido.QLBD.Model.xevao;
import com.baido.QLBD.Repository.xevaoDAO;

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

	@Override
	public List<xevao> kiemtra(String iDXeVao, String iDThe) {
		// TODO Auto-generated method stub
		String sql = "Select IDXeVao, IDThe from Xevao where IDXeVao LIKE ? or IDThe LIKE ?";
		List<xevao> xv = jdbcTemplate.query(sql, ps -> {
			String idXV = "%" + iDXeVao + "%";
			String idXeRa = "%" + iDThe + "%";
			ps.setString(1, idXV);
			ps.setString(2, idXeRa);
		}, (rs, rowNum) -> {
			xevao x = new xevao();
			x.setIdXe(rs.getString("IDXeVao"));
			x.setIdThe(rs.getString("IDThe"));
			return x;
		});
		return xv;
	}

	@Override
	public String kiemtra_Tontai(String id) {
		// TODO Auto-generated method stub
		String sql = "Select IDXeRa from xera where IDXeRa = ?";
		List<xera> exist = jdbcTemplate.query(sql, ps -> {
			ps.setString(1, id);
		}, (rs, rowNum) -> {
			xera x = new xera();
			x.setiDXeRa(rs.getString("IDXeRa"));
			return x;
		});
		
		if(exist.size() != 0) {
			return "true";
		}
		
		return "false";
	}
}
