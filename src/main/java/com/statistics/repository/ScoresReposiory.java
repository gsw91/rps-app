package com.statistics.repository;

import com.statistics.domain.Scores;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ScoresReposiory extends CrudRepository <Scores, Long> {

    @Override
    Scores save(Scores score);

    @Override
    Optional<Scores> findById(Long id);

    @Override
    List<Scores> findAll();

    @Override
    long count();

    @Override
    void deleteById(Long id);

}
