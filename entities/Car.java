package entities;

import exception.NumberEqualsZero;

public class Car {

    private String carName;
    private int petrolLtrs;
    private int km;

    public Car(String carName) {

        this.carName = carName;

    }

    @Override
    public String toString() {
        return "Car{" +
                "carName='" + carName + '\'' +
                ", petrolLtrs=" + petrolLtrs +
                ", km=" + km +
                '}';
    }

    public String getCarName() {
        return carName;
    }

    public void setCarName(String carName) {
        this.carName = carName;
    }

    public double getPetrolLtrs() {
        return petrolLtrs;
    }

    public void setPetrolLtrs(int petrolLtrs) {
        this.petrolLtrs = petrolLtrs;
    }

    public double getKm() {
        return km;
    }

    public void setKm(int km) {
        if (km <= 0)
            throw new NumberEqualsZero(km);
        else this.km = km;


    }
}
