package core.java.internal.works;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShuffleManualArray {


    protected List<Song> generate() {
        List<Song> songList = new ArrayList<>();
        for (int i = 0; i < 1000; i++) {
            songList.add(new Song(i + 1, "Song name" + (i + 1)));
        }
        return songList;
    }

    protected void suffle(List<Song> songs) {
        for (int i = 0; i < songs.size(); i++) {
            Random random = new Random();
            swap(i, random.nextInt(songs.size()), songs);
        }

        songs.forEach(System.out::println);
    }


    protected void swap(int firstIndex, int secondIndex, List<Song> songs) {
        Song song1 = songs.get(firstIndex);
        Song song2 = songs.get(secondIndex);
        songs.set(secondIndex, song1);
        songs.set(firstIndex, song2);
    }

    public static void main(String[] args) {
        ShuffleManualArray shuffleManualArray = new ShuffleManualArray();
        List<Song> generated = shuffleManualArray.generate();
        shuffleManualArray.suffle(generated);
    }
}

class Song {
    public int id;
    public String name;

    public Song(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "{id:" + id + " name: " + name + "}";
    }
}
