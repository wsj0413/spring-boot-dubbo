package com.pijingzhanji.provider.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

/**
 * @author : 披荆斩棘
 * @date : 2017/11/21
 */
@Configuration
@ImportResource( "classpath:dubbo-provider.xml" )
public class DubboConfig {
}
