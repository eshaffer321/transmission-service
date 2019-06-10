package com.erickshaffer.transmissionservice;

import com.google.inject.Guice;
import com.google.inject.Injector;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SMSServiceTest {

    @Autowired
    private SMSService smsService;

    @Test
    public void testLog() {
      this.smsService.send("test message");
    }

}
