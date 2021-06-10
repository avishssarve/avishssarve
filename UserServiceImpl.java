package com.casestudy.service;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Service;


@Service
public class UserServiceImpl implements UserService
{

	public User validate(User user) {
	if(user!=null)
	{
	if( user.getPassword().length() >= 5 )
	{
	System.out.println("in validate( ) of User service");
	user.setusername("Excellent");
	// go to doa
	}
	else
	{
	// raise exception
	System.out.println("in validate( ) of User service in else ");
	user.setUserName("No such user");
	}
	}
	return user;
	}

	public void saveUser(User user) {
		// TODO Auto-generated method stub
		
	}}