class ShoppingCart {
    String productName;
    double price;

    static int numberOfProducts = 0;
    static double totalValue = 0;

    ShoppingCart(String productName, double price) {
        this.productName = productName;
        this.price = price;

        numberOfProducts++;
        totalValue += price;
    }

    static void displayStatistics() {
        System.out.println("Number of Products: " + numberOfProducts);
        System.out.println("Total Value of All Products: " + totalValue);
    }

    public static void main(String[] args) {
        ShoppingCart p1 = new ShoppingCart("Laptop", 60000);
        ShoppingCart p2 = new ShoppingCart("Mouse", 1000);
        ShoppingCart p3 = new ShoppingCart("Keyboard", 2000);

        ShoppingCart.displayStatistics();
    }
}