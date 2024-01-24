package rvt;

public class PaymentTerminal {
    private double money;  
    private int affordableMeals; 
    private int heartyMeals;  

    public PaymentTerminal() {
       money = 1000;
    }

    public double eatAffordably(double payment) {
        if (payment >= 2.50) {
            money += 2.50;
            affordableMeals++;
            return payment - 2.50;
        } else {
            return payment;
        }
    }

    public double eatHeartily(double payment) {
        if (payment >= 4.30) {
            money += 4.30;
            heartyMeals++;
            return payment - 4.30;
        } else {
            return payment;
        }
    }

    public boolean eatAffordably(PaymentCard card) {
        if (card.balance() >= 2.50) {
            card.takeMoney(2.50);
            affordableMeals++;
            return true;
        } else {
            return false;
        }
    }

    public boolean eatHeartily(PaymentCard card) {
        if (card.balance() >= 4.30) {
            card.takeMoney(4.30);
            heartyMeals++;
            return true;
        } else {
            return false;
        }
    }

    public void addMoneyToCard(PaymentCard card, double sum) {
        if (sum > 0) {
            card.addMoney(sum);
            money += sum;
        }
    }
    
    public String toString() {
        return "money: " + money + ", number of sold afforable meals: " + affordableMeals + ", number of sold hearty meals: " + heartyMeals;
    }
 
}