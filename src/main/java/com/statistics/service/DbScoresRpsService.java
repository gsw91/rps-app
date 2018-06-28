package com.statistics.service;

import com.statistics.Exception.NoSuchScoreIDException;
import com.statistics.domain.ScoresRps;
import com.statistics.repository.ScoresRpsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public final class DbScoresRpsService {

    @Autowired
    private ScoresRpsRepository repository;

    public List<ScoresRps> findAll() {
        return repository.findAll();
    }

    public long count() {
        return repository.count();
    }

    public ScoresRps save(ScoresRps score) {
        return repository.save(score);
    }

    public void delete(Long id) throws NoSuchScoreIDException {
        if(repository.findById(id).isPresent()) {
            repository.deleteById(id);
        } else {
            throw new NoSuchScoreIDException(NoSuchScoreIDException.message());
        }
    }

    public Optional<ScoresRps> findById(Long id) throws NoSuchScoreIDException {
        if(repository.findById(id).isPresent()) {
            return repository.findById(id);
        } else {
            throw new NoSuchScoreIDException(NoSuchScoreIDException.message());
        }
    }

}
