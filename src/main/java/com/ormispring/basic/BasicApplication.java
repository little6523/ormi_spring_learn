package com.ormispring.basic;

import com.ormispring.day0709.Message;
import com.ormispring.day0709.ValueTest;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.TimeZone;

@SpringBootApplication(scanBasePackages = "com.ormispring.day0709")
public class BasicApplication {

    @Value("${server.port}")
    private int port;

    @Value("${spring.application.name}")
    private String appName;

    @PostConstruct
    public void printConfig() {
        TimeZone.setDefault(TimeZone.getTimeZone("Asia/Seoul"));
        System.out.println("포트번호: " + port);
        System.out.println("애플리케이션 이름: " + appName);
    }
    public static void main(String[] args) {
        SpringApplication.run(BasicApplication.class, args);
    }
}
