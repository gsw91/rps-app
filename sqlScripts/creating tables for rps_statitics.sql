create table RPS_SCORES
(
GAME_ID serial primary key auto_increment,
PLAYER_NAME char(30),
GAME_LEVEL char(30),
RESULT char(30),
ROUNDS_WINNING INT,
ROUNDS_LOSING INT
)
; 

create table RPS_TWO_SCORES
(
GAME_ID serial primary key auto_increment,
PLAYER_NAME char(30),
GAME_LEVEL char(30),
RESULT char(30),
ROUNDS_WINNING INT,
ROUNDS_LOSING INT
)
; 