package com.statistics.mapper;

import com.statistics.domain.ScoresRps;
import com.statistics.dto.ScoresRpsDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public final class ScoresRpsMapper {

    public ScoresRps mapToScores(ScoresRpsDto scoresRpsDto) {
        return new ScoresRps(
                scoresRpsDto.getGame_id(),
                scoresRpsDto.getPlayerName(),
                scoresRpsDto.getGameLevel(),
                scoresRpsDto.getResult(),
                scoresRpsDto.getWinningRounds(),
                scoresRpsDto.getLosingRounds()
        );
    }

    public ScoresRpsDto mapToScores(ScoresRps scoresRps) {
        return new ScoresRpsDto(
                scoresRps.getGame_id(),
                scoresRps.getPlayerName(),
                scoresRps.getGameLevel(),
                scoresRps.getResult(),
                scoresRps.getWinningRounds(),
                scoresRps.getLosingRounds()
        );
    }

    public List<ScoresRpsDto> mapToListScoresDto (List<ScoresRps> scoresRpsList) {
        return scoresRpsList.stream()
                .map(score -> new ScoresRpsDto(
                        score.getGame_id(),
                        score.getPlayerName(),
                        score.getGameLevel(),
                        score.getResult(),
                        score.getWinningRounds(),
                        score.getLosingRounds()
                ))
                .collect(Collectors.toList());
    }

    public List<ScoresRps> mapToListScores (List<ScoresRpsDto> scoresRpsDtoList) {
        return scoresRpsDtoList.stream()
                .map(score -> new ScoresRps(
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
