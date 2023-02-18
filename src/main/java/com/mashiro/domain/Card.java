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

	// カードID
	@Id
	@Column(name = "card_id", nullable = true, length = 2)
	@Nonnull
	private String cardId;

	// キャラクターID
	@Column(name = "character_id", nullable = true, length = 2)
	@Nonnull
	private String characterId;

	// ランク
	@Column(name = "card_rank", nullable = true, length = 1)
	private String cardRank;

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
	private String performance;

	// テクニック
	@Column(name = "technique", nullable = true, length = 5)
	private String technique;

	// ビジュアル
	@Column(name = "visual", nullable = true, length = 5)
	private String visual;

	// 総合力
	@Column(name = "total_value", nullable = true, length = 6)
	private String totalValue;

	// スキル名
	@Column(name = "skill_name", nullable = true, length = 40)
	private String skillName;

	// スキル効果
	@Column(name = "skill_effect", nullable = true, length = 200)
	private String skillEffect;

	/**
	 * @return cardId
	 */
	public String getCardId() {
		return cardId;
	}

	/**
	 * @param cardId セット cardId
	 */
	public void setCardId(String cardId) {
		this.cardId = cardId;
	}

	/**
	 * @return characterId
	 */
	public String getCharacterId() {
		return characterId;
	}

	/**
	 * @param characterId セット characterId
	 */
	public void setCharacterId(String characterId) {
		this.characterId = characterId;
	}

	/**
	 * @return cardRank
	 */
	public String getCardFank() {
		return cardRank;
	}

	/**
	 * @param cardRank セット cardRank
	 */
	public void setCardFank(String cardRank) {
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
	public String getPerformance() {
		return performance;
	}

	/**
	 * @param performance セット performance
	 */
	public void setPerformance(String performance) {
		this.performance = performance;
	}

	/**
	 * @return technique
	 */
	public String getTechnique() {
		return technique;
	}

	/**
	 * @param technique セット technique
	 */
	public void setTechnique(String technique) {
		this.technique = technique;
	}

	/**
	 * @return visual
	 */
	public String getVisual() {
		return visual;
	}

	/**
	 * @param visual セット visual
	 */
	public void setVisual(String visual) {
		this.visual = visual;
	}

	/**
	 * @return totalValue
	 */
	public String getTotalValue() {
		return totalValue;
	}

	/**
	 * @param totalValue セット totalValue
	 */
	public void setTotalValue(String totalValue) {
		this.totalValue = totalValue;
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

}
