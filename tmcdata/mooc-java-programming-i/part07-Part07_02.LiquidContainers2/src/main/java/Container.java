

public class Container {
    private int value;
    private int lowerLimit;
    private int upperLimit;


    public Container() {
        this.value = 0;
        this.lowerLimit = 0;
        this.upperLimit = 100;
    }

    public int contains() {
        return this.value;
    }

    public int lowerLimit() {
        return lowerLimit;
    }

    public int upperLimit() {
        return upperLimit;
    }

    public void add(int amount) {
        if (amount > 0) {
            if (amount + this.value < this.upperLimit) {
                this.value += amount;
            } else {
                this.value = this.upperLimit;
            }
        }
    }

    public void remove(int amount) {
        if (amount > 0) {
            if (this.value - amount < this.lowerLimit) {
                this.value = this.lowerLimit;
            } else {
                this.value -= amount;
            }
        }
    }
    
    public void move(int amount, Container containerTo) {
        if (amount > 0) {
            if (this.value - amount < this.lowerLimit) {
                containerTo.add(this.value);
                remove(amount);
            } else {
                remove(amount);
                containerTo.add(amount);
            }
        }
    }

    public String toString() {
        return value + "/" + upperLimit;
    }
    
}
