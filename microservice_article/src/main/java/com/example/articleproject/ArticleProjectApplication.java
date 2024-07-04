package com.example.articleproject;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class ArticleProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(ArticleProjectApplication.class, args);
    }

}
