package com.exmonitor.postdata.service;

import com.exmonitor.postdata.dao.EngineIntervalDataEntity;
import com.exmonitor.postdata.model.EngineIntervalData;
import com.exmonitor.postdata.repository.EngineIntervalRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PostDataService {

    @Autowired
    EngineIntervalRepository repository;

    public String sendData(EngineIntervalData intervalData) {
        //do something and save data
        EngineIntervalDataEntity e = intervalData.toEntity();
        Object s = this.repository.save(e);
        ((EngineIntervalDataEntity) s).getEngineId();
        return "OK";
    }

}
