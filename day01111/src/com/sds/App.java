package com.sds;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {
	public static void main(String[] args) {
		AbstractApplicationContext factory 
			= new GenericXmlApplicationContext("myspring.xml");
		System.out.println("Spring started");
		
		Biz biz = (Biz)factory.getBean("user1");
		biz.register();
		System.out.println(biz);
		
		Dao dao = (Dao)factory.getBean("user2");
		dao.insert();
		System.out.println(dao);
		
		factory.close();
	}
}
