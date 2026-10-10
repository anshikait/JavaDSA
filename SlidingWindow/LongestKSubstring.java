import java.util.HashMap;

public class LongestKSubstring {

    public int longestKSubstr(String s, int k) {
        HashMap<Character, Integer> freq = new HashMap<>();

        int low = 0;
        int result = -1;

        for (int high = 0; high < s.length(); high++) {
            char ch = s.charAt(high);

            // Step 1: Add current character
            freq.put(ch, freq.getOrDefault(ch, 0) + 1);

            // Step 2: Shrink window if distinct characters > k
            while (freq.size() > k) {
                char leftChar = s.charAt(low);

                freq.put(leftChar, freq.get(leftChar) - 1);

                if (freq.get(leftChar) == 0) {
                    freq.remove(leftChar);
                }

                low++;
            }

            // Step 3: Update answer if exactly k distinct characters
            if (freq.size() == k) {
                result = Math.max(result, high - low + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {
        LongestKSubstring lks = new LongestKSubstring();
        String s = "aabacbebebe";
        int k = 3;
        System.out.println(lks.longestKSubstr(s, k));
    }
}