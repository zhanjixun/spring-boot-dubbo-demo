package com.github.zhanjixun.web.controller;

import com.github.zhanjixun.api.HelloService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Reference
	private HelloService helloService;

	@GetMapping("/hello")
	public String hello() {
		return helloService.sayHello("zhanjixun");
	}

}
