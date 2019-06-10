package com.erickshaffer.transmissionservice;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PropertiesTest {

    @Autowired
    private Properties properties;

    @Test
    public void testProperties() {
        assertEquals(this.properties.getEnv(), "test");
        assertEquals(this.properties.getAccountSID(), "ACf14f48f243576dd578da04db430c96d6");
    }

}
