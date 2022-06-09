import java.util.HashMap;
import java.util.Set;

import javax.swing.plaf.basic.BasicSliderUI.TrackListener;

public class Program {
    
    public static void main(String[] args){
        HashMap<String, String> trackList = new HashMap<String, String>(); 
        trackList.put("Swagger Like Us", "No one on the corner has swagger like us");
        trackList.put("Jumpin on a Jet", "Jumping on a jet, jumping on and off the jet");
        trackList.put("Redlight", "you dont have to put up a red light");
        trackList.put("Lifestyle", "Living life like a beginner and its only the beginning");

        System.out.println(trackList.get("Redlight"));
        
        Set<String> keys = trackList.keySet();
        for(String key : keys) { 
            System.out.println(key+ ": " + trackList.get(key));
        }
    }
}
