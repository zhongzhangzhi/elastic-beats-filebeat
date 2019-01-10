package com.example.elasticbeatsfilebeat;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ElasticBeatsFilebeatApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElasticBeatsFilebeatApplication.class, args);
    }

    public static final Logger logger = LoggerFactory.getLogger(ElasticBeatsFilebeatApplication.class);

    @RequestMapping("/t/info")
    public void info() {
        logger.info("-----------------------------a-----------a-a-a-a-a-");
    }

    @RequestMapping("/t/debug")
    public void debug() {
        logger.debug("-----------------------------a-----------a-a-a-a-a-");
    }

    @RequestMapping("/t/error")
    public void error() {
        logger.error("-----------------------------a-----------a-a-a-a-a-");
    }
}