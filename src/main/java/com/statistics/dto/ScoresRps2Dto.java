package com.statistics.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public class ScoresRps2Dto {
    private Long game_id;
    private String playerName;
    private String gameLevel;
    private String result;
    private Long winningRounds;
    private Long losingRounds;
}
