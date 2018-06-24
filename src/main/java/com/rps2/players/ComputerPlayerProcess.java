package com.rps2.players;

import com.rps.figures.*;
import com.rps2.figures.*;

import java.util.List;
import java.util.Random;

public final class ComputerPlayerProcess {

    public final String showFigureLvlVeryHard(String humanFigure) {
        //computer has 80% chances to win, 10% to lose and 10% to end in a tie
        List<Figure> figuresToDraw = getFiguresListLvlVeryHard(humanFigure);

        Random random = new Random();
        int i = random.nextInt(11)+1;
        System.out.println("Computer throws: " + figuresToDraw.get(i).getNameOfFigure());

        return figuresToDraw.get(i).getNameOfFigure();
    }

    public final String showFigureLvlHard(String humanFigure) {
        //computer has 50% chances to win, 25% to lose and 25% to end in a tie
        List<Figure> figuresToDraw = getFiguresListLvlHard(humanFigure);

        Random random = new Random();
        int i = random.nextInt(7)+1;
        System.out.println("Computer throws: " + figuresToDraw.get(i).getNameOfFigure());

        return figuresToDraw.get(i).getNameOfFigure();
    }


    public final String showFigureLvlMedium() {

        List<Figure> figuresToDraw = getFiguresListLvlMedium();
        Random random = new Random();
        int i = random.nextInt(5)+1;
        System.out.println("Computer throws: " + figuresToDraw.get(i).getNameOfFigure());

        return figuresToDraw.get(i).getNameOfFigure();
    }

    public final String showFigureLvlEasy(String humanFigure) {
        //computer has 25% chances to win, 50% to lose and 25% to end in a tie
        List<Figure> figuresToDraw = getFiguresListLvlEasy(humanFigure);

        Random random = new Random();
        int i = random.nextInt(7)+1;
        System.out.println("Computer throws: " + figuresToDraw.get(i).getNameOfFigure());

        return figuresToDraw.get(i).getNameOfFigure();
    }

    public final String showFigureLvlNewbie(String humanFigure) {
        //computer has 10% chances to win, 80% to lose and 10% to end in a tie
        List<Figure> figuresToDraw = getFiguresListLvlNewbie(humanFigure);

        Random random = new Random();
        int i = random.nextInt(11)+1;
        System.out.println("Computer throws: " + figuresToDraw.get(i).getNameOfFigure());

        return figuresToDraw.get(i).getNameOfFigure();
    }

    public final List<Figure> getFiguresListLvlVeryHard(String humanFigure) {
        List<Figure> figuresToDraw = getFiguresListLvlMedium();
        switch (humanFigure) {
            case ExtendedFiguresList.PAPER:
                for(int i=0; i<=2; i++) {
                    figuresToDraw.add(new Scissors(ExtendedFiguresList.SCISSORS));
                    figuresToDraw.add(new Lizard(ExtendedFiguresList.LIZARD));
                }
                break;
            case ExtendedFiguresList.ROCK:
                for(int i=0; i<=2; i++) {
                    figuresToDraw.add(new Paper(ExtendedFiguresList.PAPER));
                    figuresToDraw.add(new Spock(ExtendedFiguresList.SPOCK));
                }
                break;
            case ExtendedFiguresList.SCISSORS:
                for(int i=0; i<=2; i++) {
                    figuresToDraw.add(new Rock(ExtendedFiguresList.ROCK));
                    figuresToDraw.add(new Spock(ExtendedFiguresList.SPOCK));
                }
                break;
            case ExtendedFiguresList.LIZARD:
                for(int i=0; i<=2; i++) {
                    figuresToDraw.add(new Rock(ExtendedFiguresList.ROCK));
                    figuresToDraw.add(new Scissors(ExtendedFiguresList.SCISSORS));
                }
                break;
            case ExtendedFiguresList.SPOCK:
                for(int i=0; i<=2; i++) {
                    figuresToDraw.add(new Rock(ExtendedFiguresList.PAPER));
                    figuresToDraw.add(new Lizard(ExtendedFiguresList.LIZARD));
                }
                break;
        }
        return figuresToDraw;
    }

    public final List<Figure> getFiguresListLvlHard(String humanFigure) {
        List<Figure> figuresToDraw = getFiguresListLvlMedium();
        switch (humanFigure) {
            case ExtendedFiguresList.PAPER:
                figuresToDraw.add(new Scissors(ExtendedFiguresList.SCISSORS));
                figuresToDraw.add(new Lizard(ExtendedFiguresList.LIZARD));
                break;
            case ExtendedFiguresList.ROCK:
                figuresToDraw.add(new Paper(ExtendedFiguresList.PAPER));
                figuresToDraw.add(new Spock(ExtendedFiguresList.SPOCK));
                break;
            case ExtendedFiguresList.SCISSORS:
                figuresToDraw.add(new Rock(ExtendedFiguresList.ROCK));
                figuresToDraw.add(new Spock(ExtendedFiguresList.SPOCK));
                break;
            case ExtendedFiguresList.LIZARD:
                figuresToDraw.add(new Rock(ExtendedFiguresList.ROCK));
                figuresToDraw.add(new Scissors(ExtendedFiguresList.SCISSORS));
                break;
            case ExtendedFiguresList.SPOCK:
                figuresToDraw.add(new Paper(ExtendedFiguresList.PAPER));
                figuresToDraw.add(new Lizard(ExtendedFiguresList.LIZARD));
                break;
        }
        return figuresToDraw;
    }

    public final List<Figure> getFiguresListLvlMedium() {
        ExtendedFiguresList extendedFiguresList = new ExtendedFiguresList();
        return extendedFiguresList.getFigures();
    }

    public final List<Figure> getFiguresListLvlEasy(String humanFigure) {
        List<Figure> figuresToDraw = getFiguresListLvlMedium();
        switch (humanFigure) {
            case ExtendedFiguresList.PAPER:
                figuresToDraw.add(new Scissors(ExtendedFiguresList.ROCK));
                figuresToDraw.add(new Lizard(ExtendedFiguresList.SPOCK));
                break;
            case ExtendedFiguresList.ROCK:
                figuresToDraw.add(new Paper(ExtendedFiguresList.LIZARD));
                figuresToDraw.add(new Spock(ExtendedFiguresList.SCISSORS));
                break;
            case ExtendedFiguresList.SCISSORS:
                figuresToDraw.add(new Rock(ExtendedFiguresList.PAPER));
                figuresToDraw.add(new Spock(ExtendedFiguresList.LIZARD));
                break;
            case ExtendedFiguresList.LIZARD:
                figuresToDraw.add(new Rock(ExtendedFiguresList.SPOCK));
                figuresToDraw.add(new Scissors(ExtendedFiguresList.PAPER));
                break;
            case ExtendedFiguresList.SPOCK:
                figuresToDraw.add(new Paper(ExtendedFiguresList.ROCK));
                figuresToDraw.add(new Lizard(ExtendedFiguresList.SCISSORS));
                break;
        }
        return figuresToDraw;
    }

    public final List<Figure> getFiguresListLvlNewbie(String humanFigure) {
        List<Figure> figuresToDraw = getFiguresListLvlMedium();
        switch (humanFigure) {
            case ExtendedFiguresList.PAPER:
                for(int i=0; i<=2; i++) {
                    figuresToDraw.add(new Scissors(ExtendedFiguresList.ROCK));
                    figuresToDraw.add(new Lizard(ExtendedFiguresList.SPOCK));
                }
                break;
            case ExtendedFiguresList.ROCK:
                for(int i=0; i<=2; i++) {
                    figuresToDraw.add(new Paper(ExtendedFiguresList.SCISSORS));
                    figuresToDraw.add(new Spock(ExtendedFiguresList.LIZARD));
                }
                break;
            case ExtendedFiguresList.SCISSORS:
                for(int i=0; i<=2; i++) {
                    figuresToDraw.add(new Rock(ExtendedFiguresList.PAPER));
                    figuresToDraw.add(new Spock(ExtendedFiguresList.LIZARD));
                }
                break;
            case ExtendedFiguresList.LIZARD:
                for(int i=0; i<=2; i++) {
                    figuresToDraw.add(new Rock(ExtendedFiguresList.SPOCK));
                    figuresToDraw.add(new Scissors(ExtendedFiguresList.PAPER));
                }
                break;
            case ExtendedFiguresList.SPOCK:
                for(int i=0; i<=2; i++) {
                    figuresToDraw.add(new Rock(ExtendedFiguresList.ROCK));
                    figuresToDraw.add(new Lizard(ExtendedFiguresList.SCISSORS));
                }
                break;
        }
        return figuresToDraw;
    }

}
