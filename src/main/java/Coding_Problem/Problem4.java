package Coding_Problem;

import java.util.*;
public class Problem4 {



    public static int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        int left = 0;
        HashSet<Character> set = new HashSet<>();

        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        String input1 = "ABCBC";
        System.out.println("Input: " + input1 + ", Output: " + lengthOfLongestSubstring(input1));  // Output: 3

        String input2 = "AAA";
        System.out.println("Input: " + input2 + ", Output: " + lengthOfLongestSubstring(input2));  // Output: 1
    }
}

