import java.util.ArrayList;
import java.util.Scanner;

class Song {
    private String title;
    private String artist;
    private String mood;

    Song(String title, String artist, String mood) {
        this.title = title;
        this.artist = artist;
        this.mood = mood;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getMood() {
        return mood;
    }
}

class MusicApplication {
    private ArrayList<Song> songs;

    MusicApplication() {
        this.songs = new ArrayList<Song>();

    }

    public void addSong(Song song) {
        songs.add(song);

    }

    public void playMoodPlaylist(String mood) {
        System.out.println("Playing " + mood + " playlist...");
        System.out.println("");

        for (int i = 0; i < songs.size(); i++) {
            Song song = songs.get(i);

            if (mood.equalsIgnoreCase(song.getMood())) {
                System.out.println("Title: " + song.getTitle());
                System.out.println("Artist: " + song.getArtist());
                System.out.println("");
            }
        }
    }
}

public class MusicApplicationWithMoodPlaylist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MusicApplication musicApp = new MusicApplication();

        musicApp.addSong(new Song("Shape of You", "Ed Sheeran", "Upbeat"));
        musicApp.addSong(new Song("Thinking Out Loud", "Ed Sheeran", "Romantic"));

        musicApp.addSong(new Song("Lose You to Love Me", "Selena Gomez", "Sad"));

        musicApp.addSong(new Song("Someone You Loved", "Lewis Capaldi", "Sad"));


        System.out.println("Enter mood (Upbeat, Romantic, Sad): ");
        String mood = scanner.nextLine();

        musicApp.playMoodPlaylist(mood);
    }
}
