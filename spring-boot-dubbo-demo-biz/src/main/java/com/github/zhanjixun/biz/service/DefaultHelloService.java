package com.github.zhanjixun.biz.service;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.zhanjixun.api.HelloService;
import com.github.zhanjixun.biz.entity.User;
import com.github.zhanjixun.biz.mapper.UserMapper;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;

@Service
public class DefaultHelloService extends ServiceImpl<UserMapper, User> implements HelloService {

    @Value("${spring.application.name}")
    private String serviceName;
    @Autowired
    private UserMapper userMapper;

    @Override
    public String sayHello(String name) {
        User user = userMapper.selectById(1);
        return String.format("[%s] : Hello, %s", user.getName(), name);
    }
}
