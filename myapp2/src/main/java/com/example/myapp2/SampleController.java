package com.example.myapp2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SampleController {

	@GetMapping(value="/sample")
	public String sample() {
		return "sample";
	}
}
