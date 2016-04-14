package com.open.license;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.open.license.config.ContextConfig;
import com.open.license.config.RouteConfig;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author malalanayake
 * @created Nov 8, 2015 7:47:43 PM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
@Configuration
@ComponentScan
@EnableAutoConfiguration
@Import({ ContextConfig.class, RouteConfig.class})
public class ApplicationServer {

	public static void main(String[] args) {
		SpringApplication.run(ApplicationServer.class, args);
	}

}
