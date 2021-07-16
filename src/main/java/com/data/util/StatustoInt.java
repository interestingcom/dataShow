package com.data.util;

import java.util.HashMap;
import java.util.Map;

public class StatustoInt {

    public static Map<String,Integer> STATUS_TYPES = new HashMap<String,Integer>(){{
        put("情绪", 1);
        put("姿态", 2);
        put("学习行为", 3);
    }};
}
