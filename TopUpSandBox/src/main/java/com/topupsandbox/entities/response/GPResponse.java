package com.topupsandbox.entities.response;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gpresponse")
public class GPResponse {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String type;
	private int txnstatus;
	private Date date;
	private String extrefnum;
	private double amount;
	private Date txndate;
	private String servicetype;
	private String txnid;
	private String message;
	
	public GPResponse() {
		super();
	}
	
	public GPResponse(int id, String type, int txnstatus, Date date, String extrefnum, double amount, Date txndate,
			String servicetype, String txnid, String message) {
		super();
		this.id = id;
		this.type = type;
		this.txnstatus = txnstatus;
		this.date = date;
		this.extrefnum = extrefnum;
		this.amount = amount;
		this.txndate = txndate;
		this.servicetype = servicetype;
		this.txnid = txnid;
		this.message = message;
	}
	public int getId() {
		return id;
	}
	public String getType() {
		return type;
	}
	public int getTxnstatus() {
		return txnstatus;
	}
	public Date getDate() {
		return date;
	}
	public String getExtrefnum() {
		return extrefnum;
	}
	public double getAmount() {
		return amount;
	}
	public Date getTxndate() {
		return txndate;
	}
	public String getServicetype() {
		return servicetype;
	}
	public String getTxnid() {
		return txnid;
	}
	public String getMessage() {
		return message;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setType(String type) {
		this.type = type;
	}
	public void setTxnstatus(int txnstatus) {
		this.txnstatus = txnstatus;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public void setExtrefnum(String extrefnum) {
		this.extrefnum = extrefnum;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public void setTxndate(Date txndate) {
		this.txndate = txndate;
	}
	public void setServicetype(String servicetype) {
		this.servicetype = servicetype;
	}
	public void setTxnid(String txnid) {
		this.txnid = txnid;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	
}
