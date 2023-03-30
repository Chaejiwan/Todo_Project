package com.multicampus.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multicampus.dao.ISimpleBbsDAO;
import com.multicampus.dto.SimpleBbsDTO;

@Service
public class SimpleBbsService implements ISimpleBbsService {

	@Autowired
	ISimpleBbsDAO dao;
	
	@Override
	public List<SimpleBbsDTO> list() {
		// TODO Auto-generated method stub
		return dao.listDao();
	}

	@Override
	public SimpleBbsDTO view(String id) {
		// TODO Auto-generated method stub
		return dao.viewDao(id);
	}

	@Override
	public int write(Map<String, String> map) {
		
		int nResult = dao.writeDao(map);
		
		return nResult;
	}
				
	@Override
	public int delete(String id) {
		int nResult = dao.deleteDao(id);
		return nResult;
	}

	@Override
	public int count() {
		int nTotalCount = dao.articleCount();
		return nTotalCount;
	}

}
