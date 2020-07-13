package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.service.IUserService;

@Controller
@RequestMapping("/Test")
public class Test {
	@Autowired
	private IUserService userservice;

	@RequestMapping("/index")
	public String index(ModelMap map) {
		map.addAttribute("name", "谷占方");
		return "test";
	}

	@ResponseBody
	@RequestMapping("/query")
	public Object query() {
		return userservice.query();
	}
}
