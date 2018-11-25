package Ex9_Khorstman;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        Car BMW = new Car(0.120);

        BMW.fillTank(100);
        BMW.dirve(10);
        BMW.getFuelLevel();
        BMW.dirve(30);
        BMW.dirve(5);
        BMW.getFuelLevel();
        BMW.distance();

    }
}
