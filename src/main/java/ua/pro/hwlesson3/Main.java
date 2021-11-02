package ua.pro.hwlesson3;

public class Main {

    public static void main(String[] args) {
        Rocket rocket = new Rocket("SpaceX");

        Pilot mainPilot = new MainPilot(1000, "Kenny", 21);
        Pilot secondPilot = new SecondPilot(500, "John", 30);
        RecruitingCenter recruiting = new RecruitingCenter("USA");

        mainPilot.doWork();
        secondPilot.doWork();

        rocket.setPilot(mainPilot);
        rocket.setPilot(secondPilot);

        Payable[] receivers = new Payable[2];
        receivers[0] = mainPilot;
        receivers[1] = secondPilot;

        for (Payable receiver : receivers) {
            if (receiver != null) {
                recruiting.setBudget(recruiting.getBudget() - 100);
                receiver.takeMoney(500);
            }
        }

        SpaceStation spaceStation = new SpaceStation(rocket);
        spaceStation.start();
        spaceStation.rocketAtLaunch();
    }
}
