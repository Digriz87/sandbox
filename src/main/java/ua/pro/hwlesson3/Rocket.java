package ua.pro.hwlesson3;

public class Rocket extends SpaceCrafts {

    int fuel = 0;
    Engine engine = new Engine(true);

    public int checkFuel(int fuel) {
        return fuel;
    }

    public boolean checkEngine() {
        return engine.check();
    }
}


