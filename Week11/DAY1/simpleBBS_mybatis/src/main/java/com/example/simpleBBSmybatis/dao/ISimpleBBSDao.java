package com.example.simpleBBSmybatis.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.simpleBBSmybatis.domain.SimpleBBSDto;

@Mapper
public interface ISimpleBBSDao {

	public List<SimpleBBSDto> listDao();
	public Object viewDao(String id);
	public int writeDao(String writer, String title, String content);
	public int deleteDao(String id);
}
