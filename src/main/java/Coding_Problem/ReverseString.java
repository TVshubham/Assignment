package Coding_Problem;

public class ReverseString {


    public static void main(String[] args) {
        System.out.println("Try programiz.pro");

        String str = "I am Not String";

        String copy = str;

        str = str.replace(" ", "");
        String rev = "";

        for (int i = 0; i < str.length(); i++) {
            rev = str.charAt(i) + rev;
        }
        StringBuilder sb = new StringBuilder();
        int j = 0;
        for (int i = 0; i < copy.length(); i++) {
            if (copy.charAt(i) == ' ') {
                sb.append(" ");
            } else {
                sb.append(rev.charAt(j));
                j++;
            }

        }

        System.out.println(sb.toString());

    }

}
