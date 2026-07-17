package Day9;

// CompositionDemo.java

class Furniture {
    String name;

    Furniture(String name) {
        this.name = name;
    }

    void display() {
        System.out.println("Furniture: " + name);
    }
}

class Room {
    String roomName;
    Furniture furniture;

    Room(String roomName, String furnitureName) {
        this.roomName = roomName;
        furniture = new Furniture(furnitureName);
    }

    void display() {
        System.out.println("Room: " + roomName);
        furniture.display();
    }
}

class House {
    String owner;
    Room room;

    House(String owner, String roomName, String furnitureName) {
        this.owner = owner;
        room = new Room(roomName, furnitureName);
    }

    void display() {
        System.out.println("Owner: " + owner);
        room.display();
    }
}

public class CompositionDemo {
    public static void main(String[] args) {

        House house = new House("Rahul", "Bedroom", "Bed");

        house.display();
    }
}