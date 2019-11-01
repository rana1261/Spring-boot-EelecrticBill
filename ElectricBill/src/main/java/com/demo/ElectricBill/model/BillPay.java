package com.demo.ElectricBill.model;

public class BillPay {
	 String username;
	 String password;
	 String paytype;
	 String tranid;
	 String bill;

	    public BillPay() {
	    }

	    public BillPay(String username, String password, String paytype, String tranid, String bill) {
	        this.username = username;
	        this.password = password;
	        this.paytype = paytype;
	        this.tranid = tranid;
	        this.bill = bill;
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

	    public String getPaytype() {
	        return paytype;
	    }

	    public void setPaytype(String paytype) {
	        this.paytype = paytype;
	    }

	    public String getTranid() {
	        return tranid;
	    }

	    public void setTranid(String tranid) {
	        this.tranid = tranid;
	    }

	    public String getBill() {
	        return bill;
	    }

	    public void setBill(String bill) {
	        this.bill = bill;
	    }

	    @Override
	    public String toString() {
	        return "BillPay{" + "username=" + username + ", password=" + password + ", paytype=" + paytype + ", tranid=" + tranid + ", bill=" + bill + '}';
	    }
	 
	}

