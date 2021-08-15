package ArraysQuestions;

import java.util.Arrays;

public class RotateArrayByOne {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
       // rotateArrayByOne(a);
       int b[]= rotationByK(a,2);
        System.out.println(Arrays.toString(b));


    }
    static int [] rotateArrayByOne(int a[])

    {

        int temp = a[a.length-1];
        for(int i=a.length-1;i>0;i--){
            a[i]=a[i-1];
        }
        a[0]=temp;

      return a;
    }

    static int [] rotationByK(int a[],int k){
        int b []= new int[a.length];
        k=k%a.length;

        for(int i=0;i<a.length;i++){
            if(k>i){
                b[i]=a[a.length+i-k];
            }else
                b[i]=a[i-k];
        }
        return b;
    }
}
