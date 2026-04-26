class ElectronicItem extends Product {
    int warrantyMonths;

    ElectronicItem(String name, int quantity, double price, int warrantyMonths) {
        super(name, quantity, price);
        this.warrantyMonths = warrantyMonths;
    }

    void showWarranty() {
        System.out.println(name + " warranty: " + warrantyMonths + " months");
    }
}