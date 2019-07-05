package com.user;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.frame.Search;
import com.mapper.SearchMapper;
import com.mapper.UserMapper;
import com.vo.User;


@Repository("udao")
public class UserDao implements Dao<String, User>,
Search<String,User>{

	@Autowired
	UserMapper um;
	
	@Autowired
	SearchMapper<String,User> sm;
	
	@Override
	public void insert(User v) throws Exception {
		um.insert(v);
	}

	@Override
	public void update(User v) throws Exception {
		um.update(v);
		
	}

	@Override
	public void delete(String k) throws Exception {
		um.delete(k);
		
	}

	@Override
	public User select(String k) throws Exception {
		return um.select(k);
	}

	@Override
	public ArrayList<User> select() throws Exception {
		return um.selectall();
	}

	@Override
	public ArrayList<User> search(String k) {
		return sm.search(k);
	}

}

