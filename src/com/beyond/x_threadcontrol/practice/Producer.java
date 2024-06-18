package com.beyond.x_threadcontrol.practice;

public class Producer extends Thread{
    private Storage storage;

    public Producer(Storage storage) {
        this.storage = storage;
    }

    @Override
    public void run() {
        for (int i =1; i <= 10; i++) {
            try {
                storage.setProduct(i);
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
