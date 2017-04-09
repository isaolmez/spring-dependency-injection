package com.isa.spring.beans.javaconfig.conditional;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

public class YellowBeakEnabled implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        return isEnabled(context.getEnvironment());
    }

    public static boolean isEnabled(Environment environment) {
        return environment.getProperty("bird.beak.yellow.enabled").matches("true");
    }
}
