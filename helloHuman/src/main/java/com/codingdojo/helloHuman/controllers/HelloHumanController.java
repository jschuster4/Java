package com.codingdojo.helloHuman.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloHumanController {

		@RequestMapping("/")
		public String hello
		(
			@RequestParam(value ="name" , required=false) String name,
			@RequestParam(value ="last_name" , required=false) String last_name,
			@RequestParam(value ="times" , required=false) String times			
		)
		{
			String answer = "";
			if (name != null && last_name != null) {
				answer = "Hello " + name + " " + last_name;
			}
			else if (name != null){
				answer = "Hello " + name;
			}
			else {
				answer = "Hello Human";
			}
			
			if (times != null) {
				int _times = Integer.parseInt(times);
				for (int i=1; i<_times; i++) {
					if (last_name != null) {
						answer += " " + name + " " + last_name;
					}
					else{
						answer += " " + name;
					}
				}
			}
			
			return answer;
		}
		
}

