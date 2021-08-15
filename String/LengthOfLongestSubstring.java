package String;

public class LengthOfLongestSubstring {
    public static void main(String[] args) {

        System.out.println( lengthOfLongestSubstring("pwwkew"));
    }


    public static String lengthOfLongestSubstring(String str){

        String str1="";
        for(int i=0;i<str.length();i++){

            str1=String.valueOf(str.charAt(i));
            for(int j =i+1;j<str.length();j++){
                if(str.charAt(i)!=str.charAt(j)){
                    if(str1.contains(String.valueOf(str.charAt(j)))){
                        i=j-1;
                        str1="";
                        break;
                    }else str1=str1+String.valueOf(str.charAt(j));
                }



            }
        }

        return str1;
    }
}
