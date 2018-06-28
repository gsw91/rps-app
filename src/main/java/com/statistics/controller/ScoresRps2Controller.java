package com.statistics.controller;

import com.statistics.Exception.NoSuchScoreIDException;
import com.statistics.domain.ScoresRps2;
import com.statistics.service.DbScoresRps2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RequestMapping("/rps2/")
@RestController
@CrossOrigin(origins = "*")
public class ScoresRps2Controller {

    @Autowired
    private DbScoresRps2Service service;

    @RequestMapping(method = RequestMethod.PUT, value = "updateName")
    public String updatePlayerName(@RequestParam Long id) {
        try {
            Optional<ScoresRps2> scoreOptional = service.findById(id);
            ScoresRps2 scoresRps = scoreOptional.get();
            scoresRps.setPlayerName("ulgy name disabled (admin)");
            service.save(scoresRps);
            return "Done!";
        } catch (NoSuchScoreIDException e) {
            System.out.println(e.getMessage());
            return e.getMessage();
        }
    }

    @RequestMapping(method = RequestMethod.GET, value = "scores")
    public List<ScoresRps2> showAllScores() {
        return service.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "count")
    public Long countGames() {
        return service.count();
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "delete")
    public String deleteScore(@RequestParam Long id) {
        try {
            service.delete(id);
            return "Done!";
        } catch (NoSuchScoreIDException e) {
            System.out.println(e.getMessage());
            return e.getMessage();
        }
    }

}
