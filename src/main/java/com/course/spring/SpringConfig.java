package com.course.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

    @Bean
    Calculate getCalculator() {
        return new Calculate();
    }

    @Bean
    Print getPrinter() {
        return new Print();
    }

}
