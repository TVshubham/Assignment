package Coding_Problem;

import java.util.*;

public class Longest_SubString {

    public static String longestSubstringWithoutRepeating(String s) {
        int maxLength = 0;  // Stores the length of the longest substring without repeating characters
        int left = 0;       // Points to the start of the current window of characters we're examining
        int start = 0;      // Tracks the starting index of the longest substring found
        HashSet<Character> set = new HashSet<>();  // A set to store characters of the current substring for uniqueness check

        // Loop through each character in the string using `right` as the end of the window
        for (int right = 0; right < s.length(); right++) {
            // If the character at the 'right' pointer is already in the set, we need to move the `left` pointer
            // until this duplicate character is removed from the set
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));  // Remove the character at the `left` pointer
                left++;  // Move `left` to the right to shrink the window from the left
            }

            // Add the current character at `right` to the set
            set.add(s.charAt(right));

            // Update the maximum length and the start of the longest substring if the current window is longer
            if (right - left + 1 > maxLength) {
                maxLength = right - left + 1;
                start = left;
            }
        }

        // Return the substring from `start` with length `maxLength`
        return s.substring(start, start + maxLength);
    }

    public static void main(String[] args) {
        String input1 = "ABAXYZBX";

        String output = longestSubstringWithoutRepeating(input1);

        System.out.println("Input: " + input1 + ", Output: " + longestSubstringWithoutRepeating(input1) +"Ouput Length"+output );  // Output: "ABC"

        String input2 = "AAA";
        System.out.println("Input: " + input2 + ", Output: " + longestSubstringWithoutRepeating(input2)+"Ouput Length"+output);  // Output: "A"
    }
}