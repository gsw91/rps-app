package com.rps2.figures;

import com.rps.figures.Figure;
import com.rps.figures.FiguresList;

import java.util.List;

public class ExtendedFiguresList {

    public static final String PAPER = "Paper";
    public static final String ROCK = "Rock";
    public static final String SCISSORS = "Scissors";
    public static final String LIZARD = "Lizard";
    public static final String SPOCK = "Spock";

    public List<Figure> getFigures(){

        FiguresList figuresList = new FiguresList();

        List<Figure> extendedFiguresList = figuresList.getFigures();
        extendedFiguresList.add(4, new Lizard(LIZARD));
        extendedFiguresList.add(5, new Spock(SPOCK));

        return extendedFiguresList;

    }

}
