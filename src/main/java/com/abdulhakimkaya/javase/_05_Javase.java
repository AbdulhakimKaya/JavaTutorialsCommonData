package com.abdulhakimkaya.javase;

import java.util.Scanner;

public class _05_Javase {
    // conditional
    public static void conditional() {

        Scanner klavye = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = klavye.nextInt();

        if (number > 0) {
            System.out.println("pozitif sayı");
        }
        else {
            System.out.println("negatif sayı");
        }
    }

    public static void conditional2() {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = klavye.nextInt();

        String result = (number > 0 ? "pozitif sayı" : "negatif sayı");
        System.out.println(result);
    }

    public static void conditional3() {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Lütfen bir sayı giriniz: ");
        int number = klavye.nextInt();

        if (number > 0) {
            System.out.println("pozitif sayı");
        }
        else if (number < 0){
            System.out.println("negatif sayı");
        }
        else {
            System.out.println("Sıfır pozitif veya negatif değildir");
        }
    }

    public static void conditional4() {
        Scanner klavye = new Scanner(System.in);
        System.out.print("Lütfen bir gün giriniz: ");
        String day = klavye.nextLine();
        System.out.print("Lütfen bir ay giriniz: ");
        String month = klavye.nextLine();

        // 1. Kullanım Şekli

        switch (day.toLowerCase()) {
            case "pazartesi":
                System.out.println("1.gün");
                break;
            case "salı":
                System.out.println("2.gün");
                break;
            case "çarşamba":
                System.out.println("3.gün");
                break;
            case "perşembe":
                System.out.println("4.gün");
                break;
            case "cuma":
                System.out.println("5.gün");
                break;
            case "cumartesi":
                System.out.println("6.gün");
                break;
            case "pazar":
                System.out.println("7.gün");
                break;
            default:
                System.out.println("Geçersiz bi isim girdiniz!");
                break;
        }

        // 2. Kullanım Şekli

        switch (month.toLowerCase()) {
            case "ocak" -> System.out.println("1.ay");
            case "şubat" -> System.out.println("2.ay");
            case "mart" -> System.out.println("3.ay");
            case "nisan" -> System.out.println("4.ay");
            case "mayıs" -> System.out.println("5.ay");
            case "haziran" -> System.out.println("6.ay");
            case "temmuz" -> System.out.println("7.ay");
            case "ağustos" -> System.out.println("8.ay");
            case "eylül" -> System.out.println("9.ay");
            case "ekim" -> System.out.println("10.ay");
            case "kasım" -> System.out.println("11.ay");
            case "aralık" -> System.out.println("12.ay");
            default -> System.out.println("Geçersiz bi isim girdiniz!");
        }
    }

    public static void main(String[] args) {
        conditional();
        conditional2();
        conditional3();
        conditional4();
    }
}
