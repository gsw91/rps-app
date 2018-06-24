package com.rps.figures;

import java.util.ArrayList;
import java.util.List;

public class FiguresList {

    public static final String PAPER = "Paper";
    public static final String ROCK = "Rock";
    public static final String SCISSORS = "Scissors";

    public List<Figure> getFigures(){

        List<Figure> figuresList = new ArrayList<>();
        figuresList.add(0, null);
        figuresList.add(1, new Paper(PAPER));
        figuresList.add(2, new Rock(ROCK));
        figuresList.add(3, new Scissors(SCISSORS));

        return figuresList;

    }

}
