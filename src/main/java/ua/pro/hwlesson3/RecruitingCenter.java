package ua.pro.hwlesson3;

public class RecruitingCenter implements Payable {

    private String country;
    private double budget;

    public RecruitingCenter(String country) {
        this.country = country;
        this.budget = 10000.0;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }


    @Override
    public void takeMoney(double money) {
        System.out.println("Ваша оплата произведена на карту");
    }
}
