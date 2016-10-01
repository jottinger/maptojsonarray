package com.autumncode;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;

public class ModelTest {
    @Test
    public void testSerializer() throws JsonProcessingException {
        Model model = new Model();
        model.data.put("a", 3);
        model.data.put("c", 4);
        ObjectMapper mapper = new ObjectMapper();
        System.out.println(mapper.writeValueAsString(model));
    }
}
