package com.yesilmen;

public class Car {

    private String brand;
    private String color;
    private boolean hasSunroof;


    private Car() {
        this.brand="Bilinmeyen Marka";
        this.color="Bilinmeyen Renk";
        this.hasSunroof= false;

    }

    public Car(String brand, String color, boolean hasSunroof) {
        this.brand = brand;
        this.color = color;
        this.hasSunroof = hasSunroof;
    }


    public void getCarDetail () {

        System.out.println("---------------------\n");
        System.out.println("Marka : " + this.brand + "\n");
        System.out.println("Renk : " + this.color + "\n");
        System.out.println("Sunroof : " + sunroofToString() + "\n");

    }


    public String sunroofToString() {

        return (this.hasSunroof) ? "Var": "Yok";


    }
}
