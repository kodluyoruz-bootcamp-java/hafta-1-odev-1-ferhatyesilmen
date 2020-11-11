package com.yesilmen;

public class AortTask {

    private int min;
    private int max;
    private int count;
    private float total;

    AortTask(int min, int max) {
        this.min = min;
        this.max = max;
        this.total = 0;
        this.count = 0;
    }


    void run() {


        for (int i = this.min; i <= this.max; i++) {
            if (i % 3 == 0 && i % 5 == 0 || i % 7 == 0 || i % 53 == 0) {
                this.total += i;
                this.count++;
            }
        }

        double aort = this.total / this.count;

        System.out.println("Toplam : " + this.total + "\n");
        System.out.println("Adet : " + this.count + "\n");
        System.out.println("Aort : " + aort + "\n");


    }

    public boolean aort(int number, int mod) {

        return (number % mod==0);


    }
}
