package com.baido.QLBD.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.baido.QLBD.Repository.thegiuxeDAO;
import com.baido.QLBD.entity.thegiuxe;

@Repository
public class thegiuxeDAOImpl implements thegiuxeDAO{
	
	private JdbcTemplate jdbcTemplate;

	@Autowired
	public thegiuxeDAOImpl(JdbcTemplate jdbcTemplate) {
		super();
		this.jdbcTemplate = jdbcTemplate;
	}

	@Override
	public List<thegiuxe> list() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public void themTheGiuXe() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void xoaTheGiuXe() {
		// TODO Auto-generated method stub
		
	}

}
