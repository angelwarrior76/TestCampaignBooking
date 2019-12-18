package com.homework.hsqldb.spring.main;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import org.springframework.context.annotation.Configuration;

import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * Created by Alex on 04.05.2018.
 */
@Configuration
@EnableJpaRepositories("com.homework.hsqldb.spring.repository")
@EntityScan("com.homework.hsqldb.spring.model")
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class }, scanBasePackages = {"com.homework.hsqldb.spring"})
public class TestCampaignBookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestCampaignBookingApplication.class, args);
    }

}
