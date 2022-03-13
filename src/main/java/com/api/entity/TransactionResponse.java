package com.api.entity;

public class TransactionResponse {

	private Order order;
	private double amount;
	private String transactionId;
	private String message;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public TransactionResponse(Order order, double amount, String transactionId) {
		super();
		this.order = order;
		this.amount = amount;
		this.transactionId = transactionId;
	}
	public TransactionResponse(Order order, double amount, String transactionId, String message) {
		super();
		this.order = order;
		this.amount = amount;
		this.transactionId = transactionId;
		this.message = message;
	}
	public double getAmount() {
		return amount;
	}
	public void setAmount(double amount) {
		this.amount = amount;
	}
	public String getTransactionId() {
		return transactionId;
	}
	public void setTransactionId(String transactionId) {
		this.transactionId = transactionId;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order) {
		this.order = order;
	}
	
	public TransactionResponse() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
