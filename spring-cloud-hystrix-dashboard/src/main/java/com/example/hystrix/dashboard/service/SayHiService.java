package com.example.hystrix.dashboard.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.hystrix.dashboard.client.SayHiClient;

@Service
public class SayHiService {
	@Autowired
	SayHiClient sayHiClient;
	
	public String sayHi(String name) {
		return sayHiClient.sayHi(name);
	}

}
