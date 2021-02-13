package com.topupsandbox.entities.request;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "gprequest")
public class GPRequest {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String type;
	private Date date;
	private String extnwcode;
	private int msisdn;
	private String pin;
	private String loginid;
	private String password;
	private String extcode;
	private String extrefnum;
	private int msisdn2;
	private double amount;
	private String language1;
	private String language2;
	private String selector;
	private String externaldata2;
	private String externaldata3;
	private String externaldata4;
	
	public GPRequest() {
		super();
	}

	public GPRequest(int id, String type, Date date, String extnwcode, int msisdn, String pin, String loginid,
			String password, String extcode, String extrefnum, int msisdn2, double amount, String language1,
			String language2, String selector, String externaldata2, String externaldata3, String externaldata4) {
		super();
		this.id = id;
		this.type = type;
		this.date = date;
		this.extnwcode = extnwcode;
		this.msisdn = msisdn;
		this.pin = pin;
		this.loginid = loginid;
		this.password = password;
		this.extcode = extcode;
		this.extrefnum = extrefnum;
		this.msisdn2 = msisdn2;
		this.amount = amount;
		this.language1 = language1;
		this.language2 = language2;
		this.selector = selector;
		this.externaldata2 = externaldata2;
		this.externaldata3 = externaldata3;
		this.externaldata4 = externaldata4;
	}

	public int getId() {
		return id;
	}

	public String getType() {
		return type;
	}

	public Date getDate() {
		return date;
	}

	public String getExtnwcode() {
		return extnwcode;
	}

	public int getMsisdn() {
		return msisdn;
	}

	public String getPin() {
		return pin;
	}

	public String getLoginid() {
		return loginid;
	}

	public String getPassword() {
		return password;
	}

	public String getExtcode() {
		return extcode;
	}

	public String getExtrefnum() {
		return extrefnum;
	}

	public int getMsisdn2() {
		return msisdn2;
	}

	public double getAmount() {
		return amount;
	}

	public String getLanguage1() {
		return language1;
	}

	public String getLanguage2() {
		return language2;
	}

	public String getSelector() {
		return selector;
	}

	public String getExternaldata2() {
		return externaldata2;
	}

	public String getExternaldata3() {
		return externaldata3;
	}

	public String getExternaldata4() {
		return externaldata4;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setType(String type) {
		this.type = type;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public void setExtnwcode(String extnwcode) {
		this.extnwcode = extnwcode;
	}

	public void setMsisdn(int msisdn) {
		this.msisdn = msisdn;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public void setLoginid(String loginid) {
		this.loginid = loginid;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setExtcode(String extcode) {
		this.extcode = extcode;
	}

	public void setExtrefnum(String extrefnum) {
		this.extrefnum = extrefnum;
	}

	public void setMsisdn2(int msisdn2) {
		this.msisdn2 = msisdn2;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setLanguage1(String language1) {
		this.language1 = language1;
	}

	public void setLanguage2(String language2) {
		this.language2 = language2;
	}

	public void setSelector(String selector) {
		this.selector = selector;
	}

	public void setExternaldata2(String externaldata2) {
		this.externaldata2 = externaldata2;
	}

	public void setExternaldata3(String externaldata3) {
		this.externaldata3 = externaldata3;
	}

	public void setExternaldata4(String externaldata4) {
		this.externaldata4 = externaldata4;
	}

	@Override
	public String toString() {
		return "GPRequest [id=" + id + ", type=" + type + ", date=" + date + ", extnwcode=" + extnwcode + ", msisdn="
				+ msisdn + ", pin=" + pin + ", loginid=" + loginid + ", password=" + password + ", extcode=" + extcode
				+ ", extrefnum=" + extrefnum + ", msisdn2=" + msisdn2 + ", amount=" + amount + ", language1="
				+ language1 + ", language2=" + language2 + ", selector=" + selector + ", externaldata2=" + externaldata2
				+ ", externaldata3=" + externaldata3 + ", externaldata4=" + externaldata4 + "]";
	}
	
	
	
}
