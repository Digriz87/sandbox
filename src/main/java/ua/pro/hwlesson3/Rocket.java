package ua.pro.hwlesson3;

public class Rocket extends SpaceCrafts {

    int fuel = 0;
    Engine engine = new Engine(true);
    Rocket rocket;
    SpaceStation spaceStation = new SpaceStation(rocket);




    public int checkFuel(int fuel) {
        return fuel;
    }

    public boolean checkEngine(Engine engine) {
          return true;
    }

    public void refuelRocket() {
        fuel = 100;

    }
}


