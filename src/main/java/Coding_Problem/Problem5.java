package Coding_Problem;
import java.util.*;



class Problem5 {
    public static void main(String[] args) {
        String str = "ABCDABC";

        int maxlength = 0 ;
        int start=0;
        int left =0;
        int right =0 ;
        Set<Character> set = new HashSet<Character>();

        for( right = 0 ; right < str.length() ; right++)
        {
            while(set.contains(str.charAt(right)))
            {
                set.remove(str.charAt(left));
                left++ ;
            }
            set.add(str.charAt(right));
            if(right -left +1 > maxlength)
            {
                maxlength=right -left +1;
                start=left;
            }
        }


        System.out.println(str.substring(start,start + maxlength));


    }
}

