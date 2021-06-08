package com.example.service.impl;

import org.springframework.stereotype.Service;

import com.example.service.HomeService;

@Service
//bean nay se chua trong spring container voi ten bean la homeServiceImpl
public class HomeServiceImpl implements HomeService{
	
	@Override
	public String tenBatThuong() {
		return "mynho";
	}

	@Override
	public boolean login(String userName) {
		if(userName.equals("mynho")) {
			return true;
		}
		
		return false;
	}

}
