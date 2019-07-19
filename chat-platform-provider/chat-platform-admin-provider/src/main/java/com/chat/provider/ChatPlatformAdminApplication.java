package com.chat.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Liyanpeng
 * @date 2019/7/19 16:32
 **/
@SpringBootApplication
@EnableDiscoveryClient
public class ChatPlatformAdminApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatPlatformAdminApplication.class, args);
    }
}
