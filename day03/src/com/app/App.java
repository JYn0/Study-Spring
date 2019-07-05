package com.app;

import java.util.ArrayList;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.frame.Biz;
import com.frame.Search;
import com.vo.User;

public class App {

	public static void main(String[] args) {

		AbstractApplicationContext factory = new GenericXmlApplicationContext("myspring.xml");
		System.out.println("spring started");
		
		Search<String, User> biz = 
				(Search<String, User>) factory.getBean("ubiz");

		ArrayList<User> list = null;

		try {
			list = biz.search("±è");
			for (User u : list) {
				System.out.println(u);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		/*
		 * Biz<String, User> biz = (Biz<String, User>) factory.getBean("ubiz"); // User
		 * user = null;
		 * 
		 * // Biz<String, Product> biz = (Biz<String, Product>) factory.getBean("pbiz");
		 * // Product product = null; // try { // biz.register(new
		 * Product(5,"name05",5000,null,"imgname05")); //
		 * System.out.println("Inserted ..."); // } catch (Exception e) { // //
		 * e.printStackTrace(); // }
		 * 
		 * // ArrayList<Product> list = null; // try { // list = biz.get(); //
		 * for(Product p: list) { // System.out.println(p); // } // } catch (Exception
		 * e) { // e.printStackTrace(); // }
		 * 
		 * // try { // biz.register(new User("id07","pwd07","Ä¥¸»¼÷")); //
		 * System.out.println("Inserted ..."); // } catch (Exception e) { // //
		 * e.printStackTrace(); // }
		 * 
		 * ArrayList<User> list = null; try { list = biz.get(); for(User u: list) {
		 * System.out.println(u); } } catch (Exception e) { e.printStackTrace(); }
		 */
		
		factory.close();
	}

}
