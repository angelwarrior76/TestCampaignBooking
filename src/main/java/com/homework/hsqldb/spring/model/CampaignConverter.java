package com.homework.hsqldb.spring.model;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

@Converter
public class CampaignConverter implements AttributeConverter<Campaign, Integer> {


    @Override
    public Integer convertToDatabaseColumn(Campaign campaign) {
        return campaign.getCampaignId();
    }

    @Override
    public Campaign convertToEntityAttribute(Integer id) {
        return new Campaign(id);
    }
}
