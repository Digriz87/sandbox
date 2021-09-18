package ua.pro.hwlesson3;

public abstract class Pilot implements Payable {

    private  double salary;
    private static long idCounter = 0;

    private String namePilot;
    private final long pilotId;


    public Pilot(double salary, String namePilot, long pilotId) {
        super();
        this.salary = salary;
        this.namePilot = namePilot;
        this.pilotId = ++idCounter;
    }

    public abstract void doWork();

    @Override
    public void takeMoney(double money) {
        if (salary == money){
            System.out.println("Оплата получена");
        }else {
            System.out.println("No money no honey");
        }

    }
}
