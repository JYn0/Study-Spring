package com.sds;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class App {

	public static void main(String[] args) {
		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspringg.xml");
		System.out.println("Spring started");
		
		TV tv = (TV)factory.getBean("stv");
		tv.up();
		System.out.println(tv);
		
		TV tv2 = (TV)factory.getBean("ltv");
		tv2.turnOn();
		System.out.println(tv2);
		
//		TV tv = (TV)factory.getBean("ltv");
//		tv.up();
//		
//		TV tv2 = (TV)factory.getBean("ltv");
//		tv2.turnOn();
//		if(tv == tv2) {
//			System.out.println("ok");
//			// °´Ã¼ref°°À½
//		}
		
	}

}
