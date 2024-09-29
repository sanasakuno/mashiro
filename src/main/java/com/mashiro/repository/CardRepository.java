package com.mashiro.repository;

import java.util.List;

import com.mashiro.domain.Card;

public interface CardRepository {

	List<Card> findAll();

	Card findCard(int cardRank, int cardId);

}
