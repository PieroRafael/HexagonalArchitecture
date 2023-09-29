package com.hexagonalarchitecture.post.infraestructure.outbound.external;

import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FeignClientConfig {

    @Bean
    Logger.Level feignLoggerLevel(){
        return  Logger.Level.FULL;
    }

}
