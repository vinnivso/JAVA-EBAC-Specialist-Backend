package org.vinnivso.demo;

import org.vinnivso.singleton.SingletonPropertieSync;

//Com o synchronized só entra um por vez.
public class DemoSingletonPropertieSync {
    public static void main(String[] args) {
        Thread firstThread = new Thread(new ThreadFoo());
        Thread secondThread = new Thread(new ThreadBar());
        firstThread.start();
        secondThread.start();
    }
    static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonPropertieSync singleton = SingletonPropertieSync.getInstance("1st Test");
            System.out.println(singleton.getValue());
        }
    }

    static class ThreadBar implements Runnable {
        @Override
        public void run() {
            SingletonPropertieSync singleton = SingletonPropertieSync.getInstance("2nd Test");
            System.out.println(singleton.getValue());
        }
    }
}
