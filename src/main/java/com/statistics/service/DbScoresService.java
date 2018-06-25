package com.statistics.service;

import com.statistics.domain.Scores;
import com.statistics.repository.ScoresReposiory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DbScoresService {

    @Autowired
    private ScoresReposiory reposiory;

    public List<Scores> findAll() {
        return reposiory.findAll();
    }

    public long count() {
        return reposiory.count();
    }

}
