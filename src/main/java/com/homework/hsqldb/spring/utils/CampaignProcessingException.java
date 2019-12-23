package com.homework.hsqldb.spring.utils;

import com.fasterxml.jackson.core.JsonLocation;
import com.fasterxml.jackson.core.JsonProcessingException;

public class CampaignProcessingException extends JsonProcessingException {

    public CampaignProcessingException(Throwable rootCause) {
        this((String)null, (JsonLocation)null, rootCause);
    }

    public CampaignProcessingException(String msg, JsonLocation loc, Throwable rootCause) {
        super(msg, loc, rootCause);
    }

}
