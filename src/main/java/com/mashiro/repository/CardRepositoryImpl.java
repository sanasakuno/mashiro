package com.mashiro.repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mashiro.domain.Card;

@Repository
public class CardRepositoryImpl implements CardRepository {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Card> findAll() {

		String sql = "select * from card order by cast(card_rank as SIGNED) desc, card_id";

		List<Map<String, Object>> cards = jdbcTemplate.queryForList(sql);

		// Userオブジェクト格納用のListを作成する。
		List<Card> cardList = new ArrayList<Card>();

		// 受け取ったMapのListをfor文で回し、各ユーザの値をUserオブジェクトに格納する。
		for (Map<String, Object> eachCard : cards) {
			Card card = new Card(
					(int) eachCard.get("card_rank"), (int) eachCard.get("card_id"),
					(String) eachCard.get("card_name"), (String) eachCard.get("before_evolution_image"),
					(String) eachCard.get("after_evolution_image"), (String) eachCard.get("type"),
					(String) eachCard.get("performance"), (String) eachCard.get("technique"),
					(String) eachCard.get("visual"), (String) eachCard.get("total_value"),
					(String) eachCard.get("skill_name"), (String) eachCard.get("skill_effect"));
			cardList.add(card);
		}

		return cardList;

	};

}