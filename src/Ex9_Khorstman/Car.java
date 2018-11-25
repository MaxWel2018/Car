package Ex9_Khorstman;

import java.io.IOException;
import java.sql.SQLOutput;

public class Car {
    public Car(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
        this.xStart = 0;
        this.volumeOfTheTank = 100;

    }

    private int xStart;
    private int xEnd;
    private int volumeOfTheTank;
    private int fuelLevel;
    private double fuelConsumption;

    public void dirve(int range) {
        for (int i = 0; i < range; i++) {
            if (fuelLevel>0) {
                this.xEnd += 1;
                System.out.println("Проехал "+ (i+1) +" км......");
                fuelLevel -= fuelConsumption;
            }else {
                System.out.println("В машине закончился бензин.....");
            }
        }
        System.out.println("поездка окончена");

    }

    public void fillTank(int l) {
        if ((fuelLevel+l)<=volumeOfTheTank) {
            this.fuelLevel += l;
        }else {
            System.out.println("В бак столько не влезет :).Максимум можешь залить ещё "+ (volumeOfTheTank-fuelLevel)+ " литров");

        }
    }

    public void distance() {
        System.out.println("Всего проехано: " + ( xEnd - xStart) + " Км");
    }

    public void getFuelLevel() {
        System.out.println("В баке ещё " + fuelLevel+ " Литров");
    }
}
