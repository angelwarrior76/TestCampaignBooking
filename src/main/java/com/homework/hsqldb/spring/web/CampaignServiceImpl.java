package com.homework.hsqldb.spring.web;

import com.homework.hsqldb.spring.model.Campaign;

import com.homework.hsqldb.spring.repository.CampaignsRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

/**
 * Created by Alex on 24.04.2018.
 */
@Service
public class CampaignServiceImpl implements CampaignService {

    @Autowired
    private CampaignsRepository campaigns;


    @Override
    public Campaign createCampaign(Campaign campaign) {
        return campaigns.save(campaign);
    }

    @Override
    public void deleteCampaign(int id) {
        campaigns.deleteById(id);
    }

    @Override
    public Optional<Campaign> getCampaignById(int id) {
        return campaigns.findById(id);
    }

    @Override
    public Campaign updateCampaign(int id, Campaign campaign) {
        return campaigns.save(new Campaign(id, campaign.getName(), campaign.getStartDate(), campaign.getFinishDate(), campaign.getStatus()));
    }

}
