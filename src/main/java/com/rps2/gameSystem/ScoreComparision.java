package com.rps2.gameSystem;

import com.rps.figures.FiguresList;
import com.rps.gameSystem.DifficultyLevel;
import com.rps.gameSystem.EndOfGame;
import com.rps.gameSystem.GameInformation;
import com.rps2.players.HumanPlayerProcess;
import com.rps2.figures.ExtendedFiguresList;
import com.rps2.players.ComputerPlayerProcess;
import com.rps.exceptions.RpsException;

public class ScoreComparision {

    private static final String WIN = "You win! \n";
    private static final String LOSE = "You lost! \n";
    private static final String PAPER_VS_ROCK = " Paper wraps the rock! \n";
    private static final String SPOCK_VS_ROCK = " Spock crushes the rock! \n";
    private static final String ROCK_VS_SCISSORS = " Rock dulls scissors! \n";
    private static final String ROCK_VS_LIZARD = " Rock crushes the lizard! \n";
    private static final String SPOCK_VS_SCISSORS= " Spock crushes the scissors!\n";
    private static final String SCISSORS_VS_PAPER = " Scissors cut the paper!\n";
    private static final String SCISSORS_VS_LIZARD = " Scissors cut the lizard!\n";
    private static final String LIZARD_VS_PAPER = " Lizard eats the paper!\n";
    private static final String PAPER_VS_SPOCK = " Paper proves spock's error!\n";
    private static final String LIZARD_VS_SPOCK = " Lizard poisons the spock!\n";

    public void compareScore(HumanPlayerProcess humanPlayerProcess, ComputerPlayerProcess computerPlayerProcess, int gameLimit, int startHumanPlayerScore, int startComputerScore, String difficultyLevel) {

        boolean doWeFinished = false;
        while (!doWeFinished) {

            GameInformation gameInformation = new GameInformation();

            if (startHumanPlayerScore == gameLimit || startComputerScore == gameLimit) {

                gameInformation.checkScore(startHumanPlayerScore, gameLimit);
                EndOfGame endOfGame = new EndOfGame();
                endOfGame.endingGame();

            } else {

                try {

                    String player1Figure = humanPlayerProcess.showFigure();
                    String player2Figure = null;

                    switch (difficultyLevel) {
                        case DifficultyLevel.VERYHARD:
                            player2Figure = computerPlayerProcess.showFigureLvlVeryHard(player1Figure);
                            break;
                        case DifficultyLevel.HARD:
                            player2Figure = computerPlayerProcess.showFigureLvlHard(player1Figure);
                            break;
                        case DifficultyLevel.MEDIUM:
                            player2Figure = computerPlayerProcess.showFigureLvlMedium();
                            break;
                        case DifficultyLevel.EASY:
                            player2Figure = computerPlayerProcess.showFigureLvlEasy(player1Figure);
                            break;
                        case DifficultyLevel.NEWBIE:
                            player2Figure = computerPlayerProcess.showFigureLvlNewbie(player1Figure);
                    }

                    if (player1Figure.equals(player2Figure)) {

                        System.out.println("Tie!!! One more time! \n");

                    } else {

                        if (player1Figure.equals(FiguresList.ROCK)) {
                            switch (player2Figure) {
                                case ExtendedFiguresList.PAPER:
                                    System.out.println(LOSE + PAPER_VS_ROCK);
                                    startComputerScore++;
                                    break;
                                case ExtendedFiguresList.SPOCK:
                                    System.out.println(LOSE + SPOCK_VS_ROCK);
                                    startComputerScore++;
                                    break;
                                case ExtendedFiguresList.SCISSORS:
                                    System.out.println(WIN + ROCK_VS_SCISSORS);
                                    startHumanPlayerScore++;
                                    break;
                                case ExtendedFiguresList.LIZARD:
                                    System.out.println(WIN + ROCK_VS_LIZARD);
                                    startHumanPlayerScore++;
                                    break;
                            }
                        } else if (player1Figure.equals(ExtendedFiguresList.SCISSORS)) {
                            switch (player2Figure) {
                                case ExtendedFiguresList.ROCK:
                                    System.out.println(LOSE +  ROCK_VS_SCISSORS);
                                    startComputerScore++;
                                    break;
                                case ExtendedFiguresList.SPOCK:
                                    System.out.println(LOSE + SPOCK_VS_SCISSORS);
                                    startComputerScore++;
                                    break;
                                case ExtendedFiguresList.PAPER:
                                    System.out.println(WIN + SCISSORS_VS_PAPER);
                                    startHumanPlayerScore++;
                                    break;
                                case ExtendedFiguresList.LIZARD:
                                    System.out.println(WIN + SCISSORS_VS_LIZARD);
                                    startHumanPlayerScore++;
                                    break;
                            }
                        } else if (player1Figure.equals(ExtendedFiguresList.PAPER)) {
                            switch (player2Figure) {
                                case ExtendedFiguresList.SCISSORS:
                                    System.out.println(LOSE + SCISSORS_VS_PAPER);
                                    startComputerScore++;
                                    break;
                                case ExtendedFiguresList.LIZARD:
                                    System.out.println(LOSE + LIZARD_VS_PAPER);
                                    startComputerScore++;
                                    break;
                                case ExtendedFiguresList.ROCK:
                                    System.out.println(WIN + PAPER_VS_ROCK);
                                    startHumanPlayerScore++;
                                    break;
                                case ExtendedFiguresList.SPOCK:
                                    System.out.println(WIN + PAPER_VS_SPOCK);
                                    startHumanPlayerScore++;
                                    break;
                            }
                        } else if (player1Figure.equals(ExtendedFiguresList.LIZARD)) {
                            switch (player2Figure) {
                                case ExtendedFiguresList.ROCK:
                                    System.out.println(LOSE + ROCK_VS_LIZARD);
                                    startComputerScore++;
                                    break;
                                case ExtendedFiguresList.SCISSORS:
                                    System.out.println(LOSE + SCISSORS_VS_LIZARD);
                                    startComputerScore++;
                                    break;
                                case ExtendedFiguresList.SPOCK:
                                    System.out.println(WIN + LIZARD_VS_SPOCK);
                                    startHumanPlayerScore++;
                                    break;
                                case ExtendedFiguresList.PAPER:
                                    System.out.println(WIN + LIZARD_VS_PAPER);
                                    startHumanPlayerScore++;
                                    break;
                            }
                        } else if (player1Figure.equals(ExtendedFiguresList.SPOCK)) {
                            switch (player2Figure) {
                                case ExtendedFiguresList.PAPER:
                                    System.out.println(LOSE + PAPER_VS_SPOCK);
                                    startComputerScore++;
                                    break;
                                case ExtendedFiguresList.LIZARD:
                                    System.out.println(LOSE + LIZARD_VS_SPOCK);
                                    startComputerScore++;
                                    break;
                                case ExtendedFiguresList.ROCK:
                                    System.out.println(WIN + SPOCK_VS_ROCK);
                                    startHumanPlayerScore++;
                                    break;
                                case ExtendedFiguresList.SCISSORS:
                                    System.out.println(WIN + SPOCK_VS_SCISSORS);
                                    startHumanPlayerScore++;
                                    break;
                            }
                        }
                    }

                    System.out.println("Your score: " + startHumanPlayerScore + " vs. computer score: " + startComputerScore + "\n");

                } catch (RpsException e) {
                    System.out.println(e.getMessage());
                }

            }

        }

    }

}