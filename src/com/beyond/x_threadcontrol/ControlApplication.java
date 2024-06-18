package com.beyond.x_threadcontrol;

import com.beyond.x_threadcontrol.practice.Consumer;
import com.beyond.x_threadcontrol.practice.Producer;
import com.beyond.x_threadcontrol.practice.Storage;

public class ControlApplication {
    public static void main(String[] args) {
        Storage storage = new Storage();
        Thread producer = new Producer(storage);
        Thread consumer = new Thread(new Consumer(storage));

        producer.start();
        consumer.start();

    }
}
