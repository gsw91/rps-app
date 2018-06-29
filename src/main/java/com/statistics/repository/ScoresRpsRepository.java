package com.statistics.repository;

import com.statistics.domain.ScoresRps;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

public interface ScoresRpsRepository extends CrudRepository <ScoresRps, Long> {

    @Override
    <S extends ScoresRps> S save(S entity);

    @Override
    Optional<ScoresRps> findById(Long id);

    @Override
    List<ScoresRps> findAll();

    @Override
    long count();

    @Override
    void deleteById(Long id);

}
