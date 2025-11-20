// time : O(N)
// space: O(1)
// leetcode ran? - yes
// problem faced - i initially put wrong if else conditions
import java.util.HashMap;
class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> smap = new HashMap<>();
        HashMap<Character, Character> tmap = new HashMap<>();
        for(int i = 0; i < s.length(); i++)
        {
            if(smap.containsKey(s.charAt(i)))
            {
                if(smap.get(s.charAt(i)) != t.charAt(i))
                {
                    return false;
                }
            }
            else
            {
                smap.put(s.charAt(i), t.charAt(i));
            }
            if(tmap.containsKey(t.charAt(i)))
            {
                if(tmap.get(t.charAt(i)) != s.charAt(i))
                {
                    return false;
                }
            }
            else
            {
                tmap.put(t.charAt(i), s.charAt(i));
            }
        }
        return true;
    }
}