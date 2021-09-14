package ua.pro.hwlesson3;

public class SpaceStation {

    String rocketAtLaunch;
    Rocket rocket;



    public SpaceStation(Rocket rocket) {
        this.rocket = rocket;

    }

    public void start(){
        rocket.checkFuel(rocket.fuel);
         if (rocket.checkFuel(rocket.fuel) != 100){
             System.out.println("Станция: Двигатель заправлен на: 0 передаем на дозаправку");
             rocket.refuelRocket();
             System.out.println("Станция: Двигатель заправлен на: 100");
         }
         rocket.checkEngine(rocket.engine);
        if (rocket.checkEngine(rocket.engine) == true){
            System.out.println("Станция: Двигатель в порядке");

        }


    }

    public String  rocketAtLaunch () {
        System.out.println("запуск ракеты");
        return rocketAtLaunch;
    }
}
