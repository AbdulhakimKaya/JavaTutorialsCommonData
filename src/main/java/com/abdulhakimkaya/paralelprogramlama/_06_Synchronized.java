package com.abdulhakimkaya.paralelprogramlama;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Log4j2
public class _06_Synchronized extends Thread {

    // Global Variable
    private String threadName;
    private static int counter = 0;

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
        System.out.println(threadName + " END");
    }

    // PSVM
    // Concurrency -> eş zamanlı çalışma
    // Senkron -> aynı anda sadece bir iş yapabilme yeteneği
    // Asenkron -> aynı anda birden fazla iş yapabilme yeteneği
    // MultiThreading -> aynı anda birden fazla iş yapabilme yeteneği
    public static void main(String[] args) throws InterruptedException {
        _06_Synchronized thread1 = new _06_Synchronized("Thread 1");
        _06_Synchronized thread2 = new _06_Synchronized("Thread 2");

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        System.out.println("Main Threading Counter: " + counter);
        log.info("Main Threading Counter: " + counter);
    }
}
