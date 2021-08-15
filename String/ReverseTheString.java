package String;

public class ReverseTheString {
    public static void main(String[] args) {
      String str=  reverse("abcd");
        System.out.println(str);
    }

    public static String reverse(String str){

        //abcd
        char a[] = str.toCharArray();
        int start = 0;
        int end = a.length-1;
        char temp;
        while (start<end){

            temp = a[start];
           a[start]=a[end];
           a[end] = temp;
           start++;
           end--;

        }
        String newStr="";
        for(int i=0;i<a.length;i++){
            newStr = newStr+a[i];
        }
        str=newStr;

        return str;
    }
}
