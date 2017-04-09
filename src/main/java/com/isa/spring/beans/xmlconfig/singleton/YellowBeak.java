package com.isa.spring.beans.xmlconfig.singleton;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class YellowBeak implements Beak {
	private static final Logger LOG = LoggerFactory.getLogger(YellowBeak.class);

	@Override
	public void printBeak() {
		LOG.info("Yellow beak!");
	}
}
