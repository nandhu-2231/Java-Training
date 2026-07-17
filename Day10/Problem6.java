package Day10;
interface MusicSource {
    void play();
}

class MP3Player implements MusicSource {
    public void play() {
        System.out.println("Playing music from MP3.");
    }
}

class BluetoothPlayer implements MusicSource {
    public void play() {
        System.out.println("Playing music via Bluetooth.");
    }
}

class MusicPlayer {
    MusicSource source;

    MusicPlayer(MusicSource source) {
        this.source = source;
    }

    void startMusic() {
        source.play();
    }
}

public class Problem6 {
    public static void main(String[] args) {

        MusicSource mp3 = new MP3Player();
        MusicPlayer player1 = new MusicPlayer(mp3);
        player1.startMusic();

        MusicSource bluetooth = new BluetoothPlayer();
        MusicPlayer player2 = new MusicPlayer(bluetooth);
        player2.startMusic();
    }
}
