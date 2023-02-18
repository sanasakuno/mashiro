package com.mashiro.service;

import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

@Service
public class TopServiceImpl implements TopService {

	@Override
	public ModelAndView topPage() {

		ModelAndView modelAndView = new ModelAndView("top");

		return modelAndView;

	};

}
