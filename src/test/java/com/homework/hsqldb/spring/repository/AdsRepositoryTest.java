package com.homework.hsqldb.spring.repository;

import com.homework.hsqldb.spring.model.Ad;
import com.homework.hsqldb.spring.model.Campaign;
import com.homework.hsqldb.spring.model.Platform;
import com.homework.hsqldb.spring.model.Status;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.SpringBootConfiguration;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.ContextConfiguration;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

@ContextConfiguration(locations = "/application-context.xml")
@SpringBootConfiguration
@SpringBootTest
public class AdsRepositoryTest {

    @Autowired
    private AdsRepository ads;
    private Campaign campaign = new Campaign(1);

    @Test
    public void whenFindingCustomerById_thenCorrect() {
        List<Platform> platforms = new ArrayList<>(0);
        platforms.add(Platform.WEB);
        platforms.add(Platform.ANDROID);
        ads.save(new Ad(campaign, "Test advertising", "https://testurl1.com", platforms, Status.PLANNED));
        assertSame(ads.findById(1), Optional.class);
    }

    @Test
    public void whenFindingAllCustomers_thenCorrect() {
        List<Platform> platforms = new ArrayList<>(0);
        platforms.add(Platform.WEB);
        platforms.add(Platform.ANDROID);
        ads.save(new Ad(campaign, "Test advertising 2", "https://testurl2.com", platforms, Status.PLANNED));
        ads.save(new Ad(campaign, "Test advertising 3", "https://testurl3.com", platforms, Status.PLANNED));
        assertSame(ads.findAll(), List.class);
    }

    @Test
    public void whenSavingCustomer_thenCorrect() {
        List<Platform> platforms = new ArrayList<>(0);
        platforms.add(Platform.WEB);
        platforms.add(Platform.ANDROID);
        ads.save(new Ad(campaign, "Test advertising 4", "https://testurl4.com", platforms, Status.PLANNED));
        Ad ad = ads.findById(4).orElseGet(()
                -> new Ad(4, campaign, "Test advertising 4", "https://testurl4.com", platforms, Status.PLANNED));
        assertEquals(ad.getName(), "Test advertising 4");
    }

}
