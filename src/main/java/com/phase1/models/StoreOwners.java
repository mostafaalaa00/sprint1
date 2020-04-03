package com.phase1.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StoreOwners extends User {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	protected String username;
    protected String password;
    protected String email;



    public String getusername() {
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

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
	public StoreOwners(String username, String password, String email) {

    	this.username=username;
    	this.password=password;
    	this.email=email;
    }
    public StoreOwners() {

    }

	void AddProduct() {};

	@Override
	void login(String email, String password) {};

	void AddStore() {};



}
