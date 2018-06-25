package com.statistics.mapper;

import com.statistics.domain.Scores;
import com.statistics.dto.ScoresDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class ScoresMapper {

    public Scores mapToScores(ScoresDto scoresDto) {
        return new Scores(
                scoresDto.getGame_id(),
                scoresDto.getPlayerName(),
                scoresDto.getGameLevel(),
                scoresDto.getResult(),
                scoresDto.getWinningRounds(),
                scoresDto.getLosingRounds()
        );
    }

    public ScoresDto mapToScores(Scores scores) {
        return new ScoresDto(
                scores.getGame_id(),
                scores.getPlayerName(),
                scores.getGameLevel(),
                scores.getResult(),
                scores.getWinningRounds(),
                scores.getLosingRounds()
        );
    }

    public List<ScoresDto> mapToListScoresDto (List<Scores> scoresList) {
        return scoresList.stream()
                .map(score -> new ScoresDto(
                        score.getGame_id(),
                        score.getPlayerName(),
                        score.getGameLevel(),
                        score.getResult(),
                        score.getWinningRounds(),
                        score.getLosingRounds()
                ))
                .collect(Collectors.toList());
    }

    public List<Scores> mapToListScores (List<ScoresDto> scoresDtoList) {
        return scoresDtoList.stream()
                .map(score -> new Scores(
                        score.getGame_id(),
                        score.getPlayerName(),
                        score.getGameLevel(),
                        score.getResult(),
                        score.getWinningRounds(),
                        score.getLosingRounds()
                ))
                .collect(Collectors.toList());
    }

}
