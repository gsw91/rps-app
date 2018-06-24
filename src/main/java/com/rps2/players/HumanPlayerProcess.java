package com.rps2.players;

import com.rps.exceptions.RpsException;
import com.rps.figures.Figure;
import com.rps.gameSystem.ConfirmationExitOrReset;
import com.rps2.figures.ExtendedFiguresList;

import java.util.List;
import java.util.Scanner;

public final class HumanPlayerProcess {

    private final String playerName;

    public HumanPlayerProcess(final String playerName) {
        this.playerName = playerName;
    }

    public final String getPlayerName() {
        return playerName;
    }

    public final String showFigure() throws RpsException {

        ExtendedFiguresList extendedFiguresList = new ExtendedFiguresList();
        List<Figure> figuresToDraw = extendedFiguresList.getFigures();
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n Put your number: 1 - Paper, 2 - Rock, 3 - Scissors, 4 - Lizard, 5 - Spock");

        String command = scanner.nextLine();

        if (command.equals("1") || command.equals("2") || command.equals("3") || command.equals("4") || command.equals("5")) {
            int i = Integer.parseInt(command);
            System.out.println("You throws: " + figuresToDraw.get(i).getNameOfFigure());
            return figuresToDraw.get(Integer.parseInt(command)).getNameOfFigure();
        } else if (command.equals("n")) {
            System.out.println("Do you really want to reset this game ? \n Insert y to exit, or any other key to return to the game.");
            try {
                ConfirmationExitOrReset confirmationExitOrReset = new ConfirmationExitOrReset();
                confirmationExitOrReset.confirmReset(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Coming back to the game...");
                throw new RpsException();
            }
        } else if (command.equals("x")) {
            System.out.println("Do you really want to exit the game ? \n Insert y to exit, or any other key to return to the game.");
            try {
                ConfirmationExitOrReset confirmationExitOrReset = new ConfirmationExitOrReset();
                confirmationExitOrReset.confirmExit(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Coming back to the game...");
                throw new RpsException();
            }
        } else {
            throw new RpsException();
        }
        return figuresToDraw.get(Integer.parseInt(command)).getNameOfFigure();
    }

}