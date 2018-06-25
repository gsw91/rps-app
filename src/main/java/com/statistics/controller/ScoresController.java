package com.statistics.controller;

import com.statistics.domain.Scores;
import com.statistics.service.DbScoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/rps/")
@RestController
@CrossOrigin(origins = "*")
public class ScoresController {

    @Autowired
    private DbScoresService service;

    @RequestMapping(method = RequestMethod.GET, value = "scores")
    public List<Scores> showAllScores() {
        return service.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "count")
    public Long countGames() {
        return service.count();
    }

}
