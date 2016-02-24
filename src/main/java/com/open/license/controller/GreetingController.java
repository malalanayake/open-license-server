package com.open.license.controller;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.open.license.model.Greeting;
import com.open.license.model.HelloMessage;

/**
 * 
 * Distibution under GNU GENERAL PUBLIC LICENSE Version 2, June 1991
 * 
 * @author dmalalan
 * @created Feb 22, 2016 11:40:11 PM
 * 
 * @blog https://malalanayake.wordpress.com/
 */
@Controller
public class GreetingController {

	@MessageMapping("/hello")
	@SendTo("/topic/greetings")
	public Greeting greeting(HelloMessage message) throws Exception {
		Thread.sleep(3000);
		return new Greeting("Hello, " + message.getName() + "!");
	}

	@RequestMapping(value = "/greeting", method = RequestMethod.GET)
	public String list(ModelMap model) {
		return "greeting";
	}

}
