package RecursionQues;

import java.util.ArrayList;
import java.util.Scanner;

public class KeyPadQue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        ArrayList<String> rresult = keyPadCombination(str);
        System.out.println(rresult);
    }

    static String[] codes = {".;", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tu", "vwx", "yz"};

    private static ArrayList<String> keyPadCombination(String str) {

        if (str.length() == 0) {
            ArrayList<String> baseCase = new ArrayList<>();
            baseCase.add("");
            return baseCase;
        }
        char ch = str.charAt(0);
        String ros = str.substring(1);

        ArrayList<String> recursionResult = keyPadCombination(ros);
        ArrayList<String> mainResult = new ArrayList<>();
        String codeForCh = codes[ch - '0'];
        for (int i = 0; i < codeForCh.length(); i++) {
            char chCode = codeForCh.charAt(i);
            for (String resultStr : recursionResult) {
                mainResult.add(chCode + resultStr);
            }
        }
        return mainResult;
    }
}
