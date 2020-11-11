package com.yesilmen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {


    public static void main(String[] args) {


        System.out.println(" 1 - Aritmetik ortalama");

        AortTask aortTask = new AortTask(0, 2000);
        aortTask.run();

        System.out.println(" 2 - Araba");
        Car mercedes = new Car("Mercedes", "Kırmızı", true);
        Car bmv = new Car("BMV", "Mavi", false);

        mercedes.getCarDetail();
        bmv.getCarDetail();


        System.out.println("//3- Private constructor tanımlanabilir.\n" +
                "        /*\n" +
                "         * Bazı durumlarda direk olarak nesne üretilmesini istemeyiz.\n" +
                "         * Nesne üretilirken belli kontroller olabilir\n" +
                "         *\n" +
                "         * Örneğin bir nesnenin birden fazla üretilmesini engellemek amacıyla kullanılır.\n" +
                "         *\n" +
                "         * */");


        Singleton singleton1 = Singleton.newObject();
        Singleton singleton2 = Singleton.newObject();

        System.out.println("Singleton Memory Address 1 : " + singleton1.hashCode());
        System.out.println("Singleton Memory Address 2 : " + singleton2.hashCode());


        App app1 = new App();
        App app2 = new App();

        System.out.println("App Memory Address 1 : " + app1.hashCode());
        System.out.println("App Memory Address 2 : " + app2.hashCode());


        //----------------------------------------------------------------------------------//

        System.out.println("Sayı yuvarlama");

        NumberUtils numberUtils = new NumberUtils();

        numberUtils.ask("Ondalıklı Sayi yazınız : ");

        String stringValue = numberUtils.getData().trim();

        if (!numberUtils.checkDouble(stringValue)) {
            System.out.println("Lütfen Geçerli bir ondalıklı sayı yazınız.");
            System.exit(0);
        }

        double num = Double.parseDouble(stringValue);

        numberUtils.ask("Sayı nasıl yuvarlansin ? aşağı (a) / Yukarı (y) - Default (a) ");

        String value = numberUtils.getData().trim();

        System.out.println("Yazılan sayı : " + num);
        System.out.println("Yazılan Değer : " + value);


        if (value.equals("y")) {
            System.out.println("Yukarı Yuvarlama : : " + numberUtils.toString(numberUtils.ceil(num)));
            System.exit(0);
        }

        System.out.println("Aşağı Yuvarlama : : " + numberUtils.toString(numberUtils.round(num)));
    }


}


