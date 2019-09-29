package com.abir.demo;

import java.util.ArrayList;
import java.util.List;

public class ZeroUserRepository {
	
	List<ZeroUser> user;
	
	public ZeroUserRepository() {
		user=new ArrayList<>();
		
		ZeroUser u1 =new ZeroUser();
		u1.setId(1);
		u1.setName("Abir Hosen Ashik");
		u1.setUsercat(1);
		u1.setEmail("abir040995.hosen@gmail.com");
		
		user.add(u1);
		
		ZeroUser u2 =new ZeroUser();
		u2.setId(2);
		u2.setName("AShraful Islam");
		u2.setUsercat(1);
		u2.setEmail("ashraf.29@gmail.com");
		
		user.add(u2);
		
	}
	
	public List<ZeroUser> getUser(){
		return user;
	}
	public ZeroUser getUser(int id){
		for(ZeroUser u: user) {
			if(u.getId()==id) {
				return u;
			}
		}
		return null;
	}

	public void create(ZeroUser u1) {
		user.add(u1);
	}

}
