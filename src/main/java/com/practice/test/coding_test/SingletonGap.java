package com.practice.test.coding_test;

import java.util.concurrent.locks.ReentrantLock;

public class SingletonGap {
    private static ReentrantLock lock = new ReentrantLock();
    private static SingletonGap singleton;

    private SingletonGap(){

    }
    public static SingletonGap getSingleton(){
        try {
            if(singleton!=null){
                lock.lock();
                if(singleton==null) {
                    singleton = new SingletonGap();
                }
            }
        }finally {
            lock.unlock();
        }
        return singleton;
    }
}
