package com.abdulhakimkaya.paralelprogramlama;

public class _04_AnonymousThread extends ThreadBase {

    // Constructor
    public _04_AnonymousThread(String threadName) {
        super(threadName);
    }

    public _04_AnonymousThread() {
    }

    // Anonymous Thread
    private void anonymousMethod() {
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i < 10; i++) {
                    try {
                        Thread.sleep(1000);
                        if (i == 1) {
                            System.out.println("******* BAŞLANGIÇ *******");
                            System.out.println(builder().threadName("Thread") + " -> " + i + " ");
                        } else if (i == 9) {
                            System.out.println("******* BİTİŞ *******");
                            System.out.println(builder().threadName("Thread") + " -> " + i + " ");
                        } else {
                            System.out.println(builder().threadName("Thread") + " -> " + i + " ");
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        };
        runnable.run();
    }

    // PSVM
    public static void main(String[] args) {
        _04_AnonymousThread anonymousThread = new _04_AnonymousThread();
        anonymousThread.anonymousMethod();
    }
}
