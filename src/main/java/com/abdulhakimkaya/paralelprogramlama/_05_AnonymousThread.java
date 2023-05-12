package com.abdulhakimkaya.paralelprogramlama;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class _05_AnonymousThread extends ThreadBase {

    // Global Variable
    private String threadName;

    // Anonymous Thread
    private void anonymousMethod() {
        _05_AnonymousThread anonymousThread = new _05_AnonymousThread("Thread 1");
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println(anonymousThread + " Start Threading...");
                for (int i = 1; i < 10; i++) {
                    System.out.println(anonymousThread + " " + i + " Continue Threading...");
                    try {
                        Thread.sleep(1000);
                        System.out.print(i + " ");
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                }
                System.out.println(anonymousThread + " Finish Threading...");
            }
        });
        thread.start();
    }

    // Anonymous Thread (Lambda Expression)
    private void anonymousMethodLambdaExpression() {
        _05_AnonymousThread anonymousThread = new _05_AnonymousThread("Thread 2");
        Thread thread = new Thread(() -> {
            System.out.println(anonymousThread + " Start Threading...");
            for (int i = 1; i < 10; i++) {
                System.out.println(anonymousThread + " " + i + " Continue Threading...");
                try {
                    Thread.sleep(1000);
                    System.out.print(i + " ");
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            System.out.println(anonymousThread + " Finish Threading...");
        });
        thread.start();
    }

    // PSVM
    public static void main(String[] args) {
        _05_AnonymousThread anonymousThread = new _05_AnonymousThread();
        anonymousThread.anonymousMethod();
        anonymousThread.anonymousMethodLambdaExpression();
    }
}
