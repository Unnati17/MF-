package com.ncu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;
import javax.swing.tree.RowMapper;
import javax.swing.tree.TreePath;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.stereotype.Repository;

import com.ncu.model.UserLogin;


class UserRowMapper implements RowMapper {

	public UserLogin mapRow(ResultSet rs, int rowNum) throws SQLException {
		UserLogin user = new UserLogin();
		user.setEmail(rs.getString(1));
		user.setPassword(rs.getString(2));
		user.setUsername(rs.getString(3));
		user.setDob(rs.getString(4));
		   
        return user;
	}

	@Override
	public int[] getRowsForPaths(TreePath[] path) {
		// TODO Auto-generated method stub
		return null;
	}

}
@Repository
public class LoginDaoImpl implements LoginDao {

	@Autowired
	private JdbcTemplate jdbc;
	
	public LoginDaoImpl(DataSource ds)
	{
		jdbc=new JdbcTemplate(ds);
	}
	

	@Override
	public void delete(String username) {
		
		String sql = "delete from userdets where username=?";
        jdbc.update(sql, new Object[]{username});
	}	

	
	@Override
	public void add(UserLogin user) {
		// TODO Auto-generated method stub
		String insertquery="insert into userdets values(?,?,?,?)";
		jdbc.update(insertquery,new Object[] {user.getEmail(),user.getPassword(),user.getUsername(),user.getDob()});
	}


	@Override
	public void update(UserLogin user) {
		// TODO Auto-generated method stub
		String sql = "update userdets set email=?,password=?,dob=? where username=?";
		jdbc.update(sql,new Object[] {user.getEmail(),user.getPassword(),user.getUsername(),user.getDob()});
		
	}


	@Override
	public List<UserLogin> showall() {
		// TODO Auto-generated method stub
		String sql = "select * from userdets";

        List<UserLogin> userlist = jdbc.query(sql, new ResultSetExtractor<List<UserLogin>>(){
		public List<UserLogin> extractData(ResultSet rs) throws SQLException, DataAccessException {
			 List<UserLogin> list = new ArrayList<UserLogin>();
               while (rs.next())
               {
                   UserLogin user = new UserLogin();
                   user.setEmail(rs.getString(1));
                   user.setPassword(rs.getString(2));
                   user.setUsername(rs.getString(4));
                   user.setDob(rs.getString(5));
                   
                   list.add(user);
               }
               return list;
		}
	});
   return userlist;
	} 
   } 