package RecursionQues;

import java.util.ArrayList;
import java.util.Scanner;

public class StringSubSequence {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        //String str = sc.next();

        ArrayList<String> arrayList = gss("abcdef");
        System.out.println(arrayList);
    }

    private static ArrayList<String> gss(String str) {
        if(str.length()==0){
            ArrayList<String> space = new ArrayList<>();
            space.add("");
            return space;
        }
        char ch = str.charAt(0);
        String str2 = str.substring(1);
        ArrayList<String> sub = gss(str2);
        ArrayList<String> wholeString = new ArrayList<>();
        for(String value:sub){

            wholeString.add(""+value);
            wholeString.add(ch+value);

        }
        return wholeString;
    }
}
