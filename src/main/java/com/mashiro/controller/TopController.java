package com.mashiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mashiro.service.TopService;

@Controller
public class TopController {

	@Autowired
    private TopService topService;

	@GetMapping("/")
	public ModelAndView top() {

		return topService.topPage();

	}
}
