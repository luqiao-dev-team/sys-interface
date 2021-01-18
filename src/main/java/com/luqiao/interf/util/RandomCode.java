package com.luqiao.interf.util;

import java.util.UUID;

public class RandomCode {

    public static String getRandomCode(){
        //生成唯一id
        String id= UUID.randomUUID().toString();
        //替换uuid中的"-"
        id=id.replace("-", "");
        System.out.println(id);
        return id;
    }
}
