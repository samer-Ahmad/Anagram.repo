package Task1;

import java.util.HashMap;
import java.util.Map;

public class Anagram2 {
    public boolean areAnagram(String str1, String str2) {

        Map<Character, Integer> hmap1
                = new HashMap<Character, Integer>();
        HashMap<Character, Integer> hmap2
                = new HashMap<Character, Integer>();

        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();


        for (int i = 0; i < arr1.length; i++) {

            if (hmap1.get(arr1[i]) == null) {

                hmap1.put(arr1[i], 1);
            } else {
                Integer c = hmap1.get(arr1[i]);
                hmap1.put(arr1[i], ++c);
            }
        }


        for (int j = 0; j < arr2.length; j++) {

            if (hmap2.get(arr2[j]) == null)
                hmap2.put(arr2[j], 1);
            else {

                Integer d = hmap2.get(arr2[j]);
                hmap2.put(arr2[j], ++d);
            }
        }

        return hmap1.equals(hmap2);
    }
}
