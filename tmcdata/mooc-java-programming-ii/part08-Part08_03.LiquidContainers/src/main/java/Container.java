
public class Container {
    private int amount;
    private String name;

    public Container(String name) {
        this.name = name;
        this.amount = 0;
    }

    public int getAmount() {
        return amount;
    }

    public void add(int addAmount) {
        if (addAmount > 0) {
            if (addAmount + amount < 100) {
                amount += addAmount;
            } else {
                amount = 100;
            }
        }
    }

    public void remove(int removeAmount) {
        if (removeAmount > 0) {
            if (amount - removeAmount > 0) {
                amount -= removeAmount;
            } else {
                amount = 0;
            }
        }
    }

    public String toString() {
        return name + ": " + amount + "/100";
    }

}
