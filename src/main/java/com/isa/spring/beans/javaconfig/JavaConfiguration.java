package com.isa.spring.beans.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class JavaConfiguration {
    @Bean
    @Primary
    public Beak yellowBeak() {
        return new YellowBeak();
    }

    @Bean
    public Beak blueBeak() {
        return new BlueBeak();
    }

    @Bean
    public Bird bird() {
        return new Bird(yellowBeak());
    }
}
