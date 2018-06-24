package com.rps.gameSystem;

import com.rps.figures.FiguresList;
import com.rps.players.ComputerPlayerProcess;
import com.rps.players.HumanPlayerProcess;
import com.rps.exceptions.RpsException;

public class ScoreComparision {

    private static final String WIN = "You win! \n";
    private static final String LOSE = "You lost! \n";

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

                    String player1 = humanPlayerProcess.showFigure();
                    String player2 = null;

                    switch (difficultyLevel) {
                        case DifficultyLevel.VERYHARD:
                            player2 = computerPlayerProcess.showFigureLvlVeryHard(player1);
                            break;
                        case DifficultyLevel.HARD:
                            player2 = computerPlayerProcess.showFigureLvlHard(player1);
                            break;
                        case DifficultyLevel.MEDIUM:
                            player2 = computerPlayerProcess.showFigureLvlMedium();
                            break;
                        case DifficultyLevel.EASY:
                            player2 = computerPlayerProcess.showFigureLvlEasy(player1);
                            break;
                        case DifficultyLevel.NEWBIE:
                            player2 = computerPlayerProcess.showFigureLvlNewbie(player1);
                    }

                    if (player1.equals(player2)) {

                        System.out.println("Tie!!! One more time! \n");

                    } else {

                        if (player1.equals(FiguresList.ROCK)) {

                            if (player2.equals(FiguresList.PAPER)) {
                                System.out.println(LOSE);
                                startComputerScore++;

                            } else {
                                System.out.print(WIN);
                                startHumanPlayerScore++;
                            }
                        }

                        if (player1.equals(FiguresList.SCISSORS)) {

                            if (player2.equals(FiguresList.ROCK)) {
                                System.out.println(LOSE);
                                startComputerScore++;

                            } else {
                                System.out.print(WIN);
                                startHumanPlayerScore++;
                            }
                        }

                        if (player1.equals(FiguresList.PAPER)) {

                            if (player2.equals(FiguresList.SCISSORS)) {
                                System.out.println(LOSE);
                                startComputerScore++;

                            } else {
                                System.out.print(WIN);
                                startHumanPlayerScore++;
                            }
                        }

                    }

                    System.out.println("Your score: " + startHumanPlayerScore + " vs. computer score: " + startComputerScore + "\n");

                } catch (RpsException e) {
                    System.out.println("Insert correct key");
                }

            }

        }

    }

}
