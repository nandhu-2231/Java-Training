package Day7;

public class Problem5  {
    String name;

    Problem5(String name) {
        this.name = name;
    }
}

class Product {
    String productName;
    double price;

    Product(String productName, double price) {
        this.productName = productName;
        this.price = price;
    }
}

class Order {
    Problem5 customer;
    Product product;
    int quantity;

    Order(Problem5 customer, Product product, int quantity) {
        this.customer = customer;
        this.product = product;
        this.quantity = quantity;
    }

    void displayOrder() {
        System.out.println("Customer: " + customer.name);
        System.out.println("Product: " + product.productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + (product.price * quantity));
    }

    public static void main(String[] args) {

        Problem5 c = new Problem5("Rahul");

        Product p = new Product("Laptop", 60000);

        Order o = new Order(c, p, 2);

        o.displayOrder();
    }
}

