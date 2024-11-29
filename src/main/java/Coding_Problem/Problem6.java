package Coding_Problem;

public class Problem6 {




    public static void main(String[] args) {
        String [] str = {"flower" ,"flo" ,"f"};

        String word = str[0];

        StringBuilder sb = new StringBuilder();
         for(int i =0 ;  i < word.length() ; i++ )
         {
             for(int j =1 ; j < str.length  ; j++)
             {
                 if( str[j].length() <= i || word.charAt(i)!=str[j].charAt(i))
                 {
                     System.out.println(sb.toString());
                     return ;
                 }
             }
             sb.append(word.charAt(i));
         }


        System.out.println(sb.toString());
    }
}
