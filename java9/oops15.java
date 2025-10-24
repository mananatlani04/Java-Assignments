import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

class MusicLibrary {
    private String songname;
    ArrayList<MusicLibrary> songs = new ArrayList<MusicLibrary>();

    public MusicLibrary(String songname) {
        this.songname = songname;
    }

    public MusicLibrary() {}

    public String getSongDetails() {
        return songname;
    }

    public void addSong(MusicLibrary song) {
        songs.add(song);
    }

    public void removeSong(MusicLibrary song) {
        songs.remove(song);
    }

    public void playRandomSong() {
        if (songs.size() > 0) {
            Random rand = new Random();
            int index = rand.nextInt(songs.size());
            System.out.println("Playing: " + songs.get(index).getSongDetails());
        } else {
            System.out.println("No songs in library");
        }
    }

    public void displaySongs() {
        for (MusicLibrary song : songs) {
            System.out.println(song.getSongDetails());
        }
    }
}

class Testmain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        MusicLibrary song1 = new MusicLibrary("Shape of You");
        MusicLibrary song2 = new MusicLibrary("Believer");
        MusicLibrary song3 = new MusicLibrary("Perfect");

        MusicLibrary lib = new MusicLibrary();
        lib.addSong(song1);
        lib.addSong(song2);
        lib.addSong(song3);
        lib.displaySongs();
        lib.playRandomSong();
        System.out.println("-------------------------------------");
        lib.removeSong(song2);
        lib.displaySongs();
    }
}