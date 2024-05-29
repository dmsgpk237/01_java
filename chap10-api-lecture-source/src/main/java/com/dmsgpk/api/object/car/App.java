package com.dmsgpk.api.object.car;

public class App {

    public static void main(String[] args) {

        Car myCar = new Car("Sonata", "검정", 2000);
        System.out.println(myCar);
        System.out.println(myCar.hashCode());

        Car yourCar = new Car("Sonata", "검정", 2000);
        System.out.println(yourCar);
        System.out.println(yourCar.hashCode());

        Car hisCar = new Car("Sonata", "화이트", 2000);
        System.out.println(hisCar);
        System.out.println(hisCar.hashCode());


        System.out.println(myCar.equals(yourCar)); // true

        System.out.println(myCar.hashCode() == yourCar.hashCode()); // true

        System.out.println(myCar.equals(hisCar)); // false

        System.out.println(myCar.hashCode() == hisCar.hashCode()); // false

    }


}
