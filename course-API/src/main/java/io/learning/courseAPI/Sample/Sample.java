package io.learning.courseAPI.Sample;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Sample {
	
	@RequestMapping("/")
	public String sample()
	{
		return "Hello World!!..";
	}

}
