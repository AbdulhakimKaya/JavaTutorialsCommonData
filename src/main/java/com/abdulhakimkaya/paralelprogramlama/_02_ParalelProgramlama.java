package com.abdulhakimkaya.paralelprogramlama;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.log4j.Log4j2;

import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Log4j2
public class _02_ParalelProgramlama extends Thread {

    // Global variable
    private String threadName;

    // Run
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(1000);
                if (i == 1) {
                    System.out.println("******* BAŞLANGIÇ *******");
                    System.out.println(this.threadName + " -> " + i + " ");
                } else if (i == 9) {
                    System.out.println("******* BİTİŞ *******");
                    System.out.println(this.threadName + " -> " + i + " ");
                } else {
                    System.out.println(this.threadName + " -> " + i + " ");
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    // PSVM
    public static void main(String[] args) throws InterruptedException {
        _02_ParalelProgramlama thread1 = new _02_ParalelProgramlama("1.Thread");
        _02_ParalelProgramlama thread2 = new _02_ParalelProgramlama("2.Thread");
        _02_ParalelProgramlama thread3 = new _02_ParalelProgramlama("3.Thread");

/*
        // Thread Information
        // isAlive -> çalışıyor olup olmadığının kontrolü yapılır boolean değer döner
        System.out.println("Thread 1 is Alive -> " + thread1.isAlive());  // false
        thread1.start();
        System.out.println("Thread 1 is Alive -> " + thread1.isAlive());  // true

        // hashCode -> her bir thread'in kendine ait sabit bir hashCode'u vardır
        System.out.println("Thread 1 hashCode -> " + thread1.hashCode());
        System.out.println("Thread 2 hashCode -> " + thread2.hashCode());

        // getName -> her bir thread'in kendine ait bir ismi vardır
        System.out.println("Thread 1 getName -> " + thread1.getName());
        // Thread'in name'i değiştirilebilir
        thread1.setName("My Special Thread ".concat(UUID.randomUUID().toString()));
        System.out.println("Thread 1 getName -> " + thread1.getName());
*/

        // Join
        thread1.start();
        // join olmadığında 3 thread de aynı anda sırasız olarak çalışı
        // ancak join ile belirlediğiniz thread önce çalışır o bittikten sonra diğerleri çalışmaya başlar
        thread1.join();
        thread2.start();
        thread3.start();

    }
}
