package ua.pro.hwlesson3;

public class MainPilot extends Pilot {

    public MainPilot(double salary, String namePilot, long pilotId) {
        super(salary, namePilot, pilotId);
    }

    @Override
    public void doWork() {
        System.out.println("Я главный на корабле");

    }
}
