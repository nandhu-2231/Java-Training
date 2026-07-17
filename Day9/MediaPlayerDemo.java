package Day9;

// MediaPlayerDemo.java

class Media {
    void play() {
        System.out.println("Playing media.");
    }
}

class Audio extends Media {
    void play() {
        System.out.println("Playing Audio.");
    }
}

class Video extends Media {
    void play() {
        System.out.println("Playing Video.");
    }
}

class Podcast extends Media {
    void play() {
        System.out.println("Playing Podcast.");
    }
}

public class MediaPlayerDemo {
    public static void main(String[] args) {

        Media media;

        media = new Audio();
        media.play();

        media = new Video();
        media.play();

        media = new Podcast();
        media.play();
    }
}