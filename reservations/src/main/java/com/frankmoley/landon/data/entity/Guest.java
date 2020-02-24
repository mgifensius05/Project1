package com.frankmoley.landon.data.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="GUEST")
public class Guest {
    @Id
    @Column(name="GUEST_ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @Column(name="FIRST_NAME")
    private String fname;
    @Column(name="LAST_NAME")
    private String lname;
    @Column(name="EMAIL_ADDRESS")
    private String email;
    @Column (name="ADDRESS")
    private String address;
    @Column (name="COUNTRY")
    private String country;
    @Column (name="STATE")
    private String state;
    @Column (name="PHONE_NUMBER")
    private String phonenumber;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getfName() {
        return fname;
    }    

    public void setfName(String fname) {
        this.fname = fname;
    }
    
    public String getlName() {
        return lname;
    }    

    public void setlName(String lname) {
        this.lname = lname;
    }
    
    public String getEmail() {
    	return email;
    }
    
    public void setEmail(String email) {
    	this.email = email;
    }
    
    public String getAddress() {
    	return address;
    }
    
    public void setAddress(String address) {
    	this.address = address;
    }
    
    public String getCountry() {
    	return country;
    }
    
    public void setCountry(String country) {
    	this.country = country;
    }
    
    public String getState() {
    	return state;
    }
    
    public void setState(String state) {
    	this.state = state;
    }
    
    public String getNumber() {
        return phonenumber;
    }

    public void setNumber(String number) {
        this.phonenumber = number;
    }

}
