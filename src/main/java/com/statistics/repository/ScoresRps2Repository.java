package com.statistics.repository;

import com.statistics.domain.ScoresRps2;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface ScoresRps2Repository extends CrudRepository<ScoresRps2, Long> {

    @Override
    <S extends ScoresRps2> S save(S entity);

    @Override
    Optional<ScoresRps2> findById(Long aLong);

    @Override
    List<ScoresRps2> findAll();

    @Override
    long count();

    @Override
    void deleteById(Long aLong);
}
