package com.isa.spring.beans.annotationconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class YellowBeak implements Beak {
    private static final Logger LOG = LoggerFactory.getLogger(YellowBeak.class);

    @Override
    public void printBeak() {
        LOG.info("Yellow beak!");
    }
}
