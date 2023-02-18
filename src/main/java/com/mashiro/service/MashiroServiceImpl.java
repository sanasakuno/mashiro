package com.mashiro.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.mashiro.domain.Card;
import com.mashiro.repository.CardRepository;

@Service
public class MashiroServiceImpl implements MashiroService {

	@Autowired
	private CardRepository cardRepository;

	@Override
	public ModelAndView mashiro() {

		// MAVの初期設定
		ModelAndView modelAndView = new ModelAndView("/mashiro/mashiro");

		// カードデータ取得
		List<Card> cardList = cardRepository.findAll();

		// 各ランクカードデータ取得
		List<Card> rank4DataList = new ArrayList<Card>();
		List<Card> rank3DataList = new ArrayList<Card>();
		List<Card> rank2DataList = new ArrayList<Card>();
		List<Card> rank1DataList = new ArrayList<Card>();
		for (Card card : cardList) {
			switch (card.getCardRank()) {
			case 4:
				rank4DataList.add(card);
				break;
			case 3:
				rank3DataList.add(card);
				break;
			case 2:
				rank2DataList.add(card);
				break;
			case 1:
				rank1DataList.add(card);
				break;
			}
		}

		// 画面側の変数に格納
		modelAndView.addObject("rank4DataList", rank4DataList);
		modelAndView.addObject("rank3DataList", rank3DataList);
		modelAndView.addObject("rank2DataList", rank2DataList);
		modelAndView.addObject("rank1DataList", rank1DataList);

		return modelAndView;

	}

	@Override
	public ModelAndView mashiroImages() {

		// MAVの初期設定
		ModelAndView modelAndView = new ModelAndView("/mashiro/mashiro_images");

		return modelAndView;
		
	}

}
