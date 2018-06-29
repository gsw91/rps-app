package com.statistics.domain;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity(name = "RPS_SCORES")
public class ScoresRps {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long game_id;
    @Column(name = "PLAYER_NAME")
    private String playerName;
    @Column(name = "GAME_LEVEL")
    private String gameLevel;
    @Column(name = "RESULT")
    private String result;
    @Column(name = "ROUNDS_WINNING")
    private Long winningRounds;
    @Column(name = "ROUNDS_LOSING")
    private Long losingRounds;

    public ScoresRps(String playerName, String gameLevel, String result, Long winningRounds, Long losingRounds) {
        this.playerName = playerName;
        this.gameLevel = gameLevel;
        this.result = result;
        this.winningRounds = winningRounds;
        this.losingRounds = losingRounds;
    }

}
