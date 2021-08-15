package String;

public class CheckRotation {
    public static void main(String[] args) {
        System.out.println(checkRotation("abcd","cdab"));
    }

    public static boolean checkRotation(String str1, String str2){
        if(str1.length()==str2.length()){
            String combineStr = str1+str1;
            if(combineStr.contains(str2)){
                return true;
            }
            else return false;
        }else return false;
    }
}
