import java.util.*;
public class Song {
    private final String title;
    private final String artist;
    private final ArrayList<String> listenersList = new ArrayList<>();
​
​
​
    public Song(String title, String artist) {
        this.title = title;
        this.artist = artist;
    }
​
    public String getTitle() {
        return title;
    }
​
    public String getArtist() {
        return artist;
    }
​
    public int howMany(ArrayList<String> listeners) {
        int count = 0;
        for (String newList : listeners) {
            String lower = newList.toLowerCase();
            if (!listenersList.contains(lower)) {
                listenersList.add(lower);
                count++;
            }
        }
        return count;
    }
  }