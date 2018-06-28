#CREATING FUNCTIONS FOR RPS STANDARD

drop function if exists RpsNewbieStat;
delimiter $$
create function RpsNewbieStat() returns double (5,2)
begin
	declare countGames int;
    declare winGames int;
    declare perWinGames double;
    select count(*) from rps_scores where GAME_LEVEL ='newbie' into countGames;
	select count(*) from rps_scores where game_level = 'newbie' and result = 'win' into winGames;
	set perWinGames = winGames / countGames * 100;
	return perWinGames;
end $$
delimiter ;


drop function if exists RpsEasyStat;
delimiter $$
create function RpsEasyStat() returns double (5,2)
begin
	declare countGames int;
    declare winGames int;
    declare perWinGames double;
    select count(*) from rps_scores where GAME_LEVEL ='easy' into countGames;
	select count(*) from rps_scores where game_level = 'easy' and result = 'win' into winGames;
	set perWinGames = winGames / countGames * 100;
	return perWinGames;
end $$
delimiter ;


drop function if exists RpsMediumStat;
delimiter $$
create function RpsMediumStat() returns double (5,2)
begin
	declare countGames int;
    declare winGames int;
    declare perWinGames double;
    select count(*) from rps_scores where GAME_LEVEL ='medium' into countGames;
	select count(*) from rps_scores where game_level = 'medium' and result = 'win' into winGames;
	set perWinGames = winGames / countGames * 100;
	return perWinGames;
end $$

delimiter ;


drop function if exists RpsHardStat;
delimiter $$
create function RpsHardStat() returns double (5,2)
begin
	declare countGames int;
    declare winGames int;
    declare perWinGames double;
    select count(*) from rps_scores where GAME_LEVEL ='hard' into countGames;
	select count(*) from rps_scores where game_level = 'hard' and result = 'win' into winGames;
	set perWinGames = winGames / countGames * 100;
	return perWinGames;
end $$
delimiter ;


drop function if exists RpsVeryHardStat;
delimiter $$
create function RpsVeryHardStat() returns double (5,2)
begin
	declare countGames int;
    declare winGames int;
    declare perWinGames double;
    select count(*) from rps_scores where GAME_LEVEL ='very hard' into countGames;
	select count(*) from rps_scores where game_level = 'very hard' and result = 'win' into winGames;
	set perWinGames = winGames / countGames * 100;
	return perWinGames;
end $$
delimiter ;


#CREATING FUNCTIONS FOR RPS V2 (EXTENDED)

drop function if exists Rps2NewbieStat;
delimiter $$
create function Rps2NewbieStat() returns double (5,2)
begin
	declare countGames int;
    declare winGames int;
    declare perWinGames double;
    select count(*) from rps_two_scores where game_level ='newbie' into countGames;
	select count(*) from rps_two_scores where game_level = 'newbie' and result = 'win' into winGames;
	set perWinGames = winGames / countGames * 100;
	return perWinGames;
end $$
delimiter ;


drop function if exists Rps2EasyStat;
delimiter $$
create function Rps2EasyStat() returns double (5,2)
begin
	declare countGames int;
    declare winGames int;
    declare perWinGames double;
    select count(*) from rps_two_scores where game_level ='easy' into countGames;
	select count(*) from rps_two_scores where game_level = 'easy' and result = 'win' into winGames;
	set perWinGames = winGames / countGames * 100;
	return perWinGames;
end $$
delimiter ;


drop function if exists Rps2MediumStat;
delimiter $$
create function Rps2MediumStat() returns double (5,2)
begin
	declare countGames int;
    declare winGames int;
    declare perWinGames double;
    select count(*) from rps_two_scores where game_level ='medium' into countGames;
	select count(*) from rps_two_scores where game_level = 'medium' and result = 'win' into winGames;
	set perWinGames = winGames / countGames * 100;
	return perWinGames;
end $$

delimiter ;


drop function if exists Rps2HardStat;
delimiter $$
create function Rps2HardStat() returns double (5,2)
begin
	declare countGames int;
    declare winGames int;
    declare perWinGames double;
    select count(*) from rps_two_scores where game_level ='hard' into countGames;
	select count(*) from rps_two_scores where game_level = 'hard' and result = 'win' into winGames;
	set perWinGames = winGames / countGames * 100;
	return perWinGames;
end $$
delimiter ;


drop function if exists Rps2VeryHardStat;
delimiter $$
create function Rps2VeryHardStat() returns double (5,2)
begin
	declare countGames int;
    declare winGames int;
    declare perWinGames double;
    select count(*) from rps_two_scores where game_level ='very hard' into countGames;
	select count(*) from rps_two_scores where game_level = 'very hard' and result = 'win' into winGames;
	set perWinGames = winGames / countGames * 100;
	return perWinGames;
end $$
delimiter ;