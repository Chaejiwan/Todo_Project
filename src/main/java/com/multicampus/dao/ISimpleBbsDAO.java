package com.multicampus.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.multicampus.dto.SimpleBbsDTO;

@Mapper
public interface ISimpleBbsDAO {
	public List<SimpleBbsDTO> listDao();
	public SimpleBbsDTO viewDao(String id);
	public int writeDao(Map<String, String> map);
	public int deleteDao(@Param("_id")String id);
	public int articleCount(); // 글의 개수를 세는 메소드
}
