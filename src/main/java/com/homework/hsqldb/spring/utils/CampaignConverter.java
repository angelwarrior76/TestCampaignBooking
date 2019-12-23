package com.homework.hsqldb.spring.utils;

import com.homework.hsqldb.spring.model.Campaign;

import org.springframework.core.convert.converter.Converter;

import org.springframework.stereotype.Component;

@Component
public class CampaignConverter implements Converter<Integer, Campaign> {

    @Override
    public Campaign convert(Integer value) {
        return new Campaign(value);
    }

}
