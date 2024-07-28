package com.mashiro.domain;

import java.io.Serializable;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "card")
public class Card implements Serializable {

	// ランク
	@Column(name = "card_rank", nullable = true, length = 1)
	@Nonnull
	private int cardRank;

	// カードID
	@Id
	@Column(name = "card_id", nullable = true, length = 2)
	@Nonnull
	private int cardId;

	// カード名
	@Column(name = "card_name", nullable = true, length = 40)
	private String cardName;

	// 画像（進化前）
	@Column(name = "before_evolution_image", nullable = true, length = 20)
	private String beforeEvolutionImage;

	// 画像（進化後）
	@Column(name = "after_evolution_image", nullable = true, length = 20)
	private String afterEvolutionImage;

	// タイプ
	@Column(name = "type", nullable = true, length = 12)
	private String type;

	// パフォーマンス
	@Column(name = "performance", nullable = true, length = 5)
	private int performance;

	// テクニック
	@Column(name = "technique", nullable = true, length = 5)
	private int technique;

	// ビジュアル
	@Column(name = "visual", nullable = true, length = 5)
	private int visual;

	// スキル名
	@Column(name = "skill_name", nullable = true, length = 40)
	private String skillName;

	// スキル効果
	@Column(name = "skill_effect", nullable = true, length = 200)
	private String skillEffect;

	// ステータス合計値
	private int totalValue;

	/**
	 * @return cardRank
	 */
	public int getCardRank() {
		return cardRank;
	}

	/**
	 * @param cardRank セット cardRank
	 */
	public void setCardRank(int cardRank) {
		this.cardRank = cardRank;
	}

	/**
	 * @return cardName
	 */
	public String getCardName() {
		return cardName;
	}

	/**
	 * @param cardName セット cardName
	 */
	public void setCardName(String cardName) {
		this.cardName = cardName;
	}

	/**
	 * @return beforeEvolutionImage
	 */
	public String getBeforeEvolutionImage() {
		return beforeEvolutionImage;
	}

	/**
	 * @param beforeEvolutionImage セット beforeEvolutionImage
	 */
	public void setBeforeEvolutionImage(String beforeEvolutionImage) {
		this.beforeEvolutionImage = beforeEvolutionImage;
	}

	/**
	 * @return afterEvolutionImage
	 */
	public String getAfterEvolutionImage() {
		return afterEvolutionImage;
	}

	/**
	 * @param afterEvolutionImage セット afterEvolutionImage
	 */
	public void setAfterEvolutionImage(String afterEvolutionImage) {
		this.afterEvolutionImage = afterEvolutionImage;
	}

	/**
	 * @return type
	 */
	public String getType() {
		return type;
	}

	/**
	 * @param type セット type
	 */
	public void setType(String type) {
		this.type = type;
	}

	/**
	 * @return performance
	 */
	public int getPerformance() {
		return performance;
	}

	/**
	 * @param performance セット performance
	 */
	public void setPerformance(int performance) {
		this.performance = performance;
	}

	/**
	 * @return technique
	 */
	public int getTechnique() {
		return technique;
	}

	/**
	 * @param technique セット technique
	 */
	public void setTechnique(int technique) {
		this.technique = technique;
	}

	/**
	 * @return visual
	 */
	public int getVisual() {
		return visual;
	}

	/**
	 * @param visual セット visual
	 */
	public void setVisual(int visual) {
		this.visual = visual;
	}

	/**
	 * @return skillName
	 */
	public String getSkillName() {
		return skillName;
	}

	/**
	 * @param skillName セット skillName
	 */
	public void setSkillName(String skillName) {
		this.skillName = skillName;
	}

	/**
	 * @return skillEffect
	 */
	public String getSkillEffect() {
		return skillEffect;
	}

	/**
	 * @param skillEffect セット skillEffect
	 */
	public void setSkillEffect(String skillEffect) {
		this.skillEffect = skillEffect;
	}

	/**
	 * @param totalValue セット totalValue
	 */
	public int getTotalValue() {
		return totalValue;
	}

	/**
	 * @return totalValue
	 */
	public void setTotalValue(int totalValue) {
		this.totalValue = totalValue;
	}

	public Card(int cardRank, int cardId, String cardName, String beforeEvolutionImage, String afterEvolutionImage,
			String type, int performance, int technique, int visual, String skillName,
			String skillEffect) {
		this.cardRank = cardRank;
		this.cardId = cardId;
		this.cardName = cardName;
		this.beforeEvolutionImage = beforeEvolutionImage;
		this.afterEvolutionImage = afterEvolutionImage;
		this.type = type;
		this.performance = performance;
		this.technique = technique;
		this.visual = visual;
		this.skillName = skillName;
		this.skillEffect = skillEffect;
		this.totalValue = performance + technique + visual;
	}

}
