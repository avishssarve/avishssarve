package com.casestudy.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.tomcat.jni.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.annotation.PersistenceExceptionTranslationAdvisor;
import org.springframework.stereotype.Repository;


import com.mysql.jdbc.util.ResultSetUtil;

@Repository
public class UserDaoImpl  userDao {
	
	
private DataSource dataSource;
@Autowired
public User ValidateUserAndPassword(User user)
{
String str="";
try
{
	Connection connection=dataSource.getConnection();
	String fetch="Select *from user where user_id=? and password=?";
	PreparedStatement ps=connection.prepareStatement(fetch);
	ps.setInt(1,user.getUserid() );
	ps.setString(2,  user.getpassword());
	ResultSet rs=PreparedStatement.executeQuery();
	
	while(rs.next())
	{
		System.out.println("db data of "+rs.getInt("user_id"));
		System.out.println("db data of "+rs.getInt("username"));
		str=rs.getString("username");
				System.out.println("db data of "+rs.getInt("password"));
	}
	catch (SQLException e)
	{
		
	System.err.print(e.getMessage());	
	}
	user.setUsername(str);
	return user;
}
				
}		}		
				
				
				

