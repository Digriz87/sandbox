package ua.pro.hwlesson3;

public class SpaceStation {

    String rocketAtLaunch;
    Rocket rocket = new Rocket();

    public SpaceStation() {
        this.rocketAtLaunch = "Станция дает готовность!";

    }

    public void start() {
        rocket.checkEngine();
        rocket.checkFuel();

    }

}
