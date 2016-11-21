package com.xuetong.movie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import springfox.documentation.builders.PathSelectors;


@SpringBootApplication
@EnableSwagger2
@PropertySource("classpath:application.properties")
public class MovieApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(MovieApplication.class, args);
    }
    
    @Bean
    public Docket petApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("Movie Service")
                .select()
                .paths(PathSelectors.regex("/movieService/v1/.*"))
                .build()
                ;
    }
}
