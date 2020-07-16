package com.whatsOpen.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.whatsOpen.dao.Test1DAO;
import com.whatsOpen.model.Test1;

@Controller
public class TestController {

	@Autowired
	private Test1DAO tdao;
	
	@GetMapping("/demo")
	public @ResponseBody Test1 demo() {
		return tdao.save(new Test1());
	}
	
	
}
