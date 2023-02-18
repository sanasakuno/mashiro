package com.mashiro.domain;

public enum CardRank {

	FOUR(4),
	THREE(3),
	TWO(2),
	ONE(1);

    private int rank;

	private CardRank(int rank) {
		this.rank = rank;
	}

	public int getCode() {
		return rank;
	}
   
}
