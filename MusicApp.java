import java.util.ArrayList;

class Song1 {
    private String title;
    private String artist;

    Song1(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }
}

class Playlist {
    private ArrayList<Song1> songs;

    Playlist() {
        this.songs = new ArrayList<>();
    }

    public void addSong(Song1 song) {
        songs.add(song);
    }

    public void play() {
        for (Song1 song : songs) {
            System.out.println("Playing: " + song.getTitle() + " by " + song.getArtist());
        }
    }
}

public class MusicApp {
    public static void main(String[] args) {
        Song1 song1 = new Song1("Imagine", "John Lennon");
        Song1 song2 = new Song1("Bohemian Rhapsody", "Queen");
        Song1 song3 = new Song1("What's Going On", "Marvin Gaye");

        Playlist playlist = new Playlist();
        playlist.addSong(song1);
        playlist.addSong(song2);
        playlist.addSong(song3);

        playlist.play();
    }
}
