package com.isa.spring.beans.xmlconfig.singleton;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;
import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@ContextConfiguration(locations = "/applicationContext.singleton.xml")
public class XmlSingletonTest {

	private static final String BIRD = "bird";
	private static final String OTHER_BIRD = "otherBird";
	private static final String BLUE_BEAK = "blueBeak";
	private static final String YELLOW_BEAK = "yellowBeak";

	@Autowired
	private ApplicationContext context;

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
	public void shouldFetchBird_ByName() {
		Bird bird = context.getBean(BIRD, Bird.class);

		assertNotNull(bird);
	}

	@Test
	public void shouldCreateSingleton_ForBird() {
		Bird initialFetched = context.getBean(BIRD, Bird.class);
		Bird secondFetched = context.getBean(BIRD, Bird.class);

		assertEquals(initialFetched, secondFetched);
	}

	@Test
	public void shouldFetchOtherBird_ByName() {
		Bird otherBird = context.getBean(OTHER_BIRD, Bird.class);

		assertNotNull(otherBird);
	}

	@Test
	public void shouldCreateSingleton_ForOtherBird() {
		Bird initialFetched = context.getBean(OTHER_BIRD, Bird.class);
		Bird secondFetched = context.getBean(OTHER_BIRD, Bird.class);

		assertEquals(initialFetched, secondFetched);
	}

	@Test
	public void shouldCreateBirds_WhichAreNotRelated() {
		Bird bird = context.getBean(BIRD, Bird.class);
		Bird otherBird = context.getBean(OTHER_BIRD, Bird.class);

		assertNotEquals(otherBird, bird);
	}

	@Test(expected = NoUniqueBeanDefinitionException.class)
	public void shouldFail_WhenFetchedByType() {
		context.getBean(Bird.class);

		fail();
	}
}
