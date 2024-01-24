package rvt;

public class Money {

    private final int euros;
    private final int cents;

    public static void main(String[] args) {
        Money macins1 = new Money(10,40); 
        
        Money macins2 = new Money(5,70);
        
        Money macins3 = macins1.plus(macins2);

        System.out.println(macins1);
    }

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public Money() {
        this.euros = 0;
        this.cents = 0;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

public Money plus(Money addition) {
    int newEuros = this.euros + addition.euros();
    int newCents = this.cents + addition.cents();
    Money newMoney = new Money(newEuros, newCents);

    if (newCents >= 100) {
        newCents -= 100;
        newEuros++;
    }

    return newMoney;
}

public boolean lessThan(Money compared) {
    if (this.euros < compared.euros()) {
        return true;
    }

    if (this.euros == compared.euros() && this.cents < compared.cents()) {
        return true;
    }

    return false;
}

public Money minus(Money decreaser) { 
    
    int newEuros = this.euros - decreaser.euros();
    int newCents = this.cents - decreaser.cents();
    Money newMoney = new Money(newEuros, newCents);
    
    if (newEuros < 0) {
        newEuros = newEuros - 1;
        newCents = newCents + 100; 
    }
    return newMoney;


}
}