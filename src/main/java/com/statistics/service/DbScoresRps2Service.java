package com.statistics.service;

import com.statistics.exception.NoSuchScoreIDException;
import com.statistics.domain.ScoresRps2;
import com.statistics.repository.ScoresRps2Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public final class DbScoresRps2Service {

    @Autowired
    private ScoresRps2Repository repository;

    public List<ScoresRps2> findAll() {
        return repository.findAll();
    }

    public long count() {
        return repository.count();
    }

    public ScoresRps2 save(ScoresRps2 score) {
        return repository.save(score);
    }

    public void delete(Long id) throws NoSuchScoreIDException {
        if(repository.findById(id).isPresent()) {
            repository.deleteById(id);
        } else {
            throw new NoSuchScoreIDException(NoSuchScoreIDException.message());
        }
    }

    public Optional<ScoresRps2> findById(Long id) throws NoSuchScoreIDException {
        if(repository.findById(id).isPresent()) {
            return repository.findById(id);
        } else {
            throw new NoSuchScoreIDException(NoSuchScoreIDException.message());
        }
    }

}
