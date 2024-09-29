package com.mashiro.service;

import org.springframework.web.servlet.ModelAndView;

public interface MashiroService {

	ModelAndView mashiro();

	ModelAndView mashiroImages();

	ModelAndView mashiroDetail(int rank, int cardId);

}
