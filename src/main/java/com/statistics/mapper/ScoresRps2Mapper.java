package com.statistics.mapper;

import com.statistics.domain.ScoresRps2;
import com.statistics.dto.ScoresRps2Dto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public final class ScoresRps2Mapper {

    public ScoresRps2 mapToScores(ScoresRps2Dto scoresRps2Dto) {
        return new ScoresRps2(
                scoresRps2Dto.getGame_id(),
                scoresRps2Dto.getPlayerName(),
                scoresRps2Dto.getGameLevel(),
                scoresRps2Dto.getResult(),
                scoresRps2Dto.getWinningRounds(),
                scoresRps2Dto.getLosingRounds()
        );
    }

    public ScoresRps2Dto mapToScores(ScoresRps2 scoresRps2) {
        return new ScoresRps2Dto(
                scoresRps2.getGame_id(),
                scoresRps2.getPlayerName(),
                scoresRps2.getGameLevel(),
                scoresRps2.getResult(),
                scoresRps2.getWinningRounds(),
                scoresRps2.getLosingRounds()
        );
    }

    public List<ScoresRps2Dto> mapToListScoresDto (List<ScoresRps2> scoresRps2List) {
        return scoresRps2List.stream()
                .map(score -> new ScoresRps2Dto(
                        score.getGame_id(),
                        score.getPlayerName(),
                        score.getGameLevel(),
                        score.getResult(),
                        score.getWinningRounds(),
                        score.getLosingRounds()
                ))
                .collect(Collectors.toList());
    }

    public List<ScoresRps2> mapToListScores (List<ScoresRps2Dto> scoresRps2DtoList) {
        return scoresRps2DtoList.stream()
                .map(score -> new ScoresRps2(
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

