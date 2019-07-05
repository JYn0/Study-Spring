package com.app;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Biz;
import com.vo.User;

public class App {

	public static void main(String[] args) {

		AbstractApplicationContext factory = 
				new GenericXmlApplicationContext("myspring.xml");
				System.out.println("spring started");
				
		Biz<String, User> biz = (Biz<String, User>) factory.getBean("ubiz");

		ArrayList<User> list = null;

		try {
			list = biz.get();
			for (User u : list) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

//		User user = null;
//		try {
//			biz.register(new User("id55", "pwd55", "¿”¡ˆ»∆"));
//			System.out.println("Inserted ...");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
		factory.close();
	}

}
