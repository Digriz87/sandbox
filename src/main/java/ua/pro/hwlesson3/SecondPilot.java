package ua.pro.hwlesson3;

public class SecondPilot extends Pilot{

    public SecondPilot(double salary, String namePilot, long pilotId) {
        super(salary, namePilot, pilotId);
    }

    @Override
    public void doWork() {
        System.out.println("Помогаю своему первому пилоту");
    }
}
