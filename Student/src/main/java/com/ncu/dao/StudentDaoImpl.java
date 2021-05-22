package com.ncu.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.ncu.model.Student;



class StudentRowMapper implements RowMapper<Student> {

	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		Student student = new Student();
        student.setRn(rs.getString(1));
        student.setSpl(rs.getString(2));
        student.setDept(rs.getString(3));
        student.setName(rs.getString(4));
        return student;
	}
	
}

@Repository
public abstract class StudentDaoImpl implements StudentDao {
	
	 private JdbcTemplate jdbcTemplate;
	    // JdbcTemplate setter
	    public void setJdbcTemplate(JdbcTemplate jdbcTemplate)
	    {
	        this.jdbcTemplate = jdbcTemplate;
	    }

	public void saveStudent(Student student) {
		String sql = "insert into student values(?,?,?,?)";

        jdbcTemplate.update(sql, new Object[]
        { student.getRn(), student.getSpl(), student.getDept(), student.getName() });
		
	}

	public Student getStudentByRn(String rn) {
		 String sql = "select * from student where rn=?";
		 Student student= (Student) jdbcTemplate.queryForObject(sql, new Object[]
			        { rn }, new StudentRowMapper());

//						public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//							Employee employee = new Employee();
//			                employee.setId(rs.getInt(1));
//			                employee.setAge(rs.getInt(2));
//			                employee.setDept(rs.getString(3));
//			                employee.setName(rs.getString(4));
//			                return employee;
//						}
//			 
//			 
//			        });
		return student;	 
		
	}

	public void updateStudent(Student student) {
		String sql = "update student set spl =?, dept=?,name=? where rn=?";
        jdbcTemplate.update(sql, new Object[]
        { student.getRn(), student.getDept(), student.getName(), student.getSpl() });
		
	}

	public void deleteStudent(String rn) {
		String sql = "delete from student where rn=?";
        jdbcTemplate.update(sql, new Object[]
        { rn });
	}

	public List<Student> getAllStudent() {
		String sql = "select * from student";

        List<Student> studentList = jdbcTemplate.query(sql, new ResultSetExtractor<List<Student>>(){

			public List<Student> extractData(ResultSet rs) throws SQLException, DataAccessException {
				 List<Student> list = new ArrayList<Student>();
	                while (rs.next())
	                {
	                	Student student = new Student();
	                	student.setRn(rs.getString(1));
	                	student.setSpl(rs.getString(2));
	                	student.setDept(rs.getString(3));
	                	student.setName(rs.getString(4));
	                    list.add(student);
	                }
	                return list;
			}
        });
			
        
        return studentList;
		
	}
	
}
