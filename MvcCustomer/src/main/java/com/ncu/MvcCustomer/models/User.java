package com.ncu.MvcCustomer.models;

import javax.validation.constraints.NotNull;

import com.ncu.MvcCustomer.validation.Password;

public class User {
	
private String username;

@NotNull(message="Enter password")
@Password(message="Must have first alphabet caps atleast 1 no. and 1 special character")
private String pass;

public String getUsername() {
	return username;
}

public void setUsername(String username) {
	this.username = username;
}

public String getPass() {
	return pass;
}

public void setPass(String pass) {
	this.pass = pass;
}


}
