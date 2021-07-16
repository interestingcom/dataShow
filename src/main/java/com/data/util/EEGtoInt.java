package com.data.util;

import java.util.HashMap;
import java.util.Map;

public class EEGtoInt {
    public static Map<String,Integer> BOW_TYPE = new HashMap<String,Integer>(){{
        put("α波", 1);
        put("β波", 2);
        put("γ波", 3);
    }};

}
