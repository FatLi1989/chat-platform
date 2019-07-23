package com.chat.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Liyanpeng
 * @date 2019/7/22 17:49
 **/
@EnableDiscoveryClient
@SpringBootApplication
public class ChatAdminApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ChatAdminApiApplication.class, args);
    }

}
