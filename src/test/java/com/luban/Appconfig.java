package com.luban;

import com.luban.app.A;
import com.luban.app.OrderService;
import com.luban.app.UserService;
import org.springframework.context.annotation.*;



@ComponentScan(value = "com.luban.app")
//@ImportResource("classpath:spring.xml")
@Configuration
public class Appconfig {


	@Bean
	public OrderService orderService() {

		return  new OrderService();
	}
	@Bean
	public UserService userService() {

		return  new UserService();
	}

//	@Bean
//	public SqlSessionFactoryBean sqlSessionFactoryBean(DataSource dataSource){
//		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
//		sqlSessionFactoryBean.setDataSource(dataSource);
//		return sqlSessionFactoryBean;
//	}
//
//	@Bean
//	public DataSource dataSource(){
//		DriverManagerDataSource driverManagerDataSource = new DriverManagerDataSource();
//		driverManagerDataSource.setDriverClassName("com.mysql.jdbc.Driver");
//		driverManagerDataSource.setUrl("jdbc:mysql://47.94.158.155:3306/test");
//		driverManagerDataSource.setUsername("root");
//		driverManagerDataSource.setPassword("aq1sw2de");
//		return driverManagerDataSource;
//	}

//	@Bean
//	public TDao tDao(){
//		Class<?>[] interfaces = new Class[]{TDao.class};
//		TDao tDao = (TDao) Proxy.newProxyInstance(BatisUtil.class.getClassLoader(),interfaces,new LubanInvocationHandler());
//		return tDao;
//	}


}
