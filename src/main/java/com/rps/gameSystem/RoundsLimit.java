package com.rps.gameSystem;

public final class RoundsLimit {

    public final int getLimit(){

        GameInformation gameInformation = new GameInformation();

        int roundLimit = 0;

        boolean roundLimitBoolean = false;

        while (!roundLimitBoolean) {

            try {
                roundLimit = roundLimit + gameInformation.insertRoundsQuantity();

                if (roundLimit>0) {
                    roundLimitBoolean = true;
                }

            } catch (NumberFormatException e) {
                System.out.print("\n Firstly please determine quantity of rounds, \n please insert a figure: \n");

            }

        }

        System.out.println("\n The game lasts for " + roundLimit + " winning rounds. Good luck! \n");

        return roundLimit;
    }

}
