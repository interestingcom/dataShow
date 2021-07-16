package com.data.util;

import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MyTest {

    @Test
    public void test1(){

        Integer tempK=new EEGtoInt().BOW_TYPE.get("α波");
         int k=tempK.intValue();
        System.out.println(k);

    }
}
