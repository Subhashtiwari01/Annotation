package org.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;


@Component
public class codingpractice {

    @Bean
    public void getStudent(){
        System.out.println("creating student object");
    }
}
