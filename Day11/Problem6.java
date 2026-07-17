package Day11;
interface Notification {
    void send();
}

class Email implements Notification {
    public void send() {
        System.out.println("Email Sent");
    }
}

class SMS implements Notification {
    public void send() {
        System.out.println("SMS Sent");
    }
}

public class Problem6 {
    public static void main(String[] args) {
        Notification n = new Email();
        n.send();

        n = new SMS();
        n.send();
    }
}