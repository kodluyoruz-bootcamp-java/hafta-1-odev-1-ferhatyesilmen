package com.yesilmen;

public class Singleton {


    private static Singleton object = null;


    private Singleton() {

    }

    public static Singleton newObject() {

        if (object == null) {
            object = new Singleton();
        }
        return object;
    }

}
