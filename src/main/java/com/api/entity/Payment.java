package com.api.entity;

public class Payment {

	
	private int PAYMENTID;
	private String PAYMENTSTATUS;
	private String TRANSACTIONID;
	private int ORDERID;
	private double AMOUNT;
	public int getPAYMENTID() {
		return PAYMENTID;
	}
	public void setPAYMENTID(int pAYMENTID) {
		PAYMENTID = pAYMENTID;
	}
	public String getPAYMENTSTATUS() {
		return PAYMENTSTATUS;
	}
	public void setPAYMENTSTATUS(String pAYMENTSTATUS) {
		PAYMENTSTATUS = pAYMENTSTATUS;
	}
	public String getTRANSACTIONID() {
		return TRANSACTIONID;
	}
	public void setTRANSACTIONID(String tRANSACTIONID) {
		TRANSACTIONID = tRANSACTIONID;
	}
	public int getORDERID() {
		return ORDERID;
	}
	public void setORDERID(int oRDERID) {
		ORDERID = oRDERID;
	}
	public double getAMOUNT() {
		return AMOUNT;
	}
	public void setAMOUNT(double aMOUNT) {
		AMOUNT = aMOUNT;
	}
	public Payment(int pAYMENTID, String pAYMENTSTATUS, String tRANSACTIONID, int oRDERID, double aMOUNT) {
		super();
		PAYMENTID = pAYMENTID;
		PAYMENTSTATUS = pAYMENTSTATUS;
		TRANSACTIONID = tRANSACTIONID;
		ORDERID = oRDERID;
		AMOUNT = aMOUNT;
	}
	public Payment() {
		super();
		
	}
	
	
}
