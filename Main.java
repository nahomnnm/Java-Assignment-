public class Main {
    public static void main(String[] args) {

        ElectronicItem laptop = new ElectronicItem("Laptop", 10, 1200.0, 24);

        laptop.display();
        laptop.purchase(2);
        laptop.restock(5);
        laptop.showWarranty();
    }
} 