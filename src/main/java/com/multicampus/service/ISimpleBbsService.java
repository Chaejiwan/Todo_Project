package com.multicampus.service;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Param;

import com.multicampus.dto.SimpleBbsDTO;

public interface ISimpleBbsService {
	public List<SimpleBbsDTO> list();
	public SimpleBbsDTO view(String id);
	public int write(Map<String, String> map);
	public int delete(@Param("_id")String id);
	public int count();
} 
