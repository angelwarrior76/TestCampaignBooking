package com.homework.hsqldb.spring.web;

import com.homework.hsqldb.spring.model.Campaign;
import com.homework.hsqldb.spring.model.CampaignData;

/**
 * Created by Alex on 24.04.2018.
 */
public interface SummaryService {

    Iterable<Campaign> listCampaigns(CampaignData data);

}
