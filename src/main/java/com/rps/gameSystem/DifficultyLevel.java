package com.rps.gameSystem;

import java.util.Scanner;

public class DifficultyLevel {

    public static final String VERYHARD = "very hard";
    public static final String HARD = "hard";
    public static final String MEDIUM = "medium";
    public static final String EASY = "easy";
    public static final String NEWBIE = "newbie";

    public String setDifficultyLevel() {

        boolean setPropertlyWord = false;
        String level = null;
        while (!setPropertlyWord) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Set difficulty level: very hard, hard, medium, easy or newbie");
            level = scanner.nextLine();
            switch (level) {
                case VERYHARD:
                    System.out.println("You choosed " + level + " level");
                    return level;
                case HARD:
                    System.out.println("You choosed " + level + " level");
                    return level;
                case MEDIUM:
                    System.out.println("You choosed " + level + " level");
                    return level;
                case EASY:
                    System.out.println("You choosed " + level + " level");
                    return level;
                case NEWBIE:
                    System.out.println("You choosed " + level + " level");
                    return level;
                    default:
                        System.out.println("Wrong word, write one more time");
            }
        }
        return level;
    }

}
