package com.chen.springbootactivity.config;

import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
import org.springframework.web.filter.HttpPutFormContentFilter;

import javax.servlet.annotation.WebFilter;

/**
 * @ClassName PutFilter
 * @Description: 过滤器
 * @Author chenGJ
 * @Date 2019/12/4 22:38
 * @Version V1.0
**/
@Component
@WebFilter(urlPatterns = "/*", filterName = "putFilter")
@Order(Integer.MIN_VALUE)
public class PutFilter extends HttpPutFormContentFilter {

}

