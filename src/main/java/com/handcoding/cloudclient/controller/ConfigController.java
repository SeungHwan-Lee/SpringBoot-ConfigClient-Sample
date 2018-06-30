package com.handcoding.cloudclient.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.handcoding.cloudclient.component.Config;

@RestController
public class ConfigController {

	@Autowired
	private Config config;
	
	@GetMapping("/")
	public String test() {
		return config.getHellow();
	}
	
}
