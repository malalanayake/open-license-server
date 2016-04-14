package com.open.license.config;

import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.javaconfig.CamelConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RouteConfig extends CamelConfiguration{

	
	@Bean
	RouteBuilder calypsoToPrincipiaRouteBuilder() {
		return new RouteBuilder() {
			@Override
			public void configure() throws Exception {
				from("jms:queue:" + "Test").log("Test");
			}
		};
	}
}
