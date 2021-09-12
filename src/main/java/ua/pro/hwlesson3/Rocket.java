package ua.pro.hwlesson3;

public class Rocket extends SpaceStation {


    public static void main(String[] args) {
        SpaceCrafts spacecrafts = new  SpaceCrafts();
        Engine engineSpaceX = new  Engine();
        SpaceStation spaceStation = new SpaceStation();
        checkParamsFuel (spacecrafts.fuel);
        checkEngineSpaceX (engineSpaceX.durability);
        System.out.println(spaceStation.gives);
        String startFromSpaceStation = spacecrafts.start();
        startSpaceX(startFromSpaceStation);

    }

    private static void startSpaceX(String startFromSpaceStation) {

        System.out.println(startFromSpaceStation);

    }

    private static void checkEngineSpaceX(boolean durability) {
        if (durability == true) {
            System.out.println("Космонавт: Двигатель в порядке");
            System.out.println("Космонавт: Параметры в порядке, готовы к старту, ждем ответа от Станции");

        }else
        {
            System.out.println("Что-то не так");

        }
    }


    public static void checkParamsFuel(int fuel) {

        if (fuel == 0) {
            System.out.println("Космонавт: Двигатель заправлен на: " + fuel + " передаем на дозаправку");
            refuelRocket ();

        }else
        {
            System.out.println("Станция: Двигатель заправлен на: " + fuel);

        }
    }

    public static void refuelRocket() {
        int fuel = 100;
        checkParamsFuel(fuel);

    }




}


