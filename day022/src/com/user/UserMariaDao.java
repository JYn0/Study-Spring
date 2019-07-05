package com.user;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.frame.Dao;
@Repository("umd")
public class UserMariaDao implements Dao<String, User> {

	@Override
	public void insert(User v) throws Exception {
		System.out.println(v+" UserMariaDao Inserted...");
	}

	@Override
	public void update(User v) throws Exception {
		System.out.println(v+" UserMariaDao Updated...");
	}

	@Override
	public void delete(String k) throws Exception {
		System.out.println(k+" UserMariaDao Deleted...");
	}

	@Override
	public User select(String k) throws Exception {
		return new User("id01","pwd01","°­¸»¼÷");
	}

	@Override
	public ArrayList<User> select() throws Exception {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("id01","pwd01","°­¸»¼÷"));
		list.add(new User("id02","pwd02","±è¸»¼÷"));
		list.add(new User("id03","pwd03","ÀÌ¸»¼÷"));
		list.add(new User("id04","pwd04","¹Ú¸»¼÷"));
		return list;
	}

}
