package String;

public class NumberOfPlinDrome {

    public static void main(String[] args) {
        String str = "aba abba mom ashish topsapot";

        String s[] = str.split(" ");
        Palimdrome p = new Palimdrome();

        int count =0;
        for(int i =0;i<s.length;i++){
            if(p.palimdromeOrNot(s[i]))
                count++;
        }

        System.out.println(count);
    }
}
