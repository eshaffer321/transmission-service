package com.erickshaffer.transmissionservice;

public class EmailClient implements Transport {
    @Override
    public boolean send(String message) {
        return false;
    }
}
