package com.rps2.gameSystem;

import com.rps.exceptions.RpsException;

import java.util.Scanner;

public final class EndOfGame {

    public final void endingGame() {

        GameInformation gameInformation = new GameInformation();
        Scanner scanner = new Scanner(System.in);

        boolean isThisEnd = false;

        while (!isThisEnd) {

            System.out.println("\n Game is finished. Put n to play one more time, s to see statistics, or x key to exit");

            try {
                String command = scanner.nextLine();
                gameInformation.showStatistics(command);
                gameInformation.exitOrReset(command);
            } catch (RpsException e) {
                System.out.println("Please, confirm your decision");
            }
        }
    }

}
