package com.ocdemo.demo.control;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OcDemoController {

	
	@GetMapping("/")
	public String home() {
		return "Started...!!!";
	}
	
}
