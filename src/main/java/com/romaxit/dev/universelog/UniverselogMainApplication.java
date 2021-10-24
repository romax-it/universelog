package com.romaxit.dev.universelog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories
public class UniverselogMainApplication {

    public static void main(String[] args) {
        SpringApplication.run(UniverselogMainApplication.class, args);
    }

}