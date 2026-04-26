class Product {
    String name;
    int quantity;
    double price;

    Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
    }

    void purchase(int amount) {
        if (amount <= quantity) {
            quantity -= amount;
            System.out.println(amount + " " + name + "(s) purchased.");
        } else {
            System.out.println("Not enough stock for " + name);
        }
    }

    void restock(int amount) {
        quantity += amount;
        System.out.println(name + " restocked by " + amount);
    }

    void display() {
        System.out.println("Product: " + name + ", Price: " + price + ", Quantity: " + quantity);
    }
}