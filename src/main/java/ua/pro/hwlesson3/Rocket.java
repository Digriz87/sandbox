package ua.pro.hwlesson3;

public class Rocket extends SpaceCrafts {

    int fuel = 0;
    SpaceCrafts spaceCraft = new SpaceCrafts();

    public void checkFuel() {
        if (fuel == 0) {
            System.out.println("Станция: Двигатель заправлен на: " + fuel + " передаем на дозаправку");
            refuelRocket();

        } else {
            System.out.println("Станция: Двигатель заправлен на: " + fuel);

        }
    }

    public void checkEngine() {
        if (spaceCraft.engine.durability == true) {
            System.out.println("Станция: Двигатель в порядке");
            System.out.println("Станция: Параметры в порядке, готовы к старту, ждем ответа от Станции");

        } else {
            System.out.println("Станция: Что-то не так");

        }
    }

    public void refuelRocket() {
        this.fuel = 100;
        checkFuel();
    }
}


