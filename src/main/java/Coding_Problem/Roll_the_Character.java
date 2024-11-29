package Coding_Problem;

public class Roll_the_Character {


    public static void main(String args[])
    {
        int []roll = {1,2,3};
        String str = "abcd" ;
        /*
       first iteration  bbcd
                        cccd
                        dddd
         */
         char [] ch = str.toCharArray();

         for(int k: roll)
         {
             for(int j = 0 ; j < k ; j++)
             {
                 ch[j]++;
             }
         }
         String s = "";
         for(char c :ch)
         {
             s =s +c ;
         }

         System.out.println(s);




    }

}
