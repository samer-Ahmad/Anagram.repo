package Task1;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Anagram {
    public boolean anagram(String string1, String string2, String string3) {

        Map<Character, Double> characterDoubleHashMap = new HashMap<Character, Double>();

        if (string1.length() == string2.length()) {

            for (int i = 0; i < string1.length(); ++i) {
                if (characterDoubleHashMap.containsKey(string1.charAt(i))) {
                    Double c = characterDoubleHashMap.get(string1.charAt(i));
                    characterDoubleHashMap.put(string1.charAt(i), ++c);
                } else {
                    characterDoubleHashMap.put(string1.charAt(i), 1.0);
                }

            }

            for (int i = 0; i < string2.length(); ++i) {
                if (characterDoubleHashMap.containsKey(string2.charAt(i))) {
                    Double c = characterDoubleHashMap.get(string2.charAt(i));
                    characterDoubleHashMap.put(string2.charAt(i), c - 0.5);
                } else {
                    characterDoubleHashMap.put(string2.charAt(i), 1.0);
                }
            }

            for (int i = 0; i < string3.length(); ++i) {
                if (characterDoubleHashMap.containsKey(string3.charAt(i))) {
                    Double c = characterDoubleHashMap.get(string3.charAt(i));
                    characterDoubleHashMap.put(string3.charAt(i), c - 0.5);
                } else {
                    characterDoubleHashMap.put(string3.charAt(i), 1.0);
                }
            }

            Collection<Double> valueCollection = characterDoubleHashMap.values();

            for (Double value : valueCollection) {

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
