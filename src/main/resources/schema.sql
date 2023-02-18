DROP TABLE IF EXISTS character_data;
DROP TABLE IF EXISTS card;

CREATE TABLE character_data(
character_id int,
sei varchar(12),
mei varchar(12)
);

CREATE TABLE card(
character_id int,
card_id int,
card_rank varchar(1),
card_name varchar(40),
before_evolution_image varchar(20),
after_evolution_image varchar(20),
type varchar(12),
performance varchar(5),
technique varchar(5),
visual varchar(5),
total_value varchar(6),
skill_name varchar(40),
skill_effect varchar(200)
);

