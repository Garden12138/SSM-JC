package com.garden.web.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScan.Filter;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * 数据层组件配置类
 * @author Garden
 * 2018年3月25日
 */
@Configuration
@ComponentScan(basePackages={"com.garden.web.dao","com.garden.web.service"},
               excludeFilters={@Filter(type=FilterType.ANNOTATION,value=EnableWebMvc.class)})  
public class RootConfig {

}
