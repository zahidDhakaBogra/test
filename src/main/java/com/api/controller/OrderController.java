package com.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.entity.Order;
import com.api.entity.Payment;
import com.api.entity.TransactionRequest;
import com.api.entity.TransactionResponse;
import com.api.service.OrderService;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private OrderService service;
	
	@PostMapping("/orderpayment")
	public TransactionResponse orderpayment(@RequestBody TransactionRequest request) {
		
		
		
		return service.saveOrderPayment(request);
	}
	
	@PostMapping("/bookorder")
	public Order bookOrder(@RequestBody Order order) {
		
		
		return service.saveOrder(order);
	}
}
