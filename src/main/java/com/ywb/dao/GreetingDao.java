package com.ywb.dao;

import org.springframework.stereotype.Repository;

@Repository
public class GreetingDao {
	public String hello(){
		return "hello world";
	}
}
