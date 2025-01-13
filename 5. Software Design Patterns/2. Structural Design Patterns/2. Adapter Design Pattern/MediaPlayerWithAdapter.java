// Step 1: Target Interface
interface MediaPlayer {
    void play(String mediaType, String fileName);
}

// Step 2: Adaptee (Existing classes)
class AudioPlayer {
    public void playAudio(String fileName) {
        System.out.println("Playing audio: " + fileName);
    }
}

class VideoPlayer {
    public void playVideo(String fileName) {
        System.out.println("Playing video: " + fileName);
    }
}

// Step 3: Adapter Class
class MediaAdapter implements MediaPlayer {
    private AudioPlayer audioPlayer = new AudioPlayer();
    private VideoPlayer videoPlayer = new VideoPlayer();

    @Override
    public void play(String mediaType, String fileName) {
        if (mediaType.equalsIgnoreCase("audio")) {
            audioPlayer.playAudio(fileName);
        } else if (mediaType.equalsIgnoreCase("video")) {
            videoPlayer.playVideo(fileName);
        } else {
            System.out.println("Invalid media type: " + mediaType);
        }
    }
}

// Step 4: Client Code
public class MediaPlayerWithAdapter {
    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaAdapter();
        mediaPlayer.play("audio", "song.mp3");
        mediaPlayer.play("video", "movie.mp4");
    }
}
