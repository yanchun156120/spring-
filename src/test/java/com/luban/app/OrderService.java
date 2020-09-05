package com.luban.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class OrderService {

	@Autowired
	UserService userService;

	public void A( ) {
		System.out.println("orderService");
	}
}
