package Day11;

interface MusicPlayer {
    void play();
}

class MP3Player implements MusicPlayer {
    public void play() {
        System.out.println("Playing MP3 Music");
    }
}

class BluetoothPlayer implements MusicPlayer {
    public void play() {
        System.out.println("Playing Bluetooth Music");
    }
}

public class Problem11 {
    public static void main(String[] args) {
        MusicPlayer m = new MP3Player();
        m.play();

        m = new BluetoothPlayer();
        m.play();
    }
}