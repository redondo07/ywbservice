package com.ywb.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ywb.dao.GreetingDao;

@Service
public class GreetService {

	@Autowired
	GreetingDao _greetingDao;

	public String hello() {
		return _greetingDao.hello();
	}

	public void setGreetingDao(GreetingDao greetingDao) {
		_greetingDao = greetingDao;
	}

}
