package com.mashiro.repository;

import java.io.Serializable;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mashiro.domain.Card;

public interface CardRepository extends JpaRepository<Card, Serializable> {
	
	@Query(nativeQuery = true,
            value = "SELECT * FROM card WHERE character_id = ?1 AND card_rank = ?2 ORDER BY CARD_ID")
	List<Card> getCardList(int character_id, int cardRank);
}
