package com.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.api.entity.Order;
import com.api.entity.Payment;
import com.api.entity.TransactionRequest;
import com.api.entity.TransactionResponse;
import com.api.repository.OrderRepository;

@Service
@RefreshScope
public class OrderService {

	@Autowired
	private OrderRepository repository;

	@Autowired
	@Lazy
	private RestTemplate template;
	
	@Value("${microservice.payment-service.endpoints.endpoint.uri}")
	private String ENDPOINT_URI;
	
	public TransactionResponse saveOrderPayment(TransactionRequest request) {
		String msg="";
		
		Order order = request.getOrder();
		
		Payment payment =request.getPayment();
				
		payment.setORDERID(order.getID());
		payment.setAMOUNT(order.getPRICE());
		
		
		Payment paymentResponse = template.postForObject(ENDPOINT_URI, payment, Payment.class);
		msg =paymentResponse.getPAYMENTSTATUS().equals("Success")?"Successful":"Failed";
		
		
		
		repository.save(order);
		return new TransactionResponse( order,paymentResponse.getAMOUNT(),paymentResponse.getTRANSACTIONID(),msg);
	}
	public Order saveOrder(Order order) {
		
		System.out.println("order.getID():" + order.getID());
		
		return repository.save(order);
	}
	
	
}
