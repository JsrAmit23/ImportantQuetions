package String;

public class StringWithoutX {
    public static void main(String[] args) {
        System.out.println(stringWithoutX("ashish kumar singh",'a'));
    }


    public static String stringWithoutX(String s,char c){
        String str = "";
        for(int i =0;i<s.length();i++){
            if(s.charAt(i)!=c){
                str = str+ s.charAt(i);
            }
        }

        return str;
    }
}
