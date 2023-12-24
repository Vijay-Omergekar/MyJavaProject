package com.picsanddabs.demo.controller;
/* testing */
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
	
	@RequestMapping(value="/getmsg/{username}" , method=RequestMethod.GET)
	public String helloWorld(@PathVariable String username) {
		return "Hello " + username;
	}

}
