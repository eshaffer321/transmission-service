package com.erickshaffer.transmissionservice;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SMSService implements Transport {

    @Autowired
    private Properties properties;

    @Override
    public void send(String messageToSend) {
        System.out.println(this.properties);
        Twilio.init(this.properties.getAccountSID(), this.properties.getAuthToken());

        Message.creator(new PhoneNumber(this.properties.getPhoneTo()),
                new PhoneNumber(this.properties.getPhoneFrom()), messageToSend).create();

    }

}
