package com.mashiro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.ModelAndView;

import com.mashiro.domain.CardRank;
import com.mashiro.domain.Character;
import com.mashiro.repository.CardRepository;
import com.mashiro.repository.CharacterDataRepository;

@Service
public class MashiroServiceImpl implements MashiroService{

	@Autowired
	private CharacterDataRepository characterDataRepository;

	@Autowired
	private CardRepository cardRepository;

	public ModelAndView mashiro() {

		// MAVの初期設定
		ModelAndView modelAndView = new ModelAndView("/mashiro/mashiro");

		// キャラクターデータ取得
		modelAndView.addObject("mashiro", characterDataRepository.getCharacterData(Character.MASHIRO.getCode()));

		// ランク4カードデータ取得
		modelAndView.addObject("rank4DataList", cardRepository.getCardList(Character.MASHIRO.getCode(), CardRank.FOUR.getCode()));

		// ランク3カードデータ取得
		modelAndView.addObject("rank3DataList", cardRepository.getCardList(Character.MASHIRO.getCode(), CardRank.THREE.getCode()));

		// ランク2カードデータ取得
		modelAndView.addObject("rank2DataList", cardRepository.getCardList(Character.MASHIRO.getCode(), CardRank.TWO.getCode()));

		// ランク1カードデータ取得
		modelAndView.addObject("rank1DataList", cardRepository.getCardList(Character.MASHIRO.getCode(), CardRank.ONE.getCode()));

		return modelAndView;

	}

}
