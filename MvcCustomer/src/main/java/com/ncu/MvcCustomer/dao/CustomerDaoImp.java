package com.ncu.MvcCustomer.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ncu.MvcCustomer.models.CustomerDets;


class CustomerMapper implements RowMapper<CustomerDets>{
	
	@Override
	public CustomerDets mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		CustomerDets cus = new CustomerDets();
		 cus.setEmail(rs.getString("email"));
         cus.setPrd(rs.getString("prd"));
         cus.setFirstname(rs.getString("firstname"));
         cus.setLastname(rs.getString("lastname"));
         cus.setGender(rs.getString("gender"));
         cus.setPostcode(rs.getInt("postcode"));
         cus.setReview(rs.getString("review"));
         cus.setPhn(rs.getString("phn"));
		return  cus;
		
		
	}
	
}


@Repository
public class CustomerDaoImp implements CustomerDao{

	@Autowired
	private JdbcTemplate customer;
	
	public CustomerDaoImp(DataSource dataSource) {
        customer = new JdbcTemplate(dataSource);
    }
	
	@Override
	public void saveOrUpdate(CustomerDets cus) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(String email) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CustomerDets get(String email) {
		String sql = "SELECT * FROM customer where email='" + email + "'";
	    return customer.queryForObject(sql, BeanPropertyRowMapper.newInstance(CustomerDets.class));
		
	}

	@Override
	public List<CustomerDets> list() {
//		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
//        String sql = "SELECT * from users";
//        List<User> listUser = jdbcTemplate.query(sql,new RowMapper<User>()  {
// 
//         @Override
//			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
//				  User user = new User();
//	                user.setEmail(rs.getString("puneet.gmail.com"));
//	                user.setPassword(rs.getString("abc@123"));
//	                user.setFname(rs.getString("Puneet"));
//	                return user;
//				
//			}
//             
//        });
//        return listUser;
        return null;
	}

	

}
