package com.pankaj.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pankaj.model.Career;
import com.pankaj.service.TestCareerService;

@RestController
public class TestCareerController {
	
	@Autowired
	TestCareerService testCareerService;
	
	@RequestMapping(value="/{id}")
	public Career getTestCareerById(@PathVariable("id") int id) {
		return testCareerService.getTestCareer(id);
	}

}
