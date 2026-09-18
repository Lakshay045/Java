class Product {
    String productName;
    double price;

    static int totalProducts = 0;
    static double totalInventoryValue = 0;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;

        totalProducts++;
        totalInventoryValue += price;
    }

    static void calculateTotalInventoryValue() {
        System.out.println("Total Products: " + totalProducts);
        System.out.println("Total Inventory Value: " + totalInventoryValue);
    }

    public static void main(String[] args) {
        Product p1 = new Product("Laptop", 50000);
        Product p2 = new Product("Mobile", 20000);
        Product p3 = new Product("Headphones", 5000);

        Product.calculateTotalInventoryValue();
    }
}