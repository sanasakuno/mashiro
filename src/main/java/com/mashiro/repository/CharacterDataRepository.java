package com.mashiro.repository;

import java.io.Serializable;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.mashiro.domain.CharacterData;

public interface CharacterDataRepository extends JpaRepository<CharacterData, Serializable> {
	
	@Query(nativeQuery = true,
            value = "SELECT * FROM character_data WHERE character_id = ?1")
	CharacterData getCharacterData(int character_id);
}
