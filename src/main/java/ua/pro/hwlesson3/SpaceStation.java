package ua.pro.hwlesson3;

public class SpaceStation {

    String rocketAtLaunch;
    Rocket rocket;

    public SpaceStation(Rocket rocket) {
        this.rocket = rocket;
    }

    public void start() {
        rocket.checkFuel(rocket.fuel);
        if (rocket.checkFuel(rocket.fuel) != 100) {
            System.out.println("Станция: Двигатель заправлен на: 0 передаем на дозаправку");
            refuelRocket();
            System.out.println("Станция: Двигатель заправлен на: 100");
        }

        if (rocket.checkEngine()) {
            System.out.println("Станция: Двигатель в порядке");
        }
    }
    public void refuelRocket() {
        rocket.fuel = 100;
    }

    public String rocketAtLaunch() {
        System.out.println("запуск ракеты");
        return rocketAtLaunch;
    }
}
