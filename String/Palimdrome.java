package String;

public class Palimdrome {
    public static void main(String[] args) {
        Palimdrome p = new Palimdrome();
        System.out.println(p.palimdromeOrNot("dontnod"));

    }
    public  boolean palimdromeOrNot(String str){
        int start=0,end=str.length()-1;
        //aba
        boolean charChecker = false;

        while(start<end){
            if(str.charAt(start)==str.charAt(end)){
                charChecker=true;
                start++;
                end--;
            }
            else {
                charChecker=false;
                break;
            }
        }

        return charChecker;
    }
}
