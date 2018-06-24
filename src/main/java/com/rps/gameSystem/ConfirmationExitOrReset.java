package com.rps.gameSystem;

import com.rps.gameConfiguration.GameConfiguration;

public final class ConfirmationExitOrReset {

    public final void confirmReset(String confirm) throws NumberFormatException {

        if (confirm.equals("y")) {
            System.out.println("Resetting the game... \n");
            GameConfiguration configuration = new GameConfiguration();
            configuration.play();

        } else {
            throw new NumberFormatException();
        }

    }

    public final void confirmExit(String confirm) throws NumberFormatException{

        if (confirm.equals("y")) {
            System.out.println("Goodbye!");
            System.exit(0);
        } else {
            throw new NumberFormatException();
        }

    }

}
