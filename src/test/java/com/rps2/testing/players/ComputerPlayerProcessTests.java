package com.rps2.testing.players;

import com.rps.figures.*;
import com.rps2.players.*;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;

public class ComputerPlayerProcessTests {

    private static final String ROCK = "Rock";
    private static final String SCISSORS = "Scissors";
    private static final String PAPER = "Paper";
    private static final String LIZARD = "Lizard";
    private static final String SPOCK = "Spock";

    //tests of creating properly figures list for level very hard
    @Test
    public void shouldReturn4PaperAnd4Spock() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlVeryHard(ROCK);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(PAPER)||figure.getNameOfFigure().equals(SPOCK))
                .collect(Collectors.toList());
        List<Figure> paperList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(PAPER))
                .collect(Collectors.toList());
        List<Figure> spockList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SPOCK))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(11,figuresWithoutNullList.size());
        Assert.assertEquals(8, resultList.size());
        Assert.assertEquals(4, paperList.size());
        Assert.assertEquals(4, spockList.size());
    }

    @Test
    public void shouldReturn4ScissorsAnd4Lizard() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlVeryHard(PAPER);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SCISSORS)||figure.getNameOfFigure().equals(LIZARD))
                .collect(Collectors.toList());
        List<Figure> scissorsList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SCISSORS))
                .collect(Collectors.toList());
        List<Figure> lizardList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(LIZARD))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(11,figuresWithoutNullList.size());
        Assert.assertEquals(8, resultList.size());
        Assert.assertEquals(4, scissorsList.size());
        Assert.assertEquals(4, lizardList.size());
    }

    @Test
    public void shouldReturn4RocksAnd4Spocks() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlVeryHard(SCISSORS);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(ROCK)||figure.getNameOfFigure().equals(SPOCK))
                .collect(Collectors.toList());
        List<Figure> rockList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(ROCK))
                .collect(Collectors.toList());
        List<Figure> spockList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SPOCK))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(11,figuresWithoutNullList.size());
        Assert.assertEquals(8, resultList.size());
        Assert.assertEquals(4, spockList.size());
        Assert.assertEquals(4, rockList.size());
    }

    @Test
    public void shouldReturn4RocksAnd4Scissors() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlVeryHard(LIZARD);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(ROCK)||figure.getNameOfFigure().equals(SCISSORS))
                .collect(Collectors.toList());
        List<Figure> rockList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(ROCK))
                .collect(Collectors.toList());
        List<Figure> scissorsList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SCISSORS))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(11,figuresWithoutNullList.size());
        Assert.assertEquals(8, resultList.size());
        Assert.assertEquals(4, scissorsList.size());
        Assert.assertEquals(4, rockList.size());
    }

    @Test
    public void shouldReturn4PaperAnd4Lizard() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlVeryHard(SPOCK);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(PAPER)||figure.getNameOfFigure().equals(LIZARD))
                .collect(Collectors.toList());
        List<Figure> paperList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(PAPER))
                .collect(Collectors.toList());
        List<Figure> lizardList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(LIZARD))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(11,figuresWithoutNullList.size());
        Assert.assertEquals(8, resultList.size());
        Assert.assertEquals(4, paperList.size());
        Assert.assertEquals(4, lizardList.size());
    }
    //tests of creating properly figures list for level hard
    @Test
    public void shouldReturn2PaperAnd2SpocksFromList() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlHard(ROCK);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(PAPER)||figure.getNameOfFigure().equals(SPOCK))
                .collect(Collectors.toList());
        List<Figure> paperList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(PAPER))
                .collect(Collectors.toList());
        List<Figure> spockList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SPOCK))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(7, figuresWithoutNullList.size());
        Assert.assertEquals(4, resultList.size());
        Assert.assertEquals(2, paperList.size());
        Assert.assertEquals(2, spockList.size());
    }

    @Test
    public void shouldReturn2ScissorsAnd2LizardsFromList() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlHard(PAPER);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SCISSORS)||figure.getNameOfFigure().equals(LIZARD))
                .collect(Collectors.toList());
        List<Figure> scissorsList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SCISSORS))
                .collect(Collectors.toList());
        List<Figure> lizardList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(LIZARD))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(7, figuresWithoutNullList.size());
        Assert.assertEquals(4, resultList.size());
        Assert.assertEquals(2, scissorsList.size());
        Assert.assertEquals(2, lizardList.size());
    }

    @Test
    public void shouldReturn2RocksAnd2SpocksFromList() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlHard(SCISSORS);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(ROCK)||figure.getNameOfFigure().equals(SPOCK))
                .collect(Collectors.toList());
        List<Figure> rockList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(ROCK))
                .collect(Collectors.toList());
        List<Figure> spockList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SPOCK))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(7, figuresWithoutNullList.size());
        Assert.assertEquals(4, resultList.size());
        Assert.assertEquals(2, rockList.size());
        Assert.assertEquals(2, spockList.size());
    }

    @Test
    public void shouldReturn2ScissorsAnd2RocksFromList() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlHard(LIZARD);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SCISSORS)||figure.getNameOfFigure().equals(ROCK))
                .collect(Collectors.toList());
        List<Figure> rockList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(ROCK))
                .collect(Collectors.toList());
        List<Figure> scissorsList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SCISSORS))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(7, figuresWithoutNullList.size());
        Assert.assertEquals(4, resultList.size());
        Assert.assertEquals(2, rockList.size());
        Assert.assertEquals(2, scissorsList.size());
    }

    @Test
    public void shouldReturn2PaperAnd2LizardsFromList() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlHard(SPOCK);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(PAPER)||figure.getNameOfFigure().equals(LIZARD))
                .collect(Collectors.toList());
        List<Figure> paperList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(PAPER))
                .collect(Collectors.toList());
        List<Figure> lizardList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(LIZARD))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(7, figuresWithoutNullList.size());
        Assert.assertEquals(4, resultList.size());
        Assert.assertEquals(2, paperList.size());
        Assert.assertEquals(2, lizardList.size());
    }

    //tests of creating properly figures list for level medium
    @Test
    public void shouldReturnFiveFigures() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlMedium();
        List<Figure> listQuantityOfFigures = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        Long rocksQuantity = listQuantityOfFigures.stream()
                .filter(i -> i.getNameOfFigure().equals(ROCK))
                .count();
        Long paperQuantity = listQuantityOfFigures.stream()
                .filter(i -> i.getNameOfFigure().equals(PAPER))
                .count();
        Long scissorsQuantity = listQuantityOfFigures.stream()
                .filter(i -> i.getNameOfFigure().equals(SCISSORS))
                .count();
        Long lizardsQuantity = listQuantityOfFigures.stream()
                .filter(i -> i.getNameOfFigure().equals(LIZARD))
                .count();
        Long spocksQuantity = listQuantityOfFigures.stream()
                .filter(i -> i.getNameOfFigure().equals(SPOCK))
                .count();
        //then
        Assert.assertEquals(5, listQuantityOfFigures.size());
        Assert.assertEquals(1, rocksQuantity.longValue());
        Assert.assertEquals(1, paperQuantity.longValue());
        Assert.assertEquals(1, scissorsQuantity.longValue());
        Assert.assertEquals(1, lizardsQuantity.longValue());
        Assert.assertEquals(1, spocksQuantity.longValue());
    }

    @Test
    public void shouldReturnNullFromList() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlMedium();
        //then
        Assert.assertEquals(null, figuresList.get(0));
    }

    //tests of creating properly figures list for level easy
    @Test
    public void shouldReturn2PaperAnd2SpocksFromListLvlEasy() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlEasy(LIZARD);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(PAPER)||figure.getNameOfFigure().equals(SPOCK))
                .collect(Collectors.toList());
        List<Figure> paperList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(PAPER))
                .collect(Collectors.toList());
        List<Figure> spockList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SPOCK))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(7, figuresWithoutNullList.size());
        Assert.assertEquals(4, resultList.size());
        Assert.assertEquals(2, paperList.size());
        Assert.assertEquals(2, spockList.size());
    }

    @Test
    public void shouldReturn2ScissorsAnd2LizardsFromListLvlEasy() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlEasy(ROCK);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SCISSORS)||figure.getNameOfFigure().equals(LIZARD))
                .collect(Collectors.toList());
        List<Figure> scissorsList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SCISSORS))
                .collect(Collectors.toList());
        List<Figure> lizardList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(LIZARD))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(7, figuresWithoutNullList.size());
        Assert.assertEquals(4, resultList.size());
        Assert.assertEquals(2, scissorsList.size());
        Assert.assertEquals(2, lizardList.size());
    }

    @Test
    public void shouldReturn2RocksAnd2SpocksFromListLvlEasy() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlEasy(PAPER);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(ROCK)||figure.getNameOfFigure().equals(SPOCK))
                .collect(Collectors.toList());
        List<Figure> rockList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(ROCK))
                .collect(Collectors.toList());
        List<Figure> spockList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SPOCK))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(7, figuresWithoutNullList.size());
        Assert.assertEquals(4, resultList.size());
        Assert.assertEquals(2, rockList.size());
        Assert.assertEquals(2, spockList.size());
    }

    @Test
    public void shouldReturn2ScissorsAnd2RocksFromListLvlEasy() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlEasy(SPOCK);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SCISSORS)||figure.getNameOfFigure().equals(ROCK))
                .collect(Collectors.toList());
        List<Figure> rockList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(ROCK))
                .collect(Collectors.toList());
        List<Figure> scissorsList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SCISSORS))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(7, figuresWithoutNullList.size());
        Assert.assertEquals(4, resultList.size());
        Assert.assertEquals(2, rockList.size());
        Assert.assertEquals(2, scissorsList.size());
    }

    @Test
    public void shouldReturn2PaperAnd2LizardsFromListLvlEasy() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlEasy(SCISSORS);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(PAPER)||figure.getNameOfFigure().equals(LIZARD))
                .collect(Collectors.toList());
        List<Figure> paperList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(PAPER))
                .collect(Collectors.toList());
        List<Figure> lizardList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(LIZARD))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(7, figuresWithoutNullList.size());
        Assert.assertEquals(4, resultList.size());
        Assert.assertEquals(2, paperList.size());
        Assert.assertEquals(2, lizardList.size());
    }

    //tests of creating properly figures list for level newbie
    @Test
    public void shouldReturn4PaperAnd4SpockFromListLvlNewbie() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlNewbie(LIZARD);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(PAPER)||figure.getNameOfFigure().equals(SPOCK))
                .collect(Collectors.toList());
        List<Figure> paperList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(PAPER))
                .collect(Collectors.toList());
        List<Figure> spockList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SPOCK))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(11,figuresWithoutNullList.size());
        Assert.assertEquals(8, resultList.size());
        Assert.assertEquals(4, paperList.size());
        Assert.assertEquals(4, spockList.size());
    }

    @Test
    public void shouldReturn4ScissorsAnd4LizardFromListLvlNewbie() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlNewbie(ROCK);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SCISSORS)||figure.getNameOfFigure().equals(LIZARD))
                .collect(Collectors.toList());
        List<Figure> scissorsList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SCISSORS))
                .collect(Collectors.toList());
        List<Figure> lizardList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(LIZARD))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(11,figuresWithoutNullList.size());
        Assert.assertEquals(8, resultList.size());
        Assert.assertEquals(4, scissorsList.size());
        Assert.assertEquals(4, lizardList.size());
    }

    @Test
    public void shouldReturn4RocksAnd4SpocksFromListLvlNewbie() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlNewbie(PAPER);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(ROCK)||figure.getNameOfFigure().equals(SPOCK))
                .collect(Collectors.toList());
        List<Figure> rockList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(ROCK))
                .collect(Collectors.toList());
        List<Figure> spockList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SPOCK))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(11,figuresWithoutNullList.size());
        Assert.assertEquals(8, resultList.size());
        Assert.assertEquals(4, spockList.size());
        Assert.assertEquals(4, rockList.size());
    }

    @Test
    public void shouldReturn4RocksAnd4ScissorsFromListLvlNewbie() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlVeryHard(LIZARD);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(ROCK)||figure.getNameOfFigure().equals(SCISSORS))
                .collect(Collectors.toList());
        List<Figure> rockList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(ROCK))
                .collect(Collectors.toList());
        List<Figure> scissorsList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(SCISSORS))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(11,figuresWithoutNullList.size());
        Assert.assertEquals(8, resultList.size());
        Assert.assertEquals(4, scissorsList.size());
        Assert.assertEquals(4, rockList.size());
    }

    @Test
    public void shouldReturn4PaperAnd4LizardFromListLvlNewbie() {
        //given
        ComputerPlayerProcess processTests = new ComputerPlayerProcess();
        List<Figure> figuresList;
        //when
        figuresList = processTests.getFiguresListLvlNewbie(SCISSORS);
        List<Figure> figuresWithoutNullList = figuresList.stream()
                .filter(figure -> figure!=null)
                .collect(Collectors.toList());
        List<Figure> resultList = figuresWithoutNullList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(PAPER)||figure.getNameOfFigure().equals(LIZARD))
                .collect(Collectors.toList());
        List<Figure> paperList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(PAPER))
                .collect(Collectors.toList());
        List<Figure> lizardList = resultList.stream()
                .filter(figure -> figure.getNameOfFigure().equals(LIZARD))
                .collect(Collectors.toList());
        //then
        Assert.assertEquals(11,figuresWithoutNullList.size());
        Assert.assertEquals(8, resultList.size());
        Assert.assertEquals(4, paperList.size());
        Assert.assertEquals(4, lizardList.size());
    }

}
