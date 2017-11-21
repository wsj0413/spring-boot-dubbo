package com.pijingzhanji.dubbo.service.impl;

import com.pijingzhanji.dubbo.service.DemoService;

/**
 * @author : 披荆斩棘
 * @date : 2017/11/21
 */
public class DemoServiceImpl implements DemoService {
    @Override
    public String sayHello ( String name ) {
        return "Hello " + name;
    }
}
