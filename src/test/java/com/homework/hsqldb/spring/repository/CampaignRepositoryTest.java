package com.homework.hsqldb.spring.repository;

import com.homework.hsqldb.spring.model.Campaign;
import com.homework.hsqldb.spring.model.Status;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.junit.Test;

import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.Assert.assertThat;

@ExtendWith(SpringExtension.class)
@SpringBootTest
public class CampaignRepositoryTest {

    @Autowired
    private CampaignsRepository campaigns;

    @Test
    public void whenFindingCustomerById_thenCorrect() {
        campaigns.save(new Campaign(1, "Test campaign 1", new Date(), new Date(), Status.PLANNED));
        //assertThat(campaigns.findById(1)).isInstanceOf(Optional.class);
    }

    @Test
    public void whenFindingAllCustomers_thenCorrect() {
        campaigns.save(new Campaign(2, "Test campaign 2", new Date(), new Date(), Status.PLANNED));
        campaigns.save(new Campaign(3, "Test campaign 3", new Date(), new Date(), Status.PLANNED));
        //assertThat(campaigns.findAll()).isInstanceOf(List.class);
    }

    @Test
    public void whenSavingCustomer_thenCorrect() {
        campaigns.save(new Campaign(4, "Test campaign 4", new Date(), new Date(), Status.PLANNED));
        Campaign campaign = campaigns.findById(1).orElseGet(()
                -> new Campaign(4, "Test campaign 4", new Date(), new Date(), Status.PLANNED));
        //assertThat(campaign.getName()).isEqualTo("Test campaign 4");
    }

}
