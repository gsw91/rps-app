package com.statistics.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Entity(name = "scores")
public class Scores {

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

}
