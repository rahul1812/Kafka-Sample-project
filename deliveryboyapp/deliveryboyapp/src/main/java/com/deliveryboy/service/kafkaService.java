package com.deliveryboy.service;


import com.deliveryboy.config.AppConstants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service

public class kafkaService {

    @Autowired
    private KafkaTemplate<String,String> kafkaTemplate;

    private Logger logger= LoggerFactory.getLogger(kafkaService.class);

    public boolean updateLocation(String location){

            this.kafkaTemplate.send(AppConstants.LOCATION_TOPIC_NAME, location);
            this.logger.info("Location produced");

        return true;
    }
}
