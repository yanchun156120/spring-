package com.luban.test;

import com.luban.app.Appconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.reflect.Proxy;


public class Test {

	public static void main(String[] args)  {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);

	}


}
