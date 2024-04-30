package com.green.junitExam.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.green.junitExam.domain.User;

@Mapper
public interface IUserDao {
	public User getUsert(int uno);
	public List<User> getUserList();
	public int saveUser(User user);
	public int deleteUser(int uno);
}
