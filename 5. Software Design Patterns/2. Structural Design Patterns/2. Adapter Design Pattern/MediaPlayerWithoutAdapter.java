// Existing class to play audio
class AudioPlayer {
    public void playAudio(String fileName) {
        System.out.println("Playing audio: " + fileName);
    }
}

// Client code
public class MediaPlayerWithoutAdapter {
    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();

        audioPlayer.playAudio("song.mp3"); // This will work fine

        // Cannot play video files!
        // audioPlayer.playVideo("movie.mp4"); -> This won't work
    }
}
