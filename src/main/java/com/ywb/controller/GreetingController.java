package com.ywb.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ywb.service.GreetService;

@RestController
public class GreetingController {

	@Autowired
	GreetService _greetService;
	
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) {
        return _greetService.hello();
    	//return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }

	public void set_greetService(GreetService _greetService) {
		this._greetService = _greetService;
	}
    
    
}