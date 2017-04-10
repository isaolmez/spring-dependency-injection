package com.isa.spring.beans.xmlconfig.prototype;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.prototype.xml")
public class XmlPrototypeTest {

    @Autowired
    private ApplicationContext context;

	private static final String BIRD = "bird";

	private static final String BLUE_BEAK = "blueBeak";

	private static final String YELLOW_BEAK = "yellowBeak";

	@Test
	public void shouldFetchYellowBeak_ByName(){
		Object beak = context.getBean(YELLOW_BEAK);

		assertNotNull(beak);
	}

	@Test
	public void shouldFetchYellowBeak_ByNameAndSuperType(){
		Beak beak = context.getBean(YELLOW_BEAK, Beak.class);

		assertNotNull(beak);
	}

	@Test
	public void shouldFetchYellowBeak_ByNameAndType(){
		Beak beak = context.getBean(YELLOW_BEAK, YellowBeak.class);

		assertNotNull(beak);
	}

	@Test
	public void shouldFetchYellowBeak_ByDefault(){
		Beak beak = context.getBean(Beak.class);

		assertNotNull(beak);
		assertEquals(YellowBeak.class, beak.getClass());
	}

	@Test
	public void shouldFetchBlueBeak_ByName(){
		Object beak = context.getBean(BLUE_BEAK);

		assertNotNull(beak);
	}

	@Test
	public void shouldFetchBlueBeak_ByNameAndSuperType(){
		Beak beak = context.getBean(BLUE_BEAK, Beak.class);

		assertNotNull(beak);
	}

	@Test
	public void shouldFetchBlueBeak_ByNameAndType(){
		Beak beak = context.getBean(BLUE_BEAK, BlueBeak.class);

		assertNotNull(beak);
		assertEquals(BlueBeak.class, beak.getClass());
	}

	@Test
	public void shouldFetchBean() {
		Bird actual = context.getBean(BIRD, Bird.class);

		assertNotNull(actual);
	}

	@Test
	public void shouldFetchBean_WithDifferentInstance() {
		Bird initialFetched = context.getBean(BIRD, Bird.class);
		Bird secondFetched = context.getBean(BIRD, Bird.class);

		assertNotEquals(secondFetched, initialFetched);
	}
}
