package Task1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public boolean anagram(String string1, String string2) {

        Map<Character, Integer> characterIntegerHashMap = new HashMap<Character, Integer>();

        if (string1.length() == string2.length()) {

            for (int i = 0; i < string1.length(); ++i) {
                if (characterIntegerHashMap.containsKey(string1.charAt(i))) {
                    Integer c = characterIntegerHashMap.get(string1.charAt(i));
                    characterIntegerHashMap.put(string1.charAt(i), ++c);
                } else {
                    characterIntegerHashMap.put(string1.charAt(i), 1);
                }

            }

            for (int i = 0; i < string2.length(); ++i) {
                if (characterIntegerHashMap.containsKey(string2.charAt(i))) {
                    Integer c = characterIntegerHashMap.get(string2.charAt(i));
                    characterIntegerHashMap.put(string2.charAt(i), --c);
                } else {
                    characterIntegerHashMap.put(string1.charAt(i), 1);
                }
            }

            Collection<Integer> valueCollection = characterIntegerHashMap.values();

            for (Integer value : valueCollection) {

                if (value != 0) {
                    return false;
                }
                valueCollection.iterator().next();

            }
            return true;
        } else {
            return false;
        }

    }
}
