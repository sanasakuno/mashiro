package com.mashiro.domain;

import java.io.Serializable;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "character_data")
public class CharacterData implements Serializable {

	// ID
	@Id
	@Column(name = "character_id", nullable = true, length = 2)
	@Nonnull
	private String characterId;

	// 姓
	@Column(name = "sei", nullable = true, length = 12)
	@Nonnull
	private String sei;

	// 名
	@Column(name = "mei", nullable = true, length = 12)
	@Nonnull
	private String mei;

	/**
	 * @return id
	 */
	public String getCharacterId() {
		return characterId;
	}

	/**
	 * @param id セット id
	 */
	public void setId(String id) {
		this.characterId = id;
	}

	/**
	 * @return sei
	 */
	public String getSei() {
		return sei;
	}

	/**
	 * @param sei セット sei
	 */
	public void setSei(String sei) {
		this.sei = sei;
	}

	/**
	 * @return mei
	 */
	public String getMei() {
		return mei;
	}

	/**
	 * @param mei セット mei
	 */
	public void setMei(String mei) {
		this.mei = mei;
	}

}
