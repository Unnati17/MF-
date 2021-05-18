package com.ncu.MvcCustomer.dao;

import java.util.List;

import com.ncu.MvcCustomer.models.CustomerDets;

public interface CustomerDao {
	
	public void saveOrUpdate(CustomerDets cs);
    
    public void delete(String email);
     
    public CustomerDets get(String email);
     
    public List<CustomerDets> list();

}
