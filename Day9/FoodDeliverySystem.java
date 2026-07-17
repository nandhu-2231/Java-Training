package Day9;

// FoodDeliverySystem.java

class Food {
    void prepare() {
        System.out.println("Preparing food.");
    }
}

class Pizza extends Food {
    void prepare() {
        System.out.println("Preparing Pizza.");
    }
}

class Burger extends Food {
    void prepare() {
        System.out.println("Preparing Burger.");
    }
}

class Customer {
    String name;

    Customer(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Customer: " + name);
    }
}

class Order {
    Customer customer;   // Composition

    Order(Customer customer) {
        this.customer = customer;
    }

    void placeOrder(Food food) {   // Polymorphism
        customer.display();
        food.prepare();
        System.out.println("Order Delivered Successfully.");
    }
}

public class FoodDeliverySystem {
    public static void main(String[] args) {

        Customer customer = new Customer("Anand");

        Order order = new Order(customer);

        Food food;

        food = new Pizza();
        order.placeOrder(food);

        System.out.println();

        food = new Burger();
        order.placeOrder(food);
    }
}