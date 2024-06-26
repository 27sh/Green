package com.green.junitExam.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.green.junitExam.dto.User;

@Mapper
public interface IUserDao {
	public User getUser(int uno);
	
	public List<User> getUserList();
	
	public int saveUser(User user);
	
	public int deleteUser(int uno);
}
