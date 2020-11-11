package com.yesilmen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class NumberUtils {
    BufferedReader reader;

    NumberUtils() {

        reader = new BufferedReader(new InputStreamReader(System.in));

    }

    public void ask(String question) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(question);
    }


    public String getData() {
        String data = null;
        try {
            data = reader.readLine();
        } catch (IOException e) {
            data = "";
        }

        return data;
    }

    public double round(double num) {
        return Math.round(num);
    }

    public double ceil(double num) {
        return Math.ceil(num);
    }

    public String toString(Double num) {
        return String.valueOf(num);
    }

    public boolean checkDouble(String num) {

        if (num.trim().equals("")) {
            return false;
        }

        String pattern = "([0-9]*)\\.([0-9]*)";
        return Pattern.matches(pattern, num);
    }

}
