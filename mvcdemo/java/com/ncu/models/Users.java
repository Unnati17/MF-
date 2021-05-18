package com.ncu.models;

public class Users {
	
	private String userid;
	private String pwd;
	
	public Users() {}

//	public Users(String userid,String pwd)
//	{
//		this.userid=userid;
//		this.pwd=pwd;
//	}
	public String getUserid() 
	{
		return userid;
	}
	public void setUserid(String userid) 
	{
	this.userid=userid;
	}
	public String getPwd() 
	{
	return pwd;
	}
	public void setPwd(String pwd) 
	{
	this.pwd = pwd;
	}
	

}
