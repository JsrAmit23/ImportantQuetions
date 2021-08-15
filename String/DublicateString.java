package String;

import java.util.ArrayList;
import java.util.HashMap;

public class DublicateString {
    public static void main(String[] args) {

        ArrayList<Character> value= duplicateChars("abcaf");
        for(char c: value){
            System.out.println(c);
        }

        System.out.println();

    }

    public static ArrayList<Character> duplicateChars(String str) {
        //abcdaf
        int i = 0;
        int j = str.length() - 1;
        ArrayList<Character> dc = new ArrayList<>();
        while (i <= str.length()) {

            if (str.charAt(i) == str.charAt(j)) {
                if (i != j) {
                    dc.add(str.charAt(i));
                    i++;
                    j = str.length() - 1;
                } else j--;
            }
            else {

                if (j == 0) {

                    i++;
                    j = str.length() - 1;

                }
                j--;
            }

        }
        return dc;
    }
}

