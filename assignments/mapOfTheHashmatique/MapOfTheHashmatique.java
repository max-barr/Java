import java.util.Set;
import java.util.HashMap;

public class MapOfTheHashmatique {
    public static void main(String[] args) {
        HashMap<String, String> trackList = new HashMap<String, String>();

        // Add 4 songs with lyrics
        trackList.put("Lovebird", "You are my lovebird");
        trackList.put("Climb", "We must climb");
        trackList.put("The Blacksmith", "He will forge your strength");
        trackList.put("You Shall Not Pass", "He's our white wizard!");

        // Get one song by title
        String song = trackList.get("Climb");
        System.out.println(song);

        // Print all song titles and lyrics
        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key);
            System.out.println(trackList.get(key));
        }
    }
}