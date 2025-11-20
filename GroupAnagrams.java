// time: O(N*k) where N is number of strings and k is average length of string
// space: O(N * K) where N is number of strings and K is average length of string
// leetcode ran? - yes
// problems faced? - I refered to the code in class
import java.math.BigInteger;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<BigInteger, List<String>> map = new HashMap<>();
        for(String str : strs)
        {
            BigInteger hash = getHash(str);
            if(!map.containsKey(hash))
            {
                map.put(hash, new ArrayList<>());
            }
            map.get(hash).add(str);
        }
        return new ArrayList<>(map.values());
    }

    private BigInteger getHash(String str)
    {
        // assign prime values for each lowercase alphabets - 26 of them
        int[] primes = new int[]{2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 
            41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101};
        BigInteger hash = BigInteger.ONE;
        for(int i = 0; i < str.length(); i++)
        {
            char ch = str.charAt(i);
            hash = hash.multiply(BigInteger.valueOf(primes[ch - 'a']));
        }
        return hash;
    }
}