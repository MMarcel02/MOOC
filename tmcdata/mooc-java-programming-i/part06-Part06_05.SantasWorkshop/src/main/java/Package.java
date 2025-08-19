import java.util.ArrayList;

public class Package {
    private ArrayList<Gift> gifts;

    public Package() {
        this.gifts = new ArrayList<>();
    }

    public void addGift(Gift gift) {
        this.gifts.add(gift);
    }

    public int totalWeight() {
        int weightTracker = 0;
        for (Gift gift : gifts) {
            weightTracker = weightTracker + gift.getWeight();
        }
        return weightTracker;
    }
}
