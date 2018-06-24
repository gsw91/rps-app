package com.rps.gameConfiguration;

import com.rps.gameSystem.*;
import com.rps.players.ComputerPlayerProcess;
import com.rps.players.HumanPlayerName;
import com.rps.players.HumanPlayerProcess;

public final class GameConfiguration {

    public final void play() {

        GameInformation gameInformation = new GameInformation();
        gameInformation.showWelcome();

        HumanPlayerName humanPlayerName = new HumanPlayerName();
        String playerName = humanPlayerName.insertHumanName();

        HumanPlayerProcess humanPlayerProcess = new HumanPlayerProcess(playerName);
        System.out.print("Hello " + humanPlayerProcess.getPlayerName());

        gameInformation.showRules();

        DifficultyLevel difficultyLevel = new DifficultyLevel();
        String level = difficultyLevel.setDifficultyLevel();

        gameInformation.infoInsertQuantityOfROunds();

        RoundsLimit roundLimit = new RoundsLimit();
        int gameLimit = roundLimit.getLimit();

        ComputerPlayerProcess computerPlayerProcess = new ComputerPlayerProcess();

        ScoreComparision comparision = new ScoreComparision();
        comparision.compareScore(humanPlayerProcess, computerPlayerProcess, gameLimit,0,0, level);

    }

}
