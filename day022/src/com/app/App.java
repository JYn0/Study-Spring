package com.app;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Biz;
import com.user.User;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext factory 
		= new GenericXmlApplicationContext("myspring.xml");
		
		System.out.println("Spring started");

		Biz<String, User> biz = (Biz<String, User>) factory.getBean("ubiz");
		
		User user = null;
		
		try {
			// user = biz.select("id01");
			user = biz.select("id00"); 
			System.out.println(user);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
//		User user = new User("id01","pwd01","�̸���");
//		try {
//			biz.insert(user);
//			System.out.println("Inserted Ok From app.");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
//		Biz<String, Product> pbiz = (Biz<String, Product>) factory.getBean("pbiz");
//		
//		Product product = new Product("pid01","pname01",0);
//		try {
//			pbiz.insert(product);
//			System.out.println("Product Inserted Ok From app.");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		
		factory.close();
	}

}
