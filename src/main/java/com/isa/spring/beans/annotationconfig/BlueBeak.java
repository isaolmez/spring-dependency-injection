package com.isa.spring.beans.annotationconfig;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class BlueBeak implements Beak {
    private static final Logger LOG = LoggerFactory.getLogger(BlueBeak.class);

    @Override
    public void printBeak() {
        LOG.info("Blue beak!");
    }
}
