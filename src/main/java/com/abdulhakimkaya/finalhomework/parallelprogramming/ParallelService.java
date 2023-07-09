package com.abdulhakimkaya.finalhomework.parallelprogramming;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ParallelService extends Thread {
    public static final String PERSON_URL =
            "C:\\Users\\KAYA\\IdeaProjects\\JavaTutorialsCommonData\\src\\main\\java\\com\\abdulhakimkaya\\finalhomework\\parallelprogramming\\files\\person.txt";
    public static final String SECRET_URL =
            "C:\\Users\\KAYA\\IdeaProjects\\JavaTutorialsCommonData\\src\\main\\java\\com\\abdulhakimkaya\\finalhomework\\parallelprogramming\\files\\secret.txt";

    //1.VERİ
    public String userDataInformation() {
        Scanner klavye = new Scanner(System.in);
        String username, password, email;
        System.out.print("Username giriniz: ");
        username = klavye.nextLine();
        System.out.print("Password giriniz: ");
        password = klavye.nextLine();
        System.out.print("email giriniz: ");
        email = klavye.nextLine();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(username).append(" \n").append(password).append(" \n").append(email).append(" \n \n");
        return stringBuilder.toString();
    }

    public void fileIouserDataInformation() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PERSON_URL, false))) {
            String userData = userDataInformation();
            bufferedWriter.write(userData);
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    //2.VERİ
    public String userDataSecretInformation() {
        Scanner klavye = new Scanner(System.in);
        String secretInformation;
        System.out.print("secretInformation giriniz: ");
        secretInformation = klavye.nextLine();
        return secretInformation;
    }

    public void fileIouserSecretInformation() {
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(SECRET_URL, false))) {
            String userData = userDataSecretInformation();
            bufferedWriter.write(userData);
            bufferedWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    // MultiThread
    public static void main(String[] args) throws InterruptedException {
        // 1.Thread
        ParallelService parallelService1 = new ParallelService();
        parallelService1.fileIouserDataInformation();

        // 2.Thread
        ParallelService parallelService2 = new ParallelService();
        parallelService2.fileIouserSecretInformation();

        parallelService1.start();  // 1.Thread çalıştırılır
        parallelService1.join();   // 1.Thread bitmeden 2.Thread'i başlatma

        parallelService2.start();  // 2.Thread çalıştırılır
        parallelService2.join();   // 2.Thread bitmeden devam etme
    }

}
