/*
 * Copyright (c) 2021 iChochy
 * URL:https://ichochy.com
 * Date:2021/06/25 09:07:25
 */

package com.ichochy.example.restful;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RequsetService {

    @Bean
    public RestTemplate restTemplate(RestTemplateBuilder builder) {
        return builder.build();
    }

    @Bean
    public ObjectMapper mapper() {
        return new ObjectMapper();
    }

    @Bean
    public CommandLineRunner run(RestTemplate restTemplate,ObjectMapper mapper) throws Exception {
        return args -> {
            Greeting object = restTemplate.getForObject(
                    "http://localhost:8080/greeting", Greeting.class);
            System.out.println(mapper.writeValueAsString(object));
        };
    }

}
