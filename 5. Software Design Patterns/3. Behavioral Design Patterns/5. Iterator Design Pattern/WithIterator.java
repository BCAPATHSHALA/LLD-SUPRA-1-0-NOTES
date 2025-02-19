import java.util.ArrayList;
import java.util.List;

// Step 1: Iterator Interface
interface Iterator {
    boolean hasNext();
    String next();
}

// Step 2: Concrete Iterator Class
class VideoIterator implements Iterator {
    private List<String> videos;
    private int index = 0;

    public VideoIterator(List<String> videos) {
        this.videos = videos;
    }

    @Override
    public boolean hasNext() {
        return index < videos.size();
    }

    @Override
    public String next() {
        if (hasNext()) {
            return videos.get(index++);
        }
        return null;
    }
}

// Step 3: Collection Interface
interface PlaylistCollection {
    Iterator createIterator();
}

// Step 4: Concrete Collection Class
class Playlist implements PlaylistCollection {
    private List<String> videos = new ArrayList<>();

    public void addVideo(String video) {
        videos.add(video);
    }

    @Override
    public Iterator createIterator() {
        return new VideoIterator(videos);
    }
}

// Step 5: Client Code (Main Method)
public class WithIterator {
    public static void main(String[] args) {
        Playlist playlist = new Playlist();
        playlist.addVideo("Video 1");
        playlist.addVideo("Video 2");
        playlist.addVideo("Video 3");

        Iterator iterator = playlist.createIterator();
        
        while (iterator.hasNext()) {
            System.out.println("Playing: " + iterator.next());
        }
    }
}
