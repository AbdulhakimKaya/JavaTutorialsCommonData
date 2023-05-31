package com.abdulhakimkaya.paralelprogramlama;

import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;

import java.util.Scanner;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

@Log4j2
public class _08_ThreadPoolExecutorServices implements Runnable {
    private long id;
    private String firstName;
    private String lastName;

    // Parametreli Constructor


    public _08_ThreadPoolExecutorServices(long id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // FullName
    public void fullName() {
        System.out.println("Threading: " + this.firstName + " " + this.lastName);
    }

    @Override
    public void run() {
        System.out.println("START");
        fullName();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("END");
    }

    // Manuel Thread Process
    @SneakyThrows
    public static void manuelThread() {
        Thread thread1 = new Thread(new _08_ThreadPoolExecutorServices(1, "Ad 1", "Soyad 1"));
        Thread thread2 = new Thread(new _08_ThreadPoolExecutorServices(2, "Ad 2", "Soyad 2"));
        Thread thread3 = new Thread(new _08_ThreadPoolExecutorServices(3, "Ad 3", "Soyad 3"));
        Thread thread4 = new Thread(new _08_ThreadPoolExecutorServices(4, "Ad 4", "Soyad 4"));
        Thread thread5 = new Thread(new _08_ThreadPoolExecutorServices(5, "Ad 5", "Soyad 5"));

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();

        thread3.start();
        thread4.start();
        thread3.join();
        thread4.join();

        thread5.start();
        thread5.join();
    }

    // Dynamics Thread Process
    @SneakyThrows
    public static void dynamicsThread() {
        // Thread Pool -> Thread'lerimizin bir arada olduğu yerdir
        // Thread Pool -> 2 tane Thread'in aynı anda çalışması istenilir

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        for (int i = 1; i < 6; i++) {
            executorService.submit(new _08_ThreadPoolExecutorServices(i, "Ad " + i, "Soyad " + i));
        }

        // Yukarıda dinamik olarak yazılan Thread'ler bitmeden yeni Thread'e izin verilmez
        // Eğer shutdown() yazılmazsa Thread'lerin hepsi aynı anda çalışmaya başlar
        // Eğer shutdown() yazılırsa Thread en kötü durumda bir dakika sonra kapanacaktır
        executorService.shutdown();

        System.out.println("Threading Continues Data");

        // Thread'in bitmesini zorlamak için yazıldı
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        System.out.println("Thread END");
    }

    // All Thread Process
    public static void allThreadProcess() {
        while (true) {
            Scanner klavye = new Scanner(System.in);
            System.out.println("\nLütfen seçim yapınız..\n1-Manuel Thread\n2-Dinamik Thread\n3-Çıkış");
            int key = klavye.nextInt();

            switch (key) {
                case 1:
                    // Start Time
                    long startTime1 = System.currentTimeMillis();

                    manuelThread();

                    // End Time
                    long endTime1 = System.currentTimeMillis();
                    System.out.println("Toplam geçen süre: " + Math.round(endTime1 - startTime1) / 1000 + " saniye");
                    break;
                case 2:
                    // Start Time
                    long startTime2 = System.currentTimeMillis();

                    dynamicsThread();

                    // End Time
                    long endTime2 = System.currentTimeMillis();
                    System.out.println("Toplam geçen süre: " + Math.round(endTime2 - startTime2) / 1000 + " saniye");
                    break;
                case 3:
                    System.out.println("Çıkış yapılıyor..");
                    System.exit(0);
                    break;
            }
        }
    }

    // PSVM
    public static void main(String[] args) {
        allThreadProcess();
    }
}
