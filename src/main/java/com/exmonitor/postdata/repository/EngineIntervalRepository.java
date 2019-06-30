package com.exmonitor.postdata.repository;

import com.exmonitor.postdata.dao.EngineIntervalDataEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EngineIntervalRepository extends CrudRepository<EngineIntervalDataEntity, Integer> {

}
