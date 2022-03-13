package com.api.entity;

public class TransactionRequest {

	private Order order;
	private Payment payment;
	
	
	public TransactionRequest() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TransactionRequest(Order order1, Payment payment1) {
		super();
		this.order = order1;
		this.payment = payment1;
	}
	public Order getOrder() {
		return order;
	}
	public void setOrder(Order order1) {
		this.order = order1;
	}
	public Payment getPayment() {
		return payment;
	}
	public void setPayment(Payment payment1) {
		this.payment = payment1;
	}
	
	
}
