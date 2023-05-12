package com.abdulhakimkaya.paralelprogramlama;

// Extends (Kalıtım)
// Java'da bir tane extends hakkınız vardır
public class _01_ParalelProgramlama extends Thread{
    @Override
    public void run() {
        // Codes
    }
}


// Implements (Interface)
// Java'da istediğimiz kadar implements verebiliriz
class ImplementsClass implements Runnable {

    @Override
    public void run() {
        // Codes
    }
}


// Anonymous -> metotla çözmek
class AnonymousClass {
    public void anonymousMethod() {
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                // Codes
            }
        });
    }
}
