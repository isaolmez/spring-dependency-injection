package com.isa.spring.beans.javaconfig.conditional;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoBeak implements Beak {
    private static final Logger LOG = LoggerFactory.getLogger(NoBeak.class);

    @Override
    public void printBeak() {
        LOG.info("No beak!");
    }
}
