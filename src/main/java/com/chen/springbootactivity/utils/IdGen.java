package com.chen.springbootactivity.utils;

import java.util.UUID;

/**
 * @ClassName IdGen
 * @Description: uuid生成器
 * @Author chenGJ
 * @Date 2019/12/4 15:57
 * @Version V1.0
**/
public class IdGen {
    public static String uuid(){
        return UUID.randomUUID().toString().replace("-","");
    }
}
