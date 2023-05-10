package com.abdulhakimkaya.javase;

public class _02_Javase {

    //    Method
    public static void voidliParametresiz() {
        System.out.println("Voidli Parametresiz");
    }

    public static void voidliParametreli(String name) {
        System.out.println("Voidli Parametreli " + name);
    }

    public static String voidsizParametresiz() {
        return "Voidsiz Parametreli";
    }

    public static String voidsizParametreli(String name) {
        return "Voidsiz Parametreli " + name;
    }

    public static void main(String[] args) {
        voidliParametresiz();
        voidliParametreli("fonksiyon");

        String changeData = voidsizParametresiz();
        System.out.println(changeData);

        String changeData2 = voidsizParametreli("fonksiyon");
        System.out.println(changeData2);
    }
}
