package com.user;

import java.util.ArrayList;

import com.frame.Biz;
import com.frame.Dao;

public class UserBiz implements Biz<String, User> {
	
	Dao<String, User> dao;
	
	public void startBiz() {
		System.out.println("Start Biz ...");
	}

	public void endBiz() {
		System.out.println("End Biz ...");
	}
	
	public void setDao(Dao<String, User> dao) {
		this.dao = dao;
	}

	@Override
	public void insert(User v) throws Exception {
		dao.insert(v);
	}

	@Override
	public void update(User v) throws Exception {
		dao.update(v);
	}

	@Override
	public void delete(String k) throws Exception {
		dao.delete(k);
	}

	@Override
	public User select(String k) throws Exception {
		return dao.select(k);
	}

	@Override
	public ArrayList<User> select() throws Exception {
		return dao.select();
	}

}
