package com.user;

import java.util.ArrayList;

import org.springframework.stereotype.Repository;

import com.frame.Dao;
import com.vo.User;
@Repository("uod")
public class UserDao implements Dao<String, User> {

	@Override
	public void insert(User v) throws Exception {
		System.out.println(v+" Inserted...");
	}

	@Override
	public void update(User v) throws Exception {
		System.out.println(v+" Updated...");
	}

	@Override
	public void delete(String k) throws Exception {
		System.out.println(k+" Deleted...");
	}

	@Override
	public User select(String k) throws Exception {
		return new User("id01","pwd01","������");
	}

	@Override
	public ArrayList<User> select() throws Exception {
		ArrayList<User> list = new ArrayList<>();
		list.add(new User("id01","pwd01","������"));
		list.add(new User("id02","pwd02","�踻��"));
		list.add(new User("id03","pwd03","�̸���"));
		list.add(new User("id04","pwd04","�ڸ���"));
		return list;
	}

}
