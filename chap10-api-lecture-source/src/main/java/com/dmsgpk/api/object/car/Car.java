package com.dmsgpk.api.object.car;

import java.util.Objects;

public class Car {

    private String carName;
    private String carColor;
    private int engineCC;


    public Car(String carName, String carColor, int engineCC) {
        this.carName = carName;
        this.carColor = carColor;
        this.engineCC = engineCC;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", carColor='" + carColor + '\'' +
                ", engineCC=" + engineCC +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;

        if (obj == null || getClass() != obj.getClass()) return false;

        Car car = (Car) obj;
        return this.carName.equals(car.carName) &&
                this.carColor.equals(car.carColor) &&
                this.engineCC == car.engineCC;
    }

    @Override
    public int hashCode() {
        final int PRIME = 31;
        int result = 1;
        result = PRIME * result + this.carColor.hashCode();
        result = PRIME * result + this.engineCC;
        result = PRIME * result + this.carName.hashCode();
        return result;

    }
}
