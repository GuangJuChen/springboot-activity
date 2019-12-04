package com.chen.springbootactivity.utils;

import org.activiti.engine.impl.cfg.IdGenerator;

import java.util.UUID;

/**
 * @ClassName idGenerator
 * @Description: 生成activity uuid
 * @Author chenGJ
 * @Date 2019/12/4 15:59
 * @Version V1.0
**/
public class IdGeneratorNew implements IdGenerator {

    /**
     * 封装JDK自带的UUID, 通过Random数字生成, 中间无-分割.
     */
    public static String uuid() {
        return UUID.randomUUID().toString().replaceAll("-", "");
    }

    /**
     * Activiti ID 生成
     */
    @Override
    public String getNextId() {
        return IdGen.uuid();
    }
}
