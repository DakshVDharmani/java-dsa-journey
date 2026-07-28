//Brute Force solution 

class Solution {
    public boolean checkInclusion(String s1, String s2) {

        if (s1.length() > s2.length()) {
            return false;
        }

        HashMap<Character, Integer> mp = new HashMap<>();
        HashMap<Character, Integer> hm = new HashMap<>();

        // Frequency of s1
        for (int i = 0; i < s1.length(); i++) {
            char ch = s1.charAt(i);
            mp.put(ch, mp.getOrDefault(ch, 0) + 1);
        }

        int left = 0;

        for (int right = 0; right < s2.length(); right++) {

            char ch = s2.charAt(right);
            hm.put(ch, hm.getOrDefault(ch, 0) + 1);

            // Window size > s1 length
            if (right - left + 1 > s1.length()) {

                char remove = s2.charAt(left);

                hm.put(remove, hm.get(remove) - 1);

                if (hm.get(remove) == 0) {
                    hm.remove(remove);
                }

                left++;
            }

            // Compare only when window has correct size
            if (right - left + 1 == s1.length()) {

                if (mp.equals(hm)) {
                    return true;
                }
            }
        }

        return false;
    }
}

//Space complexity = O(1)
//Time complexity = O(M + N) <- where N is generally larger than M, thus O(N) is most cases. 
