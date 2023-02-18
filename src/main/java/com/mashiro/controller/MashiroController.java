package com.mashiro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.mashiro.service.MashiroService;

@Controller
public class MashiroController {

	@Autowired
    private MashiroService mashiroService;

	@GetMapping("/mashiro/")
	public ModelAndView mashiro() {

		return mashiroService.mashiro();

	}

}
