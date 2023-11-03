package com.enduser.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration
public class kafkaConsumerConfig {


    @KafkaListener(topics=AppConstants.LOCATION_UPDATE, groupId =AppConstants.GROUP_ID )
    public void updatedLocation(String value){
    System.out.println(value);
    }


}
