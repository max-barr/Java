import java.util.HashMap;
import java.util.Set;

public class HashMapTrackList {
    public static void main(String[] args) {
        // Create a new HashMap
        HashMap<String, String> trackList = new HashMap<String, String>();

        // Add at least 4 songs stored by key of title and value of lyrics
        trackList.put("Track 1", "These are lyrics from Track 1");
        trackList.put("Track 2", "These are lyrics from Track 2");
        trackList.put("Track 3", "These are lyrics from Track 3");
        trackList.put("Track 4", "These are lyrics from Track 4");

        // Pull one of the songs out by its track title
        String song = trackList.get("Track 3");
        System.out.println(song);

        // Print out all the track names and lyrics in the format Track: Lyrics
        Set<String> keys = trackList.keySet();

        System.out.println("All Songs:");
        for (String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }


    }
}