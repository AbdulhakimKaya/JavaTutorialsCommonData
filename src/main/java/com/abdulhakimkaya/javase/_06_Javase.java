package com.abdulhakimkaya.javase;

import java.util.*;

public class _06_Javase {
    // Loop
    public static void loopFor() {
        for (int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        }
    }


    public static void loopWhile() {
        int i = 0;
        while (i < 10) {
            System.out.print(i + " ");
            i++;
        }
    }


    public static void loopDoWhile() {
        int i = 0;
        do {
            System.out.print(i + " ");
            i++;
        }
        while (i < 10);
    }


    // Exception Handling
    public static void exceptionHandling() {
        System.out.println("ilk data");
        try {
            int number = 3 / 0;
        } catch (ArithmeticException ae) {
            System.out.println(ae);
            ae.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
        System.out.println("son data");
    }


    // Array -> eleman sayısı bellidir
    public static void arrayTutorial() {
        int[] arr = new int[4];
        arr[0] = 3;
        arr[1] = 2;
        arr[2] = 7;
        System.out.println(arr[2]);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();

        Arrays.sort(arr);  // dizi küçükten büyüğe sıralanır

        // foreach
        for (int j : arr) {
            System.out.print(j + " ");
        }
    }


    // Collection -> eleman sayısı belli değilidir
    public static void collectionTutorial() {
        // List -> LAV (LinkedList, ArrayList, Vector)
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(10);
        list.add(17);
        list.add(21);
        list.add(13);

        list.stream().forEach(System.out::println);

        System.out.println("-------------");

        list.stream().forEach((temp) -> {
            System.out.println(temp);
        });

        System.out.println("-------------");

        for (Integer integer : list) {
            System.out.println(integer);
        }

        System.out.println("-------------");

        Collections.sort(list);  // collection küçükten büyüğe sıralandı

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

    }

    public static void collectionTutorial2() {
        // Küme -> HalaT
        Set<Integer> set = new LinkedHashSet<>();
        set.add(10);  // set yapısında tekrarlanan veri bi kere gösterilir
        set.add(10);
        set.add(17);
        set.add(21);
        set.add(13);

        set.stream().forEach(System.out::println);
    }

    public static void collectionTutorial3() {
        // Map
        Map<String, Object> map = new TreeMap<>();
        map.put(UUID.randomUUID().toString(), "Diyarbakır");
        map.put(UUID.randomUUID().toString(), "Malatya");

        for (String temp : map.keySet()) {
            System.out.println(temp + " -> " + map.get(temp));
        }
    }

    public static void collectionTutorial4() {
        // 1-9 arasında rastgele sayı oluşturulması ve bu sayıların toplamını veren algoritma
        int[] arr = new int[5];
        Random random = new Random();
        int toplam = 0;
        int tekToplam = 0;
        int ciftToplam = 0;

        for (int i = 0; i < arr.length; i++) {
            int temp = random.nextInt(0,10);
            arr[i] = temp;
            toplam += arr[i];
            if (arr[i] %2 == 0) {
                ciftToplam += arr[i];
            }
            else {
                tekToplam += arr[i];
            }
        }

        for (int temp : arr) {
            System.out.print(temp + " ");
        }

        System.out.println("\nToplam: " + toplam);
        System.out.println("Tek Sayıların Toplamı: " + tekToplam);
        System.out.println("Çift Sayıların Toplamı: " + ciftToplam);
    }

    public static void main(String[] args) {
//        loopFor();
//        System.out.println();
//        loopWhile();
//        System.out.println();
//        loopDoWhile();
//        System.out.println();
//        exceptionHandling();
//        arrayTutorial();
//        collectionTutorial();
//        collectionTutorial2();
//        collectionTutorial3();
        collectionTutorial4();
    }
}
