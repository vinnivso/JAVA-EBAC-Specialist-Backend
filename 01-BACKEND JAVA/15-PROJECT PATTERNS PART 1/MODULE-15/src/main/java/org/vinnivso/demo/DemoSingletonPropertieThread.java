package org.vinnivso.demo;

import org.vinnivso.singleton.SingletonPropertie;

public class DemoSingletonPropertieThread {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new ThreadFoo());
        Thread secondThread = new Thread(new ThreadBar());
        firstThread.start();
        secondThread.start();
    }
    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonPropertie singleton = SingletonPropertie.getInstance("1st Test");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonPropertie singleton = SingletonPropertie.getInstance("2nd Test");
            System.out.println(singleton.getValue());
        }
    }
}
