package com.example.springfundamentals.iok;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ZooConfig {


    @Bean
    public Animal dog(){
        return new Dog();
    }
}
