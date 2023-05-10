package com.abdulhakimkaya.javase;

public class _03_Javase {
    public static void main(String[] args) {

        //    String

        String value = "I'am learning Java Java ";
        System.out.println(value);
        System.out.println(value.length());
        System.out.println(value.trim());
        System.out.println(value.trim().length());
        System.out.println(value.startsWith("I'am"));
        System.out.println(value.endsWith("I'am"));
        System.out.println(value.toLowerCase());
        System.out.println(value.toUpperCase());

        System.out.println(value.charAt(0));
        System.out.println(value.indexOf("Java"));
        System.out.println(value.lastIndexOf("Java"));

        System.out.println(value.substring(3));
        System.out.println(value.substring(0, 3));
    }
}
