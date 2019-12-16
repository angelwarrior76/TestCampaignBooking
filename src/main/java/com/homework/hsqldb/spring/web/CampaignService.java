package com.homework.hsqldb.spring.web;

import com.homework.hsqldb.spring.model.Campaign;

import java.util.Optional;

/**
 * Created by Alex on 24.04.2018.
 */
public interface CampaignService {

    Campaign createCampaign(Campaign campaign);

    void deleteCampaign(int id);

    Optional<Campaign> getCampaignById(int id);

    Campaign updateCampaign(int id, Campaign campaign);

}
