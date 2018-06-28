# rps-app
Rock, paper, scissors application's project

com.rps.RpsRunner

        -> standard version includes three figures: rock, paper and scissors

        -> choice of the difficulty level:

            -> very hard - 10% chance of winning, 80% chanse of losing, 10% chanse of getting a tie

            -> hard -      25% chance of winning, 50% chanse of losing, 25% chanse of getting a tie

            -> medium -    1/3 chance of winning, 1/3 chanse of losing, 1/3 chanse of getting a tie

            -> easy -      25% chance of winning, 50% chanse of losing, 25% chanse of getting a tie

            -> newbie -    80% chance of winning, 10% chanse of losing, 10% chanse of getting a tie

        -> exporting scores to local mySql database


com.rps2.Rps2Runner (game extension)

        -> extented version includes five figures: rock, paper, scissors, spock and lizard

        -> choiche of the difficulty level

            -> very hard - ~18% chance of winning, ~73% chanse of losing, ~9% chanse of getting a tie

            -> hard -      ~29% chance of winning, ~57% chanse of losing, ~14% chanse of getting a tie

            -> medium -     40% chance of winning, 40% chanse of losing, 20% chanse of getting a tie

            -> easy -      ~57%% chance of winning, ~29% chanse of losing, ~14% chanse of getting a tie

            -> newbie -    ~73% chance of winning, ~18% chanse of losing, ~9% chanse of getting a tie

        -> exporting scores to local mySql database


com.statistics (app to manage scores for rps and rps2)

        -> rest-app enhancement based on Spring Framework and Project Lombok lets manage scores (by using e.g. postman application)

        -> first run StatisticsApplication in com.statistics package

        -> to manage standard rps app's scores send requests to : http://localhost:8080/rps/ or

           to manage extended rps2 app's scores send requests to : http://localhost:8080/rps2/

                -> see all scores by sending a request with : scores/

                   e.g. http://localhost:8080/rps/scores/

                -> count all games by sending a request with : count/

                   e.g. http://localhost:8080/rps/scores/

                -> delete score from database by sending a request with a parameter to : delete/

                   parameter - it's id of appropriate score e.g. http://localhost:8080/rps/delete/?id=1

                -> block unproper player name by sending a request with a parameter : http://localhost:8080/rps/updateName/

                   parameter - it's id of appropriate score e.g. http://localhost:8080/rps/updateName/?id=1

                   it'll change player name to "ulgy name disabled (admin)"

        -> adding a new result to database is only possible by playing a game!!!