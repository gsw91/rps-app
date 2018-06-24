package com.rps.players;

import java.util.Scanner;

public final class HumanPlayerName {

    public final String insertHumanName() {

        String playerName;

        Scanner scanner = new Scanner(System.in);

        playerName = scanner.nextLine();

        return playerName;

    }

}
