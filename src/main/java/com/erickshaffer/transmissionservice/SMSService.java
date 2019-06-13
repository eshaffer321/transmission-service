package com.erickshaffer.transmissionservice;

import com.twilio.Twilio;
import com.twilio.rest.api.v2010.account.Message;
import com.twilio.type.PhoneNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

@Service
public class SMSService implements Transport {

    private static final Logger logger = LogManager.getLogger(SMSService.class);

    @Autowired
    private Properties properties;

    @Override
    public boolean send(String messageToSend) {
        logger.info("Attempting to send message via SMS Service");
        try {
            Twilio.init(this.properties.getAccountSID(), this.properties.getAuthToken());

            Message.creator(new PhoneNumber(this.properties.getPhoneTo()),
                    new PhoneNumber(this.properties.getPhoneFrom()), messageToSend).create();
            return true;
        } catch(Exception e) {
            logger.error(e);
            return false;
        }
    }

}
