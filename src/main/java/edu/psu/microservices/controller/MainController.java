package edu.psu.microservices.controller;

import edu.psu.microservices.service.ArticleService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@EnableAutoConfiguration
@SpringBootApplication
public class MainController {
    public static void main(String[] args){
        SpringApplication.run(MainController.class,args);
    }

    @Bean
    public ArticleService articleService() {
        return new ArticleService ();
    }
}
