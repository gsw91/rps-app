package com.rps.testing.players;

import com.rps.figures.*;
import com.rps.players.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class ComputerPlayerProcessTests {

    private static final String ROCK = "Rock";
    private static final String SCISSORS = "Scissors";
    private static final String PAPER = "Paper";

    @Test
    public void shouldReturn8Paper() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlVeryHard(ROCK);
        List<Figure> listOfPaper = figuresList.stream()
                .filter(figure -> figure!=null)
                .filter(figure -> figure.getNameOfFigure().equals(PAPER))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(8, listOfPaper.size());
    }

    @Test
    public void shouldReturn8Scissors() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlVeryHard(PAPER);
        List<Figure> listOfPaper = figuresList.stream()
                .filter(figure -> figure!=null)
                .filter(figure -> figure.getNameOfFigure().equals(SCISSORS))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(8, listOfPaper.size());
    }

    @Test
    public void shouldReturn8Rocks() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlVeryHard(SCISSORS);
        List<Figure> listOfPaper = figuresList.stream()
                .filter(figure -> figure!=null)
                .filter(figure -> figure.getNameOfFigure().equals(ROCK))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(8, listOfPaper.size());
    }

    @Test
    public void shouldAddPaperIntoList() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlHard(ROCK);
        List<Figure> listOfPaper = figuresList.stream()
                .filter(figure -> figure!=null)
                .filter(figure -> figure.getNameOfFigure().equals(PAPER))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(2, listOfPaper.size());
    }

    @Test
    public void shouldAddScissorsIntoList() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlHard(PAPER);
        List<Figure> listOfScissors = figuresList.stream()
                .filter(figure -> figure!=null)
                .filter(figure -> figure.getNameOfFigure().equals(SCISSORS))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(2, listOfScissors.size());
    }

    @Test
    public void shouldAddRockIntoList(){
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlHard(SCISSORS);
    List<Figure> listOfRocks = figuresList.stream()
            .filter(figure -> figure!=null)
            .filter(figure -> figure.getNameOfFigure().equals(ROCK))
            .collect(Collectors.toList());
    //then
        Assert.assertEquals(2, listOfRocks.size());
}

    @Test
    public void shouldReturnFourFigures() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlHard(SCISSORS);
        List<Figure> listQuantityOfFigures = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(4, listQuantityOfFigures.size());
    }

    @Test
    public void shouldReturn3Figures() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlNormal();
        List<Figure> listQuantityOfFigures = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(3, listQuantityOfFigures.size());
    }

}
