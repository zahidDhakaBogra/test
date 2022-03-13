package com.api.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table( name="ORDER_TB")
public class Order {

	@Id
	private int ID;
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int iD, String nAME, int qTY, double pRICE) {
		super();
		ID = iD;
		NAME = nAME;
		QTY = qTY;
		PRICE = pRICE;
	}
	public String getNAME() {
		return NAME;
	}
	public void setNAME(String nAME) {
		NAME = nAME;
	}
	public int getQTY() {
		return QTY;
	}
	public void setQTY(int qTY) {
		QTY = qTY;
	}
	public double getPRICE() {
		return PRICE;
	}
	public void setPRICE(double pRICE) {
		PRICE = pRICE;
	}
	private String NAME;
	private int QTY;
	private double PRICE;
}
