package com.chat.provider;


import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Liyanpeng
 * @date 2019/7/19 16:32
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class ChatPlatformAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatPlatformAdminApplication.class, args);
    }


    @Slf4j
    @RestController
    static class TestController {
        @GetMapping("/hello")
        public String hello(@RequestParam("name") String name) {
            log.info("invoked name = " + name);
            return "hello " + name;
        }
    }
}
