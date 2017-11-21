package com.pijingzhanji.consumer;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 * @author pijingzhanji
 */
@SpringBootApplication
public class ConsumerAppApplication extends SpringBootServletInitializer {

	public static void main ( String[] args ) {
		SpringApplication.run( ConsumerAppApplication.class , args );
	}

	@Override
	protected SpringApplicationBuilder configure ( SpringApplicationBuilder application ) {
		return application.sources( ConsumerAppApplication.class );
	}
}
