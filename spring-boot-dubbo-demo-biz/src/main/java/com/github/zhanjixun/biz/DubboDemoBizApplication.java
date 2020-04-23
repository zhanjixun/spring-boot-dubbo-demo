package com.github.zhanjixun.biz;

import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@MapperScan("com.github.zhanjixun.**.mapper")
public class DubboDemoBizApplication {
    public static void main(String[] args) {

        //启动嵌入式ZooKeeper
        new EmbeddedZooKeeper(2181, false).start();
        SpringApplication.run(DubboDemoBizApplication.class, args);
    }

    /**
     * Mybatis-plus分页插件
     *
     * @return
     */
    @Bean
    public PaginationInterceptor paginationInterceptor() {
        return new PaginationInterceptor();
    }
}
