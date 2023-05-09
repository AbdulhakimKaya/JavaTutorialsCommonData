package com.abdulhakimkaya.javase;

import java.util.Random;
import java.util.Scanner;

public class _01_Javase {
    public static void main(String[] args) {

//        Scanner klavye = new Scanner(System.in);
//        System.out.print("Lütfen bir kelime giriniz: ");
//        String data = klavye.nextLine();
//        System.out.println(data);


//        int veriyi String'e çevirmek

//        int number = 24;
//        String str1 = String.valueOf(number);
//        String str2 = Integer.toString(number);


//        String veriyi int'e çevirmek

//        String str3 = "24";
//        int num1 = Integer.valueOf(str3);
//        int num2 = Integer.parseInt(str3);


//        Math

//        System.out.println(Math.max(2,7));
//        System.out.println(Math.min(2,7));
//
//        System.out.println(Math.pow(2,7));
//        System.out.println(Math.abs(-7));
//        System.out.println(Math.sqrt(49));
//
//        System.out.println(Math.round(2.5));
//        System.out.println(Math.round(2.4));
//        System.out.println(Math.floor(2.7));
//        System.out.println(Math.ceil(2.7));
//
//        System.out.println(Math.sin(90));
//        System.out.println(Math.cos(90));


//        Random

        System.out.println(Math.round(Math.random()*9+1));

        Random random = new Random();
        int num3 = random.nextInt(0,100);
        int num4 = random.nextInt(100);
        System.out.println(num3);
        System.out.println(num4);
    }
}
