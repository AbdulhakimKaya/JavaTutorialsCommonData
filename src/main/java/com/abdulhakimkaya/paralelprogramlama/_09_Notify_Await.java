package com.abdulhakimkaya.paralelprogramlama;


import lombok.SneakyThrows;

import java.util.Scanner;

// await     -> ikinci bir emir verilene kadar bekle
// notify    -> artık emir geldi kalkabilirsin
// notifyAll -> Bütün Thread'leri kaldırır
public class _09_Notify_Await {
    // Global Variable
    private Scanner klavye = new Scanner(System.in);
    private Object lockData = new Object();

    // await method
    @SneakyThrows
    public void awaitMethod() {
        synchronized (lockData) {
            System.out.println("1.Thread çalıştı ancak sonraki 2.Thread'in çalışması için 1.Thread'in çalışması gerekiyor");
            lockData.wait();
        }
        System.out.println("1.Thread uykudan kalktı");
    }

    // notify method
    @SneakyThrows
    public void notifyMethod() {
        Thread.sleep(5000);
        synchronized (lockData) {
            System.out.println("2.Thread'in devam etmesi için 1.Thread devam etmelidir bunun için herhangi bir tuşa basınız");
            klavye.nextLine();
            lockData.notify();
            System.out.println("1.Thread uyandı ve 2.Thread 5 saniye uyanacak ve sonra devam edecek");
        }
        for (int i = 1; i < 6; i++) {
            System.out.println(i + " saniye");
            Thread.sleep(1000);
        }
    }

    // All Thread Process
    @SneakyThrows
    public static void allThreadProcess() {
        _09_Notify_Await notify_await = new _09_Notify_Await();

        // Anonymous Thread 1
        Runnable thread1 = () -> {
            for (int i = 1; i < 6; i++) {
                System.out.println("Thread-X1");
            }
            notify_await.awaitMethod();
        };
        // Thred oluştur -> interface anonymous lambda expression
        Thread lambdaThread = new Thread(thread1);

        // Anonymous Thread 2
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                notify_await.notifyMethod();
                for (int i = 1; i < 6; i++) {
                    System.out.println("Thread-X2");
                }
            }
        });

        lambdaThread.start();
        thread2.start();
        lambdaThread.join();
        thread2.join();
    }

    // PSVM
    public static void main(String[] args) {
        allThreadProcess();
    }
}
