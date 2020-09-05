package com;

import com.luban.Appconfig;
import com.luban.app.A;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {

		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Appconfig.class);
		DefaultListableBeanFactory beanFactory = (DefaultListableBeanFactory) ac.getBeanFactory();


	}
}
