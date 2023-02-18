DROP TABLE IF EXISTS card;

CREATE TABLE card(
card_rank int,
card_id int,
card_name varchar(40),
before_evolution_image varchar(20),
after_evolution_image varchar(20),
type varchar(12),
performance varchar(5),
technique varchar(5),
visual varchar(5),
total_value varchar(6),
skill_name varchar(40),
skill_effect varchar(200),
PRIMARY KEY(card_id,card_rank)
);

