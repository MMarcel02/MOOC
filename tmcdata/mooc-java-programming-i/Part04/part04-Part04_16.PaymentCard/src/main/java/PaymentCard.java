public class PaymentCard {
    private double balance;
    private String name;

    public PaymentCard(double openingBalance, String initalName) {
        this.balance = openingBalance;
        this.name = initalName;
    }

    public String toString() {
       return (this.name + ": The card has a balance of " + this.balance + " euros");
    }

    public void eatAffordably() {
        if (balance >= 2.6) {
            this.balance = this.balance - 2.6;
        } 
    }

    public void eatHeartily() {
        if (balance >= 4.6) {
            this.balance = this.balance - 4.6;
        }
    }

    public void addMoney(double amount) {
        if (this.balance + amount > 150) {
            this.balance = 150;
        } else if (amount > 0) {
            this.balance = this.balance + amount;
        }
    }
}
