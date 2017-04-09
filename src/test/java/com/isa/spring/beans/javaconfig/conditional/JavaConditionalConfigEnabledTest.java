package com.isa.spring.beans.javaconfig.conditional;

import org.junit.Assume;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertNotNull;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = JavaConditionalConfiguration.class)
@TestPropertySource(properties = {"bird.beak.yellow.enabled = true", "bird.beak.blue.enabled = true"})
public class JavaConditionalConfigEnabledTest {
    @Autowired
    private ApplicationContext context;

    private static final String BIRD = "bird";
    private static final String BLUE_BEAK = "blueBeak";
    private static final String YELLOW_BEAK = "yellowBeak";
    private static final String NO_BEAK = "noBeak";

    @Test
    public void shouldCreateYellowBeak_IfEnabled(){
        Beak beak = context.getBean(YELLOW_BEAK, Beak.class);

        assertNotNull(beak);
    }

    @Test
    public void shouldCreateBlueBeak_IfEnabled(){
        Beak beak = context.getBean(BLUE_BEAK, Beak.class);

        assertNotNull(beak);
    }

    @Test
    public void shouldFetchNoBeak(){
        Beak beak = context.getBean(NO_BEAK, Beak.class);

        assertNotNull(beak);
    }

    @Test
    public void shouldFetchBird_WithNotNull(){
        Bird bird = context.getBean(BIRD, Bird.class);

        assertNotNull(bird);
        assertNotNull(bird.getBeak());
        assertEquals(YellowBeak.class, bird.getBeak().getClass());
    }
}
