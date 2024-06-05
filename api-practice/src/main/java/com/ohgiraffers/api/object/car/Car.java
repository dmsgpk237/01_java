package com.ohgiraffers.api.object.car;

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
        // 여기서 this는 mycar
        // 모든 객체는 object에 상속된다. 그래서 this는 주소를 담고 있다.
        // car를 상속받는 mycar가 가진 주소가 가리키는 객체와 obj가 가진 주소가 가리키는 객체와 같으면 true를 반환하겠다는 것.
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
