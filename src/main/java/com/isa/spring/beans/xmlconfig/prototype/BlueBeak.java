package com.isa.spring.beans.xmlconfig.prototype;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BlueBeak implements Beak {
	private static final Logger LOG = LoggerFactory.getLogger(BlueBeak.class);

	@Override
	public void printBeak() {
		LOG.info("Blue beak!");
	}
}
