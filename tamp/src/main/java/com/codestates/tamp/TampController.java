package com.codestates.tamp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller

public class TampController {
	@GetMapping
	public String hello(){
		return "hello!!!!!";
	}
}
