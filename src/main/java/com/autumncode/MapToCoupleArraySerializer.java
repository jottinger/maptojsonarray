package com.autumncode;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.SerializerProvider;

import java.io.IOException;
import java.util.Map;

public class MapToCoupleArraySerializer extends JsonSerializer<Map<?, ?>> {

    @Override
    public void serialize(Map<?, ?> value, JsonGenerator generator,
                          SerializerProvider serializers) throws IOException,
            JsonProcessingException {
        generator.writeStartArray();
        for (Map.Entry<?, ?> entry : value.entrySet()){
            generator.writeStartObject();
            generator.writeObjectField("key", entry.getKey());
            generator.writeObjectField("value", entry.getValue());
            generator.writeEndObject();
        }
        generator.writeEndArray();
    }
}