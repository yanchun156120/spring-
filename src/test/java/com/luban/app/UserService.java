package com.luban.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


public class UserService {

	@Autowired
	OrderService orderService;
	public void B( ) {
		System.out.println("UserService");
	}
}
