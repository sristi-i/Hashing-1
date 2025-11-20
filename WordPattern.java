// time : O(N)
// space: O(1)
// lettcode ran? - yes
// problems faced? - none
import java.util.HashMap;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> patternmap = new HashMap<>();
        HashMap<String, Character> smap = new HashMap<>();
        String[] strArray = s.split(" ");
        if(strArray.length != pattern.length()) return false;

        for(int i = 0; i < pattern.length(); i++)
        {
            if(patternmap.containsKey(pattern.charAt(i)))
            {
                if(!patternmap.get(pattern.charAt(i)).equals(strArray[i]))
                {
                    return false;
                }
            }
            else
            {
                patternmap.put(pattern.charAt(i), strArray[i]);
            }
            if(smap.containsKey(strArray[i]))
            {
                if(smap.get(strArray[i]) != pattern.charAt(i))
                {
                    return false;
                }
            }
            else
            {
                smap.put(strArray[i], pattern.charAt(i));
            }
        }
        return true;
    }
}