package homework_nr_9;

import java.util.*;

public class MainDictionary {
    public static void main(String[] args) {
        Map<String, String> dictionaryRomEng = new HashMap<>();

        dictionaryRomEng.put("carrot", "morcov");
        dictionaryRomEng.put("frog", "broască");
        dictionaryRomEng.put("cat", "pisică");
        dictionaryRomEng.put("ogre", "căpcăun");
        dictionaryRomEng.put("badger", "bursuc");
        dictionaryRomEng.put("dinosaur", "dinozaur");
        dictionaryRomEng.put("snail", "melc");
        dictionaryRomEng.put("donkey", "măgar");
        dictionaryRomEng.put("fox", "vulpe");
        dictionaryRomEng.put("rainbow", "curcubeu");



        for (Map.Entry<String, String> entry : dictionaryRomEng.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }





    }
}
