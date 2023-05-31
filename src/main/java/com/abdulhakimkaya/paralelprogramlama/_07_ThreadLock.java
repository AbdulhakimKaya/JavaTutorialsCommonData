package com.abdulhakimkaya.paralelprogramlama;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@Log4j2
public class _07_ThreadLock extends Thread {

    // Global Variable
    private String threadName;
    private static int counter = 0;

    // Thread Lock
    private Object threadLockObject = new Object();

    // Constructor
    public _07_ThreadLock(String threadName) {
        this.threadName = threadName;
    }

    // Counter Method -> synchronized
    // synchronized -> ilk giren Thread işini bitirmeden diğer Thread in çalışmasına izin vermiyor
    public synchronized void counterPlus() {
        counter++;
        System.out.println(counter);
        log.info(counter);
    }

    // Thread Run
    @Override
    public void run() {
//        synchronized (threadLockObject) {}
        // sadece bir Thread'in girmesine izin verildi
        synchronized (threadLockObject) {
            for (int i = 1; i < 10; i++) {
                System.out.println(threadName + " START " + i);
                try {
                    Thread.sleep(1000);
                    // synchronized
                    counterPlus();
                } catch (InterruptedException e) {
                    System.out.println("InterruptedException: " + e);
                    throw new RuntimeException(e);
                }
            }
        }
        System.out.println(threadName + " END");
    }

    // PSVM
    // Concurrency -> eş zamanlı çalışma
    // Senkron -> aynı anda sadece bir iş yapabilme yeteneği
    // Asenkron -> aynı anda birden fazla iş yapabilme yeteneği
    // MultiThreading -> aynı anda birden fazla iş yapabilme yeteneği
    public static void main(String[] args) throws InterruptedException {
        _07_ThreadLock thread1 = new _07_ThreadLock("Thread 1");
        _07_ThreadLock thread2 = new _07_ThreadLock("Thread 2");

        // Start Time
        long startTime = System.currentTimeMillis();

        // Threading
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Main Threading Counter: " + counter);
        log.info("Main Threading Counter: " + counter);

        // End Time
        long endTime = System.currentTimeMillis();
        System.out.println("Toplam geçen süre: " + Math.round(endTime - startTime) / 1000 + " saniye");
    }
}
