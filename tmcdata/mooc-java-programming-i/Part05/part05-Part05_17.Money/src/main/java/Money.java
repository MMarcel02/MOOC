
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        int totalCents = euros*100 + cents;
        if (totalCents < 0) {
            this.euros = 0;
            this.cents = 0;
        } else {
            this.euros = totalCents/100;
            this.cents = totalCents % 100;
        }

        
    }

    public int euros() {
        return this.euros;
    }

    public int cents() {
        return this.cents;
    }

    public Money plus(Money addition) {
        Money newMoney = new Money(this.euros + addition.euros(), this.cents + addition.cents());
        return newMoney;
    }

    public Money minus(Money decrease) {
        Money newMoney = new Money(this.euros - decrease.euros(), this.cents - decrease.cents());
        return newMoney;
    }

    public boolean lessThan(Money compared) {
        if (this.euros > compared.euros()){
            return false;
        } else if (this.euros == compared.euros() && this.cents > compared.cents()){
            return false;
        } else {
            return true;
        }
    }

    public String toString() {
        String zero = "";
        if (this.cents < 10) {
            zero = "0";
        }

        return this.euros + "." + zero + this.cents + "e";
    }

}
