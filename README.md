# rps-app
Rock, paper, scissors application

com.rps

        -> standard version includes three figures: rock, paper and scissors

        -> choice of the difficulty level:

            -> very hard - 10% chance of winning, 80% chanse of losing, 10% chanse of getting a tie

            -> hard -      25% chance of winning, 50% chanse of losing, 25% chanse of getting a tie

            -> medium -    1/3 chance of winning, 1/3 chanse of losing, 1/3 chanse of getting a tie

            -> easy -      25% chance of winning, 50% chanse of losing, 25% chanse of getting a tie

            -> newbie -    80% chance of winning, 10% chanse of losing, 10% chanse of getting a tie

        -> exporting scores to  mySql database


com.rps2 (game extension)

        -> extented version includes five figures: rock, paper, scissors, spock and lizard

        -> choiche of the difficulty level

            -> very hard - ~18% chance of winning, ~73% chanse of losing, ~9% chanse of getting a tie

            -> hard -      ~29% chance of winning, ~57% chanse of losing, ~14% chanse of getting a tie

            -> medium -     40% chance of winning, 40% chanse of losing, 20% chanse of getting a tie

            -> easy -      ~57%% chance of winning, ~29% chanse of losing, ~14% chanse of getting a tie

            -> newbie -    ~73% chance of winning, ~18% chanse of losing, ~9% chanse of getting a tie

com.statistics (will be created)

        -> rest-app enhancement, currently can see all scores and counts games (statistics in preparation)

            -> first run StatisticsApplication in com.statistics package

            -> see all scores by sending a request : http://localhost:8080/rps/scores/

            -> count all games by sending a request : http://localhost:8080/rps/count/

            -> adding a new result to data base is only possible by playing a game!!!