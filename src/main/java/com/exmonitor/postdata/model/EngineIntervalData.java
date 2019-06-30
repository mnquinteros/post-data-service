package com.exmonitor.postdata.model;

import com.exmonitor.postdata.dao.EngineIntervalDataEntity;

import java.util.Date;

public class EngineIntervalData {

    private Long engineId;
    private Long id;
    private Date timestamp;
    private Double value0;
    private Double value1;
    private Double value2;

    public Long getEngineId() {
        return engineId;
    }

    public void setEngineId(Long engineId) {
        this.engineId = engineId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getValue0() {
        return value0;
    }

    public void setValue0(Double value0) {
        this.value0 = value0;
    }

    public Double getValue1() {
        return value1;
    }

    public void setValue1(Double value1) {
        this.value1 = value1;
    }

    public Double getValue2() {
        return value2;
    }

    public void setValue2(Double value2) {
        this.value2 = value2;
    }

    public Date getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Date timestamp) {
        this.timestamp = timestamp;
    }

    public EngineIntervalDataEntity toEntity() {
        EngineIntervalDataEntity e = new EngineIntervalDataEntity();
        e.setId(this.id);
        e.setEngineId(this.engineId);
        e.setTimestamp(this.timestamp);
        e.setValue0(this.value0);
        e.setValue1(this.value1);
        e.setValue2(this.value2);
        return e;
    }

}
