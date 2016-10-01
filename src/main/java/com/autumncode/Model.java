package com.autumncode;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

public class Model implements Serializable {
    @JsonSerialize(using=MapToCoupleArraySerializer.class)
    Map<String, Integer> data=new HashMap<>();
}
