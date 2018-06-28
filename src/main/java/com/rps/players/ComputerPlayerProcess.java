package com.rps.players;

import com.rps.figures.*;

import java.util.List;
import java.util.Random;

public final class ComputerPlayerProcess {

    private static final String ROCK = "Rock";
    private static final String SCISSORS = "Scissors";
    private static final String PAPER = "Paper";

    public final String showFigureLvlVeryHard(String humanFigure) {
        //computer has 80% chances to win, 10% to lose and 10% to end in a tie
        List<Figure> figuresToDraw = getFiguresListLvlVeryHard(humanFigure);
        Random random = new Random();
        int i = random.nextInt(10)+1;
        System.out.println("Computer throws: " + figuresToDraw.get(i).getNameOfFigure());

        return figuresToDraw.get(i).getNameOfFigure();
    }

    public final String showFigureLvlHard(String humanFigure) {
        //computer has 50% chances to win, 25% to lose and 25% to end in a tie
        List<Figure> figuresToDraw = getFiguresListLvlHard(humanFigure);
        Random random = new Random();
        int i = random.nextInt(4)+1;
        System.out.println("Computer throws: " + figuresToDraw.get(i).getNameOfFigure());

        return figuresToDraw.get(i).getNameOfFigure();
    }


    public final String showFigureLvlMedium() {
        List<Figure> figuresToDraw = getFiguresListLvlNormal();
        Random random = new Random();
        int i = random.nextInt(3)+1;
        System.out.println("Computer throws: " + figuresToDraw.get(i).getNameOfFigure());

        return figuresToDraw.get(i).getNameOfFigure();
    }

    public final String showFigureLvlEasy(String humanFigure) {
        //computer has 25% chances to win, 50% to lose and 25% to end in a tie
        List<Figure> figuresToDraw = getFiguresListLvlEasy(humanFigure);
        Random random = new Random();
        int i = random.nextInt(4)+1;
        System.out.println("Computer throws: " + figuresToDraw.get(i).getNameOfFigure());

        return figuresToDraw.get(i).getNameOfFigure();
    }

    public final String showFigureLvlNewbie(String humanFigure) {
        //computer has 10% chances to win, 80% to lose and 10% to end in a tie
        List<Figure> figuresToDraw = getFiguresListLvlNewbie(humanFigure);
        Random random = new Random();
        int i = random.nextInt(10)+1;
        System.out.println("Computer throws: " + figuresToDraw.get(i).getNameOfFigure());

        return figuresToDraw.get(i).getNameOfFigure();
    }

    public final List<Figure> getFiguresListLvlVeryHard(String humanFigure) {
        List<Figure> figuresToDraw = getFiguresListLvlNormal();

        switch (humanFigure) {
            case PAPER:
                for(int i=0; i<=6; i++) {
                    figuresToDraw.add(new Scissors(SCISSORS));
                }
                break;
            case ROCK:
                for(int i=0; i<=6; i++) {
                    figuresToDraw.add(new Paper(PAPER));
                }
                break;
            case SCISSORS:
                for(int i=0; i<=6; i++) {
                    figuresToDraw.add(new Rock(ROCK));

                }
                break;
        }
        return figuresToDraw;
    }

    public final List<Figure> getFiguresListLvlHard(String humanFigure) {
        List<Figure> figuresToDraw = getFiguresListLvlNormal();

        switch (humanFigure) {
            case PAPER:
                figuresToDraw.add(new Scissors(SCISSORS));
                break;
            case ROCK:
                figuresToDraw.add(new Paper(PAPER));
                break;
            case SCISSORS:
                figuresToDraw.add(new Rock(ROCK));
                break;
        }
        return figuresToDraw;
    }

    public final List<Figure> getFiguresListLvlNormal() {
        FiguresList figuresList = new FiguresList();
        return figuresList.getFigures();
    }

    public final List<Figure> getFiguresListLvlEasy(String humanFigure) {
        List<Figure> figuresToDraw = getFiguresListLvlNormal();

        switch (humanFigure) {
            case PAPER:
                figuresToDraw.add(new Scissors(ROCK));
                break;
            case ROCK:
                figuresToDraw.add(new Paper(SCISSORS));
                break;
            case SCISSORS:
                figuresToDraw.add(new Rock(PAPER));
                break;
        }
        return figuresToDraw;
    }

    public final List<Figure> getFiguresListLvlNewbie(String humanFigure) {
        List<Figure> figuresToDraw = getFiguresListLvlNormal();

        switch (humanFigure) {
            case PAPER:
                for(int i=0; i<=6; i++) {
                    figuresToDraw.add(new Scissors(ROCK));
                }
                break;
            case ROCK:
                for(int i=0; i<=6; i++) {
                    figuresToDraw.add(new Paper(SCISSORS));
                }
                break;
            case SCISSORS:
                for(int i=0; i<=6; i++) {
                    figuresToDraw.add(new Rock(PAPER));
                }
                break;
        }
        return figuresToDraw;
    }


}
