package com.ncu.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import com.ncu.validations.Password;

public class UserLogin {
	
	@NotNull(message="is required")
	@Pattern(regexp= "^[a-zA-Z0-9+_.-]+@[a-zA-Z0-9.-]+$", message="email required")
	private String email;
	@Password(message="Must have first alphabet caps atleast 1 no. and 1 special character")
	private String password ;
	
	private String username ;
	private String dob;

	
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

}