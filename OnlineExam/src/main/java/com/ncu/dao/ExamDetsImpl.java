package com.ncu.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class ExamDetsImpl implements ExamDetsDao{
	
	@Autowired
	private JdbcTemplate jdbc;
	
	public ExamDetsImpl(DataSource ds)
	{
		jdbc=new JdbcTemplate(ds);
	}

	@Override
	public void delete(String examName) {
		// TODO Auto-generated method stub
		String sql = "delete from examdets where examame=?";
        jdbc.update(sql, new Object[]{examName});
		
	}	
}
