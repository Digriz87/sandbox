package ua.pro.hwlesson3;

public class Rocket extends SpaceCrafts {

    int fuel = 0;
    Engine engine = new Engine(true);
    private String nameRocket;
    private Pilot[] pilots;


    public Rocket(String nameRocket) {
        this.nameRocket = nameRocket;
        this.pilots = new Pilot[3];

    }


    public String getNameRocket() {
        return nameRocket;
    }

    public void setNameRocket(String nameRocket) {
        this.nameRocket = nameRocket;
    }

    public Pilot[] getPilots() {
        return pilots;
    }

    public void setPilot(Pilot pilot) {
        for (int i = 0; i <= getPilots().length - 1; i++) {
            if (pilots[i] == null) {
                pilots[i] = pilot;
            }
        }

    }


    public int checkFuel(int fuel) {
        return fuel;
    }

    public boolean checkEngine() {
        return engine.check();
    }


}


