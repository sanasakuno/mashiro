package com.mashiro.repository;

import java.util.List;

import com.mashiro.domain.Card;

public interface CardRepository {

	List<Card> findAll();

}
