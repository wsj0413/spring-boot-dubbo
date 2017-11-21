package com.pijingzhanji.provider;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;


/**
 * @author pijingzhanji
 */
@SpringBootApplication
public class ProviderAppApplication extends SpringBootServletInitializer {

	public static void main ( String[] args ) {
		SpringApplication.run( ProviderAppApplication.class , args );
	}

	@Override
	protected SpringApplicationBuilder configure ( SpringApplicationBuilder application ) {
		return application.sources( ProviderAppApplication.class );
	}
}
