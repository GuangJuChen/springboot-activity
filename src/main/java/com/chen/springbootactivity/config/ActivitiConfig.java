package com.chen.springbootactivity.config;

import com.chen.springbootactivity.utils.IdGeneratorNew;
import org.activiti.spring.SpringProcessEngineConfiguration;
import org.activiti.spring.boot.ProcessEngineConfigurationConfigurer;
import org.springframework.context.annotation.Configuration;

/**
 * @ClassName ActivitiConfig
 * @Description: activity配置类
 * @Author chenGJ
 * @Date 2019/12/4 16:00
 * @Version V1.0
**/
@Configuration
public class ActivitiConfig implements ProcessEngineConfigurationConfigurer {


    @Override
    public void configure(SpringProcessEngineConfiguration springProcessEngineConfiguration) {
        springProcessEngineConfiguration.setIdGenerator(new IdGeneratorNew());
    }
}
