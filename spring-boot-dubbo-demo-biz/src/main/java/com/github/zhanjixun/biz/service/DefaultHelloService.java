package com.github.zhanjixun.biz.service;


import com.github.zhanjixun.api.HelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;

@Service
public class DefaultHelloService implements HelloService {

	@Value("${spring.application.name}")
	private String serviceName;

	public String sayHello(String name) {
		return String.format("[%s] : Hello, %s", serviceName, name);
	}
}
