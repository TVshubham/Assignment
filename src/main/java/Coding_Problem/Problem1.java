package Coding_Problem;

import java.util.HashSet;
import java.util.Set;

public class Problem1 {


    public static void main(String[] args) {

        String str = "abcd",str2 ="aaa" ;

        Set<Character> set =new HashSet<>();

        char [] ch = str.toCharArray();

        int count = 0;

        for(char c : ch)
        {
            if(!set.contains(c))
                set.add(c);

        }
        System.out.println(set.size());

    }

}
