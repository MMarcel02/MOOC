public class Product {
    private String name;
    private int quantity;
    private double price;

    public Product(String initalName, double initalPrice, int initalQuantity) {
        this.name = initalName;
        this.quantity = initalQuantity;
        this.price = initalPrice;
    }

    public void printProduct() {
        System.out.println(this.name + ", price " + this.price + ", " + this.quantity + " pcs");
    }

}
