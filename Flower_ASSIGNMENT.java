public class Flower_ASSIGNMENT {
    private String name, color;
    private double price;
    private int quantity;

    // Constructor without parameters
    public Flower_ASSIGNMENT() {
        name = "";
        color = "";
        price = 0.00;
        quantity = 0;
    }

    // Parameterized constructor
    public Flower_ASSIGNMENT(String name, String color, double price, int quantity) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    // Accessors (getters)
    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    // Mutator (setter) to change object state
    public void setAllData(String name, String color, double price, int quantity) {
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantity = quantity;
    }

    // Method to calculate price
    public double calculatePrice() {
        return quantity * price;
    }

    // toString method
    @Override
    public String toString() {
        return "\nFlower Name   : " + name +
               "\nColor         : " + color +
               "\nQuantity      : " + quantity +
               "\nPrice         : RM" + calculatePrice();
    }
}
