package com.erickshaffer.transmissionservice;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Properties {

    public String getPhoneFrom() {
        return phoneFrom;
    }

    public void setPhoneFrom(String phoneFrom) {
        this.phoneFrom = phoneFrom;
    }

    public String getPhoneTo() {
        return phoneTo;
    }

    public void setPhoneTo(String phoneTo) {
        this.phoneTo = phoneTo;
    }

    public String getAccountSID() {
        return accountSID;
    }

    public void setAccountSID(String accountSID) {
        this.accountSID = accountSID;
    }

    public String getAuthToken() {
        return authToken;
    }

    public void setAuthToken(String authToken) {
        this.authToken = authToken;
    }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    @Override
    public String toString() {
        return "Properties{" +
                "phoneFrom='" + phoneFrom + '\'' +
                ", phoneTo='" + phoneTo + '\'' +
                ", accountSID='" + accountSID + '\'' +
                ", authToken='" + authToken + '\'' +
                '}';
    }

    @Value("${phone-from}")
    private String phoneFrom;
    @Value("${phone-to}")
    private String phoneTo;
    @Value("${accountSID}")
    private String accountSID;
    @Value("${authToken}")
    private String authToken;
    @Value("${env}")
    private String env;

}
