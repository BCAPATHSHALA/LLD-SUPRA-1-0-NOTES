import java.util.ArrayList;
import java.util.List;

class Playlist {
    List<String> videos = new ArrayList<>();

    public void addVideo(String video) {
        videos.add(video);
    }

    public void playAll() {
        for (int i = 0; i < videos.size(); i++) {
            System.out.println("Playing: " + videos.get(i));
        }
    }
}

public class WithoutIterator {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addVideo("Video 1");
        playlist.addVideo("Video 2");
        playlist.addVideo("Video 3");

        playlist.playAll();  // Manually iterating
    }
}

/*
OUTPUT:
Playing: Video 1
Playing: Video 2
Playing: Video 3
*/