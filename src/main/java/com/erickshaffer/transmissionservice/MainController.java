package com.erickshaffer.transmissionservice;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    private static final Logger logger = LogManager.getLogger(MainController.class);

    @Autowired
    private SMSService smsService;

    @RequestMapping("/transmit")
    public String transmit() {
        logger.debug("transmit route hit");
        smsService.send("test message");
        return "yes";
    }

    @RequestMapping("/")
    public String home() {
        return "welcome!";
    }
}