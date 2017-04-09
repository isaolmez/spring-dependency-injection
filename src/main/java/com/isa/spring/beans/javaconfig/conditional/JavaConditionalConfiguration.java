package com.isa.spring.beans.javaconfig.conditional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;

@Configuration
@ComponentScan(basePackages = "com.isa.spring.beans.javaconfig.conditional")
@PropertySource("application.properties")
public class JavaConditionalConfiguration {

    @Autowired
    private Environment environment;

    @Bean
    @Primary
    @Conditional(YellowBeakEnabled.class)
    public Beak yellowBeak() {
        return new YellowBeak();
    }

    @Bean
    @Conditional(BlueBeakEnabled.class)
    public Beak blueBeak() {
        return new BlueBeak();
    }

    @Bean
    public Beak noBeak() {
        return new NoBeak();
    }

    @Bean
    public Bird bird(Beak beak) {
        return new Bird(beak);
    }
}
