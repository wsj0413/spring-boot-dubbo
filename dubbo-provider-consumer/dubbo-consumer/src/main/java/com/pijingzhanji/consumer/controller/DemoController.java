package com.pijingzhanji.consumer.controller;

import com.pijingzhanji.dubbo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 披荆斩棘
 * @date : 2017/11/21
 */
@RestController
public class DemoController {

    @Autowired
    @Qualifier("demoService")
    private DemoService demoService;

    @GetMapping( "demo" )
    public ResponseEntity< String > hello ( @RequestParam( required = false, defaultValue = "world" ) String name ) {
        return ResponseEntity.ok( demoService.sayHello( name ) );
    }


}
