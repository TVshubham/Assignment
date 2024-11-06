package Coding_Problem;

public class Problem3 {


    public static String longestCommonPrefix(String[] strs) {
        if (strs == null || strs.length == 0) return "";

        // Start with the first string as a reference for the common prefix
        String prefix = strs[0];

        // Outer loop to iterate over each string in the array (starting from the second one)
        for (int i = 1; i < strs.length; i++) {
            int prefixLength = 0;

            // Inner loop to compare characters of the current prefix with the current string
            for (int j = 0; j < prefix.length() && j < strs[i].length(); j++) {
                if (prefix.charAt(j) == strs[i].charAt(j)) {
                    prefixLength++;
                } else {
                    break;
                }
            }

            // Update prefix to the matched portion
            prefix = prefix.substring(0, prefixLength);

            // If the prefix becomes empty, no common prefix exists
            if (prefix.isEmpty()) return "";
        }

        return prefix;
    }

    public static void main(String[] args) {
        String[] strs1 = {"flower", "flow", "flight"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs1)); // Output: "fl"

        String[] strs2 = {"dog", "racecar", "car"};
        System.out.println("Longest Common Prefix: " + longestCommonPrefix(strs2)); // Output: ""
    }
    }



