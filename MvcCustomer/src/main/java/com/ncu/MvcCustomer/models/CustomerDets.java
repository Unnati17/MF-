package com.ncu.MvcCustomer.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
public class CustomerDets {
	
	
	private String firstname;
	
	@NotNull(message="is required")
	
	private String lastname;

	private String prd;
	
	@NotNull(message="Fill review")
	private String review;
	
	@NotNull(message="email required")
	
	private String email;
	
	private String gender;
	@NotNull(message="Postal Code required")
	private int postcode;
	
	@NotNull(message="is required")
	private String phn;

	public CustomerDets() {}

	public CustomerDets(String firstname,String lastname,String prd,String review,String gender,String email,String phn,int postcode)
	{
		this.firstname=firstname;
		this.lastname=lastname;
		this.prd=prd;
		this.review=review;
		this.email=email;
		this.phn=phn;
		this.gender=gender;
		this.postcode=postcode;
	}
	
	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPrd() {
		return prd;
	}

	public void setPrd(String prd) {
		this.prd = prd;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public int getPostcode() {
		return postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public String getPhn() {
		return phn;
	}

	public void setPhn(String phn) {
		this.phn = phn;
	}

	@Override
	public String toString() {
		return "CustomerDets [firstname=" + firstname + ", lastname=" + lastname + ", prd=" + prd + ", review=" + review
				+ ", email=" + email + ", gender=" + gender + ", postcode=" + postcode + ", phn=" + phn + "]";
	}
	
	

}
