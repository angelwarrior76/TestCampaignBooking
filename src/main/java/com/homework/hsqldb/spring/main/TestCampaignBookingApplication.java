package com.homework.hsqldb.spring.main;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

import org.springframework.context.annotation.Configuration;

/**
 * Created by Alex on 04.05.2018.
 */
@Configuration
@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class TestCampaignBookingApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestCampaignBookingApplication.class, args);
    }

}
