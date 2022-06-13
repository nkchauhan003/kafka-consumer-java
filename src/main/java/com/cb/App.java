package com.cb;

import com.cb.consumer.DemoConsumer;
import com.cb.consumer.DemoConsumerImpl;

/**
 * Hello world!
 */
public class App {
    private static final String TOPIC = "demo-topic";

    public static void main(String[] args) {
        DemoConsumer consumer = new DemoConsumerImpl(TOPIC);
        consumer.doWork();
    }
}
