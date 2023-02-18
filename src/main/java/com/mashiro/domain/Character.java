package com.mashiro.domain;

public enum Character {

	MASHIRO(1);

	private int character;

	private Character(int character) {
		this.character = character;
	}

	public int getCode() {
		return character;
	}

}
