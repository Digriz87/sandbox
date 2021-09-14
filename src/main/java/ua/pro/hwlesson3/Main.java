package ua.pro.hwlesson3;

public class Main {

    public static void main(String[] args) {
        Rocket rocket = new Rocket();
        SpaceStation spaceStation = new SpaceStation(rocket);
        spaceStation.start();
        spaceStation.rocketAtLaunch();
    }
}
