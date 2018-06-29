package com.rps2.gameSystem;

import com.rps.exceptions.RpsException;
import com.rps2.dbConnection.GameStatistics;
import com.rps2.gameSystem.ConfirmationExitOrReset;

import java.util.Scanner;

public final class GameInformation {

    public final void showWelcome() {
        System.out.println("Welcome in the game Rock - Paper - Scissors v.2\n" +
                "\n Please insert your name.\n");
    }

    public final void showRules() {
        System.out.println("\n Rules: \n" +
                "press 1 to throw Rock \n" +
                "press 2 to throw Paper \n" +
                "press 3 to throw Scissors \n" +
                "press 4 to throw Lizard \n" +
                "press 5 to throw Spock \n" +
                "press x to end the game \n" +
                "press n to restart the game \n");
    }

    public final void infoInsertQuantityOfROunds() {
        System.out.println("\n Please insert quantity of winning rounds: ");
    }


    public final int insertRoundsQuantity() throws NumberFormatException {
        Scanner scanner = new Scanner(System.in);
        String getLimit = scanner.nextLine();
        boolean isTrue = false;
        while(!isTrue){
            if((Integer.parseInt(getLimit))>0){
                isTrue = true;
            } else {
                throw new NumberFormatException();
            }
        }
        return Integer.parseInt(getLimit);
    }

    public final void showStatistics(String command) {
        if (command.equals("s")) {
            GameStatistics statistics = new GameStatistics();
            statistics.getBasicStatistics();
            EndOfGame endOfGame = new EndOfGame();
            endOfGame.endingGame();
        }
    }

    public final void exitOrReset(String command) throws RpsException {
        ConfirmationExitOrReset confirmationExitOrReset = new ConfirmationExitOrReset();
        Scanner scanner = new Scanner(System.in);

        if (command.equals("x")) {
            System.out.println("Do you really want to exit the game ? \n Insert y to exit, or any other key to return to the game.");
            try {
                confirmationExitOrReset.confirmExit(scanner.nextLine());
            } catch (RpsException o) {
                System.out.println("Insert correct key!");
            }
        } else if (command.equals("n")) {
            System.out.println("Do you want to play one more time ? \n Insert y to begin, or any other key to return to the game.");
            try {
                confirmationExitOrReset.confirmReset(scanner.nextLine());
            } catch (RpsException x) {
                System.out.println("Insert correct key!");
            }
        } else {
            throw new RpsException();
        }
    }

    public final void checkScore(int humanPlayerScore, int limitOfTheGame) {
        if (humanPlayerScore == limitOfTheGame) {
            System.out.println("\nYou win the game!!!\n");
        } else {
            System.out.println("\nYou lost with a computer...\n");
        }
    }


    public Integer[] resetScores (){
        Integer[] scores = new Integer[2];
        scores[0] = 0;
        scores[1] = 0;
        return scores;
    }

}
