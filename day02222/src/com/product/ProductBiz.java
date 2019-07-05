package com.product;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.springframework.stereotype.Component;

import com.frame.Dao;
import com.frame.Biz;
import com.vo.Product;

@Component("pbiz")
public class ProductBiz implements Biz<String, Product> {
	@Resource(name="pod")
	Dao<String, Product> dao;
	
	public void startBiz() {
		System.out.println("Start Biz ...");
	}

	public void endBiz() {
		System.out.println("End Biz ...");
	}
	
	public void setDao(Dao<String, Product> dao) {
		this.dao = dao;
	}

	@Override
	public void insert(Product v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void update(Product v) throws Exception {
		dao.update(v);
	}

	@Override
	public void delete(String k) throws Exception {
		dao.delete(k);
	}

	@Override
	public Product select(String k) throws Exception {
		return dao.select(k);
	}

	@Override
	public ArrayList<Product> select() throws Exception {
		return dao.select();
	}

}
