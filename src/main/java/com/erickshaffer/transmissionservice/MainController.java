package com.erickshaffer.transmissionservice;

import com.google.inject.Inject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MainController {

    @Autowired
    private SMSService smsService;

    @RequestMapping("/transmit")
    public String transmit() {
        smsService.send("test message");
        return "yes";
    }

    @RequestMapping("/")
    public String home() {
        return "welcome!";
    }
}