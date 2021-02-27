package com.topupsandbox.entities.request;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "restricted")
public class GPRestrictions {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String telco;
	private int max;
	private int min;
	private int block;
	public GPRestrictions() {
		super();
	}
	public GPRestrictions(int id, String telco, int max, int min, int block) {
		this.id = id;
		this.telco = telco;
		this.max = max;
		this.min = min;
		this.block = block;
	}
	public int getId() {
		return id;
	}
	public String getTelco() {
		return telco;
	}
	public int getMax() {
		return max;
	}
	public int getMin() {
		return min;
	}
	public int getBlock() {
		return block;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setTelco(String telco) {
		this.telco = telco;
	}
	public void setMax(int max) {
		this.max = max;
	}
	public void setMin(int min) {
		this.min = min;
	}
	public void setBlock(int block) {
		this.block = block;
	}
	@Override
	public String toString() {
		return "GPRestrictions [id=" + id + ", telco=" + telco + ", max=" + max + ", min=" + min + ", block=" + block
				+ "]";
	}

	
	
}
