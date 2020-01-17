package com.github.zhanjixun.biz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DubboDemoBizApplication {

	public static void main(String[] args) {
		//启动嵌入式ZooKeeper
		new EmbeddedZooKeeper(2181, false).start();
		SpringApplication.run(DubboDemoBizApplication.class, args);
	}

}
