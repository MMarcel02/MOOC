import java.util.ArrayList;

public class Suitcase {
    private ArrayList<Item> itemsInSuitcase;
    private int maxWeight;

    public Suitcase(int maxWeight) {
        this.itemsInSuitcase = new ArrayList<>();
        this.maxWeight = maxWeight;
    }

    public int totalWeight() {
        int totalWeight = 0;
        for (Item item : itemsInSuitcase) {
            totalWeight = totalWeight + item.getWeight();
        }
        return totalWeight;
    }

    public void addItem(Item item) {
        if (totalWeight() + item.getWeight() <= maxWeight) {
            itemsInSuitcase.add(item);
        }
    }

    public void printItems() {
        for (Item item : itemsInSuitcase) {
            System.out.println(item);
        }
    }

    public Item heaviestItem() {
        if (itemsInSuitcase.isEmpty()) {
            return null;
        }

        Item heaviestItem = itemsInSuitcase.get(0);
        for (Item item : itemsInSuitcase) {
            if (item.getWeight() > heaviestItem.getWeight()) {
                heaviestItem = item;
            }
        }
        return heaviestItem;
    }

    public String toString() {
        if (itemsInSuitcase.isEmpty()) {
            return "no items (0 kg)";
        } else if (itemsInSuitcase.size() == 1) {
            return "1 item (" + totalWeight() + " kg)";
        } else {
            return itemsInSuitcase.size() + " items (" + totalWeight() + " kg)";
        }
    }


}
