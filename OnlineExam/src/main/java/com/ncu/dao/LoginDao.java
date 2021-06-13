package com.ncu.dao;

import java.util.List;

import com.ncu.model.UserLogin;

public interface LoginDao {
	
public void update(UserLogin user);
	
	public void delete(String username);
	
	public List<UserLogin> showall();

	public void add(UserLogin user);

}
