package com.rps2.gameSystem;

import com.rps.exceptions.RpsException;
import com.rps2.gameConfiguration.GameConfiguration;

public final class ConfirmationExitOrReset {

    public final void confirmReset(String confirm) throws RpsException {

        if (confirm.equals("y")) {
            System.out.println("Resetting the game... \n");
            GameConfiguration configuration = new GameConfiguration();
            configuration.play();

        } else {
            throw new RpsException();
        }

    }

    public final void confirmExit(String confirm) throws RpsException{

        if (confirm.equals("y")) {
            System.out.println("Goodbye!");
            System.exit(0);
        } else {
            throw new RpsException();
        }

    }

}
