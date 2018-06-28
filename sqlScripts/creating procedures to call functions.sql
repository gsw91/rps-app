#CREATING PROCEDURE TO SHOW STATISTICS OF RPS STANDARD

drop procedure if exists ShowResultsRps;
delimiter $$
create procedure ShowResultsRps()
begin
	select  RpsNewbieStat() as percents_of_wins_lvl_newbie, 
			RpsEasyStat() as percents_of_wins_lvl_easy, 
			RpsMediumStat() as percents_of_wins_lvl_medium, 
			RpsHardStat() as percents_of_wins_lvl_hard, 
			RpsVeryHardStat() as percents_of_wins_lvl_veryhard;
end$$
delimiter ;


#CREATING PROCEDURE TO SHOW STATISTICS OF RPS V2 (EXTENDED)

drop procedure if exists ShowResultsRps2;
delimiter $$
create procedure ShowResultsRps2()
begin
	select  Rps2NewbieStat() as percents_of_wins_lvl_newbie, 
			Rps2EasyStat() as percents_of_wins_lvl_easy, 
			Rps2MediumStat() as percents_of_wins_lvl_medium, 
			Rps2HardStat() as percents_of_wins_lvl_hard, 
			Rps2VeryHardStat() as percents_of_wins_lvl_veryhard;
end$$
delimiter ;