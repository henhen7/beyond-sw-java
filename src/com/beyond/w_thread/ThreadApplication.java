package com.beyond.w_thread;

import com.beyond.w_thread.practice.MyRunnable;
import com.beyond.w_thread.practice.Mythread;

public class ThreadApplication {
    public static void main(String[] args) {
        System.out.println("메인 스레드 실행");

        Mythread thread1 = new Mythread();
        /**
         * run()
         *  - 메인 스레드에서 run()을 호출하므로 메인 스레드에서 해당 메소드를 실행함
         */
//        thread1.run();
        /**
         * start()
         *  - 새로운 실행 흐름 생성하여 별개로 run()메소드를 실행하며, 메인 스레드는 start를 호출하고 바로 종료됨.
         *  - 호출된 start 메소드를 통해 새로 생성된 스레드에서 Mythread의 코드를 실행함
         */
        thread1.start();

        Thread thread2 = new Thread(new MyRunnable());
//        thread2.run();
        thread2.start();

        // 익명 구현 객체
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "[" + i + "]");
                }
            }
        });
        thread3.start();

        // 람다식
        Thread thread4 = new Thread(() -> {
                for (int i = 1; i <= 100; i++) {
                    System.out.println(Thread.currentThread().getName() + "[" + i + "]");
                }
        });
        /**
         * 데몬 스레드
         *  - 보조적인 역할을 수행하는 스레드이다.
         *  - 다른 스레드가 종료되면 데몬 스레드는 강제로 종료된다.
         */
        thread4.setDaemon(true);
        thread4.start();

        try {
            /**
             * join() 메소드
             *  - join()을 호출한 스레드는 아래의 스레드가 종료될 때까지 기다렸다가
             *    스레드가 종료되면 join()을 호출한 스레드를 다시 실행한다.
             */
            thread1.join();
            thread2.setPriority(Thread.MIN_PRIORITY);
            thread2.join();
            thread3.join();
            thread4.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("메인 스레드 종료");
    }
}
