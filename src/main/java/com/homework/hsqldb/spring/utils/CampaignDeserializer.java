package com.homework.hsqldb.spring.utils;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonProcessingException;

import com.fasterxml.jackson.databind.DeserializationContext;
import com.fasterxml.jackson.databind.JsonNode;

import com.fasterxml.jackson.databind.deser.std.StdDeserializer;

import com.homework.hsqldb.spring.model.Campaign;

import java.io.IOException;

public class CampaignDeserializer extends StdDeserializer<Campaign> {

    private static final long serialVersionUID = 6422963439518410312L;

    public CampaignDeserializer() {
        this(null);
    }

    public CampaignDeserializer(Class<?> vc) {
        super(vc);
    }

    @Override
    public Campaign deserialize(JsonParser jp, DeserializationContext context) throws IOException, JsonProcessingException {
        try {
            JsonNode node = jp.getCodec().readTree(jp);
            return new Campaign(node.asInt(-1));
        } catch (Exception e) {
            throw new CampaignProcessingException(e);
        }
    }

}
