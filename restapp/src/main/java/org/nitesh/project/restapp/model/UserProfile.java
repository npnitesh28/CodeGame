package org.nitesh.project.restapp.model;

import java.util.Date;

import com.mysql.cj.jdbc.Blob;

public class UserProfile {

	String user_id;
	String first_name;
	String middle_name;
	String last_name;
	String username;
	String password;
	String email_id;
	String contact_number;
	Blob profile_photo;
	Date user_creation_date;
	String gender;
	Date dob;
	String status;
	
	public String getUser_id() {
		return user_id;
	}
	public void setUser_id(String user_id) {
		this.user_id = user_id;
	}
	public String getFirst_name() {
		return first_name;
	}
	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}
	public String getMiddle_name() {
		return middle_name;
	}
	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}
	public String getLast_name() {
		return last_name;
	}
	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail_id() {
		return email_id;
	}
	public void setEmail_id(String email_id) {
		this.email_id = email_id;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public Blob getProfile_photo() {
		return profile_photo;
	}
	public void setProfile_photo(Blob profile_photo) {
		this.profile_photo = profile_photo;
	}
	public Date getUser_creation_date() {
		return user_creation_date;
	}
	public void setUser_creation_date(Date user_creation_date) {
		this.user_creation_date = user_creation_date;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
}
