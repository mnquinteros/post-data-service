package com.exmonitor.postdata.controller;

import com.exmonitor.postdata.dto.PostDataResponse;
import com.exmonitor.postdata.model.EngineIntervalData;
import com.exmonitor.postdata.service.PostDataService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("postdata")
public class EngineDataController {

    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @Autowired
    private PostDataService postDataService;

    @PostMapping(path= "/", consumes = "application/json", produces = "application/json")
    public PostDataResponse post(@RequestHeader(name = "X-COM-PERSIST", required = false) String headerPersist,
                                 @RequestHeader(name = "X-COM-LOCATION", defaultValue = "AR") String headerLocation,
                                 @RequestBody EngineIntervalData intData) {
        PostDataResponse result = new PostDataResponse();
        try {
            result.setStatus(postDataService.sendData(intData));
            logger.info("Posted data successfully");

        } catch (Exception e) {
            result.setStatus("ERROR");
            result.setMessage("Exception catched when sending interval data for engine "
                    + intData.getEngineId() + ". " + e.getMessage());
            logger.error("Error posting data: ", e.getMessage());
        }
        return result;
    }
}
