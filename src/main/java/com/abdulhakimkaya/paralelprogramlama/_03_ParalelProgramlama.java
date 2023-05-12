package com.abdulhakimkaya.paralelprogramlama;

// Eğer extends hakkını başka class kullanmışsa o zaman implements kullanılır
public class _03_ParalelProgramlama extends ThreadBase implements Runnable{

    // Constructor
    public _03_ParalelProgramlama(String threadName) {
        super(threadName);
    }

    // Run
    @Override
    public void run() {
        for (int i = 1; i < 10; i++) {
            try {
                Thread.sleep(1000);
                if (i == 1) {
                    System.out.println("******* BAŞLANGIÇ " + getThreadName() + " *******");
                    System.out.println(getThreadName() + " -> " + i + " ");
                } else if (i == 9) {
                    System.out.println("******* BİTİŞ " + getThreadName() + " *******");
                    System.out.println(getThreadName() + " -> " + i + " ");
                } else {
                    System.out.println(getThreadName() + " -> " + i + " ");
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
        Thread thread1 = new Thread(new _03_ParalelProgramlama("1.Thread"));
        Thread thread2 = new Thread(new _03_ParalelProgramlama("2.Thread"));
        Thread thread3 = new Thread(new _03_ParalelProgramlama("3.Thread"));

        // 1. Thread başlasın
        thread1.start();
        // 1. Thread bitene kadar diğer Thread'ler beklesin
        thread1.join();

        // 2. Thread başlasın
        thread2.start();
        // 2. Thread bitene kadar diğer Thread'ler beklesin
        thread2.join();

        // 3. Thread başlasın
        thread3.start();

    }
}
