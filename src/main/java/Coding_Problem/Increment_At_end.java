package Coding_Problem;

import java.util.Arrays;

public class Increment_At_end {
    public static int[] Increment_At_End(int[] arr)
    {
        int length = arr.length -1;
        for(int i =length ;i >= 0 ; i--)
        {
            if(arr[i] == 9)
            {
                arr[i] = 0;
            }
            else
            {
                arr[i]++;
                System.out.println(Arrays.toString(arr));
                return arr ;
            }
        }
        int [] digits = new int[arr.length + 1];
        digits[0]++;
        System.out.println(Arrays.toString(digits));
        return digits ;
    }
    public static void main(String [] args) {
        int [] digits ={9,9,9};
        Increment_At_End(digits);
    }
}
