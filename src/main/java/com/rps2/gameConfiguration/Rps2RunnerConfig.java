package com.rps2.gameConfiguration;

import java.util.Scanner;

public final class Rps2RunnerConfig {

    public final void playGame() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert rps to play standard game");
        System.out.println("Insert rps2 to play extended game");
        System.out.println("Insert exit to end the app");
        boolean condition = false;

        while (!condition)
        {
            String game = scanner.nextLine();
            switch (game) {
                case "rps":
                    com.rps.gameConfiguration.GameConfiguration configurationRps = new com.rps.gameConfiguration.GameConfiguration();
                    configurationRps.play();
                    break;
                case "rps2":
                    com.rps2.gameConfiguration.GameConfiguration configurationRps2 = new com.rps2.gameConfiguration.GameConfiguration();
                    configurationRps2.play();
                case "exit":
                    condition = true;
            }
        }
        System.exit(0);
    }

}


