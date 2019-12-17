package com.homework.hsqldb.spring.web;

import com.homework.hsqldb.spring.model.Campaign;
import com.homework.hsqldb.spring.model.CampaignData;

import com.homework.hsqldb.spring.repository.CampaignsRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;

import org.springframework.stereotype.Service;

/**
 * Created by Alex on 24.04.2018.
 */
@Service
public class SummaryServiceImpl implements SummaryService {

    @Autowired
    private CampaignsRepository repository;

    @Override
    public Iterable<Campaign> listCampaigns(CampaignData data) {
        Pageable page = PageRequest.of(data.getPageNumber(),data.getPageSize(), data.getDirection(), "name", "count_ads", "status");
        return repository.findCampainsByNameAndStatus(data.getName(), data.getStatus().getCode(), page);
    }

}
