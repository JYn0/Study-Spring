package com.product;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.frame.Dao;
@Repository("pod")
public class ProductOracleDao implements Dao<String, Product> {

	@Override
	public void insert(Product v) throws Exception {
		System.out.println(v+" Inserted...");
	}

	@Override
	public void update(Product v) throws Exception {
		System.out.println(v+" Updated...");
	}

	@Override
	public void delete(String k) throws Exception {
		System.out.println(k+" Deleted...");
	}

	@Override
	public Product select(String k) throws Exception {
		return new Product("pid01","pname01",0);
	}

	@Override
	public ArrayList<Product> select() throws Exception {
		ArrayList<Product> list = new ArrayList<>();
		list.add(new Product("pid01","pname01",0));
		list.add(new Product("pid01","pname01",0));
		list.add(new Product("pid01","pname01",0));
		list.add(new Product("pid01","pname01",0));
		return list;
	}

}
