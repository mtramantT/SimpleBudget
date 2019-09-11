package com.budget;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GeneralController {

	@GetMapping("Test")
	public void test() {
		System.out.println("Test Works!");
	}
}
